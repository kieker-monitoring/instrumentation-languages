/***************************************************************************
 * Copyright 2020 Kieker Project (http://kieker-monitoring.net)
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
 package kieker.develop.rl.generator.python

import java.io.File
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Model
import de.cau.cs.se.geco.architecture.framework.IGenerator


class PythonOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	static String PYTHON_EXTENSION = "py"
	
	new () {
		super("python", "Python Output Folder", "./src/gen/python", GeneratorProvider.LANG_PYTHON, GeneratorProvider.TECH_KIEKER_PYTHON)
		generators.put(new EventTypeGenerator, PYTHON_EXTENSION)
		generators.put(new EnumerationTypeGenerator, PYTHON_EXTENSION)
	}
	
	override outputFilePath(ComplexType type, IGenerator<?,?> generator) '''«type.outputDirectory»«File::separator»«type.name».py'''
	
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
}
