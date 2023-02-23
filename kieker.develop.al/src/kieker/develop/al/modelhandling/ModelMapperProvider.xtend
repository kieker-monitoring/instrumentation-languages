/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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

import org.eclipse.core.runtime.Platform
import java.util.HashMap
import java.util.Map
import org.eclipse.core.runtime.CoreException
import org.eclipse.emf.ecore.EObject
import org.eclipse.core.runtime.RegistryFactory

/**
 * 
 * @author Reiner Jung
 * 
 * @since 1.3
 */
class ModelMapperProvider {
	
	val Map<String,IModelMapper<EObject, EObject>> mappers = 
		new HashMap<String, IModelMapper<EObject, EObject>>()
		
	new () {
		/** Register all mapping modules. */
		//val registry = Platform.getExtensionRegistry()
		val registry = RegistryFactory.getRegistry()
		try {
			val config = registry.getConfigurationElementsFor(IModelMapper.MODEL_MAPPER)
			config.forEach[element |
				val ext = element.createExecutableExtension(IModelMapper.MAPPING_HANDLER)
				if (ext instanceof IModelMapper<?,?>) {
					this.mappers.put(ext.name, ext as IModelMapper<EObject, EObject>)
				}
			]
		} catch (CoreException ex) {
			System.out.println(ex.getMessage())
		} catch (NullPointerException nl) {
			System.out.println(nl.getMessage())
		}
	}
	
	def Map<String,IModelMapper<EObject, EObject>> getModelMappers() {
		return mappers
	}
}
