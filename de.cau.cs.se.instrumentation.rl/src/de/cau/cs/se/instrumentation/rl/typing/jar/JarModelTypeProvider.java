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

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.se.instrumentation.rl.recordLang.Type;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 *
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelTypeProvider
 *
 */
public class JarModelTypeProvider implements Resource.Factory, IJarModelTypeProvider {

	private final IProject project;

	private JarModelResource resource;

	/**
	 * Construct the type provider.
	 *
	 * @param resourceSet
	 *            context resource set
	 * @param model
	 *            the application model
	 */
	public JarModelTypeProvider(final IProject project) {
		this.project = project;
		this.resource = null;
	}

	/**
	 * Provides a list of all primitive types.
	 *
	 * @return Returns an iterable with all primitive types.
	 */
	public Iterable<Type> getAllTypes() {
		if (this.resource != null) {
			return this.resource.getAllTypes();
		} else {
			return new ArrayList<Type>();
		}
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

		if (this.resource != null) {
			return (Type) this.resource.getEObject(name);
		} else {
			return (Type) this.createResource(JarModelTypeURIHelper.createResourceURI()).getEObject(name);
		}
	}

	/**
	 * Create a type resource for a given URI.
	 *
	 * @param uri
	 *            The URI for the resource
	 */
	public JarModelResource createResource(final URI uri) {
		synchronized (this.project) {
			if (this.resource == null) {
				this.resource = new JarModelResource(uri, this.project);
				if (!this.resource.isLoaded()) {
					try {
						this.resource.load(null);
					} catch (final IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return this.resource;
		}
	}

}
