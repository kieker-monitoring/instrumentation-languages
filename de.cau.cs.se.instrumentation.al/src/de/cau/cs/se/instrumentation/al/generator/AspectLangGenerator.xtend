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
package de.cau.cs.se.instrumentation.al.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AspectLangGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val aspects = resource.allContents.filter(typeof(Aspect))
		aspects.forEach[it.createProbe(fsa)]
		aspects.forEach[it.createConfiguration(fsa)]
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
	
	/**
	 * Generate configuration for the given aspect.
	 */
	def void createConfiguration(Aspect aspect, IFileSystemAccess access) {
		aspect.annotation.annotations.forEach[annotation |
			access.generateFile('configuration.txt', switch(annotation.name) {
				case 'J2EE' : createJ2EEConfiguration(aspect, access)
				case 'Spring' : createSpringConfiguration(aspect, access)
			})
		]
	}
	
	def createSpringConfiguration(Aspect aspect, IFileSystemAccess access) {
		"TODO: auto-generated method stub"
	}
	
	def createJ2EEConfiguration(Aspect aspect, IFileSystemAccess access) {
		"TODO: auto-generated method stub"
	}
	
	def void createProbe(Aspect aspect, IFileSystemAccess access) {
		
	}
	
}
