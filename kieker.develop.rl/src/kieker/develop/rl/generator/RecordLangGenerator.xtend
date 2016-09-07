/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.rl.generator

import java.util.ArrayList
import java.util.Calendar
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.preferences.TargetsPreferences
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import org.eclipse.core.runtime.preferences.IEclipsePreferences
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.osgi.service.prefs.Preferences

/**
 * Generates one single files per record for java, c, and perl. 
 */
class RecordLangGenerator implements IGenerator2 {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (resource.URI.platformResource) {
			// list all generators to support RecordType
			val preferenceStore = TargetsPreferences.preferenceStore

			val project = resource.URI.segmentsList.get(1)

			val projectStore = preferenceStore.node(project)

			projectStore.v()

			preferenceStore.runGenerators(resource, fsa)
		}
	}

	def void v(Preferences preferences) {
		preferences.childrenNames.forEach[System.out.println(">> " + it)]
	}

	private def runGenerators(IEclipsePreferences preferenceStore, Resource resource, IFileSystemAccess2 fsa) {
		val version = TargetsPreferences.getVersionID(preferenceStore)
		val author = TargetsPreferences.getAuthorName(preferenceStore)

		for (AbstractOutletConfiguration configuration : GeneratorConfiguration.outletConfigurations) {
			if (TargetsPreferences.isGeneratorActive(preferenceStore, configuration.name)) {
				/** Parse header template. */
				var rawHeader = TargetsPreferences.getHeaderComment(preferenceStore, configuration.name).replace(
					"THIS-YEAR", Calendar.getInstance().get(Calendar.YEAR).toString)
				
				val header = if (!rawHeader.isEmpty) {
					if (rawHeader.lastIndexOf(System.lineSeparator) + 1 < rawHeader.length)
						rawHeader + System.lineSeparator
					else
						rawHeader
				} else
					""
				
				val types = new ArrayList<Type>()
								
				resource.allContents.filter(typeof(ModelSubType))
				
				// TODO process model types.
				
				resource.allContents.filter(typeof(Type)).forEach[types += it]
				
				configuration.generators.forEach[generator |
					types.filter[generator.accepts(it)].forEach[
						val result = switch (it) {
							RecordType : (generator as AbstractTypeGenerator<RecordType>).generate(new TypeInputModel<RecordType>(header, author, version, it))
							TemplateType : (generator as AbstractTypeGenerator<TemplateType>).generate(new TypeInputModel<TemplateType>(header, author, version, it))
						}
						fsa.generateFile(configuration.outputFilePath(it), configuration.name, result)
					]
				]
			}
		}

	}



	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
}
