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

import org.eclipse.emf.common.util.URI;

import kieker.develop.al.mapping.NamedElement;
import kieker.develop.al.mapping.NamedType;

/**
 * The type provider interface. It is used by the scoping and plays a role in the content assist.
 * the interface provides a method to get all types
 *
 * @author Christian Schneider - Initial contribution (derived from
 *         org.eclipse.xtext.common.types.access.IJvmTypeProvider)
 * @author Reiner Jung - Cleanups and commentary
 */
public interface IForeignModelTypeProvider {

	/**
	 * Provides a collection of all supported primitive types (helpful for content assist).
	 *
	 * @author chsch
	 *
	 * @return Collection of types
	 */
	Iterable<NamedElement> getAllTypes();

	/**
	 * Find a type by its fully qualified name, which is for primitive types their normal name.
	 *
	 * @param name
	 *            of the searched type
	 *
	 * @return the found {@link Type} or null if no such type could be found.
	 */
	NamedElement findTypeByName(String name);

	/**
	 * Get all data types in a foreign model.
	 *
	 * @return Returns an iterable over all data types
	 */
	Iterable<NamedType> getAllDataTyes();

	/**
	 * Construct a full URI for a class.
	 *
	 * @param fullQualifiedClassName
	 *            the full qualified class name
	 * @return a complete URI
	 */
	public URI getFullURIForClass(final String fullQualifiedClassName);

}
