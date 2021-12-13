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
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import kieker.develop.geco.ITraceModelProvider
import kieker.develop.al.aspectLang.ApplicationModelHandle

/**
 * 
 * @author Reiner Jung
 * 
 * @since 1.3
 */
interface IModelMapper<S, T> {
	
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
	 * @param handle for the application model
	 * @param resourceSet the resource set where the model belongs to described by the ApplicationModelHandle
	 * 
	 * @returns a mapping model
	 */
	def MappingModel loadModel(ApplicationModelHandle handle, ResourceSet resourceSet)
	
	/**
	 * returns the trace model provider for the used model. The trace model relates source
	 * model elements to code elements.
	 */
	def ITraceModelProvider<S, T> traceModelProvider(URI uri, ResourceSet resourceSet)
			
}