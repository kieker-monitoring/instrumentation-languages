package kieker.develop.al.generator.spring;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import kieker.develop.al.aspectLang.Pointcut;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SpringPointcutGenerator implements IGenerator<Pointcut, CharSequence> {
  @Override
  public CharSequence generate(final Pointcut input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MISSING");
    return _builder;
  }
}
