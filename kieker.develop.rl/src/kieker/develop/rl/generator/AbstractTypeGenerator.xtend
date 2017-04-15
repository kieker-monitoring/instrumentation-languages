/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
import kieker.develop.rl.recordLang.ComplexType

/**
 * Abstract type generator realizing common parameters.
 * 
 * @param <S>
 * @param <T>
 * 
 * @author Reiner Jung
 */
abstract class AbstractTypeGenerator<S extends ComplexType, T> implements IGenerator<S, T>, IAcceptType, IConfigureParameters {

	protected String header
	
	protected String author
	
	protected String version
	
	override configure(String header, String author, String version) {
		this.header = header
		this.author = author
		this.version = version
	}
	
	/**
	 * Primary code generation function.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 */
	override generate(S input) {
		val definedAuthor = if (input.author === null) this.author else input.author
		val definedVersion = if (input.since === null) this.version else input.since

		return createOutputModel(input, header, definedAuthor, definedVersion)
	}
		
	protected abstract def T createOutputModel(S type, String header, String author, String version)
	
}