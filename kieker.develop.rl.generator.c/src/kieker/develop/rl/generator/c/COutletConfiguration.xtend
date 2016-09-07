package kieker.develop.rl.generator.c

import java.io.File
import kieker.develop.rl.generator.c.header.RecordTypeGenerator
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Type

import static extension kieker.develop.rl.generator.c.CommonCFunctionsExtension.*

class COutletConfiguration extends AbstractOutletConfiguration {
	
	private static String C_OUTLET_ID = "c"
	
	new () {
		super(C_OUTLET_ID, "C", "./src/gen/c")
		this.generators += new RecordTypeGenerator
		this.generators += new kieker.develop.rl.generator.c.main.RecordTypeGenerator
	}
	
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»«type.name.cstyleName».h'''
	
	override outputDirectory(Type type) '''«type.directoryPathName»'''
	
}