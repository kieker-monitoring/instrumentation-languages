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

import java.util.Map
import java.util.List
import java.util.HashMap
import java.util.ArrayList
import java.util.Collection

/**
 * Generic trace model provider.
 * In many cases S and T are only EObject, as the meta-models do not provide
 * marker interfaces identifying trace model aware node types.
 * 
 * @param <S> node type of the source meta-model
 * @param <T> node type of the target meta-model
 * 
 * @author Reiner Jung
 * 
 * @since 1.0 
 */
class TraceModelProvider<S,T> implements ITraceModelProvider<S,T> {
	
	val Map<S,List<T>> map 
	
	new() {
		this.map = new HashMap<S,List<T>>()
	}
	
	/**
	 * Register a target node to a source node. If no such source node exists,
	 * add the source node.
	 * 
	 * @param source node of the source model
	 * @param target node of the target model
	 */
	override void add(S source, T target) {
		val list = map.get(source)
		if (list === null) { /** new entry */
			map.put(source, new ArrayList<T>())
			this.add(source, target)
		} else {
			list.add(target)
		}
	}
	
	/**
	 * Get all target nodes for a given source node.
	 * 
	 * @param source node of the source model
	 * 
	 * @return list of target nodes
	 */
	override Collection<T> lookup(S source) {
		map.get(source)
	}
	
	/**
	 * Get all target nodes connected to the given source node
	 * which conform to a type V.
	 * 
	 * @param source node of the source model
	 * @param clazz clazz type restriction
	 * 
	 * @return list of target nodes
	 */
	override <V extends T> Iterable<V> lookup(S source, Class<V> clazz) {
		map.get(source).filter(clazz)
	}
	
	/**
	 * Get all target nodes connected to source nodes of a specific type
	 * which conform to a type V.
	 * 
	 * @param sourceClass class type restriction of the source class
	 * @param targetClass class type restriction of the target class
	 * 
	 * @return list of target nodes
	 */
	override <SV extends S,TV extends T> Iterable<TV> lookup(Class<SV> sourceClass, Class<TV> targetClass) {
		val result = new ArrayList<TV>()
		map.keySet.filter(sourceClass).forEach[source |
			result.addAll(map.get(source).filter(targetClass))
		]
		
		return result
	}
	
	/**
	 * Get all source nodes of a specific type.
	 * 
	 * @param sourceClass class type restriction of the source class
	 * 
	 * @return list of source nodes of the given type.
	 */
	override <SV extends S> Iterable<SV> allSources(Class<SV> sourceClass) {
		map.keySet.filter(sourceClass)
	}
	
	/**
	 * Get source node for a specific target node.
	 * 
	 * @param target target node 
	 * 
	 * @return source nodes
	 */
	override Iterable<S> reverseLookup(T target) {
		val result = new ArrayList<S>()
		map.forEach[key, value |
			if (value.contains(target))
				result.add(key)
		]
		
		return result
	}
	
	/**
	 * Calculate a subset trace model based on source and target classes.
	 * 
	 * @param sourceClass class type restriction of the source class
	 * @param targetClass class type restriction of the target class
	 */
	override <SV extends S,TV extends T> ITraceModelProvider<SV,TV> subset(Class<SV> sourceClass, Class<TV> targetClass) {
		val resultMap = new TraceModelProvider<SV,TV>()
		map.forEach[key, value |
			if (key.class.equals(sourceClass)) {
				val matchingValues = value.filter(targetClass)
				if (!matchingValues.empty) {
					matchingValues.forEach[resultMap.add(key as SV, it)]
				}
			}
		]
		return resultMap
	 }
	
}
