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
package kieker.develop.al.generator.java.servlet

import java.io.File
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.generator.java.ConfigurationProperties
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.geco.IGenerator

/**
 * Servlet advice outlet configuration.
 * 
 * @author Reiner Jung
 */
class ServletAdviceOutletConfiguration extends AbstractOutletConfiguration<Advice, CharSequence> {

	static String JAVA_EXTENSION = "java"

	new() {
		super(ConfigurationProperties.SERVLET_ADVICE_OUTLET_ID, "Java Servlet", "./src-gen/java", 
			ConfigurationProperties.LANG_JAVA, ConfigurationProperties.TECH_SERVLET
		)
		generators.put(new ServletAdviceGenerator(), JAVA_EXTENSION)
	}
	
	override outputFilePath(Advice node, IGenerator<?, ?> generator) '''«node.outputDirectory»«File::separator»«node.name».java'''
	
	override outputDirectory(Advice node) '''«(node.eContainer as AspectModel).name.replace('.',File::separator)»'''	
}