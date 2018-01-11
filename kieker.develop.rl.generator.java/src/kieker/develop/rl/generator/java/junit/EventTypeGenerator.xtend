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
package kieker.develop.rl.generator.java.junit

import java.util.ArrayList
import java.util.Collection
import java.util.List
import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.StringLiteral

import static extension kieker.develop.rl.generator.java.JavaTypeMapping.*
import static extension kieker.develop.rl.generator.java.junit.NameResolver.*
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.generator.Version
import kieker.develop.rl.generator.java.GeneratorFeatures

/**
 * Java test class generator for event types.
 * 
 * @since 1.1
 * @author Reiner Jung
 */
class EventTypeGenerator extends AbstractTypeGenerator<EventType, CharSequence> {
	
	/** Unit tests are only produced for non abstract classes which define properties.  */
	override accepts(ComplexType type) {
		if (type instanceof EventType) {
			!(type as EventType).abstract && (type.collectAllPersistentDataProperties.size > 0)
		} else
			false
	}
		
	/**
	 * Main generator method.
	 */
	protected override createOutputModel(EventType type, Version targetVersion, String header, String author, String version) {
		val allPersistentDataProperties = type.collectAllPersistentDataProperties
		
		'''
		«header»package «(type.eContainer as Model).name.createTestPackageName»;
				
		import org.junit.Assert;
		import org.junit.Test;
		
		import «(type.eContainer as Model).name».«type.name»;
		
		import kieker.test.common.junit.AbstractGeneratedKiekerTest;
				
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
		
			«IF allPersistentDataProperties.size() > 0»
			«if (isSupported(GeneratorFeatures.ARRAY_SERIALIZER)) type.createTestToArray(allPersistentDataProperties)»
			
			«type.createTestBuffer(allPersistentDataProperties)»
			
			«type.createTestParameterConstruction(allPersistentDataProperties)»
			
			«type.createTestEquality(allPersistentDataProperties)»
			
			«type.createTestUnequality(allPersistentDataProperties)»
			«ENDIF»
		}
		'''
	}
	
	/**
	 * Create the test of equality.
	 */
	private def createTestUnequality(EventType type, List<Property> allPersistentDataProperties) '''
		@Test
		public void testUnequality() {
			int i = 0;
			«type.name» oneRecord = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
			i = 2;
			«type.name» anotherRecord = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
			
			Assert.assertNotEquals(oneRecord, anotherRecord);
		}
	'''
	
	/**
	 * 
	 */
	private def createTestEquality(EventType type, List<Property> allPersistentDataProperties) '''
		@Test
		public void testEquality() {
			int i = 0;
			«type.name» oneRecord = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
			i = 0;
			«type.name» copiedRecord = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
			
			Assert.assertEquals(oneRecord, copiedRecord);
		}	
	'''
	
	/**
	 * 
	 */
	private def createTestParameterConstruction(EventType type, List<Property> allPersistentDataProperties) '''
		/**
		 * Tests {@link «type.name»#Test«type.name»(«allPersistentDataProperties.map[property | property.findType.type.name].join(', ')»)}.
		 */
		@Test
		public void testParameterConstruction() { // NOPMD (assert missing)
			for (int i=0;i<ARRAY_LENGTH;i++) {
				// initialize
				«type.name» record = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
				
				// check values
				«allPersistentDataProperties.createAllGetterValueAssertions(type)»
			}
		}
	'''
	
	/**
	 * 
	 */
	private def createTestBuffer(EventType type, List<Property> allPersistentDataProperties) '''
		/**
		 * Tests {@link «type.name»#Test«type.name»(«allPersistentDataProperties.map[property | property.findType.type.name].join(', ')»)}.
		 */
		@Test
		public void testBuffer() { // NOPMD (assert missing)
			for (int i=0;i<ARRAY_LENGTH;i++) {
				// initialize
				«type.name» record = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
				
				// check values
				«allPersistentDataProperties.createAllGetterValueAssertions(type)»
			}
		}
	'''
	
	/**
	 * Create test to array.
	 */
	private def createTestToArray(EventType type, List<Property> allPersistentDataProperties) '''
		/**
		 * Tests {@link «type.name»#Test«type.name»(«allPersistentDataProperties.map[property | property.findType.type.name].join(', ')»)}.
		 */
		@Test
		public void testToArray() { // NOPMD (assert missing)
			for (int i=0;i<ARRAY_LENGTH;i++) {
				// initialize
				«type.name» record = new «type.name»(«allPersistentDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
				
				// check values
				«allPersistentDataProperties.createAllGetterValueAssertions(type)»
				
				Object[] values = record.toArray();
				
				Assert.assertNotNull("Record array serialization failed. No values array returned.", values);
				Assert.assertEquals("Record array size does not match expected number of properties «allPersistentDataProperties.size».", «allPersistentDataProperties.size», values.length);
				
				// check all object values exist
				«allPersistentDataProperties.createAllValueExistAssertions»
				
				// check all types
				«allPersistentDataProperties.createAllTypeAssertions»
									
				// check all object values 
				«allPersistentDataProperties.createAllValueAssertions»
			}
		}
	'''
	
	private def createAllValueExistAssertions(Collection<Property> properties) {
		val List<CharSequence> result = new ArrayList<CharSequence>()
		properties.forEach[property, index | result.add(property.createValueExistAssertion(index))]
		
		return result.join
	}
	
	private def CharSequence createValueExistAssertion(Property property, Integer index) '''
		Assert.assertNotNull("Array value [«index»] of type «property.type.type.createPrimitiveWrapperTypeName» must be not null.", values[«index»]); 
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
			«IF property.type.type.name == 'float' || property.type.type.name == 'double'»
				«property.getCastToPrimitiveType» «createPropertyValueSet(property)», «property.getCastToPrimitiveType» («property.type.type.createPrimitiveWrapperTypeName»)values[«index»], 0.0000001
			«ELSEIF property.type.type.name == 'string'»
				«property.createPropertyValueSet» == null?«property.createConstantValue»:«property.createPropertyValueSet», values[«index»]
			«ELSE»
				«property.createPropertyValueSet», values[«index»]
		«ENDIF»);
	'''
	
	/**
	 * Create constant value for string.
	 */
	private def String createConstantValue(Property property) {
		if (property.value !== null)
			return this.createConstantValue(property.value)
		else
			return '""'
	}
	
	private def String createConstantValue(Literal value) {
		switch (value) {
			StringLiteral :	return '"' + (value as StringLiteral).value + '"'
			FloatLiteral : return (value as FloatLiteral).value.toString
			IntLiteral : return (value as IntLiteral).value.toString
			ConstantLiteral : return createConstantValue((value as ConstantLiteral).value.value)
			BuiltInValueLiteral case "KIEKER_VERSION".equals(value.value): '''kieker.common.util.Version.getVERSION()'''
			default : return '""'
		}
	}
	
	/**
	 * Returns a string representing a type case in Java iff
	 * the type is not of type string.
	 */
	private def getCastToPrimitiveType(Property property) {
		if ('string'.equals(property.type.type.name)) {
			return ""
		} else {
			return '(' + property.type.type.name + ')'			
		}
	}
	
	/**
	 * Create assertions to test each return value from a getter of a record.
	 * 
	 * @param properties list of all data properties of a type
	 * @param type the EventType itself
	 */
	private def createAllGetterValueAssertions(Collection<Property> properties, EventType type) '''
		«FOR property : properties»
			Assert.assertEquals("«type.name».«property.name» values are not equal.", «IF property.type.type.name == 'float' || property.type.type.name == 'double'»
				«property.getCastToPrimitiveType» «property.createPropertyValueSet», record.get«property.name.toFirstUpper»(), 0.0000001);
			«ELSEIF property.type.type.name == 'boolean'»
				«property.createPropertyValueSet», Boolean.valueOf(record.is«property.name.toFirstUpper»()));
			«ELSEIF property.type.type.name == 'string'»
				«property.createPropertyValueSet» == null?«property.createConstantValue»:«property.createPropertyValueSet», record.get«property.name.toFirstUpper»());
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
		Assert.assertTrue("Type of array value [«index»] " + values[«index»].getClass().getCanonicalName() + " does not match the desired type «property.type.type.createPrimitiveWrapperTypeName»", values[«index»] instanceof «property.type.type.createPrimitiveWrapperTypeName»);
	'''

	/**
	 * Produce a type conform value for input. This only works for primitive types.
	 */
	private def createPropertyValueSet(Property property) '''«property.type.type.name.toUpperCase»_VALUES.get(i % «property.type.type.name.toUpperCase»_VALUES.size())'''
	
		
}
