package kieker.develop.rl.generator.java.record;

import java.util.List;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.InternalErrorException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
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
   * Return the preferences activation description.
   */
  @Override
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Java record generator");
    return _builder.toString();
  }
  
  /**
   * Java requires abstract record types.
   */
  @Override
  public boolean supportsAbstractRecordType() {
    return true;
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
  
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create monitoring record
   */
  @Override
  public CharSequence generate(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nType mismatch: cannot convert from Object to Property"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method createSizeConstant(Property, RecordType) from the type RecordTypeGenerator refers to the missing type RecordType"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method createPropertyTypeArrayEntry(Property, RecordType) from the type RecordTypeGenerator refers to the missing type RecordType"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ncollectAllDataProperties cannot be resolved"
      + "\ncollectAllDeclarationProperties cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateImports cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\n== cannot be resolved"
      + "\nauthor cannot be resolved"
      + "\nsince cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsince cannot be resolved"
      + "\nabstract cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateParent cannot be resolved"
      + "\ncreateImplements cannot be resolved"
      + "\ncomputeDefaultSUID cannot be resolved"
      + "\nabstract cannot be resolved"
      + "\n! cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncreateUserConstants cannot be resolved"
      + "\ncreateDefaultConstants cannot be resolved"
      + "\ncreateProperties cannot be resolved"
      + "\ncreateParameterizedConstructor cannot be resolved"
      + "\nabstract cannot be resolved"
      + "\n! cannot be resolved"
      + "\ncreateArrayConstructor cannot be resolved"
      + "\ncreateArrayInitializeConstructor cannot be resolved"
      + "\ncreateBufferReadConstructor cannot be resolved"
      + "\nabstract cannot be resolved"
      + "\n! cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nfilterNull cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncreatePropertyGetters cannot be resolved");
  }
  
  /**
   * Create buffer initialization constructor.
   */
  private CharSequence createBufferReadConstructor(final /* RecordType */Object type, final List<Property> properties) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved");
  }
  
  /**
   * Create array initialization constructor.
   */
  private CharSequence createArrayInitializeConstructor(final /* RecordType */Object type, final List<Property> properties) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  /**
   * Create the parameterized constructor.
   * 
   * @param type the record type
   * @param allDataProperties list of all data properties
   * @param allDeclarationProperties list of all properties which have been declared in this type
   */
  private CharSequence createParameterizedConstructor(final /* RecordType */Object type, final List<Property> allDataProperties, final List<Property> allDeclarationProperties) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ncreatePropertyComment cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  /**
   * Create an arbitrary comment for a property of a monitoring record.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one comment
   */
  private CharSequence createPropertyComment(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("* @param ");
    _builder.append(name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*            ");
    _builder.append(name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create the array constructor.
   * 
   * @param type the record type
   * @param allDeclarationProperties list of all properties which have been declared in this type
   */
  private CharSequence createArrayConstructor(final /* RecordType */Object type, final List<Property> allDeclarationProperties) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\ncollectAllDataProperties cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  /**
   * Create all imports for the record.
   * 
   * @param type the record type
   */
  private CharSequence createImports(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method createInterfaceImport(TemplateType) from the type RecordTypeGenerator refers to the missing type TemplateType"
      + "\nabstract cannot be resolved"
      + "\n! cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparent cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved"
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  /**
   * Create a list of imports for the given type.
   */
  private CharSequence createInterfaceImport(final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create string registry access for the given property.
   * 
   * @param property
   * 
   * @returns result register access or null
   */
  private CharSequence createRegisterStringForProperty(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(Object) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method or field type is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ntype cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\ncreateArrayAccessLoops cannot be resolved");
  }
  
  /**
   * Create the equals check for a property of a type.
   * 
   * @param property the property for which the equals is created
   * 
   * @returns code snippet for the given property
   */
  private CharSequence createEquals(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createEquals(BaseType, CharSequence) from the type RecordTypeGenerator refers to the missing type BaseType"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createArrayAccessLoops(EList<ArraySize>, int, String, CharSequence) from the type ValueAccessExpressionModule refers to the missing type ArraySize"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ntype cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nsizes cannot be resolved");
  }
  
  /**
   * Create equal check for simple values.
   * 
   * @param typeName name of the type
   * @param getterExpression value access expresion
   */
  private CharSequence createEquals(final /* BaseType */Object type, final CharSequence getterExpression) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(BaseType) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field DOUBLE is undefined");
  }
  
  /**
   * Determine the size of one type.
   * 
   * @param property
   * 		property which serialization size is determined.
   * 
   * @returns
   * 		the serialization size of the property
   */
  private String createSizeConstant(final Property property, final /* RecordType */Object type) {
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
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createPropertyFQN(Property, TemplateType) from the type RecordTypeGenerator refers to the missing type TemplateType"
      + "\ntype cannot be resolved");
  }
  
  /**
   * Determine the name of the parent class.
   */
  private CharSequence createParent(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create the sequence of implements of the class and render the implements char sequence.
   */
  private CharSequence createImplements(final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nparent cannot be resolved"
      + "\n== cannot be resolved"
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  /**
   * Determine the correct deserialization code for a property by type.
   * 
   * @param property
   * 		the property to deserialize
   * 
   * @returns
   * 		code to deserialize the given property
   */
  private CharSequence createPropertyBinaryDeserialization(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createArrayAccessLoops(EList<ArraySize>, int, String, CharSequence) from the type ValueAccessExpressionModule refers to the missing type ArraySize"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createValueAssignmentForDeserialization(EList<ArraySize>, Property) from the type RecordTypeGenerator refers to the missing type ArraySize"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\ncreateTypeInstantiationName cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePropertyPrimitiveTypeDeserialization cannot be resolved");
  }
  
  /**
   * Determine the name and additional array sizes for an array deserialization.
   * For example property[2][_property_size1][6] or just property for simple fields
   */
  private CharSequence createTypeInstantiationName(final /* Classifier */Object classifier, final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe method createArraySize(ArraySize, String, int) from the type RecordTypeGenerator refers to the missing type ArraySize"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ncreatePrimitiveTypeName cannot be resolved");
  }
  
  /**
   * Creates code for fixed and runtime array sizes according to the record model.
   */
  private CharSequence createArraySize(final /* ArraySize */Object size, final String name, final int index) {
    throw new Error("Unresolved compilation problems:"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsize cannot be resolved");
  }
  
  /**
   * Assignment for a primitive value
   */
  private String createValueAssignmentForDeserialization(final /* EList<ArraySize> */Object sizes, final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ntype cannot be resolved"
      + "\ncreatePropertyPrimitiveTypeDeserialization cannot be resolved");
  }
  
  /**
   * Create code to get values from the input buffer.
   */
  private CharSequence createPropertyPrimitiveTypeDeserialization(final /* BaseType */Object classifier) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(BaseType) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field STRING is undefined"
      + "\nThe method or field BYTE is undefined"
      + "\nThe method or field SHORT is undefined"
      + "\nThe method or field INT is undefined"
      + "\nThe method or field LONG is undefined"
      + "\nThe method or field FLOAT is undefined"
      + "\nThe method or field DOUBLE is undefined"
      + "\nThe method or field CHAR is undefined"
      + "\nThe method or field BOOLEAN is undefined");
  }
  
  /**
   * Determine the correct serialization for a property by type.
   * 
   * @param property
   * 		the property to serialize
   * 
   * @returns
   * 		code to serialize the given property
   */
  private CharSequence createPropertyBinarySerialization(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createArrayAccessLoops(EList<ArraySize>, int, String, CharSequence) from the type ValueAccessExpressionModule refers to the missing type ArraySize"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n> cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\nindexOf cannot be resolved");
  }
  
  private CharSequence createValueStoreForSerialization(final Property property) {
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
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ntype cannot be resolved");
  }
  
  /**
   * Create all assignments for the generic constructor based on property name and an array.
   * 
   * @param property
   * 		a property of the record type
   * @param offset
   * 		the array offset
   * 
   * @returns all assignments for the given property list
   */
  private String createPropertyGenericAssignments(final Iterable<Property> list, final int offset) {
    final EList<CharSequence> r = new BasicEList<CharSequence>();
    final Procedure2<Property, Integer> _function = (Property property, Integer index) -> {
      String _createPropertyGenericAssignment = this.createPropertyGenericAssignment(property, ((index).intValue() + offset));
      r.add(_createPropertyGenericAssignment);
    };
    IterableExtensions.<Property>forEach(list, _function);
    return IterableExtensions.join(r);
  }
  
  /**
   * Create an assignment with a property as assignment target and an array value as source.
   * Used in the generic constructor.
   * 
   * @param property
   * 		a property of the record type
   * @param index
   * 		the array index
   * 
   * @returns one assignment
   */
  private String createPropertyGenericAssignment(final Property property, final int index) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\ncreateObjectTypeName cannot be resolved");
  }
  
  /**
   * Create an assignment with a property as assignment target and an array value as source.
   * 
   * @param property
   * 		a property of the record type
   * @param index
   * 		the array index
   * 
   * @returns one assignment
   */
  private CharSequence createPropertyAssignment(final Property property) throws InternalErrorException {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeEnum(Object) is undefined for the type Class<BaseTypes>"
      + "\nThe method or field value is undefined for the type Property"
      + "\nThe method or field value is undefined for the type Property"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ntype cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n== cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ncreateConstantReference cannot be resolved");
  }
  
  private Object createConstantReference(final /* Literal */Object literal, final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nStringLiteral cannot be resolved to a type."
      + "\nConstantLiteral cannot be resolved to a type."
      + "\nBuiltInValueLiteral cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method createConstantName(Property) from the type NameResolver refers to the missing type Object"
      + "\nThe method createConstantName(Property) from the type NameResolver refers to the missing type Object"
      + "\ncreateConstantLiteralName cannot be resolved"
      + "\nclass cannot be resolved");
  }
  
  /**
   * Create one entry for the constructor parameter sequence.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one parameter for the given property
   */
  private CharSequence createPropertyParameter(final Property property) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createName(Property) from the type NameResolver refers to the missing type Object"
      + "\ncreateTypeName cannot be resolved");
  }
  
  /**
   * Create one entry of the property type array.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one type entry
   */
  private CharSequence createPropertyTypeArrayEntry(final Property property, final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method findType(Property) from the type TypeResolution refers to the missing type Classifier"
      + "\nThe method createPropertyFQN(Property, TemplateType) from the type RecordTypeGenerator refers to the missing type TemplateType"
      + "\ncreateTypeName cannot be resolved");
  }
  
  /**
   * Compute the fully qualified name of a property.
   * 
   * @param property
   * 		the property itself
   * @param type
   * 		the present RecordType
   * 
   * @returns
   * 		the FQ property name
   */
  private CharSequence createPropertyFQN(final Property property, final /* TemplateType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nTemplateType cannot be resolved to a type."
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method createPropertyFQN(Property, TemplateType) from the type RecordTypeGenerator refers to the missing type TemplateType"
      + "\nproperties cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved");
  }
  
  /**
   * Compute the full qualified name of a property.
   * 
   * @param property
   * 		the property itself
   * @param type
   * 		the present RecordType
   * 
   * @returns
   * 		the FQ property name
   */
  private CharSequence createPropertyFQN(final Property property, final /* RecordType */Object type) {
    throw new Error("Unresolved compilation problems:"
      + "\nTemplateType cannot be resolved to a type."
      + "\nThe method or field name is undefined for the type Property"
      + "\nThe method createPropertyFQN(Property, TemplateType) from the type RecordTypeGenerator refers to the missing type TemplateType"
      + "\nThe method createPropertyFQN(Property, TemplateType) from the type RecordTypeGenerator refers to the missing type TemplateType"
      + "\nproperties cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nparent cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparent cannot be resolved"
      + "\nparents cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved");
  }
}
