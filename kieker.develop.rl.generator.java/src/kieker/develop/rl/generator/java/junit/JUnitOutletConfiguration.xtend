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
package kieker.develop.rl.generator.java.junit

import java.io.File
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model

import static extension kieker.develop.rl.generator.java.junit.NameResolver.*
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.generator.java.GeneratorProvider
import de.cau.cs.se.geco.architecture.framework.IGenerator

/**
 * Outlet configuration for JUnit tests.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class JUnitOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	static String JUNIT_OUTLET_ID = "java.junit";
	static String JAVA_EXTENSION = "java"
		
	new () {
		super(JUNIT_OUTLET_ID, "JUnit test", "./test-gen/common", GeneratorProvider.LANG_JAVA, GeneratorProvider.TECH_JUNIT)
		generators.put(new EventTypeGenerator, JAVA_EXTENSION)
	}
	
	override outputFilePath(ComplexType type, IGenerator<?,?> generator) '''«type.outputDirectory»«File::separator»TestGenerated«type.name».java'''
	
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.createTestPackageName.replace('.',File::separator)»'''
	
	
}