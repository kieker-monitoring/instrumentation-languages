/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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
package de.cau.cs.se.instrumentation.al.modelhandling;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;

/**
 * The type provider factory controls the type provider, which is created by this class.
 * 
 * @author Christian Schneider - derived this class from
 *         org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory
 * @author Reiner Jung - commentary and cleanups
 */
public class ForeignModelTypeProviderFactory {

	@Inject
	public ForeignModelTypeProviderFactory() {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider
	 * @param model the application model
	 * @return Returns the type provider for primitive types.
	 */
	public IForeignModelTypeProvider getTypeProvider(final ResourceSet resourceSet, final ApplicationModel model) {
		if (resourceSet != null) {
			final Object o = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(ForeignModelTypeURIHelper.PROTOCOL);
			if (o != null) {
				if (!(o instanceof IForeignModelTypeProvider)) {
					// TODO something went terribly wrong, to be save create a new type provider
					return this.createTypeProvider(resourceSet, model);
				} else {
					return (IForeignModelTypeProvider) o;
				}
			} else {
				return this.createTypeProvider(resourceSet, model);
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
	 * @param model the application model
	 * @return Returns the new type provider.
	 */
	private IForeignModelTypeProvider createTypeProvider(final ResourceSet resourceSet, final ApplicationModel model) {
		final IForeignModelTypeProvider typeProvider = new ForeignModelTypeProvider(resourceSet, model);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(ForeignModelTypeURIHelper.PROTOCOL, typeProvider);
		return typeProvider;
	}



}
