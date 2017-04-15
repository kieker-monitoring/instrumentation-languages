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
package kieker.develop.rl.typing.jar;

import org.eclipse.core.resources.IProject;
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
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelTypeProvider
 *
 * @author Reiner Jung
 * @since 1.2
 */
public class JarModelTypeProvider implements Resource.Factory, ITypeProvider {

	/** */
	public static final String ELEMENTS = "/Elements"; //$NON-NLS-1$
	/** */
	public static final String ID = "autojar"; //$NON-NLS-1$
	/** */
	public static final String OBJECTS = "/Objects/"; //$NON-NLS-1$

	private final IProject project;

	private final ResourceSet resourceSet;

	/**
	 * Construct the type provider.
	 *
	 * @param project
	 *            the project which is used as basis for the jars
	 * @param resourceSet
	 *            context resource set
	 */
	public JarModelTypeProvider(final IProject project, final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		this.project = project;
	}

	/**
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	@Override
	public Iterable<Type> getAllTypes() {
		return IterableExtensions.map(
				IterableExtensions.filter(this.resourceSet.getResource(JarModelTypeProvider.createResourceURI(), true).getContents(),
						Type.class),
				p -> p);
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

		final JarModelResource resource = (JarModelResource) this.resourceSet.getResource(JarModelTypeProvider.createResourceURI(), true);

		return (Type) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI.
	 *
	 * @param uri
	 *            The URI for the resource
	 * @return Returns a new jar model resource
	 */
	@Override
	public JarModelResource createResource(final URI uri) {
		return new JarModelResource(uri, this.project);
	}

	/**
	 * Create the URI for the virtual resource.
	 *
	 * @return the URI
	 */
	private static URI createResourceURI() {
		return URI.createURI(ID + ':' + ELEMENTS);
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
		uriBuilder.append(OBJECTS).append(fullQualifiedClassName);
		uriBuilder.append('#');
		uriBuilder.append(fullQualifiedClassName);
		return URI.createURI(uriBuilder.toString());
	}

}
