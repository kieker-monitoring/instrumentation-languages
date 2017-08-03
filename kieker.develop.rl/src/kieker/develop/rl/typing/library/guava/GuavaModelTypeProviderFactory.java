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
package kieker.develop.rl.typing.library.guava;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.resource.ResourceSet;

import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.typing.ITypeProvider;
import kieker.develop.rl.typing.library.jdt.JDTModelTypeProvider;

/**
 * The type provider factory controls the type provider, which is created by this class.
 *
 * @author Reiner Jung
 * @since 1.3
 */
public class GuavaModelTypeProviderFactory {

	private static Collection<File> jars = new ArrayList<>();

	/**
	 * empty constructor.
	 */
	private GuavaModelTypeProviderFactory() {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 *
	 * @param resourceSet
	 *            The resource set associated with the type provider
	 * @param project
	 *            the project where the jars are scanned
	 *
	 * @return Returns the type provider for primitive types.
	 * @throws InternalErrorException
	 *             when the application state is broken
	 */
	public static synchronized ITypeProvider getTypeProvider(final ResourceSet resourceSet) throws InternalErrorException {
		if (resourceSet != null) {
			final Object object = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(GuavaModelTypeProvider.ID);
			if (object != null) {
				if (object instanceof ITypeProvider) {
					return (ITypeProvider) object;
				} else {
					throw new InternalErrorException("Expected JarModelTypeProvider but found " + object);
				}
			} else {
				return GuavaModelTypeProviderFactory.createTypeProvider(resourceSet);
			}
		} else {
			throw new InternalErrorException("Cannot get type provide without a resourceSet.");
		}
	}

	public static Collection<File> getJars() {
		return jars;
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
	private static ITypeProvider createTypeProvider(final ResourceSet resourceSet) {
		final ITypeProvider typeProvider = new GuavaModelTypeProvider(jars, resourceSet);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(JDTModelTypeProvider.ID, typeProvider);
		return typeProvider;
	}

}
