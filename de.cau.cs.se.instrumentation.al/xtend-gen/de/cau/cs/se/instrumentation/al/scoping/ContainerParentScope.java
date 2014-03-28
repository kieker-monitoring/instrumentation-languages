package de.cau.cs.se.instrumentation.al.scoping;

import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.modelhandling.ForeignModelTypeProviderFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

@SuppressWarnings("all")
public class ContainerParentScope implements IScope {
  public ContainerParentScope(final ForeignModelTypeProviderFactory factory, final ContainerNode node) {
  }
  
  public Iterable<IEObjectDescription> getAllElements() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public IEObjectDescription getSingleElement(final EObject object) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
