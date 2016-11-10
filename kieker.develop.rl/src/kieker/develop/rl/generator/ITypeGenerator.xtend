/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.rl.recordLang.Type

/**
 * General interface for all type generators.
 * 
 * @author Reiner Jung
 */
interface ITypeGenerator<S extends Type, T> extends IGenerator<TypeInputModel<S>, T> {

	/**
	 * Primary code generation template.
	 * 
	 * @param type
	 * 		one record type to be used to create monitoring record
	 */
	override T generate(TypeInputModel<S> type)
	
	/**
	 * Check whether the generator supports the given type declaration.
	 * 
	 * @param type the type to be checked
	 * 
	 * @return true in case the generator supports the type
	 */
	def boolean accepts(Type type)
}