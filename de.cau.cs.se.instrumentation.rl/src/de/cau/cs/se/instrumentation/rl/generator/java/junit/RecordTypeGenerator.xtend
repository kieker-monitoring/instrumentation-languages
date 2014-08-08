package de.cau.cs.se.instrumentation.rl.generator.java.junit

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import java.io.File
import org.eclipse.emf.ecore.EClassifier
import de.cau.cs.se.instrumentation.rl.validation.PropertyEvaluation
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import java.util.Collection
import java.util.List
import java.util.ArrayList

class RecordTypeGenerator extends AbstractRecordTypeGenerator {
	
	override createContent(RecordType type, String author, String version) {
		val allDataProperties = PropertyEvaluation::collectAllDataProperties(type)
		'''
		/***************************************************************************
		 * Copyright 2014 Kieker Project (http://kieker-monitoring.net)
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
		
		import kieker.test.common.junit.AbstractKiekerTest;
		import kieker.test.common.junit.TestValueRangeConstants;
		import kieker.test.common.util.record.BookstoreOperationExecutionRecordFactory;
				
		/**
		 * Creates {@link OperationExecutionRecord}s via the available constructors and
		 * checks the values passed values via getters.
		 * 
		 * @author «author»
		 * 
		 * @since «version»
		 */
		public class Test«type.name» extends AbstractKiekerTest {
		
			public Test«type.name»() {
				// empty default constructor
			}
		
			/**
			 * Tests {@link «type.name»#Test«type.name»(String, String, long, long, long, String, int, int)}.
			 */
			@Test
			public void testToArray() { // NOPMD (assert missing)
			for (int i=0;i<TestValueRangeConstants.ARRAY_LENGTH;i++) {
					// initialize
					«type.name» record = new «type.name»(«allDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
					
					// check values
					«allDataProperties.createAllGetterValueAssertions(type)»
					
					Object[] values = record.toArray();
					
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
				for (int i=0;i<TestValueRangeConstants.ARRAY_LENGTH;i++) {
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
				for (int i=0;i<TestValueRangeConstants.ARRAY_LENGTH;i++) {
					// initialize
					«type.name» record = new «type.name»(«allDataProperties.map[property | createPropertyValueSet(property)].join(', ')»);
					
					// check values
					«allDataProperties.createAllGetterValueAssertions(type)»
				}
			}
		'''
	}
	
	/**
	 * This routine is ugly.
	 * Collect all value assertions
	 */
	def createAllValueAssertions(Collection<Property> properties) {
		val List<CharSequence> result = new ArrayList<CharSequence>()
		properties.forEach[property, index | result.add(property.createValueAssertion(index))]
		
		return result.join
	}
	
	def createValueAssertion(Property property, Integer index) {
		'''
			«IF property.type.class_.name == 'float' || property.type.class_.name == 'double'»
				Assert.assertEquals("Value «index» in array does not match the desired value.", «createPropertyValueSet(property)», («property.getObjectType»)values[«index»], 0.0000001);
			«ELSE»
				Assert.assertEquals("Value «index» in array does not match the desired value.", «createPropertyValueSet(property)», («property.getObjectType»)values[«index»]);
			«ENDIF»
		'''
	}
	
	/**
	 * Create assertions to test each return value from a getter of a record.
	 * 
	 * @param properties list of all data properties of a type
	 * @param type the RecordType itself
	 */
	def createAllGetterValueAssertions(Collection<Property> properties, RecordType type) '''
		«FOR property : properties»
			«IF property.type.class_.name == 'float' || property.type.class_.name == 'double'»
				Assert.assertEquals("«type.name».«property.name» values are not equal.", «createPropertyValueSet(property)», record.get«property.name.toFirstUpper»(), 0.0000001);
			«ELSE»
				Assert.assertEquals("«type.name».«property.name» values are not equal.", «createPropertyValueSet(property)», record.get«property.name.toFirstUpper»());
			«ENDIF»
		«ENDFOR»
	'''
	
	/**
	 * This routine is ugly.
	 * Collects all type assertions.
	 */
	def createAllTypeAssertions(Collection<Property> properties) {
		val List<CharSequence> result = new ArrayList<CharSequence>()
		properties.forEach[property, index | result.add(property.createTypeAssertion(index))]
		
		return result.join
	}
	
	def createTypeAssertion(Property property, Integer index) {
		'''Assert.assertTrue("Type of Value «index» in array does not match the desired type.", values[«index»] instanceof «property.getObjectType»);'''
	}
	
	def getGetObjectType(Property property) {
		switch (property.type.class_.name) {
			case 'int' : 'Integer'
			case 'long' : 'Long'
			case 'short' : 'Short'
			case 'double' : 'Double'
			case 'float' : 'Float'
			case 'char' : 'Character'
			case 'byte' : 'Byte'
			case 'string' : 'String'
			case 'boolean' : 'Boolean'
			default : property.type.class_.name			
		}
	}
	
	/**
	 * Produce a type conform value for input. This only works for primitive types.
	 */
	def createPropertyValueSet(Property property) '''TestValueRangeConstants.«property.type.class_.name.toUpperCase»_VALUES[i%TestValueRangeConstants.«property.type.class_.name.toUpperCase»_VALUES.length]'''
	
	
	/**
	 * Reconstruct the package name out of the record package name.
	 * kieker.common.record -> kieker.test.common.junit.record
	 * All other structures are converted by adding .junit to the package hierarchy
	 */
	def createTestPackageName(String name) {
		if (name.contains("kieker.common.record")) 
			return name.replaceAll("kieker\\.common\\.record", "kieker.test.common.junit.record")
		else
			return name + ".junit"
	}
	
	override directoryName(Type type) '''«(type.eContainer as Model).name.createTestPackageName.replace('.',File::separator)»'''

	override fileName(Type type) '''«type.directoryName»«File::separator»Test«type.name».java'''
	
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
			case 'int' : 'int'
			case 'long' : 'long'
			case 'short' : 'short'
			case 'double' : 'double'
			case 'float' : 'float'
			case 'char' : 'char'
			case 'byte' : 'byte'
			case 'string' : 'String'
			case 'boolean' : 'boolean'
			default : classifier.name
		}	
	}
	
	override getLanguageType() '''junit'''
	
}