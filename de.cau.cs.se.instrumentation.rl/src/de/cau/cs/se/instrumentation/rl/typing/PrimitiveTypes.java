/*
 * Science Blog
 *
 * https://se.informatik.uni-kiel.de/
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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * The primitive types of the language for app development.
 * 
 * @author Reiner Jung - Initial contribution
 * 
 */
public enum PrimitiveTypes {
	BIG_DECIMAL(EcorePackage.Literals.EBIG_DECIMAL),
	EBIG_INTEGER(EcorePackage.Literals.EBIG_INTEGER),
	EBOOLEAN(EcorePackage.Literals.EBOOLEAN),
	EINT(EcorePackage.Literals.EINT),
	EFLOAT(EcorePackage.Literals.EFLOAT),
	ESTRING(EcorePackage.Literals.ESTRING);

	private EDataType etype;
	
	PrimitiveTypes(EDataType etype) {
		this.etype = etype;
	}
	
	public EDataType getEType() {
		return etype;
	}
}
