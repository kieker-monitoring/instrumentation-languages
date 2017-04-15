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
package kieker.develop.al.generator.java.javaee

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.intermediate.IntermediateModel
import org.w3c.dom.Document
import de.cau.cs.se.geco.architecture.framework.ITraceModelInput
import org.eclipse.xtext.common.types.JvmType
import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider

// TODO process code snippet

//	/**
//	 * Create J2EE configuration for a given collection of aspects.
//	 * 
//	 * @param aspects collection of aspects for AspectJ
//	 * @param access file system access
//	 */
//	private def createJ2EEConfiguration(Collection<Aspect> aspects, IFileSystemAccess2 access) {
//		val adviceGenerator = new JavaEEAdviceGenerator()
//		
//		val utilizationAdviceMap = aspects.createUtilizationMap()
//		
//		utilizationAdviceMap.forEach[advice, utilizedAdvices |
//			access.generateFile(advice.aspectJ2EEAdviceName, adviceGenerator.generate(advice))
//		]
//	}
//	
//	private def String aspectJ2EEAdviceName(Advice advice) '''j2ee«File.separator»«advice.packagePathName»«advice.name»Interceptor.java'''

/**
 * JavaEE configuration generator.
 * 
 * @author Reiner Jung
 */
class JavaEEConfigurationGenerator implements IGenerator<IntermediateModel, Document>, ITraceModelInput<JvmType, JvmType> {
	
	private var ITraceModelProvider<JvmType, JvmType>[] localTraceModelProviders
		
	override setTraceModelProviders(ITraceModelProvider<JvmType, JvmType>... traceModelProviders) {
		this.localTraceModelProviders = traceModelProviders
	}
	
	override generate(IntermediateModel input) {
		null
	}
	
}