package kieker.develop.rl.generator.perl

import java.io.File
import kieker.develop.rl.ouput.config.AbstractOutletConfiguration
import kieker.develop.rl.recordLang.ComplexType
import kieker.develop.rl.recordLang.Model

class PerlOutletConfiguration extends AbstractOutletConfiguration<ComplexType, CharSequence> {
	
	new () {
		super("perl", "Perl Output Folder", "./src-gen/perl", GeneratorProvider.LANG_PERL, GeneratorProvider.TECH_KIEKER_PERL)
		generators += new EventTypeGenerator
	}
	
	override outputFilePath(ComplexType type) '''«type.outputDirectory»«File::separator»«type.name».pm'''
	
	override outputDirectory(ComplexType type) '''«(type.eContainer as Model).name.replace('.',File::separator)»'''
	
}