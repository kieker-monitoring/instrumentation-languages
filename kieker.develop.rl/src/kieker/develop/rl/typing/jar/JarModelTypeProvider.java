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
 */
public class JarModelTypeProvider implements Resource.Factory, ITypeProvider {

	private final IProject project;

	private final ResourceSet resourceSet;

	/**
	 * Construct the type provider.
	 *
	 * @param resourceSet
	 *            context resource set
	 * @param model
	 *            the application model
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
	public Iterable<Type> getAllTypes() {
		return IterableExtensions.map(
				this.resourceSet.getResource(JarModelTypeURIHelper.createResourceURI(), true).getContents(),
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

		final URI resourceURI = JarModelTypeURIHelper.createResourceURI();
		final JarModelResource resource = (JarModelResource) this.resourceSet.getResource(resourceURI, true);

		return (Type) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI.
	 *
	 * @param uri
	 *            The URI for the resource
	 */
	public JarModelResource createResource(final URI uri) {
		return new JarModelResource(uri, this.project);
	}

}
