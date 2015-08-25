/**
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

/**
 * TODO why is this named ContainerParentScope
 * 
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class ContainerParentScope implements IScope {
  private Iterable<NamedElement> types;
  
  private ContainerNode node;
  
  /**
   * Constructor.
   * 
   * @param types list of type name
   * @param node representing a hierarchy model node
   */
  public ContainerParentScope(final Iterable<NamedElement> types, final ContainerNode node) {
    this.types = types;
    this.node = node;
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    System.out.println("TODO: auto-generated method stub getAllElements");
    return null;
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    System.out.println("TODO: auto-generated method stub getElements name");
    return null;
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    System.out.println("TODO: auto-generated method stub getElements object");
    return null;
  }
  
  @Override
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
    final Function1<Container, Boolean> _function = (Container it) -> {
      String _name = it.getName();
      String _lastSegment = name.getLastSegment();
      return Boolean.valueOf(_name.equals(_lastSegment));
    };
    final Container element = IterableExtensions.<Container>findFirst(_contents, _function);
    boolean _notEquals = (!Objects.equal(element, null));
    if (_notEquals) {
      return EObjectDescription.create(name, element);
    } else {
      return null;
    }
  }
  
  @Override
  public IEObjectDescription getSingleElement(final EObject object) {
    System.out.println("TODO: auto-generated method stub getSingleElement object");
    return null;
  }
}
