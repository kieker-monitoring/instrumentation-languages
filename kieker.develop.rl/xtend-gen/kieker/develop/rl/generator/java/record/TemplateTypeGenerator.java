package kieker.develop.rl.generator.java.record;

import kieker.develop.rl.generator.AbstractTemplateTypeGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class TemplateTypeGenerator extends AbstractTemplateTypeGenerator {
  /**
   * Return the unique id.
   */
  @Override
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
    return _builder.toString();
  }
  
  /**
   * Define language/generation type, which is also used to define the outlet.
   */
  @Override
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("java");
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
  
  @Override
  public CharSequence generate(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nauthor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\nsince cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsince cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparents cannot be resolved"
      + "\ncreateImports cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparents cannot be resolved"
      + "\ncreateExtends cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  private Object isInSamePackage(final /* TemplateType */Object left, final /* TemplateType */Object right) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!= cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private CharSequence createImports(final /* EList<TemplateType> */Object parents, final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method isInSamePackage(TemplateType, TemplateType) from the type TemplateTypeGenerator refers to the missing type Object"
      + "\nThe method createImport(TemplateType) from the type TemplateTypeGenerator refers to the missing type TemplateType");
  }
  
  private CharSequence createDefaultImport() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import kieker.common.record.IMonitoringRecord;");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence createImport(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private CharSequence createExtends(final /* EList<TemplateType> */Object parents) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  /**
   * Creates a getter for a given property.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns the resulting getter as a CharSequence
   */
  private CharSequence createPropertyGetter(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved");
  }
}
