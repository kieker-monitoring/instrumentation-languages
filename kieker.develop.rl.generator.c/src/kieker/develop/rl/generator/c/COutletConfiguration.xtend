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
 package kieker.develop.rl.generator.c

import java.io.File
import kieker.develop.rl.generator.c.header.EventTypeGenerator
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType
import de.cau.cs.se.geco.architecture.framework.IGenerator

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*

/**
 * Outlet configuration for C.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class COutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	static String C_OUTLET_ID = "c"
	static String C_HEADER_EXTENSION = "h"
	static String C_MAIN_EXTENSION = "c"
	
	new () {
		super(C_OUTLET_ID, "C", "./src/gen/c", GeneratorProvider.LANG_C, GeneratorProvider.TECH_KIEKER_C)
		this.generators.put(new EventTypeGenerator, C_HEADER_EXTENSION)
		this.generators.put(new kieker.develop.rl.generator.c.main.EventTypeGenerator, C_MAIN_EXTENSION)
	}
	
	override outputFilePath(ComplexType type, IGenerator<?,?> generator) '''«type.outputDirectory»«File::separator»«type.name.cstyleName».«this.generators.get(generator)»'''
	
	override outputDirectory(ComplexType type) '''«type.directoryPathName»'''
		
}