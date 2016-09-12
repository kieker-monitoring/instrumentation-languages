package kieker.develop.al.modelhandling

import kieker.develop.al.mapping.MappingModel
import kieker.develop.al.aspectLang.ApplicationModel
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import de.cau.cs.se.geco.architecture.framework.TraceModelProvider

interface IModelMapper {
	
	/** Interface attribute name. */
	static final String MAPPING_HANDLER = "mappingHandler"
	
	/** Extension point identifier. */
	static final String MODEL_MAPPER = "kieker.develop.al.modelMapping"
	
	/**
	 * Return the unique identifier of the extension to be used in the language.
	 */
	def String name()
		
	/**
	 * Load an application model and return a mapping model.
	 * 
	 * @param model an application model reference
	 * @param resourceSet the resource set for the model
	 * 
	 * @returns a mapping model
	 */
	def MappingModel loadModel(ApplicationModel model, ResourceSet resourceSet)
	
	/**
	 * returns the trace model provider for the used model. The trace model relates source
	 * model elements to code elements.
	 */
	def TraceModelProvider<? extends EObject, String> traceModelProvider(URI uri, ResourceSet resourceSet)
			
}