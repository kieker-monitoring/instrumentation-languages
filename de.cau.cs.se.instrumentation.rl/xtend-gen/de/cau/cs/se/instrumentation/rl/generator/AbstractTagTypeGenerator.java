package de.cau.cs.se.instrumentation.rl.generator;

import de.cau.cs.se.instrumentation.rl.generator.AbstractTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.TagType;

@SuppressWarnings("all")
public abstract class AbstractTagTypeGenerator extends AbstractTypeGenerator {
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
  public abstract CharSequence createContent(final TagType type, final String author, final String version);
}
