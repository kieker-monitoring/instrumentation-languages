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
import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;

/**
 * @author Reiner Jung
 */
public class EcoreTypeURIHelper extends TypeURIHelper {

	public static String ELEMENTS = "/Elements"; //$NON-NLS-1$
	public static String PROTOCOL = "internal"; //$NON-NLS-1$

	public URI createResourceURI() {
		return URI.createURI(EcoreTypeURIHelper.PROTOCOL + ':' + EcoreTypeURIHelper.ELEMENTS);
	}

}
