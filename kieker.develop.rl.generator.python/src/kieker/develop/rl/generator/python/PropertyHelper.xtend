package kieker.develop.rl.generator.python

import java.util.List
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.typing.base.BaseTypes
import static extension kieker.develop.rl.typing.PropertyResolution.*
import static extension kieker.develop.rl.typing.TypeResolution.*
import kieker.develop.rl.recordLang.BaseType

class PropertyHelper {
	private static def CharSequence createPropertyAssignment(Property property) throws InternalErrorException {
		'''self.«property.name» = «property.name»
		'''
		}
	}
	
	