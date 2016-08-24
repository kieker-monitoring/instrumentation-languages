package kieker.develop.rl.generator;

import java.util.Collection;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator;
import kieker.develop.rl.ouput.config.OutletConfiguration;

@SuppressWarnings("all")
public interface IGeneratorProvider {
  public abstract Collection<Class<? extends AbstractRecordTypeGenerator>> getRecordTypeGenerators();
  
  public abstract Collection<Class<? extends AbstractTemplateTypeGenerator>> getTemplateTypeGenerators();
  
  public abstract Collection<OutletConfiguration> getOutletConfigurations();
}
