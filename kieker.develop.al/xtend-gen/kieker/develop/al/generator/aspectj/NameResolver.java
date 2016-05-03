package kieker.develop.al.generator.aspectj;

import kieker.develop.al.aspectLang.Advice;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class NameResolver {
  public static CharSequence getAdviceClassName(final Advice advice, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Abstract");
    String _name = advice.getName();
    _builder.append(_name, "");
    _builder.append("Advice");
    _builder.append(index, "");
    return _builder;
  }
  
  public static CharSequence getConcreteAdviceClassName(final Advice advice, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = advice.getName();
    _builder.append(_name, "");
    _builder.append("Advice");
    _builder.append(index, "");
    return _builder;
  }
}
