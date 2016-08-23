package kieker.develop.rl.generator.java.record

import java.io.File
import java.util.ArrayList
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
import kieker.develop.rl.typing.base.BaseTypes
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import static extension kieker.develop.rl.generator.java.record.ConstantConstructionModule.*
import static extension kieker.develop.rl.generator.java.record.NameResolver.*
import static extension kieker.develop.rl.generator.java.record.PropertyConstructionModule.*
import static extension kieker.develop.rl.generator.java.record.ValueAccessExpressionModule.*
import static extension kieker.develop.rl.generator.java.record.uid.ComputeUID.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.typing.PropertyResolution.*

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
	 */
	override generate(RecordType type) {
		val allDataProperties = type.collectAllDataProperties
		val allDeclarationProperties = type.collectAllDeclarationProperties

		'''
		«header»package «(type.eContainer as Model).name»;
		
		«type.createImports»
		
		/**
		 * @author «if (type.author == null) author else type.author»
		 * 
		 * @since «if (type.since == null) version else type.since»
		 */
		public «if (type.abstract) 'abstract '»class «type.name» extends «type.createParent»«type.createImplements» {
			private static final long serialVersionUID = «type.computeDefaultSUID»L;
		
			«IF (!type.abstract) »/** Descriptive definition of the serialization size of the record. */
			public static final int SIZE = «if (allDataProperties.size == 0) '0' else allDataProperties.map[property | property.createSizeConstant(type)].join('\n\t\t + ')»
			;

			public static final Class<?>[] TYPES = {
				«allDataProperties.map[property | property.createPropertyTypeArrayEntry(type)].join»
			};«ENDIF»
			
			/* user-defined constants */
			«type.createUserConstants»
			/* default constants */
			«allDeclarationProperties.createDefaultConstants»
			/* property declarations */
			«allDeclarationProperties.createProperties»

			«type.createParameterizedConstructor(allDataProperties, allDeclarationProperties)»
		
			«if (!type.abstract) type.createArrayConstructor(allDeclarationProperties)»
		
			«type.createArrayInitializeConstructor(allDeclarationProperties)»
		
			«type.createBufferReadConstructor(allDeclarationProperties)»
		
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
		
			«type.createPropertyGetters»
		}
		'''
	}
	
	/**
	 * Create buffer initialization constructor.
	 */
	private def createBufferReadConstructor(RecordType type, List<Property> properties) '''
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
			«ENDIF»«properties.map[property | createPropertyBinaryDeserialization(property)].join('\n')»
		}
	'''
	
	/**
	 * Create array initialization constructor.
	 */
	private def createArrayInitializeConstructor(RecordType type, List<Property> properties) '''
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
			«ENDIF»«properties.createPropertyGenericAssignments(if (type.parent!=null) type.parent.collectAllDataProperties.size else 0)»
		}
	'''
		
	/**
	 * Create the parameterized constructor.
	 * 
	 * @param type the record type
	 * @param allDataProperties list of all data properties
	 * @param allDeclarationProperties list of all properties which have been declared in this type 
	 */
	private def createParameterizedConstructor(RecordType type, 
		List<Property> allDataProperties, List<Property> allDeclarationProperties
	) '''
		/**
		 * Creates a new instance of this class using the given parameters.
		 * 
		 «allDataProperties.map[it.createName.createPropertyComment].join»
		 */
		public «type.name»(«allDataProperties.map[property | createPropertyParameter(property)].join(', ')») {
			«if (type.parent!=null) 'super(' + type.parent.collectAllDataProperties.map[name].join(', ')+');'»
			«allDeclarationProperties.map[property | createPropertyAssignment(property)].join»
		}
	'''
	
	/**
	 * Create an arbitrary comment for a property of a monitoring record.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one comment
	 */
	private def createPropertyComment(String name) '''
		* @param «name»
		*            «name»
	'''
	
	/**
	 * Create the array constructor.
	 * 
	 * @param type the record type
	 * @param allDeclarationProperties list of all properties which have been declared in this type
	 */
	private def createArrayConstructor(RecordType type, List<Property> allDeclarationProperties) '''
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
			«ENDIF»«allDeclarationProperties.createPropertyGenericAssignments(if (type.parent!=null)
					type.parent.collectAllDataProperties.size else 0
			)»
		}
	'''
	
		/**
	 * Create all imports for the record.
	 * 
	 * @param type the record type
	 */
	private def createImports(RecordType type) '''
		«IF (!type.abstract)»import java.nio.BufferOverflowException;
		«ENDIF»import java.nio.BufferUnderflowException;
		import java.nio.ByteBuffer;

		«IF (type.parent == null)»import kieker.common.record.AbstractMonitoringRecord;
		import kieker.common.record.IMonitoringRecord;
		«ELSE»import «(type.parent.eContainer as Model).name».«type.parent.name»;
		«ENDIF»import kieker.common.util.registry.IRegistry;
		import kieker.common.util.Version;
		
		«if (type.parents != null && type.parents.size > 0) type.parents.map[i | i.createInterfaceImport].join»
	'''
	
	/**
	 * Create a list of imports for the given type.
	 */	
	private def createInterfaceImport(TemplateType type) '''import «(type.eContainer as Model).name».«type.name»;
	'''
	
	/**
	 * Create string registry access for the given property.
	 * 
	 * @param property 
	 * 
	 * @returns result register access or null
	 */
	private def CharSequence createRegisterStringForProperty(Property property) {
		if (BaseTypes.getTypeEnum(property.type.type).equals(BaseTypes.STRING)) {
			val simpleAction = '''stringRegistry.get(this.«createGetterValueExpression(property)»);'''
			val type = property.findType
			if (type.sizes.size > 0) {
				'''
					// get array length
					«FOR size : type.sizes»
						«IF (size.size == 0)»
							int _«property.createName»_size«type.sizes.indexOf(size)» = this.«property.createName»«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length;
						«ENDIF»
					«ENDFOR»
					«property.type.sizes.createArrayAccessLoops(0, property.createName, simpleAction)»
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
		val simpleTypeAction = createEquals(type.type, property.createGetterValueExpression)
		if (type.sizes.size > 0) {
			'''
				// get array length
				«FOR size : type.sizes»
					«IF (size.size == 0)»
						int _«property.createName»_size«type.sizes.indexOf(size)» = this.«property.createName»«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length;
						if (_«property.createName»_size«type.sizes.indexOf(size)» != castedRecord.«property.createName»«createCodeToDetermineArraySize(type.sizes.indexOf(size))».length)
							return false;
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(type.sizes, 0, property.createName, simpleTypeAction)»
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
	private def CharSequence createEquals(BaseType type, CharSequence getterExpression) throws InternalErrorException {
		switch (BaseTypes.getTypeEnum(type)) {
			case STRING: 
				'''if (!this.«getterExpression».equals(castedRecord.«getterExpression»)) return false;'''
			case FLOAT: 
				'''if (isNotEqual(this.«getterExpression», castedRecord.«getterExpression»)) return false;'''
			case DOUBLE: 
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
						int _«property.createName»_size«sizes.indexOf(size)» = buffer.getInt();
					«ENDIF»
				«ENDFOR»
				this.«property.createName» = new «property.findType.createTypeInstantiationName(property.createName)»;
				«createArrayAccessLoops(sizes,0, property.createName, createValueAssignmentForDeserialization(sizes,property))»
			'''
		} else
			'''this.«property.createName» = «property.findType.type.createPropertyPrimitiveTypeDeserialization»;'''
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
		return '''«property.createPropertyValueExpression» = «property.findType.type.createPropertyPrimitiveTypeDeserialization»;'''
	}
	
	/**
	 * Create code to get values from the input buffer.
	 */
	private def createPropertyPrimitiveTypeDeserialization(BaseType classifier) {
		switch (BaseTypes.getTypeEnum(classifier)) {
			case STRING : '''stringRegistry.get(buffer.getInt())'''
			case BYTE : '''buffer.get()'''
			case SHORT : '''buffer.getShort()'''
			case INT : '''buffer.getInt()'''
			case LONG : '''buffer.getLong()'''
			case FLOAT : '''buffer.getFloat()'''
			case DOUBLE : '''buffer.getDouble()'''
			case CHAR : '''buffer.getChar()'''
			case BOOLEAN : '''buffer.get()==1?true:false'''
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
						int _«property.createName»_size«sizes.indexOf(size)» = this.«property.createGetterName»()«createCodeToDetermineArraySize(sizes.indexOf(size))».length;
						buffer.putInt(_«property.createName»_size«sizes.indexOf(size)»);
					«ENDIF»
				«ENDFOR»
				«createArrayAccessLoops(sizes,0,property.createName, createValueStoreForSerialization(property))»
			'''
		} else {
			createValueStoreForSerialization(property)
		}
	}
	
	private def createValueStoreForSerialization(Property property) {
		val getterName = "this." + createGetterValueExpression(property)
		switch (BaseTypes.getTypeEnum(property.findType.type)) {
			case STRING : '''buffer.putInt(stringRegistry.get(«getterName»));'''
			case BYTE : '''buffer.put((byte)«getterName»);'''
			case SHORT : '''buffer.putShort(«getterName»);'''
			case INT : '''buffer.putInt(«getterName»);'''
			case LONG : '''buffer.putLong(«getterName»);'''
			case FLOAT : '''buffer.putFloat(«getterName»);'''
			case DOUBLE : '''buffer.putDouble(«getterName»);'''
			case CHAR : '''buffer.putChar(«getterName»);'''
			case BOOLEAN : '''buffer.put((byte)(«getterName»?1:0));'''
		}
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
	'''this.«property.createName» = («property.findType.createObjectTypeName») values[«index»];
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
	private def createPropertyAssignment(Property property) throws InternalErrorException {
		val type = property.findType
		if (BaseTypes.STRING == BaseTypes.getTypeEnum(type.type) && 
			type.sizes.size == 0
		) { // guarantee initialization is always not null in case of plain strings
			'''this.«property.createName» = «property.createName» == null?«if (property.value != null) property.value.createConstantReference(property) else '""'»:«property.createName»;
			'''
		} else
			'''this.«property.createName» = «property.createName»;
			'''
	}
	
	private def createConstantReference(Literal literal, Property property) {
		switch (literal) {
			StringLiteral : property.createConstantName 
			ConstantLiteral : literal.createConstantLiteralName
			BuiltInValueLiteral : property.createConstantName
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
		'''final «property.findType.createTypeName» «property.createName»'''
	
			
	/**
	 * Create one entry of the property type array.
	 * 
	 * @param property
	 * 		a property of the record type
	 * 
	 * @returns one type entry 
	 */
	private def createPropertyTypeArrayEntry(Property property, RecordType type) 
		'''«property.findType.createTypeName».class, // «property.createPropertyFQN(type)»
		'''
		
	
	/**
	 * Compute the fully qualified name of a property.
	 * 
	 * @param property
	 * 		the property itself
	 * @param type
	 * 		the present RecordType
	 * 
	 * @returns
	 * 		the FQ property name
	 */
	private def CharSequence createPropertyFQN(Property property, TemplateType type) {
		if (type.properties.contains(property))
			return type.name + '.' + property.name
		else if (type.parents != null) {
			for (TemplateType t : type.parents) {
				val result2 = property.createPropertyFQN(t)
				if (result2 != null)
					return result2
			}
		}
				
		return null
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
	private def CharSequence createPropertyFQN(Property property, RecordType type) {
		if (type.properties.contains(property)) { 
			return type.name + '.' + property.name
		} else {
			if (type.parent!=null) {
				val result = property.createPropertyFQN(type.parent)
				if (result != null)
					return result
			}
			
			if (type.parents != null) {
				for (TemplateType t : type.parents) {
					val result = property.createPropertyFQN(t)
					if (result != null)
						return result
				}
			}
			return null
		}
	}
}
