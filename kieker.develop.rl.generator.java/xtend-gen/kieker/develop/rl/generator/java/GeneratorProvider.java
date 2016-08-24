package kieker.develop.rl.generator.java;

import java.util.ArrayList;
import java.util.Collection;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator;
import kieker.develop.rl.generator.IGeneratorProvider;
import kieker.develop.rl.generator.java.factory.RecordFactoryTypeGenerator;
import kieker.develop.rl.generator.java.record.RecordTypeGenerator;
import kieker.develop.rl.generator.java.record.TemplateTypeGenerator;
import kieker.develop.rl.ouput.config.OutletConfiguration;

@SuppressWarnings("all")
public class GeneratorProvider implements IGeneratorProvider {
  @Override
  public Collection<Class<? extends AbstractRecordTypeGenerator>> getRecordTypeGenerators() {
    final ArrayList<Class<? extends AbstractRecordTypeGenerator>> generators = new ArrayList<Class<? extends AbstractRecordTypeGenerator>>();
    generators.add(RecordFactoryTypeGenerator.class);
    generators.add(RecordTypeGenerator.class);
    generators.add(kieker.develop.rl.generator.java.junit.RecordTypeGenerator.class);
    return generators;
  }
  
  @Override
  public Collection<Class<? extends AbstractTemplateTypeGenerator>> getTemplateTypeGenerators() {
    final ArrayList<Class<? extends AbstractTemplateTypeGenerator>> generators = new ArrayList<Class<? extends AbstractTemplateTypeGenerator>>();
    generators.add(TemplateTypeGenerator.class);
    return generators;
  }
  
  @Override
  public Collection<OutletConfiguration> getOutletConfigurations() {
    final ArrayList<OutletConfiguration> outletConfigurations = new ArrayList<OutletConfiguration>();
    OutletConfiguration _outletConfiguration = new OutletConfiguration("java", "Java Output Folder", "./src-gen/java");
    outletConfigurations.add(_outletConfiguration);
    OutletConfiguration _outletConfiguration_1 = new OutletConfiguration("java-factory", "Java Factory Output Folder", "./src-gen/java-factory");
    outletConfigurations.add(_outletConfiguration_1);
    OutletConfiguration _outletConfiguration_2 = new OutletConfiguration("junit", "Junit Output Folder", "./test-gen/common");
    outletConfigurations.add(_outletConfiguration_2);
    return outletConfigurations;
  }
}
