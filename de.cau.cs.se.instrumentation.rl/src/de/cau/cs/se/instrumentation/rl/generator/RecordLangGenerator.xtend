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
package de.cau.cs.se.instrumentation.rl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import java.io.File

/**
 * Generates one single files per record for java, c, and perl. 
 */
class RecordLangGenerator implements IGenerator {
		
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val author = "Generic Kieker"
		val version = "1.9"
		
		// list all generators to support
		val Class<?>[] generators = #[
			typeof(RecordLangCGenerator),
			typeof(RecordLangCHeaderGenerator),
			typeof(RecordLangJavaGenerator),
			typeof(RecordLangPerlGenerator)
		]
						
		for (Class<?> generator : generators) {
			val cg = generator.getConstructor().newInstance() as RecordLangGenericGenerator
			resource.allContents.filter(typeof(RecordType)).forEach[type | fsa.generateFile(cg.directoryName(type) + File::separator + type.name+'.'+cg.fileExtension, cg.createContent(type,author,version))]
		} 
			
		
	}
	
}