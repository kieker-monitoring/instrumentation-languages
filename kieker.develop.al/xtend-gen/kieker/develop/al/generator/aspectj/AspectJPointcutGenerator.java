package kieker.develop.al.generator.aspectj;

import java.util.Collection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
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
  public Document generate(final /* Collection<Aspect> */Object input) {
    throw new Error("Unresolved compilation problems:"
      + "\nAspect cannot be resolved to a type."
      + "\nThe method createUtilizationMap(Collection<Aspect>) from the type CommonCollectionModule refers to the missing type Advice"
      + "\nThe method createAspect(Element, Advice, int) from the type AspectJPointcutGenerator refers to the missing type Advice"
      + "\nThe method createConcreteAspect(Element, Advice, int) from the type AspectJPointcutGenerator refers to the missing type Advice"
      + "\nadvice cannot be resolved"
      + "\nadvice cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\npointcut cannot be resolved"
      + "\ncreatePointcut cannot be resolved");
  }
  
  private Element createPointcut(final /* Pointcut */Object pointcut) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\ncreateExpression cannot be resolved");
  }
  
  private Element createAspect(final Element parent, final /* Advice */Object advice, final int i) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetAdviceClassName cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  private Element createConcreteAspect(final Element parent, final /* Advice */Object advice, final int i) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetConcreteAdviceClassName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ngetAdviceClassName cannot be resolved"
      + "\ntoString cannot be resolved");
  }
}
