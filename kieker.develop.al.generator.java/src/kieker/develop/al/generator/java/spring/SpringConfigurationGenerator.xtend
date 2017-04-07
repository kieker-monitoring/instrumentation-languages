package kieker.develop.al.generator.java.spring

import de.cau.cs.se.geco.architecture.framework.IGenerator
import org.w3c.dom.Document
import kieker.develop.al.intermediate.IntermediateModel
import de.cau.cs.se.geco.architecture.framework.ITraceModelInput
import org.eclipse.xtext.common.types.JvmType
import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider

// TODO process code snippet

//	/**
//	 * Create Spring configuration for a given collection of aspects.
//	 * 
//	 * @param aspects collection of aspects for AspectJ
//	 * @param access file system access
//	 */
//	private def createSpringConfiguration(Collection<Aspect> aspects, IFileSystemAccess2 access) {
//		val adviceGenerator = new SpringAdviceGenerator()
//		
//		val utilizationAdviceMap = aspects.createUtilizationMap()
//		
//		utilizationAdviceMap.forEach[advice, utilizedAdvices |
//			access.generateFile(advice.aspectSpringAdviceName, adviceGenerator.generate(advice))
//		]
//	}
	
// private def String aspectSpringAdviceName(Advice advice) '''spring«File.separator»«advice.packagePathName»«advice.name»Interceptor.java'''
	

class SpringConfigurationGenerator implements IGenerator<IntermediateModel, Document>, ITraceModelInput<JvmType, JvmType> {
	
	private var ITraceModelProvider<JvmType, JvmType>[] localTraceModelProviders
		
	override setTraceModelProviders(ITraceModelProvider<JvmType, JvmType>... traceModelProviders) {
		this.localTraceModelProviders = traceModelProviders
	}
	
	override generate(IntermediateModel input) {
		null
	}
	
}