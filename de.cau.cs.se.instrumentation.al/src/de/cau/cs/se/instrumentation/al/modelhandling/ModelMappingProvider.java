/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.al.modelhandling;

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
public class ModelMappingProvider implements Resource.Factory, ITypeProvider {

	private final EcoreTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;

	/**
	 * @param resourceSet
	 */
	public ModelMappingProvider(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		this.typeUriHelper = new EcoreTypeURIHelper();
	}

	/**
	 * Provides a list of all primitive types.
	 * 
	 * @return Returns an iterable with all primitive types.
	 */
	// @Override
	public Iterable<EClassifier> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		return IterableExtensions.map(
				this.resourceSet.getResource(
						URI.createURI(EcoreURIHelperConstants.PROTOCOL + ":"
								+ EcoreURIHelperConstants.PRIMITIVES), true).getContents(),
				new Function1<EObject, EClassifier>() {
					// @Override
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
	// @Override
	public EClassifier findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final URI resourceURI = this.typeUriHelper.createResourceURI();
		final ModelMappingResource resource = (ModelMappingResource) this.resourceSet.getResource(resourceURI, true);

		return (EClassifier) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 * 
	 * @param uri
	 *            The URI for the resource
	 */
	// @Override
	public ModelMappingResource createResource(final URI uri) {
		return new ModelMappingResource(uri);
	}

	/**
	 * @returns Returns the URI helper for the type system.
	 */
	// @Override
	public EcoreTypeURIHelper getTypeUriHelper() {
		return this.typeUriHelper;
	}

}
