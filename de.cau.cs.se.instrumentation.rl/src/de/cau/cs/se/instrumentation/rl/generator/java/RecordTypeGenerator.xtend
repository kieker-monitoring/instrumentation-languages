package de.cau.cs.se.instrumentation.rl.generator.java

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Constant
import de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Literal
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation
import java.io.File
import java.util.ArrayList
import java.util.Collection
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClassifier
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
	
	/**
	 * Primary code generation template.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 * @params author
	 * 		generic author name for the record
	 * @params version
	 * 		generic kieker version for the record
	 */
	override createContent(RecordType type, String author, String version) {
		val serialUID = '123456789L'
		val allDataProperties = PropertyEvaluation::collectAllDataProperties(type)
		val allDeclarationProperties = collectAllDeclarationProperties(type)
		val allGetterDeclarationProperties = collectAllGetterDeclarationProperties(type) 
		'''
		/***************************************************************************
		 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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
		
		package «(type.eContainer as Model).name»;
		
		«IF (!type.abstract)»import java.nio.BufferOverflowException;
		«ENDIF»import java.nio.BufferUnderflowException;
		import java.nio.ByteBuffer;

		«IF (type.parent == null)»import kieker.common.record.AbstractMonitoringRecord;
		«ENDIF»import kieker.common.record.IMonitoringRecord;
		import kieker.common.util.registry.IRegistry;
		
		«if (type.parent != null) type.createParentImport»
		«if (type.parents != null && type.parents.size > 0) type.parents.map[i | i.createInterfaceImport].join»
		
		/**
		 * @author «author»
		 * 
		 * @since «version»
		 */
		public «if (type.abstract) 'abstract '»class «type.name» extends «if (type.parent!=null) type.parent.name else 'AbstractMonitoringRecord'» implements «type.createImplements» {
			«IF (!type.abstract) »public static final int SIZE = «allDataProperties.calculateSize»; // serialization size (without variable part of strings)
			«ENDIF»
			private static final long serialVersionUID = «serialUID»;
			
			«IF (!type.abstract) »private static final Class<?>[] TYPES = {
				«allDataProperties.map[property | property.createPropertyType(type)].join»
			};«ENDIF»
			
			«type.constants.map[const | createDefaultConstant(const)].join»
			
			«allDeclarationProperties.map[property | createPropertyDeclaration(property)].join»
		
			/**
			 * Creates a new instance of this class using the given parameters.
			 * 
			 «allDataProperties.map[property |createPropertyComment(property)].join»
			 */
			public «type.name»(«allDataProperties.map[property | createPropertyParameter(property)].join(', ')») {
				«if (type.parent!=null) 'super('+PropertyEvaluation::collectAllDataProperties(type.parent).map[name].join(', ')+');'»
				«allDeclarationProperties.map[property | createPropertyAssignment(property)].join»
			}
		
			«IF (!type.abstract)»
			/**
			 * This constructor converts the given array into a record. It is recommended to use the array which is the result of a call to {@link #toArray()}.
			 * 
			 * @param values
			 *            The values for the record.
			 */
			public «type.name»(final Object[] values) { // NOPMD (direct store of values)
				«IF (type.parent==null)»AbstractMonitoringRecord.checkArray(values, TYPES);
				«ELSE»super(values, TYPES);
				«ENDIF»«allDeclarationProperties.createPropertyGenericAssignments(if (type.parent!=null) PropertyEvaluation::collectAllDataProperties(type.parent).size else 0)»
			}
			«ENDIF»
			
			/**
			 * This constructor uses the given array to initialize the fields of this record.
			 * 
			 * @param values
			 *            The values for the record.
			 * @param valueTypes
			 *            The types of the elements in the first array.
			 */
			protected «type.name»(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
				«IF (type.parent==null)»AbstractMonitoringRecord.checkArray(values, valueTypes);
				«ELSE»super(values, valueTypes);
				«ENDIF»«allDeclarationProperties.createPropertyGenericAssignments(if (type.parent!=null) PropertyEvaluation::collectAllDataProperties(type.parent).size else 0)»
			}
		
			/**
			 * This constructor converts the given array into a record.
			 * 
			 * @param buffer
			 *            The bytes for the record.
			 * 
			 * @throws BufferUnderflowException
			 *             if buffer not sufficient
			 */
			public «type.name»(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
				«IF (type.parent!=null)»super(buffer, stringRegistry);
				«ENDIF»«allDeclarationProperties.map[property | createPropertyValueFromBuffer(property)].join('\n')»
			}
		
		«IF (!type.abstract)»
			/**
			 * {@inheritDoc}
			 */
			public Object[] toArray() {
				return new Object[] {
					«allDataProperties.map[property | createPropertyArrayEntry(property)].join(',\n')»
				};
			}
		
			/**
			 * {@inheritDoc}
			 */
			public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
				«allDataProperties.map[property | createPropertyBinarySerialization(property)].join('\n')»
			}

			/**
			 * {@inheritDoc}
			 */
			public Class<?>[] getValueTypes() {
				return TYPES; // NOPMD
			}

			/**
			 * {@inheritDoc}
			 */
			public int getSize() {
				return SIZE;
			}
		«ENDIF»
			/**
			 * {@inheritDoc}
			 * 
			 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.
			 */
			@Deprecated
			public void initFromArray(final Object[] values) {
				throw new UnsupportedOperationException();
			}
		
			/**
			 * {@inheritDoc}
			 * 
			 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.
			 */
			@Deprecated
			public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
				throw new UnsupportedOperationException();
			}
		
			«allGetterDeclarationProperties.map[property | createPropertyGetter(property)].join»
		}
		'''
	}
		
	/**
	 * Create the sequence of implements of the class
	 */
	def CharSequence createImplements(RecordType type) '''IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory«if (type.parents != null && type.parents.size > 0) ', ' + type.parents.map[i | i.createImplement].join(', ')»'''
		
	def createImplement(PartialRecordType type) '''«type.name»'''
	/**
	 * Create a list of imports for the given type.
	 */	
	def createInterfaceImport(PartialRecordType type) '''import «(type.eContainer as Model).name».«type.name»;
	'''
	
	/**
	 * Create import for the parent structure.
	 */
	def createParentImport(RecordType type) '''import «(type.parent.eContainer as Model).name».«type.parent.name»;
	'''

	/**
	 * Determine the correct deserialization code for a property by type.
	 * 
	 * @param property
	 * 		the property to deserialize
	 * 
	 * @returns
	 * 		code to deserialize the given property 
	 */
	def createPropertyValueFromBuffer(Property property) {
		if (property.findType.sizes.size > 0) {
			val sizes = property.findType.sizes
			'''
				{
					int __sizes[] = new int[«sizes.size»];
					for (int i=0;i<«sizes.size»;i++)
						__sizes[i] = buffer.getInt();
					«makeLoop(sizes,0,property)»
				}
			'''
		} else
			'''this.«property.name» = «property.findType.class_.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	def CharSequence makeLoop(EList<ArraySize> sizes, int depth, Property property) {
		'''
			for (int i«depth»=0;i«depth»<__sizes[«depth»];i«depth»++)
				«if (sizes.size-1 > depth)
					makeLoop(sizes,depth+1,property)
				else
					makeAssignment(sizes,property)»
		'''
	}
	
	def makeAssignment(EList<ArraySize> sizes, Property property) {
		var String arrays = ''
		for (i : 0 ..< sizes.size) 
			arrays = '''«arrays»[i«i»]'''
		return '''this.«property.name»«arrays» = «property.findType.class_.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	def createPropertyPrimitiveTypeDeserialization(EClassifier classifier) {
		switch (classifier.name) {
			case 'string' : '''stringRegistry.get(buffer.getInt())'''
			case 'byte' : '''buffer.get()'''
			case 'short' : '''buffer.getshort()'''
			case 'int' : '''buffer.getInt()'''
			case 'long' : '''buffer.getLong()'''
			case 'float' : '''buffer.getFloat()'''
			case 'double' : '''buffer.getDouble()'''
			case 'char' : '''buffer.getChar()'''
			case 'boolean' : '''buffer.get()==1?true:false'''
			
		}
	}
		
	/**
	 * Determine the correct serialization for a property by type.
	 * 
	 * @param property
	 * 		the property to serialize
	 * 
	 * @returns
	 * 		code to serialize the given property
	 */
	def createPropertyBinarySerialization(Property property) {
		switch (property.findType.class_.name) {
			case 'string' : '''buffer.putInt(stringRegistry.get(this.get«property.name.toFirstUpper»()));'''
			case 'byte' : '''buffer.put((byte)this.get«property.name.toFirstUpper»());'''
			case 'short' : '''buffer.putShort(this.get«property.name.toFirstUpper»());'''
			case 'int' : '''buffer.putInt(this.get«property.name.toFirstUpper»());'''
			case 'long' : '''buffer.putLong(this.get«property.name.toFirstUpper»());'''
			case 'float' : '''buffer.putFloat(this.get«property.name.toFirstUpper»());'''
			case 'double' : '''buffer.putDouble(this.get«property.name.toFirstUpper»());'''
			case 'char' : '''buffer.putChar(this.get«property.name.toFirstUpper»());'''
			case 'boolean' : '''buffer.put((byte)(this.is«property.name.toFirstUpper»()?1:0));'''
		}
	}

	
	/**
	 * Creates a getter for a given property.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns the resulting getter as a CharSequence
	 */
	def createPropertyGetter(Property property) '''
		public final «property.findType.createTypeName» «property.createGetterName»() {
			return this.«property.resolveName»;
		}
		
	'''
		
	/**
	 * Returns the name of a property for the object array composition
	 * 
	 * @param property
	 * 		 a property of the record type
	 * 
	 * @returns the resulting array entry
	 */
	def createPropertyArrayEntry(Property property) '''this.«property.createGetterName»()'''
	
	/**
	 * Returns the correct name for a getter following Java conventions.
	 * 
	 * @param property
	 * 		a property of a record type
	 * 
	 * @returns the name of the getter of the property
	 */
	def CharSequence createGetterName(Property property) {
		if (property.findType.class_.name.equals('boolean')) 
			'''is«property.name.toFirstUpper»'''
		else
			'''get«property.name.toFirstUpper»'''
	}
	
	/**
	 * Determine the implementation property name of a property by following the alias graph.
	 * 
	 * @param property
	 * 		The property to resolve
	 * 
	 * @returns the implementation name of the property
	 */
	def CharSequence resolveName(Property property) {
		if (property.referTo != null)
			return '''«property.referTo.createGetterName»()'''
		else
			return property.name
	}
	
	/**
	 * Create all assignments for the generic constructor based on property name and an array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param offset
	 * 		the array offset
	 * 
	 * @returns all assignments for the given property list
	 */
	def createPropertyGenericAssignments(Iterable<Property> list, int offset) {
		val EList<CharSequence> r = new org.eclipse.emf.common.util.BasicEList<CharSequence>()
		list.forEach[property, index| r.add(property.createPropertyGenericAssignment(index+offset))]
		return r.join
	}
	
	/**
	 * Create an assignment with a property as assignment target and an array value as source.
	 * Used in the generic constructor.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param index
	 * 		the array index
	 * 
	 * @returns one assignment
	 */
	def String createPropertyGenericAssignment(Property property, int index) '''this.«property.name» = («property.findType.createTypeName») values[«index»];
	'''
	
	/**
	 * Create an assignment with a property as assignment target and an array value as source.
	 * 
	 * @param property
	 * 		a property of the record type
	 * @param index
	 * 		the array index
	 * 
	 * @returns one assignment
	 */
	def createPropertyAssignment(Property property) '''this.«property.name» = «property.name»;
	'''
	
	/**
	 * Create one entry for the constructor parameter sequence.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one parameter for the given property
	 */
	def createPropertyParameter(Property property) '''final «property.findType.createTypeName» «property.name»'''
	
	/**
	 * Create an arbitrary comment for a property of a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one comment
	 */
	def createPropertyComment(Property property)
	'''
	* @param «property.name»
	*            «property.name»
	'''
	
	/**
	 * Create a property declaration for a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns  one property declaration
	 */
	def createPropertyDeclaration(Property property) '''private final «property.findType.createTypeName» «property.name»;
	'''
	
	/**
	 * Create one entry of the property type array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one type entry 
	 */
	def createPropertyType(Property property, RecordType type) '''«property.findType.createTypeName».class, // «property.computeFullQualifiedPropertyName(type)»
	'''
	
	/**
	 * Compute the full qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	def CharSequence computeFullQualifiedPropertyName(Property property, RecordType type) {
		if (type.properties.contains(property)) { 
			return type.name + '.' + property.name
		} else {
			if (type.parent!=null) {
				val result = property.computeFullQualifiedPropertyName(type.parent)
				if (result != null)
					return result
			}
			
			if (type.parents != null) {
				for (Type t : type.parents) {
					val result = property.computeFullQualifiedPropertyName(t)
					if (result != null)
						return result
				}
			}
			return null
		}
	}
	
	/**
	 * Compute the full qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	def CharSequence computeFullQualifiedPropertyName(Property property, Type type) {
		if (type.properties.contains(property))
			return type.name + '.' + property.name
		else if (type.parents != null) {
			for (Type t : type.parents) {
				val result2 = property.computeFullQualifiedPropertyName(t)
				if (result2 != null)
					return result2
			}
		}
		return null
	}
	
	/**
	 * create a constant name from a standard name camel case name.
	 */
	def createConstName(String name) {
		// CaMeL -> CA_ME_L (this code is not functional
		return name.replaceAll("","")
	}
	
	/**
	 * Create a property constant based on the language default expression.
	 * 
	 * @param constant
	 * 		a default constant object
	 * 
	 * @returns a constant declaration
	 */
	def createDefaultConstant(Constant constant) '''
		public static final «constant.type.createTypeName» «constant.name» = «constant.value.createValue»;
	'''
	
	/**
	 * Determine the right Java string for a given system type.
	 * 
	 * @param classifier
	 * 		a classifier representing a type
	 * 
	 * @returns a java type name
	 */
	override createTypeName(Classifier classifier) {
		if (classifier.sizes.size>0)
			classifier.class_.createPrimitiveTypeName + 
			classifier.sizes.map[size | '''[]''' ].join
		else
			classifier.class_.createPrimitiveTypeName
	}
	
	/**
	 * Determine the right Java string for a given system type.
	 */
	def createPrimitiveTypeName(EClassifier classifier) {
		switch (classifier.name) {
			case 'string' : 'String'
			default : classifier.name
		}	
	}
	
	/**
	 * Compute the directory name for a record type.
	 */
	override directoryName(Type type) '''java«File::separator»«(type.eContainer as Model).name.replace('.',File::separator)»'''

	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name».java'''

	
	/**
	 * Collect recursively a list of all properties which are defined in an template and
	 * not inherited from predecessors.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require getters
	 */
	def Iterable<Property> collectAllGetterDeclarationProperties(RecordType type) {
		var Iterable<Property> result = PropertyEvaluation::collectAllProperties(type)
		if (type.parent != null)
			return result.removeAlreadyImplementedProperties(type.parent)
		else
			return result
	}
	
	
	/**
	 * Collect all properties which must be declared for this type. In total that are:
	 * - properties declared by the type, which are not an alias.
	 * - properties declared by any imported interface, which are not implemented in a parent type
	 *   and which are not an alias.
	 * 
	 * @param type
	 * 		a recordType
	 * 
	 * @returns
	 * 		a complete list of all properties which require declaration
	 */
	def Iterable<Property> collectAllDeclarationProperties(RecordType type) {
		var Collection<Property> properties = new ArrayList<Property>() 
		properties.addAll(type.properties)
		properties.addAll(PropertyEvaluation::collectAllTemplateProperties(type))
		
		var Iterable<Property> declarationProperties = properties.filter[property | (property.referTo == null)]
		
		if (type.parent != null)
			return declarationProperties.removeAlreadyImplementedProperties(type.parent)
		else
			return declarationProperties
	}
	
	/**
	 * Find properties implemented in a type and remove them from the list of properties.
	 * 
	 * @param type
	 * 		the parent type of the type where the property list belongs to
	 * 
	 * @returns
	 * 		the remaining list of properties
	 */
	def Iterable<Property> removeAlreadyImplementedProperties(Iterable<Property> list, RecordType parentType) {
		val Collection<Property> interfaceProperties = PropertyEvaluation::collectAllProperties(parentType)
		var result = list // necessary for the loop below. very ugly 
		for (Property interfaceProperty : interfaceProperties) 
			result = result.filter[item | (!item.name.equals(interfaceProperty.name))]
		
		return result
	}
			
	/**
	 * Dispatch for literals
	 */
	dispatch def CharSequence createValue(StringLiteral literal) '''"«literal.value»"'''
	dispatch def CharSequence createValue(IntLiteral literal) '''«literal.value»'''
	dispatch def CharSequence createValue(FloatLiteral literal) '''«literal.value»'''
	dispatch def CharSequence createValue(BooleanLiteral literal) '''«if (literal.value) 'true' else 'false'»'''
	dispatch def CharSequence createValue(ConstantLiteral literal) '''«literal.value.value.createValue»'''
	
	dispatch def CharSequence createValue(Literal literal) {
		'ERROR ' + literal.class.name
	}
}