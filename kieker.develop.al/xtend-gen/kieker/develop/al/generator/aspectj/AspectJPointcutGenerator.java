package kieker.develop.al.generator.aspectj;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.Aspect;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.aspectLang.UtilizeAdvice;
import kieker.develop.al.generator.aspectj.NameResolver;
import kieker.develop.al.generator.aspectj.PointcutQueryModule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@SuppressWarnings("all")
public class AspectJPointcutGenerator implements IGenerator<Collection<Aspect>, Document> {
  private final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
  
  private final DocumentBuilder docBuilder = new Function0<DocumentBuilder>() {
    public DocumentBuilder apply() {
      try {
        DocumentBuilder _newDocumentBuilder = AspectJPointcutGenerator.this.docFactory.newDocumentBuilder();
        return _newDocumentBuilder;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  private Document doc;
  
  @Override
  public Document generate(final Collection<Aspect> input) {
    Document _newDocument = this.docBuilder.newDocument();
    this.doc = _newDocument;
    final Element aspectjElement = this.doc.createElement("aspectj");
    this.doc.appendChild(aspectjElement);
    final Element weaverElement = this.doc.createElement("weaver");
    weaverElement.setAttribute("options", "");
    aspectjElement.appendChild(weaverElement);
    final Element aspectsElement = this.doc.createElement("aspects");
    aspectjElement.appendChild(aspectsElement);
    final ArrayList<Advice> advices = new ArrayList<Advice>();
    final Consumer<Aspect> _function = (Aspect it) -> {
      EList<UtilizeAdvice> _advices = it.getAdvices();
      final Consumer<UtilizeAdvice> _function_1 = (UtilizeAdvice it_1) -> {
        Advice _advice = it_1.getAdvice();
        this.addUnique(advices, _advice);
      };
      _advices.forEach(_function_1);
    };
    input.forEach(_function);
    final Procedure2<Advice, Integer> _function_1 = (Advice advice, Integer i) -> {
      Element _createAspect = this.createAspect(aspectsElement, advice, (i).intValue());
      aspectsElement.appendChild(_createAspect);
    };
    IterableExtensions.<Advice>forEach(advices, _function_1);
    for (final Aspect aspect : input) {
      EList<UtilizeAdvice> _advices = aspect.getAdvices();
      final Procedure2<UtilizeAdvice, Integer> _function_2 = (UtilizeAdvice advice, Integer i) -> {
        Advice _advice = advice.getAdvice();
        final Element concreteAspect = this.createConcreteAspect(aspectsElement, _advice, (i).intValue());
        Pointcut _pointcut = aspect.getPointcut();
        Element _createPointcut = this.createPointcut(_pointcut);
        concreteAspect.appendChild(_createPointcut);
        aspectsElement.appendChild(concreteAspect);
      };
      IterableExtensions.<UtilizeAdvice>forEach(_advices, _function_2);
    }
    return this.doc;
  }
  
  private boolean addUnique(final ArrayList<Advice> advices, final Advice advice) {
    boolean _xifexpression = false;
    boolean _contains = advices.contains(advice);
    boolean _not = (!_contains);
    if (_not) {
      _xifexpression = advices.add(advice);
    }
    return _xifexpression;
  }
  
  private Element createPointcut(final Pointcut pointcut) {
    final Element pNode = this.doc.createElement("pointcut");
    String _name = pointcut.getName();
    pNode.setAttribute("name", _name);
    String _createExpression = PointcutQueryModule.createExpression(pointcut);
    pNode.setAttribute("expression", _createExpression);
    return pNode;
  }
  
  private Element createAspect(final Element parent, final Advice advice, final int i) {
    final Element aspect = this.doc.createElement("aspect");
    CharSequence _adviceClassName = NameResolver.getAdviceClassName(advice, i);
    String _string = _adviceClassName.toString();
    aspect.setAttribute("name", _string);
    return aspect;
  }
  
  private Element createConcreteAspect(final Element parent, final Advice advice, final int i) {
    final Element aspect = this.doc.createElement("concrete-aspect");
    CharSequence _concreteAdviceClassName = NameResolver.getConcreteAdviceClassName(advice, i);
    String _string = _concreteAdviceClassName.toString();
    aspect.setAttribute("name", _string);
    CharSequence _adviceClassName = NameResolver.getAdviceClassName(advice, i);
    String _string_1 = _adviceClassName.toString();
    aspect.setAttribute("extends", _string_1);
    return aspect;
  }
}
