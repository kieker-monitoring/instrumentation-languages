package kieker.develop.rl.generator

import java.util.Collection
import kieker.develop.rl.ouput.config.OutletConfiguration

interface IGeneratorProvider {
	def Collection<Class<? extends AbstractRecordTypeGenerator>> getRecordTypeGenerators()
	
	def Collection<Class<? extends AbstractTemplateTypeGenerator>> getTemplateTypeGenerators()
	
	def Collection<OutletConfiguration> getOutletConfigurations()
}