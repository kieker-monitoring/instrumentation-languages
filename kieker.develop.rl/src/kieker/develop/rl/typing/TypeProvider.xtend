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
package kieker.develop.rl.typing

import kieker.develop.rl.recordLang.ComplexType
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.ResourceSet
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType

/**
 * Caches all existing ComplexTypes.
 * 
 * @author Reiner Jung
 * @since 1.0
 */
class TypeProvider {
		
	val types = new ArrayList<ComplexType>
		
	new (ResourceSet resourceSet) {
		resourceSet.resources.forEach[res |
			res.allContents.filter(typeof(ComplexType)).forEach[types += it]
		]
	}
	
	def Iterable<ComplexType> findInheritingTypes(TemplateType type) {
		types.filter[it.inheritsFrom(type) || type == it]
	}
	
	/** 
	 * Find all type which inherit from the given record type.
	 * 
	 * @param type the parent type
	 * 
	 * @return iterable of record types which inherit the parent type
	 */
	def Iterable<EventType> findInheritingTypes(EventType type) {
		types.filter(typeof(EventType)).filter[it.inheritsFrom(type) || it == type]
	}
		
	/**
	 * Check whether a complex type inherits the template type.
	 * 
	 * @param child the inheriting type
	 * @param parent the template type to inherit from
	 */
	private def boolean inheritsFrom(ComplexType child, TemplateType parent) {
		switch (child) {
			TemplateType: inheritsFrom(child, parent)
			EventType: inheritsFrom(child, parent)
			default: false
		}
	}
	
	/**
	 * Check whether a template type inherits the template type.
	 * 
	 * @param child the inheriting type
	 * @param parent the template type to inherit from
	 */	
	private def boolean inheritsFrom(TemplateType child, TemplateType parent) {
		if (child.inherits.size > 0) {
			child.inherits.exists[it == parent || it.inheritsFrom(parent)]
		} else
			false
	}
	
	/**
	 * Check whether a event type inherits the template type. This is checked
	 * both over the template type graph and the event type hierarchy
	 * 
	 * @param child the inheriting type
	 * @param parent the template type to inherit from
	 */
	private def boolean inheritsFrom(EventType child, TemplateType parent) {
		if (child.inherits.size > 0) {
			child.inherits.exists[it == parent || it.inheritsFrom(parent)]
		} else if (child.parent !== null)
			inheritsFrom(child.parent, parent)
		else
			false
	}
	
	/**
	 * Check whether a child inherits from a parent transitively.
	 * 
	 * @param child the child type
	 * @parem parent the parent type
	 * 
	 * @return returns true if the child is transitively a child of parent
	 */
	private def boolean inheritsFrom(EventType child, EventType parent) {
		if (child.parent !== null) {
			if (child.parent == parent)
				true
			else
				child.parent.inheritsFrom(parent)
		} else
			false
			
	} 
}