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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 * 
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 * 
 */
public class ForeignModelTypeProvider implements Resource.Factory, IForeignModelTypeProvider {

	private final ForeignModelTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;
	
	private final ApplicationModel model;

	/**
	 * @param resourceSet
	 */
	public ForeignModelTypeProvider(final ResourceSet resourceSet, ApplicationModel model) {
		this.resourceSet = resourceSet;
		this.typeUriHelper = new ForeignModelTypeURIHelper();
		this.model = model;
	}

	/**
	 * Provides a list of all primitive types.
	 * 
	 * @return Returns an iterable with all primitive types.
	 */
	// @Override
	public Iterable<NamedElement> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		return IterableExtensions.map(
				this.resourceSet.getResource(
						URI.createURI(ForeignModelTypeURIHelper.PROTOCOL + ":"
								+ ForeignModelTypeURIHelper.ELEMENTS), true).getContents(),
				new Function1<EObject, NamedElement>() {
					// @Override
					public NamedElement apply(final EObject p) {
						return (NamedElement) p;
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
	public NamedElement findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final URI resourceURI = this.typeUriHelper.createResourceURI();
		final ForeignModelResource resource = (ForeignModelResource) this.resourceSet.getResource(resourceURI, true);

		return (NamedElement) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 * 
	 * @param uri
	 *            The URI for the resource
	 */
	// @Override
	public ForeignModelResource createResource(final URI uri) {
		return new ForeignModelResource(uri,model);
	}

	/**
	 * @returns Returns the URI helper for the type system.
	 */
	// @Override
	public ForeignModelTypeURIHelper getTypeUriHelper() {
		return this.typeUriHelper;
	}

}
