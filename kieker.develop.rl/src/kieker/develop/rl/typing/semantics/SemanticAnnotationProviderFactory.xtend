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
package kieker.develop.rl.typing.semantics

import org.eclipse.emf.ecore.resource.ResourceSet

/**
 * Provider for semantic annotations of event type attributes.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class SemanticAnnotationProviderFactory {
	
	/**
	 * empty constructor.
	 */
	new () {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider
	 * @param repository
	 *            the application model
	 * @return Returns the type provider for primitive types.
	 */
	def synchronized static SemanticAnnotationProvider getProvider(ResourceSet resourceSet) {
		if (resourceSet != null) {
			val object = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(SemanticAnnotationProvider.PROTOCOL)
			if (object != null) {
				if (!(object instanceof SemanticAnnotationProvider)) {
					System.out.println("Provider for " + SemanticAnnotationProvider.PROTOCOL + " is " + object)
					// TODO something went terribly wrong, to be save create a new type provider
					return SemanticAnnotationProviderFactory.createProvider(resourceSet)
				} else {
					return object as SemanticAnnotationProvider
				}
			} else {
				return SemanticAnnotationProviderFactory.createProvider(resourceSet)
			}
		} else {
			throw new IllegalArgumentException("Cannot get type provide without a resourceSet.");
		}
	}

	/**
	 * Create a new type provider for primitive types and register it with the resource.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @param repository
	 *            the application model
	 * @return Returns the new type provider.
	 */
	def private static SemanticAnnotationProvider createProvider(ResourceSet resourceSet) {
		val typeProvider = new SemanticAnnotationProvider(resourceSet)
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(SemanticAnnotationProvider.PROTOCOL, typeProvider)
		return typeProvider
	}
}