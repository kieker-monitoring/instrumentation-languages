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
package kieker.develop.rl.typing.semantics;

import org.eclipse.emf.common.util.URI;

/**
 *
 */
public class AnnotationURIHelper { // NOCS -- constructor not required

	/** */
	public static final String ELEMENTS = "/Elements"; //$NON-NLS-1$
	/** */
	public static final String PROTOCOL = "annotation"; //$NON-NLS-1$
	/** */
	public static final String OBJECTS = "/Snippets/"; //$NON-NLS-1$

	/**
	 * Create the URI for the virtual resource.
	 *
	 * @return the URI
	 */
	public static URI createResourceURI() {
		return URI.createURI(AnnotationURIHelper.PROTOCOL + ':' + AnnotationURIHelper.ELEMENTS);
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
		uriBuilder.append(PROTOCOL);
		uriBuilder.append(':');
		uriBuilder.append(OBJECTS).append(fullQualifiedClassName);
		uriBuilder.append('#');
		uriBuilder.append(fullQualifiedClassName);
		return URI.createURI(uriBuilder.toString());
	}

}
