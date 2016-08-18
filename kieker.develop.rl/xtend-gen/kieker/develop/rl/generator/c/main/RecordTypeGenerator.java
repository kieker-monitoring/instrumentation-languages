package kieker.develop.rl.generator.c.main;

import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.InternalErrorException;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c.main");
    return _builder.toString();
  }
  
  /**
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C code generator");
    return _builder.toString();
  }
  
  /**
   * No serialization for abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return false;
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
   * compute the filename of a c file.
   */
  @Override
  public String getFileName(final /* Type */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDirectoryName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved");
  }
  
  /**
   * Return the language type name.
   */
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("c");
    return _builder.toString();
  }
  
  /**
   * Primary code generation template.
   * 
   * @param type
   * 		one record type to be used to create monitoring record
   * @param author
   * 		generic author name for the record
   * @param version
   * 		generic kieker version for the record
   * @param headerComment
   *      comment placed as header of the file
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
      + "\ngetDirectoryName cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved"
      + "\ncreateSerializer cannot be resolved");
  }
  
  /**
   * Generate the serializer for the given record type.
   */
  private CharSequence createSerializer(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved"
      + "\npackageName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncstyleName cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  private CharSequence createValueSerializer(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nserializerSuffix cannot be resolved");
  }
  
  private String serializerSuffix(final /* Classifier */Object classifier) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(Object) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field BYTE is undefined"
      + "\nThe method or field SHORT is undefined"
      + "\nThe method or field INT is undefined"
      + "\nThe method or field LONG is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field DOUBLE is undefined"
      + "\nThe method or field CHAR is undefined"
      + "\nThe method or field BOOLEAN is undefined"
      + "\ntype cannot be resolved");
  }
}
