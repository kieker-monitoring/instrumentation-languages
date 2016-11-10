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
package kieker.develop.semantics

import java.util.Collection
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.TargetLanguage
import kieker.develop.semantics.annotations.Technology
import kieker.develop.semantics.annotations.Implementation

/**
 * Extension for semantic declarations.
 * 
 * @author Reiner Jung
 */
interface ISemanticExtension {
	
	/**
	 * The supported annotations of the semantic extension.
	 * 
	 * @return Returns the supported annotations 
	 */
	def Collection<Annotation> getAnnotations()
	
	/**
	 * Collection of all technologies supported by this extensions.
	 * 
	 * @return Returns the supported set of technologies
	 */
	def Collection<Technology> getTechnologies()
	
	/**
	 * Collection of target languages.
	 * 
	 * @return Returns the supported target languages
	 */
	def Collection<TargetLanguage> getTargetLanguages()
	
	/**
	 * Find an implementation for an annotation given the technology and target language.
	 * 
	 * @return Returns on success the implementation of annotation, else null 
	 */
	def Implementation getImplementation(Annotation semantics, Technology technology, TargetLanguage language)
}