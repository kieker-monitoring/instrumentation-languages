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
package de.cau.cs.se.instrumentation.rl.typing.jar;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.se.instrumentation.rl.recordLang.Type;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 *
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelTypeProvider
 *
 */
public class JarModelTypeProvider implements Resource.Factory, IJarModelTypeProvider {

	private final JarModelTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;

	private final IProject project;

	/**
	 * Construct the type provider.
	 *
	 * @param resourceSet
	 *            context resource set
	 * @param model
	 *            the application model
	 */
	public JarModelTypeProvider(final ResourceSet resourceSet, final IProject project) {
		this.resourceSet = resourceSet;
		this.project = project;
		this.typeUriHelper = new JarModelTypeURIHelper();
	}

	/**
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	// @Override
	public Iterable<Type> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		final Resource resource = this.resourceSet.getResource(
				URI.createURI(JarModelTypeURIHelper.PROTOCOL + ":" + JarModelTypeURIHelper.ELEMENTS), true);
		final Collection<Type> result = new ArrayList<Type>();
		for (final EObject container : resource.getContents()) {
			if (container instanceof Type) {
				result.add((Type) container);
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
	public Type findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final URI resourceURI = this.typeUriHelper.createResourceURI();
		final JarModelResource resource = (JarModelResource) this.resourceSet.getResource(resourceURI, true);

		return (Type) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 *
	 * @param uri
	 *            The URI for the resource
	 */
	public JarModelResource createResource(final URI uri) {
		return new JarModelResource(uri, this.project);
	}

	/**
	 * @returns Returns the URI helper for the type system.
	 */
	public JarModelTypeURIHelper getTypeUriHelper() {
		return this.typeUriHelper;
	}

	public Iterable<Type> getAllDataTyes() {
		final Resource resource = this.resourceSet.getResource(
				URI.createURI(JarModelTypeURIHelper.PROTOCOL + ":" + JarModelTypeURIHelper.ELEMENTS), true);
		return ((JarModelResource) resource).getAllDataTypes();
	}

}
