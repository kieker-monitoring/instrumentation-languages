package kieker.develop.rl.generator.java.record.tests

import org.junit.Assert
import org.junit.Test

import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.generator.java.record.NameResolver
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.ArraySize
import java.util.ArrayList

import static extension kieker.develop.rl.generator.java.tests.ModelFactory.*
import kieker.develop.rl.generator.java.tests.ModelFactory
import kieker.develop.rl.recordLang.TemplateType

class TestNameResolver {
	
	private static String PROPERTY_NAME = "propertyName"
	private static String MODEL_NAME = "test.model"
	private static String EVENT_TYPE_NAME = "EventType"
	private static String TEMPLATE_TYPE_NAME = "TemplateType"
	private static String CHILD_TYPE_NAME = "SecondType"


	private static String[] KEYWORDS = #['abstract', 'assert',
		'boolean', 'break', 'byte', 
		'case', 'catch', 'char', 'class', 'const', 'continue',
		'default',  'do', 'double',
		'else', 'enum', 'extends',
		'final', 'finally', 'float', 'for',
		'goto',
		'if', 'implements', 'import', 'instanceof', 'int', 'interface',
		'native', 'new',
		'package', 'private', 'protected', 'public',
		'return', 
		'short', 'static', 'strictfp', 'super',
		'this', 'throw', 'transient', 'try',
		'void', 'volatile', 'while',
		'false', 'null', 'true']
	
	@Test
	def void testCreateGetterName() {
		val property = createProperty(kieker.develop.rl.generator.java.record.tests.TestNameResolver.PROPERTY_NAME, null)
		
		/** for base types. */
		BaseTypes.values.forEach[type |
			property.type = createClassifier(type, null)
		
			val getterName = NameResolver.createGetterName(property)
			
			val constant = if (type == BaseTypes.BOOLEAN) 
				"is" + kieker.develop.rl.generator.java.record.tests.TestNameResolver.PROPERTY_NAME.toFirstUpper
			else
				"get" + kieker.develop.rl.generator.java.record.tests.TestNameResolver.PROPERTY_NAME.toFirstUpper
			
			Assert.assertTrue("Property name generation failed. " + getterName + " vs " + constant, 
				constant.equals(getterName.toString))
		]
		
		/** for array types. */
		val sizes = new ArrayList<ArraySize>
		val bound = RecordLangFactory.eINSTANCE.createArraySize
		bound.size = 4
		sizes += bound
		val unbound = RecordLangFactory.eINSTANCE.createArraySize
		sizes += unbound
		
		BaseTypes.values.forEach[type |
			property.type = createClassifier(type, sizes)
		
			val getterName = NameResolver.createGetterName(property)
			
			val constant = if (type == BaseTypes.BOOLEAN) 
				"is" + kieker.develop.rl.generator.java.record.tests.TestNameResolver.PROPERTY_NAME.toFirstUpper
			else
				"get" + kieker.develop.rl.generator.java.record.tests.TestNameResolver.PROPERTY_NAME.toFirstUpper
			
			Assert.assertTrue("Property name generation failed. " + getterName + " vs " + constant, 
				constant.equals(getterName.toString))
		]
	}
	

	
	
	@Test
	def void testCreateConstantName() {
		
		val property = ModelFactory.createProperty(kieker.develop.rl.generator.java.record.tests.TestNameResolver.PROPERTY_NAME, null)
		
		val name = NameResolver.createConstantName(property)
		val expected = "PROPERTY_NAME"
				
		Assert.assertTrue("Constant names do not match." + name + " vs. " + expected, name.equals(expected))
	}
	
	@Test
	def void testCreatePropertyName() {
		/** test correct keyword protection. */
		KEYWORDS.forEach[keyword |
			val name = NameResolver.createPropertyName(ModelFactory.createProperty(keyword, null))
			Assert.assertTrue("Keyword " + keyword + " not protected.", ('_' + keyword).equals(name))
		]
	}
	
	@Test
	def void testCreatePropertyFQNEventType() {
		val model = ModelFactory.createModel(MODEL_NAME)
		val eventType = ModelFactory.createEventType(EVENT_TYPE_NAME,  null, null)
		val property = ModelFactory.createProperty(PROPERTY_NAME, createClassifier(BaseTypes.INT, null))
		
		val childType = ModelFactory.createEventType(CHILD_TYPE_NAME,  eventType, null) 
		
		eventType.properties += property 
		model.types += eventType
		
		val eventTypeResult = NameResolver.createPropertyFQN(property, eventType)
		val childTypeResult = NameResolver.createPropertyFQN(property, childType)
		
		val expected = EVENT_TYPE_NAME + '.' + PROPERTY_NAME
				
		Assert.assertTrue("FQN property name does not match." + eventTypeResult + " vs. " + expected, eventTypeResult.equals(expected))
		Assert.assertTrue("FQN property name does not match." + childTypeResult + " vs. " + expected, childTypeResult.equals(expected))
	}
	
	
	@Test
	def void testCreatePropertyFQNTemplateType() {
		val model = ModelFactory.createModel(MODEL_NAME)
		val templateType = ModelFactory.createTemplateType(TEMPLATE_TYPE_NAME,  null)
		val property = ModelFactory.createProperty(PROPERTY_NAME, createClassifier(BaseTypes.INT, null))
		
		val inherits = new ArrayList<TemplateType>
		inherits += templateType
		
		val childType = ModelFactory.createTemplateType(CHILD_TYPE_NAME, inherits) 
		
		templateType.properties += property 
		model.types += templateType
		
		val templateTypeResult = NameResolver.createPropertyFQN(property, templateType)
		val childTypeResult = NameResolver.createPropertyFQN(property, childType)
		
		val expected = TEMPLATE_TYPE_NAME + '.' + PROPERTY_NAME
				
		Assert.assertTrue("FQN property name does not match." + templateTypeResult + " vs. " + expected, templateTypeResult.equals(expected))
		Assert.assertTrue("FQN property name does not match." + childTypeResult + " vs. " + expected, childTypeResult.equals(expected))
	}
}