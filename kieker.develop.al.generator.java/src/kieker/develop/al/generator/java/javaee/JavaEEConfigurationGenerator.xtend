package kieker.develop.al.generator.java.javaee

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.intermediate.IntermediateModel
import org.w3c.dom.Document

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

class JavaEEConfigurationGenerator implements IGenerator<IntermediateModel, Document> {
	
	override generate(IntermediateModel input) {
		null
	}
	
}