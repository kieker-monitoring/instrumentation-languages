package de.cau.cs.se.instrumentation.al.scoping;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.Node;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ContainerParentScope implements IScope {
  private Iterable<NamedElement> types;
  
  private ContainerNode node;
  
  public ContainerParentScope(final Iterable<NamedElement> elements, final ContainerNode node) {
    this.types = this.types;
    this.node = node;
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("TODO: auto-generated method stub getAllElements");
    return null;
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    System.out.println("TODO: auto-generated method stub getElements name");
    return null;
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    System.out.println("TODO: auto-generated method stub getElements object");
    return null;
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    EObject _eContainer = this.node.eContainer();
    LocationQuery parent = ((LocationQuery) _eContainer);
    Node _node = parent.getNode();
    boolean _equals = Objects.equal(_node, this.node);
    if (_equals) {
      EObject _eContainer_1 = parent.eContainer();
      parent = ((LocationQuery) _eContainer_1);
    }
    Node _node_1 = parent.getNode();
    final Container container = ((ContainerNode) _node_1).getContainer();
    EList<Container> _contents = container.getContents();
    final Function1<Container,Boolean> _function = new Function1<Container,Boolean>() {
      public Boolean apply(final Container it) {
        String _name = it.getName();
        String _lastSegment = name.getLastSegment();
        boolean _equals = _name.equals(_lastSegment);
        return Boolean.valueOf(_equals);
      }
    };
    final Container element = IterableExtensions.<Container>findFirst(_contents, _function);
    boolean _notEquals = (!Objects.equal(element, null));
    if (_notEquals) {
      return EObjectDescription.create(name, element);
    } else {
      return null;
    }
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    System.out.println("TODO: auto-generated method stub getSingleElement object");
    return null;
  }
}
