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
package kieker.develop.al.modelhandling;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;

import kieker.develop.al.aspectLang.ApplicationModel;
import kieker.develop.rl.generator.InternalErrorException;

/**
 * The type provider factory controls the type provider, which is created by this class.
 *
 * @author Christian Schneider - derived this class from
 *         org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory
 * @author Reiner Jung - commentary and cleanups
 */
public class ForeignModelTypeProviderFactory {

	/**
	 * empty constructor.
	 */
	@Inject
	public ForeignModelTypeProviderFactory() {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider
	 * @param model
	 *            the application model
	 * @return Returns the type provider for primitive types.
	 * @throws InternalErrorException
	 *             when the application state is broken
	 */
	public IForeignModelTypeProvider getTypeProvider(final ResourceSet resourceSet, final ApplicationModel model) throws InternalErrorException {
		if (resourceSet != null) {
			final Object object = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(ForeignModelTypeProvider.ID);
			if (object != null) {
				if (object instanceof IForeignModelTypeProvider) {
					return (IForeignModelTypeProvider) object;
				} else {
					throw new InternalErrorException("Expected IForeignModelTypeProvider, but found " + object);
				}
			} else {
				return this.createTypeProvider(resourceSet, model);
			}
		} else {
			throw new InternalErrorException("Cannot get type provide without a resourceSet.");
		}
	}

	/**
	 * Create a new type provider for primitive types and register it with the resource.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @param model
	 *            the application model
	 * @return Returns the new type provider.
	 */
	private IForeignModelTypeProvider createTypeProvider(final ResourceSet resourceSet, final ApplicationModel model) {
		final IForeignModelTypeProvider typeProvider = new ForeignModelTypeProvider(resourceSet, model);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(ForeignModelTypeProvider.ID, typeProvider);
		return typeProvider;
	}

}
