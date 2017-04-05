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
 package kieker.develop.rl.generator.perl

import java.io.File
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Model

class PerlOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	new () {
		super("perl", "Perl Output Folder", "./src-gen/perl", GeneratorProvider.LANG_PERL, GeneratorProvider.TECH_KIEKER_PERL)
		generators += new EventTypeGenerator
	}
	
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»«type.name».pm'''
	
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
}