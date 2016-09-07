package kieker.develop.rl.generator.delphi

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Type

class DelphiOutletConfiguration extends AbstractOutletConfiguration {
	
	private static String DELFI_OUTLET_ID = "delphi.records"
	
	new () {
		super(DELFI_OUTLET_ID, "Delphi", "./src-gen/delphi")
		this.generators += new kieker.develop.rl.generator.delphi.RecordTypeGenerator
	}
												
	override outputDirectory(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
				
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»«type.name».pas'''
}