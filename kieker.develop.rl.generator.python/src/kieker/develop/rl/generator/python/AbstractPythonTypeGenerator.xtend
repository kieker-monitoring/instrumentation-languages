package kieker.develop.rl.generator.python

import kieker.develop.rl.generator.AbstractTypeGenerator
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.BaseType
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.ConstantLiteral
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.BuiltInValueLiteral
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.generator.InternalErrorException
import java.util.Collection
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.TemplateType
import org.eclipse.emf.common.util.EList
import kieker.develop.rl.recordLang.Classifier

abstract class AbstractPythonTypeGenerator<S extends ComplexType, T> extends AbstractTypeGenerator<S, T> {

    def createAssignment(Property property) {
        System.err.println("createAssignment name=" + property.name)
        if (property.referTo === null)
            return createAssignmentType(property)
        else
            return createAssignmentAlias(property)
    }

    def createAssignmentAlias(Property property) {
        System.err.println("  is alias to " + property.referTo.name)
        '''self.«property.createPropertyParameter» = self.«property.referTo.createPropertyParameter»'''
    }

    def createAssignmentType(Property property) {
        val classifier = if (property.type === null) {
                System.err.println("  is foreign key from " + property.foreignKey.eventType + "." +
                    property.foreignKey.propertyRef.name)
                property.foreignKey.propertyRef.type
            } else {
                System.err.println("  is type " + property.type)
                property.type
            }
        val type = classifier.type
        switch (type) {
            BaseType case BaseTypes.STRING == BaseTypes.getTypeEnum(type) && classifier.sizes.size == 0: '''
            self.«createPropertyParameter(property)» = «if(property.value!==null) '(self.'+ property.value.createConstantReference(property) else '(""'»
                if «property.createPropertyParameter» is None 
                else «property.createPropertyParameter»)'''
            default: '''self.«property.createPropertyParameter» = «property.createPropertyParameter»'''
        }
    }

    def static String getLiteral(Literal literal) {
        switch (literal) {
            IntLiteral: '''«literal.value»'''
            FloatLiteral: '''«literal.value»'''
            BooleanLiteral: '''«if (literal.value) 'True' else 'False'»'''
            ConstantLiteral: '''«literal.value.name»'''
            BuiltInValueLiteral case "KIEKER_VERSION".equals(
                literal.value): '''kieker.common.util.Version.getVERSION()'''
            StringLiteral: '''"«literal.value»"'''
            ArrayLiteral: '''[ «literal.literals.map[element | element.getLiteral].join(if (literal.literals.get(0) instanceof ArrayLiteral) ",\n" else ", ")» ]'''
            default:
                throw new InternalErrorException('Unknown literal type ' + literal.class.name)
        }
    }

    def createPropertyParameter(Property property) {
        '''«property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase»'''
    }

    private static def createConstantReference(Literal literal, Property property) {
        switch (literal) {
            StringLiteral: property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase
            ConstantLiteral: literal.value.name
            BuiltInValueLiteral: property.name.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase
            default: throw new InternalErrorException("constant reference requested for " + literal.class +
                " which is not defined.")
        }
    }

    def getTemplates(EList<TemplateType> parents) {
        '''«parents.map[p|p.name].join(", ")»'''
    }

    def getGetParents(EList<TemplateType> parents) {
        '''
            «if (parents !== null && parents.size > 0) parents.map[p|p.name].join(", ")»
        '''
    }

    def createIncrementAssignment(Property property) {
        '''self.«createPropertyParameter(property)» = «property.value.getLiteral»'''
    }

    def createParameterSerialization(Property property) {
        val type = if (property.type !== null)
                property.type
            else if (property.foreignKey !== null)
                property.foreignKey.propertyRef.type
            else
                null
        '''serializer.put_«createTypeName(type)»(self.«property.createPropertyParameter»)'''
    }

    def createConstantDeclaration(Constant constant) {
        '''«constant.name» = «constant.value.getLiteral»'''
    }

    def createGetter(Property property) {
        '''
            def get_«property.createPropertyParameter»(self):
                self.«property.createPropertyParameter» +=1
                return self.«property.createPropertyParameter»
        '''
    }

    /**
     * Create python type names.
     */
    def createTypeName(Classifier classifier) {
        if (classifier === null)
            return "createTypeName missing classifier"
        switch (classifier.type.name) {
            case 'string': 'string'
            default: classifier.type.name
        }
    }

    /**
     * Create one property for the type declaration.
     */
    def createProperty(Property property) '''«property.name» => $«property.name»'''

    /**
     * 
     */
    def createParameterCall(Collection<Property> list) {
        list.map['''$«name»'''].join(', ')
    }

}
