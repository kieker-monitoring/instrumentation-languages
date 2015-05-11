package de.cau.cs.se.instrumentation.rl.generator.csharp;

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
    _builder.append("csharp");
    return _builder.toString();
  }
  
  public String getDescription() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C# record generator");
    return _builder.toString();
  }
  
  public String getOutletType() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("csharp");
    return _builder.toString();
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
    _builder.append(".cs");
    return _builder.toString();
  }
  
  public boolean supportsAbstractRecordType() {
    return true;
  }
  
  public CharSequence createContent(final RecordType type, final String author, final String version) {
    return null;
  }
}
