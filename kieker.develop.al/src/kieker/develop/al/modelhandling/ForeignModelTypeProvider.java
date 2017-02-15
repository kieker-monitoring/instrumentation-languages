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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;

import kieker.develop.al.aspectLang.ApplicationModel;
import kieker.develop.al.mapping.Containment;
import kieker.develop.al.mapping.MappingModel;
import kieker.develop.al.mapping.NamedElement;
import kieker.develop.al.mapping.NamedType;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 *
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 *
 * @since 1.0
 */
public class ForeignModelTypeProvider implements Resource.Factory, IForeignModelTypeProvider {

	/** */
	public static final String ELEMENTS = "/Elements"; //$NON-NLS-1$
	/** */
	public static final String ID = "foreign"; //$NON-NLS-1$
	/** */
	public static final String OBJECTS = "/Objects/"; //$NON-NLS-1$

	private final ResourceSet resourceSet;

	private final ApplicationModel model;

	/**
	 * Construct the type provider.
	 *
	 * @param resourceSet
	 *            context resource set
	 * @param model
	 *            the application model
	 */
	public ForeignModelTypeProvider(final ResourceSet resourceSet, final ApplicationModel model) {
		this.resourceSet = resourceSet;
		this.model = model;
	}

	/**
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	// @Override
	@Override
	public Iterable<NamedElement> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		final Resource resource = this.resourceSet.getResource(this.createResourceURI(), true);
		final Collection<NamedElement> result = new ArrayList<>();
		for (final EObject container : resource.getContents()) {
			if (container instanceof MappingModel) {
				for (final Containment type : ((MappingModel) container).getContents()) {
					if (type instanceof NamedElement) {
						result.add((NamedElement) type);
					}
				}
			}
		}
		return result;
	}

	/**
	 * Find the type for a given name and return it.
	 *
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	// @Override
	@Override
	public NamedElement findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final ForeignModelResource resource = (ForeignModelResource) this.resourceSet.getResource(this.createResourceURI(), true);

		return (NamedElement) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 *
	 * @param uri
	 *            The URI for the resource
	 *
	 * @return a new foreign model resource
	 */
	@Override
	public ForeignModelResource createResource(final URI uri) {
		return new ForeignModelResource(uri, this.model);
	}

	/**
	 * Collect all data types form the foreign model resource.
	 *
	 * @return an iterable of all datatypes.
	 */
	@Override
	public Iterable<NamedType> getAllDataTyes() {
		final Resource resource = this.resourceSet.getResource(this.createResourceURI(), true);
		return ((ForeignModelResource) resource).getAllDataTypes();
	}

	/**
	 * Create the URI for the virtual resource.
	 *
	 * @return the URI
	 */
	private URI createResourceURI() {
		return URI.createURI(ID + ':' + ELEMENTS);
	}

	/**
	 * Construct a full URI for a class.
	 *
	 * @param fullQualifiedClassName
	 *            the full qualified class name
	 * @return a complete URI
	 */
	@Override
	public URI getFullURIForClass(final String fullQualifiedClassName) {
		final StringBuilder uriBuilder = new StringBuilder(48);
		uriBuilder.append(ID);
		uriBuilder.append(':');
		uriBuilder.append(OBJECTS).append(fullQualifiedClassName);
		uriBuilder.append('#');
		uriBuilder.append(fullQualifiedClassName);
		return URI.createURI(uriBuilder.toString());
	}
}
