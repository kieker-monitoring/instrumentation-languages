package kieker.develop.rl.generator.delphi

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Model

class DelphiOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence>  {
	
	private static String DELFI_OUTLET_ID = "delphi.records"
	
	new () {
		super(DELFI_OUTLET_ID, "Delphi", "./src-gen/delphi")
		this.generators += new EventTypeGenerator
	}
												
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
				
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»«type.name».pas'''
}