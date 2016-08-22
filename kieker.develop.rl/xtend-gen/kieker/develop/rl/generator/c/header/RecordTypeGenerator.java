package kieker.develop.rl.generator.c.header;

import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordTypeGenerator extends kieker.develop.rl.generator.c.main.RecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c.header");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C header file generator");
    return _builder.toString();
  }
  
  /**
   * No header for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
  }
  
  /**
   * File name for c-header files.
   */
  @Override
  public String getFileName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDirectoryName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved");
  }
  
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create monitoring record
   */
  @Override
  public CharSequence generate(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nauthor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\nsince cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsince cannot be resolved"
      + "\ncreateStructure cannot be resolved"
      + "\ncreateSerializerDeclaration cannot be resolved");
  }
  
  private CharSequence createStructure(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved");
  }
  
  private CharSequence createPropertyDeclaration(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ncreateTypeName cannot be resolved");
  }
  
  /**
   * Generate the serializer for the given record type.
   */
  private CharSequence createSerializerDeclaration(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved");
  }
}
