package kieker.develop.al.handler.pcm

import de.cau.cs.se.geco.architecture.framework.TraceModelProvider
import kieker.develop.al.aspectLang.ApplicationModel
import kieker.develop.al.handler.pcm.rac.PCMMapping
import kieker.develop.al.mapping.MappingFactory
import kieker.develop.al.modelhandling.IModelMapper
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.palladiosimulator.pcm.core.entity.NamedElement

class PCMModelMapper implements IModelMapper {
				
	override loadModel(ApplicationModel input, ResourceSet resourceSet) {
		
		// Get the resource
		val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(input.getModel(), true), true)

		// create main result model
		val	result = MappingFactory.eINSTANCE.createMappingModel()
		// determine all interfaces
		val interfaceMap=PCMLoadModel.createInterfaces(source)
		// compose container hierarchy
		PCMLoadModel.createContainerHierarchy(source, result, interfaceMap)
		// contents must be called via its getter otherwise xtend will used the variable which may
		// result in an null pointer result
		return result
	}
	
	override name() { "pcm" }
	
	override traceModelProvider(URI uri, ResourceSet resourceSet) {
		val provider = new TraceModelProvider<NamedElement,String>
		val resource = resourceSet.getResource(uri, true)
		resource.allContents.filter(typeof(PCMMapping)).forEach[mapping |
			provider.add(mapping.source, mapping.target)
		]
		
		return provider
	}
	
}