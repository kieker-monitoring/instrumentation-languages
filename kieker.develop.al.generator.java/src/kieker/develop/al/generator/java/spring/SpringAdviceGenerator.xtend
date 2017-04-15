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
package kieker.develop.al.generator.java.spring

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.aspectLang.Advice

import static extension kieker.develop.al.generator.java.CommonJavaTemplates.*

/**
 * String advice generator.
 * 
 * @author Reiner Jung
 */
class SpringAdviceGenerator implements IGenerator<Advice, CharSequence> {
	
	override generate(Advice input) {
		'''
			package «input.packageName»
			
			«input.collectors.createRecordInputs»
			
			MISSING
		'''
	}
	
}