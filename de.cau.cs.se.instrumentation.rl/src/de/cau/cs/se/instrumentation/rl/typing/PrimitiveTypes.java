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
	EINT("int"),
	ESHORT("short"),
	EBYTE("byte"),
	EBOOLEAN("boolean"),
	EFLOAT("float"),
	EDOUBLE("double"),
	ECHAR("char"),
	ESTRING("string");

	private EDataType etype;

	PrimitiveTypes(final String name) {
		this.etype = EcoreFactory.eINSTANCE.createEDataType();
		this.etype.setName(name);
	}

	public EDataType getEType() {
		return this.etype;
	}
}
