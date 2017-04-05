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
 package kieker.develop.al.generator.java

import java.util.Collection
import kieker.develop.al.aspectLang.Advice
import kieker.develop.al.generator.java.aspectj.AspectJAdviceOutletConfiguration
import kieker.develop.al.generator.java.javaee.JavaEEAdviceOutletConfiguration
import kieker.develop.al.generator.java.servlet.ServletAdviceOutletConfiguration
import kieker.develop.al.generator.java.spring.SpringAdviceOutletConfiguration
import kieker.develop.rl.generator.IGeneratorProvider
import kieker.develop.rl.outlet.AbstractOutletConfiguration

/**
 * Provider for generator supporting Java based advice technologies.
 * 
 * @author Reiner Jung
 */
class JavaAdviceGeneratorProvider implements IGeneratorProvider<Advice, CharSequence> {
	
	override addOutletConfigurations(Collection<AbstractOutletConfiguration<Advice, CharSequence>> configurations) {
		configurations += new AspectJAdviceOutletConfiguration()
		configurations += new JavaEEAdviceOutletConfiguration()
		configurations += new ServletAdviceOutletConfiguration()
		configurations += new SpringAdviceOutletConfiguration()
	}
	
}