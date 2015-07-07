package de.cau.cs.se.instrumentation.rl.generator.java.junit

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Literal
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation
import java.io.File
import java.util.ArrayList
import java.util.Calendar
import java.util.Collection
import java.util.List

import static extension de.cau.cs.se.instrumentation.rl.generator.java.IRL2JavaTypeMappingExtensions.*

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
	
	/**
	 * Return the unique id.
	 */
	override getId() '''java.junit'''
	
	/**
	 * Return the preferences activation description.
	 */
	override getDescription() '''JUnit tests for records'''
	
	/**
	 * No junit test for abstract record types.
	 */
	override boolean supportsAbstractRecordType()  { false }
	
	override getDirectoryName(Type type) '''«(type.eContainer as Model).name.createTestPackageName.replace('.',File::separator)»'''

	override getFileName(Type type) '''«type.getDirectoryName»«File::separator»TestGenerated«type.name».java'''
	
	override getOutletType() '''junit'''
	
	override createContent(RecordType type, String author, String version) {
		if (type.abstract)
			return null
		val allDataProperties = PropertyEvaluation::collectAllDataProperties(type)
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
		
		package «(type.eContainer as Model).name.createTestPackageName»;
		
		import java.nio.ByteBuffer;
		
		import org.junit.Assert;
		import org.junit.Test;
		
		import «(type.eContainer as Model).name».«type.name»;
		import kieker.common.util.registry.IRegistry;
		import kieker.common.util.registry.Registry;
		
		import kieker.test.common.junit.AbstractGeneratedKiekerTest;
		import kieker.test.common.util.record.BookstoreOperationExecutionRecordFactory;
				
		/**
		 * Creates {@link OperationExecutionRecord}s via the available constructors and
		 * checks the values passed values via getters.
		 * 
		 * @author «author»
		 * 
		 * @since «version»
		 */
		public class TestGenerated«type.name» extends AbstractGeneratedKiekerTest {
		
			public TestGenerated«type.name»() {
				// empty default constructor
			}
		
			/**
			 * Tests {@link «type.name»#Test«type.name»(String, String, long, long, long, String, int, int)}.
			 */
			@Test
			public void testToArray() { // NOPMD (assert missing)
			for (int i=0;i<ARRAY_LENGTH;i++) {
					// initialize
					«type.name» record = new «type.name»(«allDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
					
					// check values
					«allDataProperties.createAllGetterValueAssertions(type)»
					
					Object[] values = record.toArray();
					
					Assert.assertNotNull("Record array serialization failed. No values array returned.", values);
					Assert.assertEquals("Record array size does not match expected number of properties «allDataProperties.size».", «allDataProperties.size», values.length);
					
					// check all object values exist
					«allDataProperties.createAllValueExistAssertions»
					
					// check all types
					«allDataProperties.createAllTypeAssertions»
										
					// check all object values 
					«allDataProperties.createAllValueAssertions»
				}
			}
			
			/**
			 * Tests {@link «type.name»#Test«type.name»(String, String, long, long, long, String, int, int)}.
			 */
			@Test
			public void testBuffer() { // NOPMD (assert missing)
				for (int i=0;i<ARRAY_LENGTH;i++) {
					// initialize
					«type.name» record = new «type.name»(«allDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
					
					// check values
					«allDataProperties.createAllGetterValueAssertions(type)»
				}
			}
			
			/**
			 * Tests {@link «type.name»#Test«type.name»(String, String, long, long, long, String, int, int)}.
			 */
			@Test
			public void testParameterConstruction() { // NOPMD (assert missing)
				for (int i=0;i<ARRAY_LENGTH;i++) {
					// initialize
					«type.name» record = new «type.name»(«allDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
					
					// check values
					«allDataProperties.createAllGetterValueAssertions(type)»
				}
			}
		}
		'''
	}
	
	private def createAllValueExistAssertions(Collection<Property> properties) {
		val List<CharSequence> result = new ArrayList<CharSequence>()
		properties.forEach[property, index | result.add(property.createValueExistAssertion(index))]
		
		return result.join
	}
	
	private def CharSequence createValueExistAssertion(Property property, Integer index) '''
		Assert.assertNotNull("Array value [«index»] of type «property.type.class_.createPrimitiveWrapperTypeName» must be not null.", values[«index»]); 
	'''
	
	/**
	 * This routine is ugly.
	 * Collect all value assertions
	 */
	private def createAllValueAssertions(Collection<Property> properties) {
		val List<CharSequence> result = new ArrayList<CharSequence>()
		properties.forEach[property, index | result.add(property.createValueAssertion(index))]
		
		return result.join
	}
	
	private def createValueAssertion(Property property, Integer index) '''
		Assert.assertEquals("Array value [«index»] " + values[«index»] + " does not match the desired value " + «property.createPropertyValueSet»,
			«IF property.type.class_.name == 'float' || property.type.class_.name == 'double'»
				«property.getCastToPrimitiveType» «createPropertyValueSet(property)», «property.getCastToPrimitiveType» («property.type.class_.createPrimitiveWrapperTypeName»)values[«index»], 0.0000001
			«ELSEIF property.type.class_.name == 'string'»
				«property.createPropertyValueSet» == null?"«property.createConstantValue»":«property.createPropertyValueSet», values[«index»]
			«ELSE»
				«property.createPropertyValueSet», values[«index»]
		«ENDIF»);
	'''
	
	/**
	 * Create constant value for string.
	 */
	private def String createConstantValue(Property property) {
		if (property.value != null)
			return this.createConstantValue(property.value)
		else
			return ""
	}
	
	private def String createConstantValue(Literal value) {
		switch (value) {
			StringLiteral :	return (value as StringLiteral).value
			FloatLiteral : return (value as FloatLiteral).value.toString
			IntLiteral : return (value as IntLiteral).value.toString
			ConstantLiteral : return createConstantValue((value as ConstantLiteral).value.value)
			default : return ""	
		}
	}
	
	/**
	 * Returns a string representing a type case in Java iff
	 * the type is not of type string.
	 */
	private def getCastToPrimitiveType(Property property) {
		if ('string'.equals(property.type.class_.name)) {
			return ""
		} else {
			return '(' + property.type.class_.name + ')'			
		}
	}
	
	/**
	 * Create assertions to test each return value from a getter of a record.
	 * 
	 * @param properties list of all data properties of a type
	 * @param type the RecordType itself
	 */
	private def createAllGetterValueAssertions(Collection<Property> properties, RecordType type) '''
		«FOR property : properties»
			Assert.assertEquals("«type.name».«property.name» values are not equal.", «IF property.type.class_.name == 'float' || property.type.class_.name == 'double'»
				«property.getCastToPrimitiveType» «property.createPropertyValueSet», record.get«property.name.toFirstUpper»(), 0.0000001);
			«ELSEIF property.type.class_.name == 'boolean'»
				«property.createPropertyValueSet», Boolean.valueOf(record.is«property.name.toFirstUpper»()));
			«ELSEIF property.type.class_.name == 'string'»
				«property.createPropertyValueSet» == null?"«property.createConstantValue»":«property.createPropertyValueSet», record.get«property.name.toFirstUpper»());
			«ELSE»
				«property.getCastToPrimitiveType» «property.createPropertyValueSet», record.get«property.name.toFirstUpper»());
			«ENDIF»
		«ENDFOR»
	'''
	
	/**
	 * This routine is ugly.
	 * Collects all type assertions.
	 */
	private def createAllTypeAssertions(Collection<Property> properties) {
		val List<CharSequence> result = new ArrayList<CharSequence>()
		properties.forEach[property, index | result.add(property.createTypeAssertion(index))]
		
		return result.join
	}
	
	private def createTypeAssertion(Property property, Integer index) '''
		Assert.assertTrue("Type of array value [«index»] " + values[«index»].getClass().getCanonicalName() + " does not match the desired type «property.type.class_.createPrimitiveWrapperTypeName»", values[«index»] instanceof «property.type.class_.createPrimitiveWrapperTypeName»);
	'''

	/**
	 * Produce a type conform value for input. This only works for primitive types.
	 */
	private def createPropertyValueSet(Property property) '''«property.type.class_.name.toUpperCase»_VALUES.get(i % «property.type.class_.name.toUpperCase»_VALUES.size())'''
	
	
	/**
	 * Reconstruct the package name out of the record package name.
	 * kieker.common.record -> kieker.test.common.junit.record
	 * All other structures are converted by adding .junit to the package hierarchy
	 */
	private def createTestPackageName(String name) {
		if (name.contains("kieker.common.record")) 
			return name.replaceAll("kieker\\.common\\.record", "kieker.test.common.junit.record")
		else
			return name + ".junit"
	}
		
		
}