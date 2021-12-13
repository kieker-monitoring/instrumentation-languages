/***************************************************************************
 * Copyright 2017 GECO Project
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
package kieker.develop.geco

import org.eclipse.emf.ecore.EObject

/**
 * Trace model provider setter interface. This is only a generic
 * interface to all to add various trace models. In context of
 * the GECO language it is better to define specific provider setter
 * and annotate them with @TraceModel
 * 
 * @author Reiner Jung
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * 
 * @since 1.0
 */
interface ITraceModelInput<S extends EObject, T> {

	/**
	 * Allows to add a variable list of trace model providers to the generator.
	 * 
	 * @param traceModelProviders various trace model providers to be registered with the generator
	 */	
	def void setTraceModelProviders(ITraceModelProvider<S,T>... traceModelProviders)
}
