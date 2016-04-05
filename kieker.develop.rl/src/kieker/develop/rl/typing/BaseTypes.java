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
package kieker.develop.rl.typing;

import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.RecordLangFactory;

/**
 * The base types of the language for app development.
 *
 * @author Reiner Jung - Initial contribution
 *
 */
public enum BaseTypes {
	LONG, INT, SHORT, BYTE, BOOLEAN, FLOAT, DOUBLE, CHAR, STRING;

	private BaseType type;

	BaseTypes() {
		this.type = RecordLangFactory.eINSTANCE.createBaseType();
		this.type.setName(this.name().toLowerCase());
	}

	public BaseType getType() {
		return this.type;
	}
}
