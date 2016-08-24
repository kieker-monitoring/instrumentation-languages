package kieker.develop.rl.generator.perl;

import java.util.ArrayList;
import java.util.Collection;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator;
import kieker.develop.rl.generator.IGeneratorProvider;
import kieker.develop.rl.generator.perl.RecordTypeGenerator;
import kieker.develop.rl.ouput.config.OutletConfiguration;

@SuppressWarnings("all")
public class GeneratorProvider implements IGeneratorProvider {
  @Override
  public Collection<Class<? extends AbstractRecordTypeGenerator>> getRecordTypeGenerators() {
    final ArrayList<Class<? extends AbstractRecordTypeGenerator>> generators = new ArrayList<Class<? extends AbstractRecordTypeGenerator>>();
    generators.add(RecordTypeGenerator.class);
    return generators;
  }
  
  @Override
  public Collection<Class<? extends AbstractTemplateTypeGenerator>> getTemplateTypeGenerators() {
    final ArrayList<Class<? extends AbstractTemplateTypeGenerator>> generators = new ArrayList<Class<? extends AbstractTemplateTypeGenerator>>();
    return generators;
  }
  
  @Override
  public Collection<OutletConfiguration> getOutletConfigurations() {
    final ArrayList<OutletConfiguration> outletConfigurations = new ArrayList<OutletConfiguration>();
    OutletConfiguration _outletConfiguration = new OutletConfiguration("perl", "Perl Output Folder", "./src-gen/perl");
    outletConfigurations.add(_outletConfiguration);
    return outletConfigurations;
  }
}
