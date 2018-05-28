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
package kieker.develop.rl.outlet

import java.util.ArrayList
import java.util.Collection
import de.cau.cs.se.geco.architecture.framework.IGenerator

/**
 * Abstract outlet configuration class used to model outlets and
 * associated generators with the configured outlet.
 * 
 * @author Reiner Jung
 * @since 1.3
 * 
 * @param <S> source model root class
 * @param <T> target model root class (or CharSequence for Model-to-Text)
 */
abstract class AbstractOutletConfiguration<S, T> {

	/** Name of the outlet. */
	String name
	
	/** Description of the outlet. */
	String description
		
	/** Default directory for the outlet. */
	String directory
	
	/** Technology supported by the generators of this outlet. */
	String technology
	
	/** Target language supported by the generators of this outlet. */
	String lang
	
	/** All generators for event and templates types of this outlet configuration. */
	protected val generators = new ArrayList<IGenerator<? extends S,? extends T>>

	/**
	 * Create a new outlet entity.
	 */
	new (String name, String description, String directory, String lang, String technology) {
		this.name = name
		this.description = description
		this.directory = directory
		this.lang = lang
		this.technology = technology
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
	
	def getTechnology() {
		return this.technology
	}
	
	def getLang() {
		return this.lang
	}
	
	def Collection<IGenerator<? extends S, ? extends T>> getGenerators() {
		return this.generators
	}
	
	def String outputFilePath(S node)
	
	def String outputDirectory(S node)
	
}
