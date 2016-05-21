package kieker.develop.al.generator.aspectj;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.Aspect;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.aspectLang.UtilizeAdvice;
import kieker.develop.al.generator.CommonCollectionModule;
import kieker.develop.al.generator.aspectj.NameResolver;
import kieker.develop.al.generator.aspectj.PointcutQueryModule;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@SuppressWarnings("all")
public class AspectJPointcutGenerator /* implements IGenerator<Collection<Aspect>, Document>  */{
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
    final HashMap<Advice, List<UtilizeAdvice>> utilizationMap = CommonCollectionModule.createUtilizationMap(input);
    final BiConsumer<Advice, List<UtilizeAdvice>> _function = (Advice advice, List<UtilizeAdvice> utilizedAdvices) -> {
      final Procedure2<UtilizeAdvice, Integer> _function_1 = (UtilizeAdvice utilizedAdviced, Integer i) -> {
        Advice _advice = utilizedAdviced.getAdvice();
        Element _createAspect = this.createAspect(aspectsElement, _advice, (i).intValue());
        aspectsElement.appendChild(_createAspect);
      };
      IterableExtensions.<UtilizeAdvice>forEach(utilizedAdvices, _function_1);
    };
    utilizationMap.forEach(_function);
    final BiConsumer<Advice, List<UtilizeAdvice>> _function_1 = (Advice advice, List<UtilizeAdvice> utilizedAdvices) -> {
      final Procedure2<UtilizeAdvice, Integer> _function_2 = (UtilizeAdvice utilizedAdviced, Integer i) -> {
        Advice _advice = utilizedAdviced.getAdvice();
        final Element concreteAspect = this.createConcreteAspect(aspectsElement, _advice, (i).intValue());
        EObject _eContainer = utilizedAdviced.eContainer();
        final Aspect aspect = ((Aspect) _eContainer);
        Pointcut _pointcut = aspect.getPointcut();
        Element _createPointcut = this.createPointcut(_pointcut);
        concreteAspect.appendChild(_createPointcut);
        aspectsElement.appendChild(concreteAspect);
      };
      IterableExtensions.<UtilizeAdvice>forEach(utilizedAdvices, _function_2);
    };
    utilizationMap.forEach(_function_1);
    return this.doc;
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
