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
package kieker.develop.rl.generator.java.tests

import java.util.ArrayList
import kieker.develop.rl.generator.java.JavaTypeMapping
import kieker.develop.rl.recordLang.ArraySize
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.typing.base.BaseTypes
import org.junit.Assert
import org.junit.Test

import static extension kieker.develop.rl.generator.java.tests.ModelFactory.*

class JavaTypeMappingTest {
		
	static int ARRAY_DIMENSION = 10
	
	/**
	 * Primitive type names are all lower case, except strings, which follow Java class notation.
	 */
	@Test
	def void testCreateJavaTypeName() {
		BaseTypes.values.forEach[type |
			val baseType = RecordLangFactory.eINSTANCE.createBaseType
			baseType.name = type.name.toLowerCase
			
			val typeName = type.createTypeName
			
			val name = JavaTypeMapping.createJavaTypeName(baseType)
				
			Assert.assertTrue("Type names do not match. " + name + " vs " + typeName, name.equals(typeName))	
		]
	}
	
	
	/**
	 * Test the correct wrapper class names. All first letter upper case. 
	 */
	@Test
	def void testCreateJavaObjectTypeName() {
		BaseTypes.values.forEach[type |
			val baseType = RecordLangFactory.eINSTANCE.createBaseType
			baseType.name = type.name.toLowerCase
			
			val typeName = type.createObjectTypeName
			
			val name = JavaTypeMapping.createJavaObjectTypeName(baseType)
				
			Assert.assertTrue("Type names do not match. " + name + " vs " + typeName, name.equals(typeName))	
		]
	}
	
	@Test
	def void testCreateTypeName() {
		/** base types. */
		BaseTypes.values.forEach[type |
			val classifier = type.createClassifier(null)
			val resultTypeName = JavaTypeMapping.createTypeName(classifier)
			
			val typeName = if (type == BaseTypes.STRING)
				"String"
			else
				type.name.toLowerCase
				
			Assert.assertTrue("Type names do not match. " + typeName + " vs " + resultTypeName, resultTypeName.equals(typeName))					
		]
		
		/** arrays. */
		val sizes = new ArrayList<ArraySize>
		val bound = RecordLangFactory.eINSTANCE.createArraySize
		bound.size = 4
		sizes += bound
		val unbound = RecordLangFactory.eINSTANCE.createArraySize
		sizes += unbound
		BaseTypes.values.forEach[type |
			val classifier = type.createClassifier(null)
			val resultTypeName = JavaTypeMapping.createTypeName(classifier)
			
			val typeName = if (type == BaseTypes.STRING)
				"String"
			else
				type.name.toLowerCase
				
			Assert.assertTrue("Type names do not match. " + typeName + " vs " + resultTypeName, resultTypeName.equals(typeName))					
		]
	}
	
	@Test
	def void testCreateObjectTypeName() {
		/** base types. */
		BaseTypes.values.forEach[type |
			val classifier = type.createClassifier(null)
			val resultTypeName = JavaTypeMapping.createTypeName(classifier)
			
			val typeName = if (type == BaseTypes.STRING)
				"String"
			else
				type.name.toLowerCase
				
			Assert.assertTrue("Type names do not match. " + typeName + " vs " + resultTypeName, resultTypeName.equals(typeName))					
		]
		
		/** arrays. */
		val sizes = new ArrayList<ArraySize>
		val bound = RecordLangFactory.eINSTANCE.createArraySize
		bound.size = 4
		sizes += bound
		val unbound = RecordLangFactory.eINSTANCE.createArraySize
		sizes += unbound
		BaseTypes.values.forEach[type |
			val classifier = type.createClassifier(null)
			val resultTypeName = JavaTypeMapping.createTypeName(classifier)
			
			val typeName = if (type == BaseTypes.STRING)
				"String"
			else
				type.name.toLowerCase
				
			Assert.assertTrue("Type names do not match. " + typeName + " vs " + resultTypeName, resultTypeName.equals(typeName))					
		]
	}
	
	@Test
	def void testCreateArrayTypeName() {	
		val sizes = new ArrayList<ArraySize>
		var example = BaseTypes.INT.name.toLowerCase
		
		for(var i=0; i< ARRAY_DIMENSION ; i++) {
			val bound = RecordLangFactory.eINSTANCE.createArraySize
			bound.size = 4
			sizes += bound
			example += '[]'
		}
		
		val classifier = ModelFactory.createClassifier(BaseTypes.INT, sizes)
		
		val name = JavaTypeMapping.createArrayTypeName(classifier)
			
		Assert.assertTrue("Classifier name do not match. " + name + " vs. " + example, name.equals(example))
	}
		
	private def createTypeName(BaseTypes type) {
		 if (type == BaseTypes.STRING)
				"String"
			else
				type.name.toLowerCase
	}
	
	private def createObjectTypeName(BaseTypes type) {
		return switch(type) {
			case BOOLEAN : "Boolean"
			case BYTE : "Byte"
			case CHAR : "Character"
			case DOUBLE : "Double"
			case FLOAT : "Float"
			case INT : "Integer"
			case LONG : "Long"
			case SHORT : "Short"
			case STRING : "String"
		}
	}

}