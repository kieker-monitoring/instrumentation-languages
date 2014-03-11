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
package de.cau.cs.se.instrumentation.rl.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 * 
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 * 
 */
public class TypeProvider implements Resource.Factory, ITypeProvider {

	private final EcoreTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;

	/**
	 * @param resourceSet
	 */
	public TypeProvider(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		this.typeUriHelper = new EcoreTypeURIHelper();
	}

	/**
	 * Provides a list of all primitive types.
	 * 
	 * @return Returns an iterable with all primitive types.
	 */
	public Iterable<EClassifier> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		return IterableExtensions.map(
				this.resourceSet.getResource(
						this.typeUriHelper.createResourceURI(), true).getContents(),
				new Function1<EObject, EClassifier>() {
					public EClassifier apply(final EObject p) {
						return (EClassifier) p;
					}
				});
	}

	/**
	 * Find the type for a given name and return it.
	 * 
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	public EClassifier findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final URI resourceURI = this.typeUriHelper.createResourceURI();
		final TypeResource resource = (TypeResource) this.resourceSet.getResource(resourceURI, true);

		return (EClassifier) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 * 
	 * @param uri
	 *            The URI for the resource
	 */
	// @Override
	public TypeResource createResource(final URI uri) {
		return new TypeResource(uri);
	}

	/**
	 * @returns Returns the URI helper for the type system.
	 */
	// @Override
	public EcoreTypeURIHelper getTypeUriHelper() {
		return this.typeUriHelper;
	}

}
