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
package kieker.develop.rl.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import kieker.develop.rl.recordLang.Type;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 *
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 *
 */
public class BaseTypeProvider implements Resource.Factory, ITypeProvider {

	private final ResourceSet resourceSet;

	/**
	 * @param resourceSet
	 */
	public BaseTypeProvider(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	/**
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	public Iterable<Type> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		return IterableExtensions.map(
				this.resourceSet.getResource(BaseTypeURIHelper.createResourceURI(), true).getContents(),
				p -> (Type) p);
	}

	/**
	 * Find the type for a given name and return it.
	 *
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	public Type findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final URI resourceURI = BaseTypeURIHelper.createResourceURI();
		final BaseTypeResource resource = (BaseTypeResource) this.resourceSet.getResource(resourceURI, true);

		return (Type) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 *
	 * @param uri
	 *            The URI for the resource
	 */
	// @Override
	public BaseTypeResource createResource(final URI uri) {
		return new BaseTypeResource(uri);
	}

}
