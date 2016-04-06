package kieker.develop.rl.generator.java.record

import java.io.File
import java.util.ArrayList
import java.util.Calendar
import java.util.List
import kieker.develop.rl.generator.AbstractRecordTypeGenerator
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import kieker.develop.rl.typing.BaseTypes
import kieker.develop.rl.validation.PropertyEvaluation
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.IRL2JavaTypeMappingExtensions.*
import static extension kieker.develop.rl.generator.java.record.CommentModule.*
import static extension kieker.develop.rl.generator.java.record.ConstantConstructionModule.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.PropertyConstructionModule.*
import static extension kieker.develop.rl.generator.java.record.RecordTypePropertyResolutionModule.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.generator.java.record.uid.ComputeUID.*
import static extension kieker.develop.rl.validation.PropertyEvaluation.*

class RecordTypeGenerator extends AbstractRecordTypeGenerator {

	/**
	 * Return the unique id.
	 */
	override getId() '''java'''
	
	/**
	 * Return the preferences activation description.
	 */
	override getDescription() '''Java record generator'''
	
	/**
	 * Java requires abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { true }
	
	/**
	 * Define language/generation type, which is also used to define the outlet.
	 */
	override getOutletType() '''java'''
	
	/**
	 * Compute the directory name for a record type.
	 */
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''

	/**
	 * Compute file name.
	 */
	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»«type.name».java'''
	
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
		val serialUID = type.computeDefaultSUID + 'L'
		val allDataProperties = PropertyEvaluation::collectAllDataProperties(type)
		val allDeclarationProperties = collectAllDeclarationProperties(type)
		val definedAuthor = if (type.author == null) author else type.author
		val definedVersion = if (type.since == null) version else type.since
		'''
		/***************************************************************************
		 * Copyright «Calendar.getInstance().get(Calendar.YEAR)» Kieker Project (http://kieker-monitoring.net)
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
		import kieker.common.record.IMonitoringRecord;
		«ENDIF»import kieker.common.util.registry.IRegistry;
		import kieker.common.util.Version;
		
		«if (type.parent != null) type.createParentImport»
		«if (type.parents != null && type.parents.size > 0) type.parents.map[i | i.createInterfaceImport].join»
		
		/**
		 * @author «definedAuthor»
		 * 
		 * @since «definedVersion»
		 */
		public «if (type.abstract) 'abstract '»class «type.name» extends «type.createParent»«type.createImplements» {
			«IF (!type.abstract) »/** Descriptive definition of the serialization size of the record. */
			public static final int SIZE = «if (allDataProperties.size == 0) '0' else allDataProperties.map[property | property.createSizeConstant(type)].join('\n\t\t + ')»
			;
			«ENDIF»
			private static final long serialVersionUID = «serialUID»;
			
			«IF (!type.abstract) »public static final Class<?>[] TYPES = {
				«allDataProperties.map[property | property.createPropertyType(type)].join»
			};«ENDIF»
			
			/* user-defined constants */
			«type.createUserConstants»
			/* default constants */
			«allDeclarationProperties.createDefaultConstants»
			/* property declarations */
			«allDeclarationProperties.createProperties»
		
			/**
			 * Creates a new instance of this class using the given parameters.
			 * 
			 «allDataProperties.createPropertyComments»
			 */
			public «type.name»(«allDataProperties.map[property | createPropertyParameter(property)].join(', ')») {
				«if (type.parent!=null) 'super('+PropertyEvaluation::collectAllDataProperties(type.parent).map[name].join(', ')+');'»
				«allDeclarationProperties.map[property | createPropertyAssignment(property)].join»
			}
		
			«IF (!type.abstract)»
			/**
			 * This constructor converts the given array into a record.
			 * It is recommended to use the array which is the result of a call to {@link #toArray()}.
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
				«ENDIF»«allDeclarationProperties.map[property | createPropertyBinaryDeserialization(property)].join('\n')»
			}
		
		«IF (!type.abstract)»
			/**
			 * {@inheritDoc}
			 */
			@Override
			public Object[] toArray() {
				return new Object[] {
					«allDataProperties.map[property | '''this.«property.createGetterName»()'''].join(',\n')»
				};
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void registerStrings(final IRegistry<String> stringRegistry) {	// NOPMD (generated code)
				«allDataProperties.map[it.createRegisterStringForProperty].filterNull.join('\n')»
			}
		
			/**
			 * {@inheritDoc}
			 */
			@Override
			public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
				«allDataProperties.map[property | createPropertyBinarySerialization(property)].join('\n')»
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public Class<?>[] getValueTypes() {
				return TYPES; // NOPMD
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public int getSize() {
				return SIZE;
			}
		«ENDIF»
			/**
			 * {@inheritDoc}
			 * 
			 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.
			 */
			@Override
			@Deprecated
			public void initFromArray(final Object[] values) {
				throw new UnsupportedOperationException();
			}
		
			/**
			 * {@inheritDoc}
			 * 
			 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.
			 */
			@Override
			@Deprecated
			public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
				throw new UnsupportedOperationException();
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public boolean equals(final Object obj) {
				if (obj == null) return false;
				if (obj == this) return true;
				if (obj.getClass() != this.getClass()) return false;
				
				final «type.name» castedRecord = («type.name») obj;
				if (this.getLoggingTimestamp() != castedRecord.getLoggingTimestamp()) return false;
				«allDataProperties.map[it.createEquals].join('\n')»
				return true;
			}
		
			«type.collectAllGetterDeclarationProperties.map[property | createPropertyGetter(property)].join»
		}
		'''
	}
	
	/**
	 * Create a list of imports for the given type.
	 */	
	private def createInterfaceImport(TemplateType type) '''import «(type.eContainer as Model).name».«type.name»;
	'''
	
	/**
	 * Create import for the parent structure.
	 */
	private def createParentImport(RecordType type) '''import «(type.parent.eContainer as Model).name».«type.parent.name»;
		'''
	
	/**
	 * Create string registry access for the given property.
	 * 
	 * @param property 
	 * 
	 * @returns result register access or null
	 */
	private def CharSequence createRegisterStringForProperty(Property property) {
		if (property.type.type.name.equals(BaseTypes.STRING.typeName)) {
			val simpleAction = '''stringRegistry.get(this.«createGetterValueExpression(property)»);'''
			val type = property.findType
			if (type.sizes.size > 0) {
				'''
					// get array length
					«FOR size : type.sizes»
						«IF (size.size == 0)»
							int _«property.name»_size«type.sizes.indexOf(size)» = this.«property.name»«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length;
						«ENDIF»
					«ENDFOR»
					«property.type.sizes.createArrayAccessLoops(0, property.name, simpleAction)»
				'''
			} else
				simpleAction
			
		} else
			null
	}
	
	/**
	 * Create the equals check for a property of a type.
	 * 
	 * @param property the property for which the equals is created
	 * 
	 * @returns code snippet for the given property 
	 */
	private def createEquals(Property property) {
		val type = property.findType
		val simpleTypeAction = createEquals(type.type.name, property.createGetterValueExpression)
		if (type.sizes.size > 0) {
			'''
				// get array length
				«FOR size : type.sizes»
					«IF (size.size == 0)»
						int _«property.name»_size«type.sizes.indexOf(size)» = this.«property.name»«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length;
						if (_«property.name»_size«type.sizes.indexOf(size)» != castedRecord.«property.name»«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length)
							return false;
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(type.sizes, 0, property.name, simpleTypeAction)»
			'''
		} else
			simpleTypeAction		
	}
	
	/**
	 * Create equal check for simple values.
	 * 
	 * @param typeName name of the type
	 * @param getterExpression value access expresion
	 */
	private def CharSequence createEquals(String typeName, CharSequence getterExpression) {
		switch (typeName) {
			case BaseTypes.STRING.typeName: 
				'''if (!this.«getterExpression».equals(castedRecord.«getterExpression»)) return false;'''
			case BaseTypes.FLOAT.typeName: 
				'''if (isNotEqual(this.«getterExpression», castedRecord.«getterExpression»)) return false;'''
			case BaseTypes.DOUBLE.typeName: 
				'''if (isNotEqual(this.«getterExpression», castedRecord.«getterExpression»)) return false;'''
			default: 
				'''if (this.«getterExpression» != castedRecord.«getterExpression») return false;'''
		}
	}

	/**
	 * Determine the size of one type.
	 * 
	 * @param property
	 * 		property which serialization size is determined.
	 * 
	 * @returns
	 * 		the serialization size of the property
	 */
	private def createSizeConstant(Property property, RecordType type) {
		switch (PropertyEvaluation::findType(property).type.name) {
			case BaseTypes.STRING.typeName : 'TYPE_SIZE_STRING'
			case BaseTypes.BYTE.typeName : 'TYPE_SIZE_BYTE'
			case BaseTypes.SHORT.typeName : 'TYPE_SIZE_SHORT'
			case BaseTypes.INT.typeName : 'TYPE_SIZE_INT'
			case BaseTypes.LONG.typeName : 'TYPE_SIZE_LONG'
			case BaseTypes.FLOAT.typeName : 'TYPE_SIZE_FLOAT'
			case BaseTypes.DOUBLE.typeName : 'TYPE_SIZE_DOUBLE'
			case BaseTypes.CHAR.typeName : 'TYPE_SIZE_CHARACTER'
			case BaseTypes.BOOLEAN.typeName : 'TYPE_SIZE_BOOLEAN'
			default: throw new InternalErrorException(property.findType.type.name + ' is not a valid type name')
		} + ''' // «property.createPropertyFQN(type)»'''
	}
	
	/**
	 * Determine the name of the parent class.
	 */
	private def CharSequence createParent(RecordType type) {
		if (type.parent!=null) type.parent.name else 'AbstractMonitoringRecord'
	}
		
	/**
	 * Create the sequence of implements of the class and render the implements char sequence.
	 */
	private def CharSequence createImplements(RecordType type) {
		val List<CharSequence> interfaces = new ArrayList() 
		if (type.parent == null) { // only add these interfaces for classes directly inheriting AbstractMonitoringRecord
			interfaces.add('IMonitoringRecord.Factory')
			interfaces.add('IMonitoringRecord.BinaryFactory')
		}
		if (type.parents != null && type.parents.size > 0) {
			interfaces.addAll(type.parents.map[iface | iface.name]);
		}

		if (interfaces.size > 0)
			return ''' implements «interfaces.join(', ')»'''
		else
			return ' '
	} 
			
	/**
	 * Determine the correct deserialization code for a property by type.
	 * 
	 * @param property
	 * 		the property to deserialize
	 * 
	 * @returns
	 * 		code to deserialize the given property 
	 */
	private def createPropertyBinaryDeserialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// load array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.name»_size«sizes.indexOf(size)» = buffer.getInt();
					«ENDIF»
				«ENDFOR»
				this.«property.name.protectKeywords» = new «PropertyEvaluation::findType(property).createTypeInstantiationName(property.name)»;
				«createArrayAccessLoops(sizes,0, property.name, createValueAssignmentForDeserialization(sizes,property))»
			'''
		} else
			'''this.«property.name.protectKeywords» = «PropertyEvaluation::findType(property).type.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	/**
	 * Determine the name and additional array sizes for an array deserialization.
	 * For example property[2][_property_size1][6] or just property for simple fields
	 */
	private def CharSequence createTypeInstantiationName(Classifier classifier, String name) {
		if (classifier.sizes.size>0)
			classifier.type.createPrimitiveTypeName + 
			classifier.sizes.map[size | size.createArraySize(name,classifier.sizes.indexOf(size)) ].join
		else
			classifier.type.createPrimitiveTypeName
	}
	
	/**
	 * Creates code for fixed and runtime array sizes according to the record model.
	 */
	private def createArraySize(ArraySize size, String name, int index) {
		if (size.size > 0)
			'''[«size.size»]'''
		else
			'''[_«name»_size«index»]'''
	}
		
	/**
	 * Assignment for a primitive value
	 */
	private def createValueAssignmentForDeserialization(EList<ArraySize> sizes, Property property) {
		return '''«property.createPropertyValueExpression» = «PropertyEvaluation::findType(property).type.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	/**
	 * Create code to get values from the input buffer.
	 */
	private def createPropertyPrimitiveTypeDeserialization(BaseType classifier) {
		switch (classifier.name) {
			case BaseTypes.STRING.typeName : '''stringRegistry.get(buffer.getInt())'''
			case BaseTypes.BYTE.typeName : '''buffer.get()'''
			case BaseTypes.SHORT.typeName : '''buffer.getShort()'''
			case BaseTypes.INT.typeName : '''buffer.getInt()'''
			case BaseTypes.LONG.typeName : '''buffer.getLong()'''
			case BaseTypes.FLOAT.typeName : '''buffer.getFloat()'''
			case BaseTypes.DOUBLE.typeName : '''buffer.getDouble()'''
			case BaseTypes.CHAR.typeName : '''buffer.getChar()'''
			case BaseTypes.BOOLEAN.typeName : '''buffer.get()==1?true:false'''
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
	private def createPropertyBinarySerialization(Property property) {
		val sizes = property.findType.sizes
		if (sizes.size > 0) {
			'''
				// store array sizes
				«FOR size : sizes»
					«IF (size.size == 0)»
						int _«property.name»_size«sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(sizes.indexOf(size))».length;
						buffer.putInt(_«property.name»_size«sizes.indexOf(size)»);
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(sizes,0,property.name, createValueStoreForSerialization(property))»
			'''
		} else {
			createValueStoreForSerialization(property)
		}
	}
	
	private def createValueStoreForSerialization(Property property) {
		val classifier = PropertyEvaluation::findType(property)
		val getterName = "this." + createGetterValueExpression(property)
		switch (classifier.type.name) {
			case BaseTypes.STRING.typeName : '''buffer.putInt(stringRegistry.get(«getterName»));'''
			case BaseTypes.BYTE.typeName : '''buffer.put((byte)«getterName»);'''
			case BaseTypes.SHORT.typeName : '''buffer.putShort(«getterName»);'''
			case BaseTypes.INT.typeName : '''buffer.putInt(«getterName»);'''
			case BaseTypes.LONG.typeName : '''buffer.putLong(«getterName»);'''
			case BaseTypes.FLOAT.typeName : '''buffer.putFloat(«getterName»);'''
			case BaseTypes.DOUBLE.typeName : '''buffer.putDouble(«getterName»);'''
			case BaseTypes.CHAR.typeName : '''buffer.putChar(«getterName»);'''
			case BaseTypes.BOOLEAN.typeName : '''buffer.put((byte)(«getterName»?1:0));'''
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
	private def createPropertyGetter(Property property) '''
		public final «PropertyEvaluation::findType(property).createTypeName» «property.createGetterName»() {
			return this.«
				if (property.referTo != null)
					'''«property.referTo.createGetterName»()'''
				else
					property.name.protectKeywords»;
		}
		
	'''
			
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
	private def createPropertyGenericAssignments(Iterable<Property> list, int offset) {
		val EList<CharSequence> r = new BasicEList<CharSequence>()
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
	private def String createPropertyGenericAssignment(Property property, int index) 
	'''this.«property.name.protectKeywords» = («property.findType.createObjectTypeName») values[«index»];
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
	private def createPropertyAssignment(Property property) {
		val type = property.findType
		if (BaseTypes.STRING.name.equals(type.type.name) && 
			(type.sizes.size == 0)
		) { // guarantee initialization is always not null in case of plain strings
			'''this.«property.name.protectKeywords» = «property.name.protectKeywords» == null?«if (property.value != null) property.value.createConstantReference(property) else '""'»:«property.name.protectKeywords»;
			'''
		} else
			'''this.«property.name.protectKeywords» = «property.name.protectKeywords»;
			'''
	}
	
	private def createConstantReference(Literal literal, Property property) {
		switch (literal) {
			StringLiteral : property.name.createConstantName.protectKeywords
			ConstantLiteral : literal.value.name
			BuiltInValueLiteral : property.name.createConstantName.protectKeywords
			default : throw new InternalErrorException("constant reference requested for " + literal.class + " which is not defined.")
		}
	}
	
	/**
	 * Create one entry for the constructor parameter sequence.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one parameter for the given property
	 */
	private def createPropertyParameter(Property property) 
		'''final «property.findType.createTypeName» «property.name.protectKeywords»'''
	
			
	/**
	 * Create one entry of the property type array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one type entry 
	 */
	private def createPropertyType(Property property, RecordType type) 
		'''«property.findType.createTypeName».class, // «property.createPropertyFQN(type)»
		'''
}
