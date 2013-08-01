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
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * The primitive types of the language for app development.
 * 
 * @author Reiner Jung - Initial contribution
 * 
 */
public enum PrimitiveTypes {
	ELONG("long"),
	EBOOLEAN("boolean"),
	EINT("int"),
	EFLOAT("float"),
	EDOUBLE("double"),
	ESTRING("string");

	private EDataType etype;
	
	PrimitiveTypes(String name) {
		this.etype = EcoreFactory.eINSTANCE.createEDataType();
		this.etype.setName(name);	
	}
	
	public EDataType getEType() {
		return etype;
	}
}
