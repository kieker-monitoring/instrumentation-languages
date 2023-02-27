package kieker.architecture.languageServer

import de.cau.cs.kieler.klighd.lsp.launch.ILanguageRegistration
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import kieker.model.analysismodel.assembly.AssemblyPackage
import kieker.model.analysismodel.execution.ExecutionPackage
import de.cau.cs.kieler.kgraph.text.ide.KGraphLSSetup
import kieker.model.analysismodel.deployment.DeploymentPackage
import kieker.model.analysismodel.source.SourcePackage
import kieker.model.analysismodel.statistics.StatisticsPackage
import kieker.model.analysismodel.trace.TracePackage
import kieker.model.analysismodel.type.TypePackage
import kieker.model.analysismodel.AnalysismodelPackage

class KiekerLanguageRegistration implements ILanguageRegistration {
	override bindAndRegisterLanguages() {
		// There needs to be at least one XText language supported, as the KGraphLSExtension fails otherwise bc of that.
		// "No Xtext languages have been registered. Please make sure you have added the languages\'s setup class in \'/META-INF/services/org.eclipse.xtext.ISetup\'
		// in LanguageServerImpl.
		KGraphLSSetup.doLSSetup()
		// Initialize the model packages by making sure they have been called.
		var recordPackageInstance = ExecutionPackage.eINSTANCE
		var deploymentPackageInstance = DeploymentPackage.eINSTANCE
		var sourcePackageInstance = SourcePackage.eINSTANCE
		var statisticsPackageInstance = StatisticsPackage.eINSTANCE
		var tracePackageInstance = TracePackage.eINSTANCE
		var typePackageInstance = TypePackage.eINSTANCE
		var aspectPackageInstance = AssemblyPackage.eINSTANCE
		var analysisPackageInstance = AnalysismodelPackage.eINSTANCE

		// use the variables to remove unused warning
		deploymentPackageInstance = deploymentPackageInstance
		analysisPackageInstance = analysisPackageInstance
		sourcePackageInstance = sourcePackageInstance
		typePackageInstance = typePackageInstance
		statisticsPackageInstance = statisticsPackageInstance
		tracePackageInstance = tracePackageInstance
		recordPackageInstance = recordPackageInstance
		aspectPackageInstance = aspectPackageInstance

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);

	}
}
