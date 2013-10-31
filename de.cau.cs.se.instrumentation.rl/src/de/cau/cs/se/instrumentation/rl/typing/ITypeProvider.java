/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.rl.typing;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;

/**
 * The type provider interface. It is used by the scoping and plays a role in the content assist.
 * the interface provides a method to get all types
 * 
 * @author Christian Schneider - Initial contribution (derived from
 *         org.eclipse.xtext.common.types.access.IJvmTypeProvider)
 * @author Reiner Jung - Cleanups and commentary
 */
public interface ITypeProvider {

	/**
	 * Provides a collection of all supported primitive types (helpful for content assist).
	 * 
	 * @author chsch
	 */
	Iterable<EClassifier> getAllTypes();

	/**
	 * Find a type by its fully qualified name, which is for primitive types their normal name.
	 * 
	 * @return the found {@link Type} or null if no such type could be found.
	 */
	EClassifier findTypeByName(String name);

	/**
	 * Introduced analogously to {@link org.eclipse.xtext.common.types.access.jdt.IJdtTypeProvider
	 * IJdtTypeProvider#getTypeUriHelper()}.
	 * 
	 * @return the used {@link TypeURIHelper}
	 */
	EcoreTypeURIHelper getTypeUriHelper();

}
