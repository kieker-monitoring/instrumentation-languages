package kieker.develop.al.generator.java.servlet

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.aspectLang.Pointcut


// TODO process code snippet

//	
//	/**
//	 * Create Servlet configuration for a given collection of aspects.
//	 * 
//	 * @param aspects collection of aspects for AspectJ
//	 * @param access file system access
//	 */
//	private def createServletConfiguration(Collection<Aspect> aspects, IFileSystemAccess2 access) {
//		val adviceGenerator = new ServletAdviceGenerator()
//		
//		val utilizationAdviceMap = aspects.createUtilizationMap()
//		
//		utilizationAdviceMap.forEach[advice, utilizedAdvices |
//			access.generateFile(advice.aspectServletAdviceName, adviceGenerator.generate(advice))
//		]
//	}
	
// private def String aspectServletAdviceName(Advice advice) '''servlet«File.separator»«advice.packagePathName»«advice.name»Filter.java'''

class ServletConfigurationGenerator implements IGenerator<Pointcut,CharSequence> {
	
	override generate(Pointcut input) {
		'''MISSING'''
	}
	
}