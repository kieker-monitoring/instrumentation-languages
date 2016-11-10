package kieker.develop.al.handler.java

import kieker.develop.al.aspectLang.ApplicationModel
import kieker.develop.al.mapping.MappingFactory
import kieker.develop.al.modelhandling.IModelMapper
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet

class JavaModelMapper implements IModelMapper {
				
	override loadModel(ApplicationModel input, ResourceSet resourceSet) {
		
		// Get the resource
		val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(input.getModel(), true), true)

		// create main result model
		val	result = MappingFactory.eINSTANCE.createMappingModel()
		// determine all interfaces
		val interfaceMap=JavaLoadModel.createInterfaces(source)
		// compose container hierarchy
		JavaLoadModel.createContainerHierarchy(source, result, interfaceMap)
		// contents must be called via its getter otherwise xtend will used the variable which may
		// result in an null pointer result
		return result
	}
	
	override name() { "java" }
	
	override traceModelProvider(URI uri, ResourceSet resourceSet) {
		return null
	}
	
}