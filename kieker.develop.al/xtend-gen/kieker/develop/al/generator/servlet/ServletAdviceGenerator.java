package kieker.develop.al.generator.servlet;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import kieker.develop.al.aspectLang.Advice;

@SuppressWarnings("all")
public class ServletAdviceGenerator implements IGenerator<Advice, CharSequence> {
  @Override
  public CharSequence generate(final Advice input) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isTraceAPIUsed is undefined for the type Advice"
      + "\nThe method or field packageName is undefined for the type Advice"
      + "\nThe method createEventRecording(InsertionPoint) is undefined for the type Advice"
      + "\nThe method createEventRecording(InsertionPoint) is undefined for the type Advice"
      + "\nThe method createEventRecording(InsertionPoint) is undefined for the type Advice"
      + "\nThe method createRecordInputs(EList<Object>) from the type CommonJavaTemplates refers to the missing type Object");
  }
}
