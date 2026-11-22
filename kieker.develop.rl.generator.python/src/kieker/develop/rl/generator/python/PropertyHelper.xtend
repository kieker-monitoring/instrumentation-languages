package kieker.develop.rl.generator.python

import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.Property

class PropertyHelper {
    static def CharSequence createPropertyAssignment(Property property) throws InternalErrorException {
        '''self.«property.name» = «property.name»
        '''
    }
}
