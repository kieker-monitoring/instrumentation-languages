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
package kieker.develop.rl.generator.java.record

import java.util.ArrayList
import java.util.List
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.PropertyModifier
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.typing.base.BaseTypes

import kieker.develop.rl.generator.AbstractTypeGenerator

import static kieker.develop.rl.generator.java.record.EqualsMethodTemplate.*
import static extension kieker.develop.rl.generator.java.record.EventTypeAPITemplates.*

import static extension kieker.develop.rl.generator.java.record.BinaryConstructorTemplate.*
import static extension kieker.develop.rl.generator.java.record.GenericDeserializationConstructorTemplate.*
import static extension kieker.develop.rl.generator.java.record.ConstructorTemplates.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.PropertyConstructionModule.*
import static extension kieker.develop.rl.generator.java.record.uid.ComputeUID.*
import static extension kieker.develop.rl.generator.java.record.ConstantConstructionTemplates.*
import static extension kieker.develop.rl.generator.java.record.SerializationTemplates.*
import static extension kieker.develop.rl.generator.java.record.GenericSerializationTemplates.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Generates a Java class for EventTypes.
 * 
 * @author Reiner Jung
 * @author Christian Wulf
 * @since 1.0
 */
class EventTypeGenerator extends AbstractTypeGenerator<EventType, CharSequence> {

	override accepts(ComplexType type) {
		type instanceof EventType
	}

	
	/**
	 * Central code generation template.
	 * 
	 * @param type the event type
	 * 	in this event type (template inherited types and own types)
	 * @param header the header comment
	 * @param author the author of the EvenType
	 * @param version the version of the first occurrence of the type
	 * 
	 * @return a Java class for a Kieker EventType
	 */
	protected override createOutputModel(EventType type, String header, String author, String version) {
		val allDataProperties = type.collectAllDataProperties
		val allDeclarationProperties = type.collectAllDeclarationProperties
		
		'''
			«header»package «(type.eContainer as Model).name»;
			
			«type.createImports»
			
			/**
			 * @author «author»
			 * 
			 * @since «version»
			 */
			public «if (type.abstract) 'abstract '»class «type.name» extends «type.createParent»«type.createImplements» {
				private static final long serialVersionUID = «type.computeDefaultSUID»L;
			
				«if (!type.abstract) type.createEventTypeConstants(allDataProperties.filter[!it.transient])»
				
				«type.createUserConstants»
				
				«allDeclarationProperties.createDefaultConstants»
				
				«IF (!type.abstract)»/** property name array. */
				«allDataProperties.filter[!it.transient].createPropertyNameConstant»
				«ENDIF»
				
				«IF allDeclarationProperties.size > 0»/** property declarations. */«ENDIF»
				«allDeclarationProperties.createPropertyDeclarations»
				
				«type.createParameterizedConstructor(allDataProperties, allDeclarationProperties)»
			
				«if (!type.abstract) type.createArrayConstructor(allDeclarationProperties)»
			
				«type.createArrayInitializeConstructor(allDeclarationProperties)»
			
				«type.createBufferReadConstructor(allDeclarationProperties)»
				
				«type.createGenericDeserializationConstructor(allDeclarationProperties)»
				
				«IF (!type.abstract)»
				«allDataProperties.createToArrayRepresentation»
				«allDataProperties.createStringRegistration»
				«allDataProperties.createBinarySerialization»
				«allDataProperties.createGenericSerialization»
				«createConstantAccessMethods»
				«ENDIF»
			
				«createDeprecatedAPI()»
				
				«createEquals(type.name, allDataProperties)»
				
				«type.createPropertyGettersAndSetters»
			}
		'''
	}
	
	/**
	 * Create array with all property names.
	 * 
	 * @param properties collection of all properties accessible in this type
	 */
	private def createPropertyNameConstant(Iterable<Property> properties) '''
		private static final String[] PROPERTY_NAMES = {
			«properties.map['''"«it.name»",'''].join('\n')»
		};
	'''
	
	/**
	 * Create SIZE and TYPES constants for the EventType API.
	 * 
	 * @param type the EventType
	 * @param properties all properties which are accessible in this type
	 */
	private def createEventTypeConstants(EventType type, Iterable<Property> properties) '''
		/** Descriptive definition of the serialization size of the record. */
		public static final int SIZE = «if (properties.size == 0) 
				'0'
			else 
				properties.createBinarySerializationSizeConstant(type)»
		;
		
		public static final Class<?>[] TYPES = {
			«properties.map[it.createPropertyTypeArrayEntry(type)].join»
		};
	'''
	
	/**
	 * Create code listing a sequence of size constants each one representing the serialization
	 * size in binary for the respective property.
	 * 
	 * @param properties the all properties of the type
	 * @param type event type for the given type.
	 */
	private def createBinarySerializationSizeConstant(Iterable<Property> properties, EventType type) {
		properties.filter[!it.modifiers.exists[it == PropertyModifier.TRANSIENT]].map[property | 
				property.createSizeConstant(type)
			].join('\n\t\t + ')
	}
	
	/**
	 * Create all imports for the record.
	 * 
	 * @param type the record type
	 */
	private def createImports(EventType type) '''
		«IF (!type.abstract)»
		import java.nio.BufferOverflowException;
		«ENDIF»
		import java.nio.BufferUnderflowException;
		import java.nio.ByteBuffer;

		«IF (type.parent === null)»
		import kieker.common.record.AbstractMonitoringRecord;
		import kieker.common.record.IMonitoringRecord;
		«ELSE»
		import «(type.parent.eContainer as Model).name».«type.parent.name»;
		«ENDIF»
		import kieker.common.record.io.IValueDeserializer;
		import kieker.common.record.io.IValueSerializer;
		import kieker.common.util.registry.IRegistry;

		«if (type.inherits !== null && type.inherits.size > 0) type.inherits.map[i | i.createInterfaceImport].join»
	'''
	
	/**
	 * Create a list of imports for the given type.
	 */	
	private def createInterfaceImport(TemplateType type) '''
		import «(type.eContainer as Model).name».«type.name»;
	'''

	/**
	 * Find the size constant for the type of a property used to compute the serialization buffer size.
	 * 
	 * @param property
	 * 		property which serialization size is determined
	 * 
	 * @returns
	 * 		the serialization size of the property
	 */
	private def createSizeConstant(Property property, EventType type) {
		switch (BaseTypes.getTypeEnum(property.findType.type)) {
			case STRING : 'TYPE_SIZE_STRING'
			case BYTE : 'TYPE_SIZE_BYTE'
			case SHORT : 'TYPE_SIZE_SHORT'
			case INT : 'TYPE_SIZE_INT'
			case LONG : 'TYPE_SIZE_LONG'
			case FLOAT : 'TYPE_SIZE_FLOAT'
			case DOUBLE : 'TYPE_SIZE_DOUBLE'
			case CHAR : 'TYPE_SIZE_CHARACTER'
			case BOOLEAN : 'TYPE_SIZE_BOOLEAN'
		} + ''' // «property.createPropertyFQN(type)»'''
	}
	
	/**
	 * Determine the name of the parent class.
	 */
	private def CharSequence createParent(EventType type) {
		if (type.parent !== null) type.parent.name else 'AbstractMonitoringRecord'
	}
		
	/**
	 * Create the sequence of implements of the class and render the implements char sequence.
	 */
	private def CharSequence createImplements(EventType type) {
		val List<CharSequence> interfaces = new ArrayList() 
		if (type.parent === null) { // only add these interfaces for classes directly inheriting AbstractMonitoringRecord
			interfaces.add('IMonitoringRecord.Factory')
			interfaces.add('IMonitoringRecord.BinaryFactory')
		}
		if (type.inherits !== null && type.inherits.size > 0) {
			interfaces.addAll(type.inherits.map[iface | iface.name]);
		}

		if (interfaces.size > 0)
			return ''' implements «interfaces.join(', ')»'''
		else
			return ' '
	}
	

		
}
