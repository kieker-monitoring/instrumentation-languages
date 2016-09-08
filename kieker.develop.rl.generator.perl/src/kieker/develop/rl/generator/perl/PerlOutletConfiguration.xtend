package kieker.develop.rl.generator.perl

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.Type

class PerlOutletConfiguration extends AbstractOutletConfiguration {
	
	new () {
		super("perl", "Perl Output Folder", "./src-gen/perl")
		eventTypeGenerators += new EventTypeGenerator
	}
	
	override outputFilePath(Type type) '''«type.outputDirectory»«File::separator»«type.name».pm'''
	
	override outputDirectory(Type type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
}