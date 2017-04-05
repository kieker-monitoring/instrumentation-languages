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

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*

class COutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	private static String C_OUTLET_ID = "c"
	
	new () {
		super(C_OUTLET_ID, "C", "./src/gen/c", GeneratorProvider.LANG_C, GeneratorProvider.TECH_KIEKER_C)
		this.generators += new EventTypeGenerator
		this.generators += new kieker.develop.rl.generator.c.main.EventTypeGenerator
	}
	
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»«type.name.cstyleName».h'''
	
	override outputDirectory(ComplexType type) '''«type.directoryPathName»'''
	
}