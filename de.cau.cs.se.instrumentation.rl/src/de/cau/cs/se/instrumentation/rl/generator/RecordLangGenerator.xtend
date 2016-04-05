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
package kieker.tools.rl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import kieker.tools.rl.recordLang.RecordType
import kieker.tools.rl.recordLang.TemplateType
import kieker.tools.rl.preferences.TargetsPreferences

/**
 * Generates one single files per record for java, c, and perl. 
 */
class RecordLangGenerator implements IGenerator {
									
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.URI.platformResource) {			
			// list all generators to support RecordType

			val version = TargetsPreferences.getVersionID()
			val author = TargetsPreferences.getAuthorName()
					
			/** Generator invocation for RecordTypes */																	
			for (Class<?> generator : GeneratorConfiguration.RECORD_TYPE_GENERATORS) {
				val cg = generator.getConstructor().newInstance() as AbstractRecordTypeGenerator
				if (TargetsPreferences.isGeneratorActive(cg.id)) {
					resource.allContents.filter(typeof(RecordType)).forEach[type |
						if (cg.supportsAbstractRecordType || (!cg.supportsAbstractRecordType && !type.abstract)) 
							fsa.generateFile(cg.getFileName(type),	cg.outletType, cg.createContent(type,author,version))
					]
				}
			}
			
			/** Generator invocation for TemplateTypes */
			for (Class<?> generator : GeneratorConfiguration.TEMPLATE_TYPE_GENERATORS) {
				val cg = generator.getConstructor().newInstance() as AbstractTemplateTypeGenerator
				if (TargetsPreferences.isGeneratorActive(cg.id)) {
					resource.allContents.filter(typeof(TemplateType)).forEach[type | 
						fsa.generateFile(cg.getFileName(type),	cg.outletType, cg.createContent(type,author,version))
					]
				}
			}
		}
	}
	

}
