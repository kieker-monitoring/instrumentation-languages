package kieker.develop.rl.generator.c

import java.io.File
import kieker.develop.rl.generator.c.header.EventTypeGenerator
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*

class COutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	private static String C_OUTLET_ID = "c"
	
	new () {
		super(C_OUTLET_ID, "C", "./src/gen/c")
		this.generators += new EventTypeGenerator
		this.generators += new kieker.develop.rl.generator.c.main.EventTypeGenerator
	}
	
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»«type.name.cstyleName».h'''
	
	override outputDirectory(ComplexType type) '''«type.directoryPathName»'''
	
}