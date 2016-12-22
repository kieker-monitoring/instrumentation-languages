/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.al.generator.java.javaee

import kieker.develop.al.aspectLang.Advice
import java.io.File
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.generator.java.javaee.JavaEEAdviceGenerator
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration

class JavaEEAdviceOutletConfiguration extends AbstractOutletConfiguration<Advice, CharSequence> {
	
	private static String JAVAEE_ADVICE_OUTLET_ID = "java";
	
	new() {
		super(JAVAEE_ADVICE_OUTLET_ID, "AspectJ", "./src-gen/java")
		generators += new JavaEEAdviceGenerator()
	}
	
	override outputFilePath(Advice node) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(Advice node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''	
}