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
package kieker.develop.al.modelhandling

import kieker.develop.al.mapping.MappingModel
import kieker.develop.al.aspectLang.ApplicationModel
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import de.cau.cs.se.geco.architecture.framework.TraceModelProvider

/**
 * 
 * @author Reiner Jung
 * 
 * @since 1.3
 */
interface IModelMapper<S extends EObject, T> {
	
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
	def TraceModelProvider<S, T> traceModelProvider(URI uri, ResourceSet resourceSet)
			
}