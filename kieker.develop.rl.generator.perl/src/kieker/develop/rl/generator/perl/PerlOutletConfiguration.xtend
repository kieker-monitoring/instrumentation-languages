package kieker.develop.rl.generator.perl

import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.RecordType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import java.io.File
import kieker.develop.rl.recordLang.Model

class PerlOutletConfiguration extends AbstractOutletConfiguration {
	
	new () {
		super("perl", "Perl Output Folder", "./src-gen/perl")
		generators += new RecordTypeGenerator
	}
	
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»«type.name».pm'''
	
	override outputDirectory(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
}