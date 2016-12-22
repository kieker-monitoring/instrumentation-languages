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
package kieker.develop.rl.ouput.config

import java.util.ArrayList
import java.util.Collection
import de.cau.cs.se.geco.architecture.framework.IGenerator

/**
 * Abstract outlet configuration class used to model outlets and
 * associated generators with the configured outlet.
 * 
 * @author Reiner Jung
 * 
 * @param <S> source model root class
 * @param <T> target model root class (or CharSequence for Model-to-Text)
 */
abstract class AbstractOutletConfiguration<S, T> {

	/** Name of the outlet. */
	private String name
	
	/** Description of the outlet. */
	private String description
		
	/** Default directory for the outlet. */
	private String directory
	
	/** All generators for event and templates types of this outlet configuration. */
	protected val generators = new ArrayList<IGenerator<? extends S,? extends T>>

	/**
	 * Create a new outlet entity.
	 */
	new (String name, String description, String directory) {
		this.name = name
		this.description = description
		this.directory = directory
	}
	
	def getName() {
		return this.name
	}
	
	def getDescription() {
		return this.description
	}
	
	def getDirectory() {
		return this.directory
	}
	
	def Collection<IGenerator<? extends S, ? extends T>> getGenerators() {
		return this.generators
	}
	
	def String outputFilePath(S node)
	
	def String outputDirectory(S node)
	
}
