package kieker.develop.rl.generator.java.factory;

import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordFactoryTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java.factory");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Java factory");
    return _builder.toString();
  }
  
  /**
   * No factory for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * Define language/generation type, which is also used to define the outlet.
   */
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java-factory");
    return _builder.toString();
  }
  
  /**
   * Compute the directory name for a record type.
   */
  @Override
  public CharSequence getDirectoryName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplace cannot be resolved");
  }
  
  /**
   * Compute file name.
   */
  @Override
  public String getFileName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDirectoryName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Primary code generation template.
   * 
   * @param type
   * 		one record type to be used to create the corresponding monitoring record factory
   */
  @Override
  public CharSequence generate(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nauthor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\nsince cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsince cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
}
