package kieker.develop.rl.generator.delphi;

import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delphi");
    return _builder.toString();
  }
  
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Delphi record generator");
    return _builder.toString();
  }
  
  /**
   * Create abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return true;
  }
  
  @Override
  public CharSequence getDirectoryName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreplace cannot be resolved");
  }
  
  @Override
  public String getFileName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDirectoryName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delphi");
    return _builder.toString();
  }
  
  @Override
  public CharSequence generate(final /* RecordType */Object type) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
