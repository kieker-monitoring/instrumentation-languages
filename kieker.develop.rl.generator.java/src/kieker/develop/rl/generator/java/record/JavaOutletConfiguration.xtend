/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.java.record

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.generator.java.GeneratorProvider

/**
 * Configuration for the Java record type generators relating
 * an outlet to event type and template type generators.
 * 
 * @since 1.2
 * 
 * @author Reiner Jung 
 */
class JavaOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	private static String JAVA_OUTLET_ID = "java"
		
	new() {
		super(JAVA_OUTLET_ID, "Java record", "./src-gen/java", GeneratorProvider.LANG_JAVA, GeneratorProvider.TECH_KIEKER_JAVA)
		generators += new EventTypeGenerator
		generators += new TemplateTypeGenerator
	}
		
	override outputFilePath(ComplexType node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(ComplexType node) '''«(node.eContainer as Model).name.replace('.',File::separator)»'''
	
	
	
}