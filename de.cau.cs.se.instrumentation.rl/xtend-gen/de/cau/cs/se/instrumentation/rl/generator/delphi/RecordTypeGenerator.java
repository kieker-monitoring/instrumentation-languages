package de.cau.cs.se.instrumentation.rl.generator.delphi;

import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import java.io.File;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class RecordTypeGenerator extends AbstractRecordTypeGenerator {
  public String getId() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delphi");
    return _builder.toString();
  }
  
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Delphi record generator");
    return _builder.toString();
  }
  
  /**
   * Create abstract record types.
   */
  public boolean supportsAbstractRecordType() {
    return true;
  }
  
  public CharSequence getDirectoryName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = type.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    _builder.append(_replace, "");
    return _builder;
  }
  
  public String getFileName(final Type type) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _directoryName = this.getDirectoryName(type);
    _builder.append(_directoryName, "");
    _builder.append(File.separator, "");
    String _name = type.getName();
    _builder.append(_name, "");
    _builder.append(".pas");
    return _builder.toString();
  }
  
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delphi");
    return _builder.toString();
  }
  
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
