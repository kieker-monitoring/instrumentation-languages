package kieker.architecture.visualization

import de.cau.cs.kieler.klighd.IKlighdStartupHook
import de.cau.cs.kieler.klighd.KlighdDataManager

class KlighdSetup implements IKlighdStartupHook {
	
	override execute() {
		KlighdDataManager.instance
			.registerDiagramSynthesisClass(KiekerArchitectureAssemblyDiagramSynthesis.name, KiekerArchitectureAssemblyDiagramSynthesis)
			.registerDiagramSynthesisClass(KiekerArchitectureExecutionDiagramSynthesis.name, KiekerArchitectureExecutionDiagramSynthesis)
	}
	
}