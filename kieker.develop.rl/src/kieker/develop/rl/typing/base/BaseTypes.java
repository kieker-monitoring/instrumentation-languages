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
package kieker.develop.rl.typing.base;

import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.RecordLangFactory;

/**
 * The base types of the language for app development.
 *
 * @author Reiner Jung - Initial contribution
 * @since 1.0
 */
public enum BaseTypes {
	/** long data type. */
	LONG,
	/** int data type. */
	INT,
	/** short data type. */
	SHORT,
	/** byte data type. */
	BYTE,
	/** boolean data type. */
	BOOLEAN,
	/** float data type. */
	FLOAT,
	/** double data type. */
	DOUBLE,
	/** char data type. */
	CHAR,
	/** string data type. */
	STRING;

	private BaseType type;

	/**
	 * Construct enumeration values.
	 */
	BaseTypes() {
		this.type = RecordLangFactory.eINSTANCE.createBaseType();
		this.type.setName(this.name().toLowerCase());
	}

	/**
	 * Get the BaseType for the enumerated value.
	 *
	 * @return Returns the enumerated value
	 */
	public BaseType getType() {
		return this.type;
	}

	/**
	 * Find the enumerated value for a given BaseType.
	 *
	 * @param type
	 *            the type to find
	 * @return Returns the enumeration value
	 * @throws InternalErrorException when a non existing type is requested 
	 */
	public static BaseTypes getTypeEnum(final BaseType type) throws InternalErrorException {
		for (final BaseTypes result : BaseTypes.values()) {
			if (result.name().toLowerCase().equals(type.getName())) {
				return result;
			}
		}
		throw new InternalErrorException("Requested base type %s does not exist.", type.getName());
	}

}
