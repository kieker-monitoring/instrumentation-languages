package kieker.tools.rl.generator;

import kieker.tools.rl.generator.AbstractTypeGenerator;
import kieker.tools.rl.recordLang.RecordType;

@SuppressWarnings("all")
public abstract class AbstractRecordTypeGenerator extends AbstractTypeGenerator {
  /**
   * Return the description for the preference dialog of the generator.
   */
  public abstract String getDescription();
  
  /**
   * Returns if the generator also supports record types.
   */
  public abstract boolean supportsAbstractRecordType();
  
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
  public abstract CharSequence createContent(final RecordType type, final String author, final String version);
}
