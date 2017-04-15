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
package kieker.develop.rl.generator.java

import java.util.Collection
import kieker.develop.rl.generator.IGeneratorProvider
import kieker.develop.rl.outlet.AbstractOutletConfiguration
import kieker.develop.rl.generator.java.record.JavaOutletConfiguration
import kieker.develop.rl.generator.java.factory.FactoryOutletConfiguration
import kieker.develop.rl.generator.java.junit.JUnitOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType

/**
 * Provider of configurations for outlets with bound generators.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class GeneratorProvider implements IGeneratorProvider<ComplexType, CharSequence> {
	
	public static String LANG_JAVA = "java"
	
	public static String TECH_KIEKER_JAVA = "kieker.java"
	public static String TECH_JUNIT = "junit"
	
		
	override addOutletConfigurations(Collection<AbstractOutletConfiguration<ComplexType, CharSequence>> configurations) {
		configurations += new JavaOutletConfiguration()
		configurations += new FactoryOutletConfiguration()
		configurations += new JUnitOutletConfiguration()	
	}
	
}