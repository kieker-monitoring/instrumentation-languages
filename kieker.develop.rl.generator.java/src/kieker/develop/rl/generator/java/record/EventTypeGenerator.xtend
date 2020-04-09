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
import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.generator.Version
import kieker.develop.rl.generator.java.GeneratorFeatures
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EnumerationType
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.PropertyModifier
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.typing.base.BaseTypes

import static kieker.develop.rl.generator.java.record.EqualsMethodTemplate.*

import static extension kieker.develop.rl.generator.java.record.ArrayConstructorTemplates.*
import static extension kieker.develop.rl.generator.java.record.BinaryConstructorTemplate.*
import static extension kieker.develop.rl.generator.java.record.ConstantConstructionTemplates.*
import static extension kieker.develop.rl.generator.java.record.EventTypeAPITemplates.*
import static extension kieker.develop.rl.generator.java.record.GenericDeserializationConstructorTemplate.*
import static extension kieker.develop.rl.generator.java.record.GenericSerializationTemplates.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.ParameterizedConstructorTemplates.*
import static extension kieker.develop.rl.generator.java.record.PropertyConstructionModule.*
import static extension kieker.develop.rl.generator.java.record.SerializationTemplates.*
import static extension kieker.develop.rl.generator.java.record.ToStringConverterTemplates.*
import static extension kieker.develop.rl.generator.java.record.uid.ComputeUID.*
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
	 * @param targetVersion compiler target version
	 * @param header the header comment
	 * @param author the author of the EvenType
	 * @param version the version of the first occurrence of the type
	 * 
	 * @return a Java class for a Kieker EventType
	 */
	protected override createOutputModel(EventType type, Version targetVersion, String header, String author, String version) {
		val allDataProperties = type.collectAllDataProperties
		val allDeclarationProperties = type.collectAllDeclarationProperties
				
		'''
			«header»package «(type.eContainer as Model).name»;
			
			«type.createImports»
			
			/**
			 * @author «author»
			 * API compatibility: Kieker «this.targetVersion.toString»
			 * 
			 * @since «version»
			 */
			public «if (type.abstract) 'abstract '»class «type.name» extends «type.createParent»«type.createImplements» {			
				«if (!type.abstract) type.createEventTypeConstants(allDataProperties.filter[!it.transient])»
				
				«type.createUserConstants»
				«IF (!type.abstract)»/** property name array. */
				«allDataProperties.filter[!it.isTransient].createValueNamesConstant»
				«ENDIF»
				
				«allDeclarationProperties.createDefaultConstants»
				private static final long serialVersionUID = «type.computeDefaultSUID»L;
				
				«IF allDeclarationProperties.size > 0»/** property declarations. */«ENDIF»
				«allDeclarationProperties.createPropertyDeclarations»
				
				«type.createParameterizedConstructor(allDataProperties, allDeclarationProperties)»
			
				«if (!type.abstract && isSupported(GeneratorFeatures.ARRAY_DESERIALIZER)) type.createArrayConstructor(allDeclarationProperties)»
			
				«IF (isSupported(GeneratorFeatures.ARRAY_DESERIALIZER))»
				«type.createArrayInitializeConstructor(allDeclarationProperties)»
				
				«ENDIF»
				«IF (isSupported(GeneratorFeatures.BYTE_BUFFER_DESERIALIZER))»
				«type.createBufferReadConstructor(allDeclarationProperties)»
				
				«ENDIF»
				«IF (isSupported(GeneratorFeatures.GENERIC_DESERIALIZER))»
				«type.createGenericDeserializationConstructor(allDeclarationProperties)»
				
				«ENDIF»
				«IF (!type.isAbstract)»
				«if (isSupported(GeneratorFeatures.ARRAY_SERIALIZER)) allDataProperties.createToArrayRepresentation»
				«if (isSupported(GeneratorFeatures.STRING_REGISTRY)) allDataProperties.createStringRegistration»
				«if (isSupported(GeneratorFeatures.BYTE_BUFFER_SERIALIZER)) allDataProperties.createBinarySerialization»
				«if (isSupported(GeneratorFeatures.GENERIC_SERIALIZER)) allDataProperties.createGenericSerialization»
				«createConstantAccessMethods»
				«ENDIF»
			
				«if (isSupported(GeneratorFeatures.ARRAY_DESERIALIZER)) createInitFromArray()»
				«if (isSupported(GeneratorFeatures.BYTE_BUFFER_DESERIALIZER)) createInitFromBuffer()»
				
				«createEquals(type.name, allDataProperties)»
				«if (isSupported(GeneratorFeatures.OWN_HASH_FUNCTION)) createHashcode(type.name, allDataProperties)»
				
				«type.createPropertyGettersAndSetters»
				
				«type.createToString(allDataProperties)»
			}
		'''
	}
	
	/**
	 * Create array with all property names.
	 * 
	 * @param properties collection of all properties accessible in this type
	 */
	private def createValueNamesConstant(Iterable<Property> properties) '''
		public static final String[] VALUE_NAMES = {
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
				'0;'
			else 
				properties.createBinarySerializationSizeConstant(type)»
		
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
		val sizeRelevantProperties = properties.filter[!it.modifiers.exists[it == PropertyModifier.TRANSIENT]]
		val last = sizeRelevantProperties.last
		sizeRelevantProperties.map[property | property.createSizeConstant(type, last.equals(property))].join('\n\t\t + ')
	}
	
	/**
	 * Create all imports for the record.
	 * 
	 * @param type the record type
	 */
	private def createImports(EventType type) '''
		«if (!type.abstract) 'import java.nio.BufferOverflowException;'»
		«IF (isSupported(GeneratorFeatures.BYTE_BUFFER_DESERIALIZER))»
		import java.nio.BufferUnderflowException;
		import java.nio.ByteBuffer;
		«ENDIF»

		import kieker.common.exception.RecordInstantiationException;
		«IF (type.parent === null)»
		import kieker.common.record.AbstractMonitoringRecord;
		«IF isSupported(GeneratorFeatures.LEGACY_FACTORY)»
		import kieker.common.record.IMonitoringRecord;
		«ENDIF»
		«ELSE»
		import «(type.parent.eContainer as Model).name».«type.parent.name»;
		«ENDIF»
		«IF (isSupported(GeneratorFeatures.GENERIC_DESERIALIZER))»
		import kieker.common.record.io.IValueDeserializer;
		«if (!type.abstract) 'import kieker.common.record.io.IValueSerializer;'»
		«ENDIF»
		«if (!type.abstract && isSupported(GeneratorFeatures.STRING_REGISTRY)) 'import kieker.common.util.registry.IRegistry;'»

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
	 * @param type
	 *      the corresponding type of the property
	 * @param last
	 *      is true if the property is the last property  
	 *  
	 * @returns
	 * 		the serialization size of the property
	 */
	private def createSizeConstant(Property property, EventType type, boolean last) {
		val semicolon = if (last) ';' else ''
		val dataType = property.findType.type
		switch (dataType) {
			BaseType: switch (BaseTypes.getTypeEnum(dataType)) {
				case STRING : 'TYPE_SIZE_STRING'
				case BYTE : 'TYPE_SIZE_BYTE'
				case SHORT : 'TYPE_SIZE_SHORT'
				case INT : 'TYPE_SIZE_INT'
				case LONG : 'TYPE_SIZE_LONG'
				case FLOAT : 'TYPE_SIZE_FLOAT'
				case DOUBLE : 'TYPE_SIZE_DOUBLE'
				case CHAR : 'TYPE_SIZE_CHARACTER'
				case BOOLEAN : 'TYPE_SIZE_BOOLEAN'
			}
			EnumerationType: 'TYPE_SIZE_INT'
		} + semicolon + ''' // «property.createPropertyFQN(type)»'''
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
		if (type.parent === null && isSupported(GeneratorFeatures.LEGACY_FACTORY)) { // only add these interfaces for classes directly inheriting AbstractMonitoringRecord
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
