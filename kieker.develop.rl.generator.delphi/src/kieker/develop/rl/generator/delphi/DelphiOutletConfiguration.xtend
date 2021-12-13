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
package kieker.develop.rl.generator.delphi

import java.io.File
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Model
import kieker.develop.geco.IGenerator


/**
 * Outlet configuration for Delphi code.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class DelphiOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence>  {
	
	static String DELFI_OUTLET_ID = "delphi.records"
	static String PASCAL_EXTENSION = "pas"
	
	new () {
		super(DELFI_OUTLET_ID, "Delphi", "./src-gen/delphi", GeneratorProvider.LANG_DELPHI, GeneratorProvider.TECH_KIEKER_DELPHI)
		this.generators.put(new EventTypeGenerator, PASCAL_EXTENSION)
	}
												
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
				
	override outputFilePath(ComplexType type,  IGenerator<?,?> generator) '''«type.outputDirectory»«File::separator»«type.name».pas'''
}