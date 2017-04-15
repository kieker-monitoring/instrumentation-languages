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
package kieker.develop.rl.typing.base;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import kieker.develop.rl.recordLang.Type;
import kieker.develop.rl.typing.ITypeProvider;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 *
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 *
 * @since 1.0
 */
public class BaseTypeProvider implements Resource.Factory, ITypeProvider {

	/** Path to the internal resource. */
	public static final String PRIMITIVES = "/Primitives"; //$NON-NLS-1$
	/** Id for the internal resource. */
	public static final String ID = "base"; //$NON-NLS-1$

	private final ResourceSet resourceSet;

	/**
	 * Create a base type provider.
	 *
	 * @param resourceSet
	 *            the resource set where the base types will be stored to.
	 */
	public BaseTypeProvider(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	/**
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	@Override
	public Iterable<Type> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		return IterableExtensions.map(
				this.resourceSet.getResource(BaseTypeProvider.createResourceURI(), true).getContents(),
				p -> (Type) p);
	}

	/**
	 * Find the type for a given name and return it.
	 *
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	@Override
	public Type findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final BaseTypeResource resource = (BaseTypeResource) this.resourceSet.getResource(BaseTypeProvider.createResourceURI(), true);

		return (Type) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 *
	 * @param uri
	 *            The URI for the resource
	 * @return returns a new base type resource
	 */
	// @Override
	@Override
	public BaseTypeResource createResource(final URI uri) {
		return new BaseTypeResource(uri);
	}

	/**
	 * Build an URI for the internal resource.
	 *
	 * @return the URI
	 */
	public static URI createResourceURI() {
		return URI.createURI(ID + ':' + PRIMITIVES);
	}

	/**
	 * Construct a full URI for a class.
	 *
	 * @param fullQualifiedClassName
	 *            the full qualified class name
	 * @return a complete URI
	 */
	public static URI getFullURIForClass(final String fullQualifiedClassName) {
		final StringBuilder uriBuilder = new StringBuilder(48);
		uriBuilder.append(ID);
		uriBuilder.append(':');
		uriBuilder.append(PRIMITIVES).append(fullQualifiedClassName);
		uriBuilder.append('#');
		uriBuilder.append(fullQualifiedClassName);
		return URI.createURI(uriBuilder.toString());
	}

}
