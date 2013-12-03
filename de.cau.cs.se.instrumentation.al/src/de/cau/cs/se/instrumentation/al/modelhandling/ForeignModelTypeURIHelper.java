/*
 * Science Blog 
 * 
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.al.modelhandling;

import org.eclipse.emf.common.util.URI;

/**
 * @author Reiner Jung
 */
public class ForeignModelTypeURIHelper {

	public static String ELEMENTS = "/Elements"; //$NON-NLS-1$
	public static String PROTOCOL = "internal"; //$NON-NLS-1$
	public static String OBJECTS = "/Objects/"; //$NON-NLS-1$

	public URI createResourceURI() {
		return URI.createURI(ForeignModelTypeURIHelper.PROTOCOL + ':' + ForeignModelTypeURIHelper.ELEMENTS);
	}

	// TODO check if this contraption is really useful
	public URI getFullURIForClass(final String fqn) {
		final StringBuilder uriBuilder = new StringBuilder(48);
		uriBuilder.append(PROTOCOL);
		uriBuilder.append(':');
		uriBuilder.append(OBJECTS).append(fqn);
		uriBuilder.append('#');
		uriBuilder.append(fqn);
		return URI.createURI(uriBuilder.toString());
	}

}
