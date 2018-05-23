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
package kieker.develop.rl.tests

import com.google.inject.Inject
import kieker.develop.rl.recordLang.Model
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import kieker.develop.rl.typing.base.BaseTypes
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.EventType
import java.util.Map
import java.util.HashMap
import org.eclipse.emf.ecore.util.EcoreUtil

import kieker.develop.rl.tests.CodeTemplates
import kieker.develop.rl.recordLang.BaseType

@RunWith(XtextRunner)
@InjectWith(RecordLangInjectorProvider)
class RecordLangParsingTest{
	
	private static String PACKAGE_NAME = "test.record"
	private static String BASE_ET_NAME = "Base"
	private static String EXTENDED_ET_NAME = "Extended"
	private static String INT_PROPERTY = "intProperty"
	private static String STRING_PROPERTY = "stringProperty"
	
	private static ITemplates code = new CodeTemplates()

	@Inject
	ParseHelper<Model> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse(minimalModel)
		
		/** asserts */
		result.testModel

		Assert.assertNotNull("Event type does not exist", result.types.size == 1)
		val entity = result.types.get(0)
		val properties = new HashMap<BaseTypes,String>()
		properties.put(BaseTypes.INT, INT_PROPERTY)
		
		entity.testEntity(BASE_ET_NAME, properties)
	}
	
	// @Test test deactivated, as results on Jenkins report error with proxy
	def void checkInheritance() {
		val result = parseHelper.parse(inheritanceModel)
				
		/** asserts */
		result.testModel
		Assert.assertNotNull("Event types do not exist (2)", result.types.size == 2)
		
		var entity1 = result.types.get(0)
		if (entity1.eIsProxy)
			entity1 = EcoreUtil.resolve(entity1, result) as ComplexType
		
		val properties1 = new HashMap<BaseTypes,String>()
		properties1.put(BaseTypes.INT, INT_PROPERTY)
		
		entity1.testEntity(BASE_ET_NAME, properties1)
		
		var entity2 = result.types.get(1)
		if (entity2.eIsProxy)
			entity2 = EcoreUtil.resolve(entity2, result) as ComplexType
			
		val properties2 = new HashMap<BaseTypes,String>()
		properties2.put(BaseTypes.STRING, STRING_PROPERTY)
			
		entity2.testEntity(EXTENDED_ET_NAME, properties2)
		
		Assert.assertNotNull("Parent reference is null", (entity2 as EventType).parent)
		Assert.assertEquals("Wrong parent event type", entity1, (entity2 as EventType).parent)
	}
		
	/**
	 * Test whether the given type is an EventType and the properties match.
	 */
	def void testEntity(ComplexType type, String name, Map<BaseTypes,String> properties) {
		if (type instanceof EventType) {
			val entity = type as EventType
			Assert.assertEquals("Event type is not named " + name, entity.name, name)
			Assert.assertFalse("Event type has more properties than expected", (entity.properties.size > properties.size))
			Assert.assertFalse("Event type has less properties than expected", (entity.properties.size < properties.size))
		
			properties.forEach[key, value, i | 
				val property = entity.properties.get(i)
				Assert.assertTrue("Property " + name + "." + value + " does not exist", property.name.equals(value))
				Assert.assertTrue("Property " + name + "." + value + " is not typed " + key.name,
					BaseTypes.getTypeEnum(property.type.type as BaseType) == key
				)
			]
		} else
			Assert.fail("Type is not an EventType; found" + type.toString)
	}
	
	private def minimalModel() {
		code.model(PACKAGE_NAME, code.eventType(BASE_ET_NAME, false, null, null, code.simpleProperty(BaseTypes.INT, INT_PROPERTY)))	
	}
	
	private def inheritanceModel() {
		code.model(PACKAGE_NAME,
			code.eventType(BASE_ET_NAME, false, null, null, 
				code.simpleProperty(BaseTypes.INT, INT_PROPERTY)
			) +
			code.eventType(EXTENDED_ET_NAME, false, BASE_ET_NAME, null, 
				code.simpleProperty(BaseTypes.STRING, STRING_PROPERTY)
			)
		)
	}
	
	private def testModel(Model result) {
		Assert.assertNotNull(result)
		Assert.assertEquals("Package name does not match", result.name, PACKAGE_NAME)
	}
}
