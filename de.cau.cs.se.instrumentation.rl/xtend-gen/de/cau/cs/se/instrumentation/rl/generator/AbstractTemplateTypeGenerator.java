package kieker.tools.rl.generator;

import kieker.tools.rl.generator.AbstractTypeGenerator;
import kieker.tools.rl.recordLang.TemplateType;

@SuppressWarnings("all")
public abstract class AbstractTemplateTypeGenerator extends AbstractTypeGenerator {
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create monitoring record
   * @params author
   * 		generic author name for the record
   * @params version
   * 		generic kieker version for the record
   */
  public abstract CharSequence createContent(final TemplateType type, final String author, final String version);
}
