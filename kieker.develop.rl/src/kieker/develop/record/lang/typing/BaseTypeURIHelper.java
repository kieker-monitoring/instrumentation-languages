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
package kieker.develop.record.lang.typing;

import org.eclipse.emf.common.util.URI;

/**
 * @author Christian Schneider
 */
public class BaseTypeURIHelper { // NOCS -- ignore missing constructor

	/** Path to the internal resource. */
	public static final String PRIMITIVES = "/Primitives"; //$NON-NLS-1$
	/** Protocol for the internal resource. */
	public static final String PROTOCOL = "internal"; //$NON-NLS-1$

	/**
	 * Build an URI for the internal resource.
	 *
	 * @return the URI
	 */
	public static URI createResourceURI() {
		return URI.createURI(BaseTypeURIHelper.PROTOCOL + ':' + BaseTypeURIHelper.PRIMITIVES);
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
		uriBuilder.append(PRIMITIVES).append(fullQualifiedClassName);
		uriBuilder.append('#');
		uriBuilder.append(fullQualifiedClassName);
		return URI.createURI(uriBuilder.toString());
	}

}
