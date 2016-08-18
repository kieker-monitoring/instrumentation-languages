package kieker.develop.rl.generator.java.record;

import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.generator.java.JavaTypeMapping;
import kieker.develop.rl.generator.java.record.ConstantConstructionModule;
import kieker.develop.rl.generator.java.record.NameResolver;
import kieker.develop.rl.generator.java.record.PropertyConstructionModule;
import kieker.develop.rl.generator.java.record.ValueAccessExpressionModule;
import kieker.develop.rl.generator.java.record.uid.ComputeUID;
import kieker.develop.rl.recordLang.ArraySize;
import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.BuiltInValueLiteral;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.ConstantLiteral;
import kieker.develop.rl.recordLang.Literal;
import kieker.develop.rl.recordLang.Model;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.StringLiteral;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.recordLang.Type;
import kieker.develop.rl.typing.BaseTypes;
import kieker.develop.rl.typing.PropertyResolution;
import kieker.develop.rl.typing.TypeResolution;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
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
  public CharSequence getDirectoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  /**
   * Compute file name.
   */
  @Override
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(".java");
    return _builder.toString();
  }
  
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create monitoring record
   */
  @Override
  public CharSequence generate(final RecordType type) {
    CharSequence _xblockexpression = null;
    {
      final List<Property> allDataProperties = PropertyResolution.collectAllDataProperties(type);
      final List<Property> allDeclarationProperties = PropertyResolution.collectAllDeclarationProperties(type);
      StringConcatenation _builder = new StringConcatenation();
      String _header = this.getHeader();
      _builder.append(_header, "");
      _builder.append("package ");
      EObject _eContainer = type.eContainer();
      String _name = ((Model) _eContainer).getName();
      _builder.append(_name, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      CharSequence _createImports = this.createImports(type);
      _builder.append(_createImports, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("/**");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @author ");
      String _xifexpression = null;
      String _author = type.getAuthor();
      boolean _equals = Objects.equal(_author, null);
      if (_equals) {
        _xifexpression = this.getAuthor();
      } else {
        _xifexpression = type.getAuthor();
      }
      _builder.append(_xifexpression, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* @since ");
      String _xifexpression_1 = null;
      String _since = type.getSince();
      boolean _equals_1 = Objects.equal(_since, null);
      if (_equals_1) {
        _xifexpression_1 = this.getVersion();
      } else {
        _xifexpression_1 = type.getSince();
      }
      _builder.append(_xifexpression_1, " ");
      _builder.newLineIfNotEmpty();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("public ");
      String _xifexpression_2 = null;
      boolean _isAbstract = type.isAbstract();
      if (_isAbstract) {
        _xifexpression_2 = "abstract ";
      }
      _builder.append(_xifexpression_2, "");
      _builder.append("class ");
      String _name_1 = type.getName();
      _builder.append(_name_1, "");
      _builder.append(" extends ");
      CharSequence _createParent = this.createParent(type);
      _builder.append(_createParent, "");
      CharSequence _createImplements = this.createImplements(type);
      _builder.append(_createImplements, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("private static final long serialVersionUID = ");
      long _computeDefaultSUID = ComputeUID.computeDefaultSUID(type);
      _builder.append(_computeDefaultSUID, "\t");
      _builder.append("L;");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      {
        boolean _isAbstract_1 = type.isAbstract();
        boolean _not = (!_isAbstract_1);
        if (_not) {
          _builder.append("/** Descriptive definition of the serialization size of the record. */");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("public static final int SIZE = ");
          String _xifexpression_3 = null;
          int _size = allDataProperties.size();
          boolean _equals_2 = (_size == 0);
          if (_equals_2) {
            _xifexpression_3 = "0";
          } else {
            final Function1<Property, String> _function = (Property property) -> {
              return this.createSizeConstant(property, type);
            };
            List<String> _map = ListExtensions.<Property, String>map(allDataProperties, _function);
            _xifexpression_3 = IterableExtensions.join(_map, "\n\t\t + ");
          }
          _builder.append(_xifexpression_3, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append(";");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public static final Class<?>[] TYPES = {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          final Function1<Property, CharSequence> _function_1 = (Property property) -> {
            return this.createPropertyTypeArrayEntry(property, type);
          };
          List<CharSequence> _map_1 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_1);
          String _join = IterableExtensions.join(_map_1);
          _builder.append(_join, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("};");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/* user-defined constants */");
      _builder.newLine();
      _builder.append("\t");
      String _createUserConstants = ConstantConstructionModule.createUserConstants(type);
      _builder.append(_createUserConstants, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("/* default constants */");
      _builder.newLine();
      _builder.append("\t");
      String _createDefaultConstants = ConstantConstructionModule.createDefaultConstants(allDeclarationProperties);
      _builder.append(_createDefaultConstants, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("/* property declarations */");
      _builder.newLine();
      _builder.append("\t");
      String _createProperties = PropertyConstructionModule.createProperties(allDeclarationProperties);
      _builder.append(_createProperties, "\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createParameterizedConstructor = this.createParameterizedConstructor(type, allDataProperties, allDeclarationProperties);
      _builder.append(_createParameterizedConstructor, "\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      CharSequence _xifexpression_4 = null;
      boolean _isAbstract_2 = type.isAbstract();
      boolean _not_1 = (!_isAbstract_2);
      if (_not_1) {
        _xifexpression_4 = this.createArrayConstructor(type, allDeclarationProperties);
      }
      _builder.append(_xifexpression_4, "\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createArrayInitializeConstructor = this.createArrayInitializeConstructor(type, allDeclarationProperties);
      _builder.append(_createArrayInitializeConstructor, "\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      CharSequence _createBufferReadConstructor = this.createBufferReadConstructor(type, allDeclarationProperties);
      _builder.append(_createBufferReadConstructor, "\t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        boolean _isAbstract_3 = type.isAbstract();
        boolean _not_2 = (!_isAbstract_3);
        if (_not_2) {
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public Object[] toArray() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return new Object[] {");
          _builder.newLine();
          _builder.append("\t\t\t");
          final Function1<Property, String> _function_2 = (Property property) -> {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("this.");
            CharSequence _createGetterName = NameResolver.createGetterName(property);
            _builder_1.append(_createGetterName, "");
            _builder_1.append("()");
            return _builder_1.toString();
          };
          List<String> _map_2 = ListExtensions.<Property, String>map(allDataProperties, _function_2);
          String _join_1 = IterableExtensions.join(_map_2, ",\n");
          _builder.append(_join_1, "\t\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("};");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void registerStrings(final IRegistry<String> stringRegistry) {\t// NOPMD (generated code)");
          _builder.newLine();
          _builder.append("\t\t");
          final Function1<Property, CharSequence> _function_3 = (Property it) -> {
            return this.createRegisterStringForProperty(it);
          };
          List<CharSequence> _map_3 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_3);
          Iterable<CharSequence> _filterNull = IterableExtensions.<CharSequence>filterNull(_map_3);
          String _join_2 = IterableExtensions.join(_filterNull, "\n");
          _builder.append(_join_2, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {");
          _builder.newLine();
          _builder.append("\t\t");
          final Function1<Property, CharSequence> _function_4 = (Property property) -> {
            return this.createPropertyBinarySerialization(property);
          };
          List<CharSequence> _map_4 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_4);
          String _join_3 = IterableExtensions.join(_map_4, "\n");
          _builder.append(_join_3, "\t\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public Class<?>[] getValueTypes() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return TYPES; // NOPMD");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("\t");
          _builder.append("/**");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("* {@inheritDoc}");
          _builder.newLine();
          _builder.append("\t ");
          _builder.append("*/");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public int getSize() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("return SIZE;");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* {@inheritDoc}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Deprecated");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void initFromArray(final Object[] values) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new UnsupportedOperationException();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* {@inheritDoc}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* ");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Deprecated");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("throw new UnsupportedOperationException();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/**");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("* {@inheritDoc}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("*/");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public boolean equals(final Object obj) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (obj == null) return false;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (obj == this) return true;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("if (obj.getClass() != this.getClass()) return false;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("final ");
      String _name_2 = type.getName();
      _builder.append(_name_2, "\t\t");
      _builder.append(" castedRecord = (");
      String _name_3 = type.getName();
      _builder.append(_name_3, "\t\t");
      _builder.append(") obj;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("if (this.getLoggingTimestamp() != castedRecord.getLoggingTimestamp()) return false;");
      _builder.newLine();
      _builder.append("\t\t");
      final Function1<Property, CharSequence> _function_5 = (Property it) -> {
        return this.createEquals(it);
      };
      List<CharSequence> _map_5 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_5);
      String _join_4 = IterableExtensions.join(_map_5, "\n");
      _builder.append(_join_4, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("return true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      String _createPropertyGetters = PropertyConstructionModule.createPropertyGetters(type);
      _builder.append(_createPropertyGetters, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Create buffer initialization constructor.
   */
  private CharSequence createBufferReadConstructor(final RecordType type, final List<Property> properties) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This constructor converts the given array into a record.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param buffer");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            The bytes for the record.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @throws BufferUnderflowException");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*             if buffer not sufficient");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      RecordType _parent = type.getParent();
      boolean _notEquals = (!Objects.equal(_parent, null));
      if (_notEquals) {
        _builder.append("super(buffer, stringRegistry);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    final Function1<Property, CharSequence> _function = (Property property) -> {
      return this.createPropertyBinaryDeserialization(property);
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(properties, _function);
    String _join = IterableExtensions.join(_map, "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create array initialization constructor.
   */
  private CharSequence createArrayInitializeConstructor(final RecordType type, final List<Property> properties) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This constructor uses the given array to initialize the fields of this record.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param values");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            The values for the record.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param valueTypes");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            The types of the elements in the first array.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected ");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      RecordType _parent = type.getParent();
      boolean _equals = Objects.equal(_parent, null);
      if (_equals) {
        _builder.append("AbstractMonitoringRecord.checkArray(values, valueTypes);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      } else {
        _builder.append("super(values, valueTypes);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    int _xifexpression = (int) 0;
    RecordType _parent_1 = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent_1, null));
    if (_notEquals) {
      RecordType _parent_2 = type.getParent();
      List<Property> _collectAllDataProperties = PropertyResolution.collectAllDataProperties(_parent_2);
      _xifexpression = _collectAllDataProperties.size();
    } else {
      _xifexpression = 0;
    }
    String _createPropertyGenericAssignments = this.createPropertyGenericAssignments(properties, _xifexpression);
    _builder.append(_createPropertyGenericAssignments, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create the parameterized constructor.
   * 
   * @param type the record type
   * @param allDataProperties list of all data properties
   * @param allDeclarationProperties list of all properties which have been declared in this type
   */
  private CharSequence createParameterizedConstructor(final RecordType type, final List<Property> allDataProperties, final List<Property> allDeclarationProperties) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Creates a new instance of this class using the given parameters.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    final Function1<Property, CharSequence> _function = (Property it) -> {
      String _createName = NameResolver.createName(it);
      return this.createPropertyComment(_createName);
    };
    List<CharSequence> _map = ListExtensions.<Property, CharSequence>map(allDataProperties, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("(");
    final Function1<Property, CharSequence> _function_1 = (Property property) -> {
      return this.createPropertyParameter(property);
    };
    List<CharSequence> _map_1 = ListExtensions.<Property, CharSequence>map(allDataProperties, _function_1);
    String _join_1 = IterableExtensions.join(_map_1, ", ");
    _builder.append(_join_1, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _xifexpression = null;
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      List<Property> _collectAllDataProperties = PropertyResolution.collectAllDataProperties(_parent_1);
      final Function1<Property, String> _function_2 = (Property it) -> {
        return it.getName();
      };
      List<String> _map_2 = ListExtensions.<Property, String>map(_collectAllDataProperties, _function_2);
      String _join_2 = IterableExtensions.join(_map_2, ", ");
      String _plus = ("super(" + _join_2);
      _xifexpression = (_plus + ");");
    }
    _builder.append(_xifexpression, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<Property, CharSequence> _function_3 = (Property property) -> {
      try {
        return this.createPropertyAssignment(property);
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    List<CharSequence> _map_3 = ListExtensions.<Property, CharSequence>map(allDeclarationProperties, _function_3);
    String _join_3 = IterableExtensions.join(_map_3);
    _builder.append(_join_3, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
  private CharSequence createArrayConstructor(final RecordType type, final List<Property> allDeclarationProperties) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This constructor converts the given array into a record.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* It is recommended to use the array which is the result of a call to {@link #toArray()}.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param values");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            The values for the record.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append("(final Object[] values) { // NOPMD (direct store of values)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      RecordType _parent = type.getParent();
      boolean _equals = Objects.equal(_parent, null);
      if (_equals) {
        _builder.append("AbstractMonitoringRecord.checkArray(values, TYPES);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      } else {
        _builder.append("super(values, TYPES);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    int _xifexpression = (int) 0;
    RecordType _parent_1 = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent_1, null));
    if (_notEquals) {
      RecordType _parent_2 = type.getParent();
      List<Property> _collectAllDataProperties = PropertyResolution.collectAllDataProperties(_parent_2);
      _xifexpression = _collectAllDataProperties.size();
    } else {
      _xifexpression = 0;
    }
    String _createPropertyGenericAssignments = this.createPropertyGenericAssignments(allDeclarationProperties, _xifexpression);
    _builder.append(_createPropertyGenericAssignments, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create all imports for the record.
   * 
   * @param type the record type
   */
  private CharSequence createImports(final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAbstract = type.isAbstract();
      boolean _not = (!_isAbstract);
      if (_not) {
        _builder.append("import java.nio.BufferOverflowException;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import java.nio.BufferUnderflowException;");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.nio.ByteBuffer;");
    _builder.newLine();
    _builder.newLine();
    {
      RecordType _parent = type.getParent();
      boolean _equals = Objects.equal(_parent, null);
      if (_equals) {
        _builder.append("import kieker.common.record.AbstractMonitoringRecord;");
        _builder.newLineIfNotEmpty();
        _builder.append("import kieker.common.record.IMonitoringRecord;");
        _builder.newLine();
      } else {
        _builder.append("import ");
        RecordType _parent_1 = type.getParent();
        EObject _eContainer = _parent_1.eContainer();
        String _name = ((Model) _eContainer).getName();
        _builder.append(_name, "");
        _builder.append(".");
        RecordType _parent_2 = type.getParent();
        String _name_1 = _parent_2.getName();
        _builder.append(_name_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import kieker.common.util.registry.IRegistry;");
    _builder.newLineIfNotEmpty();
    _builder.append("import kieker.common.util.Version;");
    _builder.newLine();
    _builder.newLine();
    String _xifexpression = null;
    if (((!Objects.equal(type.getParents(), null)) && (type.getParents().size() > 0))) {
      EList<TemplateType> _parents = type.getParents();
      final Function1<TemplateType, CharSequence> _function = (TemplateType i) -> {
        return this.createInterfaceImport(i);
      };
      List<CharSequence> _map = ListExtensions.<TemplateType, CharSequence>map(_parents, _function);
      _xifexpression = IterableExtensions.join(_map);
    }
    _builder.append(_xifexpression, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create a list of imports for the given type.
   */
  private CharSequence createInterfaceImport(final TemplateType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _name_1 = type.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create string registry access for the given property.
   * 
   * @param property
   * 
   * @returns result register access or null
   */
  private CharSequence createRegisterStringForProperty(final Property property) {
    CharSequence _xifexpression = null;
    Classifier _type = property.getType();
    BaseType _type_1 = _type.getType();
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(_type_1);
    boolean _equals = _typeEnum.equals(BaseTypes.STRING);
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("stringRegistry.get(this.");
        CharSequence _createGetterValueExpression = ValueAccessExpressionModule.createGetterValueExpression(property);
        _builder.append(_createGetterValueExpression, "");
        _builder.append(");");
        final String simpleAction = _builder.toString();
        final Classifier type = TypeResolution.findType(property);
        CharSequence _xifexpression_1 = null;
        EList<ArraySize> _sizes = type.getSizes();
        int _size = _sizes.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("// get array length");
          _builder_1.newLine();
          {
            EList<ArraySize> _sizes_1 = type.getSizes();
            for(final ArraySize size : _sizes_1) {
              {
                int _size_1 = size.getSize();
                boolean _equals_1 = (_size_1 == 0);
                if (_equals_1) {
                  _builder_1.append("int _");
                  String _createName = NameResolver.createName(property);
                  _builder_1.append(_createName, "");
                  _builder_1.append("_size");
                  EList<ArraySize> _sizes_2 = type.getSizes();
                  int _indexOf = _sizes_2.indexOf(size);
                  _builder_1.append(_indexOf, "");
                  _builder_1.append(" = this.");
                  String _createName_1 = NameResolver.createName(property);
                  _builder_1.append(_createName_1, "");
                  EList<ArraySize> _sizes_3 = type.getSizes();
                  int _indexOf_1 = _sizes_3.indexOf(size);
                  String _createCodeToDetermineArraySize = ValueAccessExpressionModule.createCodeToDetermineArraySize(_indexOf_1);
                  _builder_1.append(_createCodeToDetermineArraySize, "");
                  _builder_1.append(".length;");
                  _builder_1.newLineIfNotEmpty();
                }
              }
            }
          }
          Classifier _type_2 = property.getType();
          EList<ArraySize> _sizes_4 = _type_2.getSizes();
          String _createName_2 = NameResolver.createName(property);
          CharSequence _createArrayAccessLoops = ValueAccessExpressionModule.createArrayAccessLoops(_sizes_4, 0, _createName_2, simpleAction);
          _builder_1.append(_createArrayAccessLoops, "");
          _builder_1.newLineIfNotEmpty();
          _xifexpression_1 = _builder_1;
        } else {
          _xifexpression_1 = simpleAction;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  /**
   * Create the equals check for a property of a type.
   * 
   * @param property the property for which the equals is created
   * 
   * @returns code snippet for the given property
   */
  private CharSequence createEquals(final Property property) {
    try {
      CharSequence _xblockexpression = null;
      {
        final Classifier type = TypeResolution.findType(property);
        BaseType _type = type.getType();
        CharSequence _createGetterValueExpression = ValueAccessExpressionModule.createGetterValueExpression(property);
        final CharSequence simpleTypeAction = this.createEquals(_type, _createGetterValueExpression);
        CharSequence _xifexpression = null;
        EList<ArraySize> _sizes = type.getSizes();
        int _size = _sizes.size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("// get array length");
          _builder.newLine();
          {
            EList<ArraySize> _sizes_1 = type.getSizes();
            for(final ArraySize size : _sizes_1) {
              {
                int _size_1 = size.getSize();
                boolean _equals = (_size_1 == 0);
                if (_equals) {
                  _builder.append("int _");
                  String _createName = NameResolver.createName(property);
                  _builder.append(_createName, "");
                  _builder.append("_size");
                  EList<ArraySize> _sizes_2 = type.getSizes();
                  int _indexOf = _sizes_2.indexOf(size);
                  _builder.append(_indexOf, "");
                  _builder.append(" = this.");
                  String _createName_1 = NameResolver.createName(property);
                  _builder.append(_createName_1, "");
                  EList<ArraySize> _sizes_3 = type.getSizes();
                  int _indexOf_1 = _sizes_3.indexOf(size);
                  String _createCodeToDetermineArraySize = ValueAccessExpressionModule.createCodeToDetermineArraySize(_indexOf_1);
                  _builder.append(_createCodeToDetermineArraySize, "");
                  _builder.append(".length;");
                  _builder.newLineIfNotEmpty();
                  _builder.append("if (_");
                  String _createName_2 = NameResolver.createName(property);
                  _builder.append(_createName_2, "");
                  _builder.append("_size");
                  EList<ArraySize> _sizes_4 = type.getSizes();
                  int _indexOf_2 = _sizes_4.indexOf(size);
                  _builder.append(_indexOf_2, "");
                  _builder.append(" != castedRecord.");
                  String _createName_3 = NameResolver.createName(property);
                  _builder.append(_createName_3, "");
                  EList<ArraySize> _sizes_5 = type.getSizes();
                  int _indexOf_3 = _sizes_5.indexOf(size);
                  String _createCodeToDetermineArraySize_1 = ValueAccessExpressionModule.createCodeToDetermineArraySize(_indexOf_3);
                  _builder.append(_createCodeToDetermineArraySize_1, "");
                  _builder.append(".length)");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("return false;");
                  _builder.newLine();
                }
              }
            }
          }
          EList<ArraySize> _sizes_6 = type.getSizes();
          String _createName_4 = NameResolver.createName(property);
          CharSequence _createArrayAccessLoops = ValueAccessExpressionModule.createArrayAccessLoops(_sizes_6, 0, _createName_4, simpleTypeAction);
          _builder.append(_createArrayAccessLoops, "");
          _builder.newLineIfNotEmpty();
          _xifexpression = _builder;
        } else {
          _xifexpression = simpleTypeAction;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Create equal check for simple values.
   * 
   * @param typeName name of the type
   * @param getterExpression value access expresion
   */
  private CharSequence createEquals(final BaseType type, final CharSequence getterExpression) throws InternalErrorException {
    CharSequence _switchResult = null;
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case STRING:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if (!this.");
          _builder.append(getterExpression, "");
          _builder.append(".equals(castedRecord.");
          _builder.append(getterExpression, "");
          _builder.append(")) return false;");
          _switchResult = _builder;
          break;
        case FLOAT:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if (isNotEqual(this.");
          _builder_1.append(getterExpression, "");
          _builder_1.append(", castedRecord.");
          _builder_1.append(getterExpression, "");
          _builder_1.append(")) return false;");
          _switchResult = _builder_1;
          break;
        case DOUBLE:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("if (isNotEqual(this.");
          _builder_2.append(getterExpression, "");
          _builder_2.append(", castedRecord.");
          _builder_2.append(getterExpression, "");
          _builder_2.append(")) return false;");
          _switchResult = _builder_2;
          break;
        default:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("if (this.");
          _builder_3.append(getterExpression, "");
          _builder_3.append(" != castedRecord.");
          _builder_3.append(getterExpression, "");
          _builder_3.append(") return false;");
          _switchResult = _builder_3;
          break;
      }
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("if (this.");
      _builder_3.append(getterExpression, "");
      _builder_3.append(" != castedRecord.");
      _builder_3.append(getterExpression, "");
      _builder_3.append(") return false;");
      _switchResult = _builder_3;
    }
    return _switchResult;
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
  private String createSizeConstant(final Property property, final RecordType type) {
    String _switchResult = null;
    Classifier _findType = TypeResolution.findType(property);
    BaseType _type = _findType.getType();
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(_type);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case STRING:
          _switchResult = "TYPE_SIZE_STRING";
          break;
        case BYTE:
          _switchResult = "TYPE_SIZE_BYTE";
          break;
        case SHORT:
          _switchResult = "TYPE_SIZE_SHORT";
          break;
        case INT:
          _switchResult = "TYPE_SIZE_INT";
          break;
        case LONG:
          _switchResult = "TYPE_SIZE_LONG";
          break;
        case FLOAT:
          _switchResult = "TYPE_SIZE_FLOAT";
          break;
        case DOUBLE:
          _switchResult = "TYPE_SIZE_DOUBLE";
          break;
        case CHAR:
          _switchResult = "TYPE_SIZE_CHARACTER";
          break;
        case BOOLEAN:
          _switchResult = "TYPE_SIZE_BOOLEAN";
          break;
        default:
          break;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("// ");
    CharSequence _createPropertyFQN = this.createPropertyFQN(property, type);
    _builder.append(_createPropertyFQN, " ");
    return (_switchResult + _builder);
  }
  
  /**
   * Determine the name of the parent class.
   */
  private CharSequence createParent(final RecordType type) {
    String _xifexpression = null;
    RecordType _parent = type.getParent();
    boolean _notEquals = (!Objects.equal(_parent, null));
    if (_notEquals) {
      RecordType _parent_1 = type.getParent();
      _xifexpression = _parent_1.getName();
    } else {
      _xifexpression = "AbstractMonitoringRecord";
    }
    return _xifexpression;
  }
  
  /**
   * Create the sequence of implements of the class and render the implements char sequence.
   */
  private CharSequence createImplements(final RecordType type) {
    final List<CharSequence> interfaces = new ArrayList<CharSequence>();
    RecordType _parent = type.getParent();
    boolean _equals = Objects.equal(_parent, null);
    if (_equals) {
      interfaces.add("IMonitoringRecord.Factory");
      interfaces.add("IMonitoringRecord.BinaryFactory");
    }
    if (((!Objects.equal(type.getParents(), null)) && (type.getParents().size() > 0))) {
      EList<TemplateType> _parents = type.getParents();
      final Function1<TemplateType, String> _function = (TemplateType iface) -> {
        return iface.getName();
      };
      List<String> _map = ListExtensions.<TemplateType, String>map(_parents, _function);
      interfaces.addAll(_map);
    }
    int _size = interfaces.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("implements ");
      String _join = IterableExtensions.join(interfaces, ", ");
      _builder.append(_join, " ");
      return _builder;
    } else {
      return " ";
    }
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
    CharSequence _xblockexpression = null;
    {
      Classifier _findType = TypeResolution.findType(property);
      final EList<ArraySize> sizes = _findType.getSizes();
      CharSequence _xifexpression = null;
      int _size = sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// load array sizes");
        _builder.newLine();
        {
          for(final ArraySize size : sizes) {
            {
              int _size_1 = size.getSize();
              boolean _equals = (_size_1 == 0);
              if (_equals) {
                _builder.append("int _");
                String _createName = NameResolver.createName(property);
                _builder.append(_createName, "");
                _builder.append("_size");
                int _indexOf = sizes.indexOf(size);
                _builder.append(_indexOf, "");
                _builder.append(" = buffer.getInt();");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("this.");
        String _createName_1 = NameResolver.createName(property);
        _builder.append(_createName_1, "");
        _builder.append(" = new ");
        Classifier _findType_1 = TypeResolution.findType(property);
        String _createName_2 = NameResolver.createName(property);
        CharSequence _createTypeInstantiationName = this.createTypeInstantiationName(_findType_1, _createName_2);
        _builder.append(_createTypeInstantiationName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        String _createName_3 = NameResolver.createName(property);
        String _createValueAssignmentForDeserialization = this.createValueAssignmentForDeserialization(sizes, property);
        CharSequence _createArrayAccessLoops = ValueAccessExpressionModule.createArrayAccessLoops(sizes, 0, _createName_3, _createValueAssignmentForDeserialization);
        _builder.append(_createArrayAccessLoops, "");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("this.");
        String _createName_4 = NameResolver.createName(property);
        _builder_1.append(_createName_4, "");
        _builder_1.append(" = ");
        Classifier _findType_2 = TypeResolution.findType(property);
        BaseType _type = _findType_2.getType();
        CharSequence _createPropertyPrimitiveTypeDeserialization = this.createPropertyPrimitiveTypeDeserialization(_type);
        _builder_1.append(_createPropertyPrimitiveTypeDeserialization, "");
        _builder_1.append(";");
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Determine the name and additional array sizes for an array deserialization.
   * For example property[2][_property_size1][6] or just property for simple fields
   */
  private CharSequence createTypeInstantiationName(final Classifier classifier, final String name) {
    try {
      String _xifexpression = null;
      EList<ArraySize> _sizes = classifier.getSizes();
      int _size = _sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        BaseType _type = classifier.getType();
        String _createPrimitiveTypeName = JavaTypeMapping.createPrimitiveTypeName(_type);
        EList<ArraySize> _sizes_1 = classifier.getSizes();
        final Function1<ArraySize, CharSequence> _function = (ArraySize size) -> {
          EList<ArraySize> _sizes_2 = classifier.getSizes();
          int _indexOf = _sizes_2.indexOf(size);
          return this.createArraySize(size, name, _indexOf);
        };
        List<CharSequence> _map = ListExtensions.<ArraySize, CharSequence>map(_sizes_1, _function);
        String _join = IterableExtensions.join(_map);
        _xifexpression = (_createPrimitiveTypeName + _join);
      } else {
        BaseType _type_1 = classifier.getType();
        _xifexpression = JavaTypeMapping.createPrimitiveTypeName(_type_1);
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Creates code for fixed and runtime array sizes according to the record model.
   */
  private CharSequence createArraySize(final ArraySize size, final String name, final int index) {
    CharSequence _xifexpression = null;
    int _size = size.getSize();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      int _size_1 = size.getSize();
      _builder.append(_size_1, "");
      _builder.append("]");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("[_");
      _builder_1.append(name, "");
      _builder_1.append("_size");
      _builder_1.append(index, "");
      _builder_1.append("]");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  /**
   * Assignment for a primitive value
   */
  private String createValueAssignmentForDeserialization(final EList<ArraySize> sizes, final Property property) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createPropertyValueExpression = ValueAccessExpressionModule.createPropertyValueExpression(property);
    _builder.append(_createPropertyValueExpression, "");
    _builder.append(" = ");
    Classifier _findType = TypeResolution.findType(property);
    BaseType _type = _findType.getType();
    CharSequence _createPropertyPrimitiveTypeDeserialization = this.createPropertyPrimitiveTypeDeserialization(_type);
    _builder.append(_createPropertyPrimitiveTypeDeserialization, "");
    _builder.append(";");
    return _builder.toString();
  }
  
  /**
   * Create code to get values from the input buffer.
   */
  private CharSequence createPropertyPrimitiveTypeDeserialization(final BaseType classifier) {
    CharSequence _switchResult = null;
    BaseTypes _typeEnum = BaseTypes.getTypeEnum(classifier);
    if (_typeEnum != null) {
      switch (_typeEnum) {
        case STRING:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("stringRegistry.get(buffer.getInt())");
          _switchResult = _builder;
          break;
        case BYTE:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("buffer.get()");
          _switchResult = _builder_1;
          break;
        case SHORT:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("buffer.getShort()");
          _switchResult = _builder_2;
          break;
        case INT:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("buffer.getInt()");
          _switchResult = _builder_3;
          break;
        case LONG:
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("buffer.getLong()");
          _switchResult = _builder_4;
          break;
        case FLOAT:
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("buffer.getFloat()");
          _switchResult = _builder_5;
          break;
        case DOUBLE:
          StringConcatenation _builder_6 = new StringConcatenation();
          _builder_6.append("buffer.getDouble()");
          _switchResult = _builder_6;
          break;
        case CHAR:
          StringConcatenation _builder_7 = new StringConcatenation();
          _builder_7.append("buffer.getChar()");
          _switchResult = _builder_7;
          break;
        case BOOLEAN:
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("buffer.get()==1?true:false");
          _switchResult = _builder_8;
          break;
        default:
          break;
      }
    }
    return _switchResult;
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
    CharSequence _xblockexpression = null;
    {
      Classifier _findType = TypeResolution.findType(property);
      final EList<ArraySize> sizes = _findType.getSizes();
      CharSequence _xifexpression = null;
      int _size = sizes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// store array sizes");
        _builder.newLine();
        {
          for(final ArraySize size : sizes) {
            {
              int _size_1 = size.getSize();
              boolean _equals = (_size_1 == 0);
              if (_equals) {
                _builder.append("int _");
                String _createName = NameResolver.createName(property);
                _builder.append(_createName, "");
                _builder.append("_size");
                int _indexOf = sizes.indexOf(size);
                _builder.append(_indexOf, "");
                _builder.append(" = this.");
                CharSequence _createGetterName = NameResolver.createGetterName(property);
                _builder.append(_createGetterName, "");
                _builder.append("()");
                int _indexOf_1 = sizes.indexOf(size);
                String _createCodeToDetermineArraySize = ValueAccessExpressionModule.createCodeToDetermineArraySize(_indexOf_1);
                _builder.append(_createCodeToDetermineArraySize, "");
                _builder.append(".length;");
                _builder.newLineIfNotEmpty();
                _builder.append("buffer.putInt(_");
                String _createName_1 = NameResolver.createName(property);
                _builder.append(_createName_1, "");
                _builder.append("_size");
                int _indexOf_2 = sizes.indexOf(size);
                _builder.append(_indexOf_2, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        String _createName_2 = NameResolver.createName(property);
        CharSequence _createValueStoreForSerialization = this.createValueStoreForSerialization(property);
        CharSequence _createArrayAccessLoops = ValueAccessExpressionModule.createArrayAccessLoops(sizes, 0, _createName_2, _createValueStoreForSerialization);
        _builder.append(_createArrayAccessLoops, "");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        _xifexpression = this.createValueStoreForSerialization(property);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private CharSequence createValueStoreForSerialization(final Property property) {
    CharSequence _xblockexpression = null;
    {
      CharSequence _createGetterValueExpression = ValueAccessExpressionModule.createGetterValueExpression(property);
      final String getterName = ("this." + _createGetterValueExpression);
      CharSequence _switchResult = null;
      Classifier _findType = TypeResolution.findType(property);
      BaseType _type = _findType.getType();
      BaseTypes _typeEnum = BaseTypes.getTypeEnum(_type);
      if (_typeEnum != null) {
        switch (_typeEnum) {
          case STRING:
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("buffer.putInt(stringRegistry.get(");
            _builder.append(getterName, "");
            _builder.append("));");
            _switchResult = _builder;
            break;
          case BYTE:
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("buffer.put((byte)");
            _builder_1.append(getterName, "");
            _builder_1.append(");");
            _switchResult = _builder_1;
            break;
          case SHORT:
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("buffer.putShort(");
            _builder_2.append(getterName, "");
            _builder_2.append(");");
            _switchResult = _builder_2;
            break;
          case INT:
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("buffer.putInt(");
            _builder_3.append(getterName, "");
            _builder_3.append(");");
            _switchResult = _builder_3;
            break;
          case LONG:
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append("buffer.putLong(");
            _builder_4.append(getterName, "");
            _builder_4.append(");");
            _switchResult = _builder_4;
            break;
          case FLOAT:
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("buffer.putFloat(");
            _builder_5.append(getterName, "");
            _builder_5.append(");");
            _switchResult = _builder_5;
            break;
          case DOUBLE:
            StringConcatenation _builder_6 = new StringConcatenation();
            _builder_6.append("buffer.putDouble(");
            _builder_6.append(getterName, "");
            _builder_6.append(");");
            _switchResult = _builder_6;
            break;
          case CHAR:
            StringConcatenation _builder_7 = new StringConcatenation();
            _builder_7.append("buffer.putChar(");
            _builder_7.append(getterName, "");
            _builder_7.append(");");
            _switchResult = _builder_7;
            break;
          case BOOLEAN:
            StringConcatenation _builder_8 = new StringConcatenation();
            _builder_8.append("buffer.put((byte)(");
            _builder_8.append(getterName, "");
            _builder_8.append("?1:0));");
            _switchResult = _builder_8;
            break;
          default:
            break;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    String _createName = NameResolver.createName(property);
    _builder.append(_createName, "");
    _builder.append(" = (");
    Classifier _findType = TypeResolution.findType(property);
    String _createObjectTypeName = JavaTypeMapping.createObjectTypeName(_findType);
    _builder.append(_createObjectTypeName, "");
    _builder.append(") values[");
    _builder.append(index, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
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
    CharSequence _xblockexpression = null;
    {
      final Classifier type = TypeResolution.findType(property);
      CharSequence _xifexpression = null;
      if ((Objects.equal(BaseTypes.STRING, BaseTypes.getTypeEnum(type.getType())) && 
        (type.getSizes().size() == 0))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.");
        String _createName = NameResolver.createName(property);
        _builder.append(_createName, "");
        _builder.append(" = ");
        String _createName_1 = NameResolver.createName(property);
        _builder.append(_createName_1, "");
        _builder.append(" == null?");
        String _xifexpression_1 = null;
        Literal _value = property.getValue();
        boolean _notEquals = (!Objects.equal(_value, null));
        if (_notEquals) {
          Literal _value_1 = property.getValue();
          _xifexpression_1 = this.createConstantReference(_value_1, property);
        } else {
          _xifexpression_1 = "\"\"";
        }
        _builder.append(_xifexpression_1, "");
        _builder.append(":");
        String _createName_2 = NameResolver.createName(property);
        _builder.append(_createName_2, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("this.");
        String _createName_3 = NameResolver.createName(property);
        _builder_1.append(_createName_3, "");
        _builder_1.append(" = ");
        String _createName_4 = NameResolver.createName(property);
        _builder_1.append(_createName_4, "");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String createConstantReference(final Literal literal, final Property property) {
    try {
      String _switchResult = null;
      boolean _matched = false;
      if (literal instanceof StringLiteral) {
        _matched=true;
        _switchResult = NameResolver.createConstantName(property);
      }
      if (!_matched) {
        if (literal instanceof ConstantLiteral) {
          _matched=true;
          _switchResult = NameResolver.createConstantLiteralName(((ConstantLiteral)literal));
        }
      }
      if (!_matched) {
        if (literal instanceof BuiltInValueLiteral) {
          _matched=true;
          _switchResult = NameResolver.createConstantName(property);
        }
      }
      if (!_matched) {
        Class<? extends Literal> _class = literal.getClass();
        String _plus = ("constant reference requested for " + _class);
        String _plus_1 = (_plus + " which is not defined.");
        throw new InternalErrorException(_plus_1);
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("final ");
    Classifier _findType = TypeResolution.findType(property);
    String _createTypeName = JavaTypeMapping.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(" ");
    String _createName = NameResolver.createName(property);
    _builder.append(_createName, "");
    return _builder;
  }
  
  /**
   * Create one entry of the property type array.
   * 
   * @param property
   * 		a property of the record type
   * 
   * @returns one type entry
   */
  private CharSequence createPropertyTypeArrayEntry(final Property property, final RecordType type) {
    StringConcatenation _builder = new StringConcatenation();
    Classifier _findType = TypeResolution.findType(property);
    String _createTypeName = JavaTypeMapping.createTypeName(_findType);
    _builder.append(_createTypeName, "");
    _builder.append(".class, // ");
    CharSequence _createPropertyFQN = this.createPropertyFQN(property, type);
    _builder.append(_createPropertyFQN, "");
    _builder.newLineIfNotEmpty();
    return _builder;
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
  private CharSequence createPropertyFQN(final Property property, final TemplateType type) {
    EList<Property> _properties = type.getProperties();
    boolean _contains = _properties.contains(property);
    if (_contains) {
      String _name = type.getName();
      String _plus = (_name + ".");
      String _name_1 = property.getName();
      return (_plus + _name_1);
    } else {
      EList<TemplateType> _parents = type.getParents();
      boolean _notEquals = (!Objects.equal(_parents, null));
      if (_notEquals) {
        EList<TemplateType> _parents_1 = type.getParents();
        for (final TemplateType t : _parents_1) {
          {
            final CharSequence result2 = this.createPropertyFQN(property, t);
            boolean _notEquals_1 = (!Objects.equal(result2, null));
            if (_notEquals_1) {
              return result2;
            }
          }
        }
      }
    }
    return null;
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
  private CharSequence createPropertyFQN(final Property property, final RecordType type) {
    EList<Property> _properties = type.getProperties();
    boolean _contains = _properties.contains(property);
    if (_contains) {
      String _name = type.getName();
      String _plus = (_name + ".");
      String _name_1 = property.getName();
      return (_plus + _name_1);
    } else {
      RecordType _parent = type.getParent();
      boolean _notEquals = (!Objects.equal(_parent, null));
      if (_notEquals) {
        RecordType _parent_1 = type.getParent();
        final CharSequence result = this.createPropertyFQN(property, _parent_1);
        boolean _notEquals_1 = (!Objects.equal(result, null));
        if (_notEquals_1) {
          return result;
        }
      }
      EList<TemplateType> _parents = type.getParents();
      boolean _notEquals_2 = (!Objects.equal(_parents, null));
      if (_notEquals_2) {
        EList<TemplateType> _parents_1 = type.getParents();
        for (final TemplateType t : _parents_1) {
          {
            final CharSequence result_1 = this.createPropertyFQN(property, t);
            boolean _notEquals_3 = (!Objects.equal(result_1, null));
            if (_notEquals_3) {
              return result_1;
            }
          }
        }
      }
      return null;
    }
  }
}
