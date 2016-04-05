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
package kieker.develop.al.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import kieker.develop.al.aspectLang.ContainerNode;
import kieker.develop.al.aspectLang.LocationQuery;
import kieker.develop.al.aspectLang.Node;
import kieker.develop.al.aspectLang.OperationQuery;
import kieker.develop.al.aspectLang.ParameterQuery;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.mapping.Container;
import kieker.develop.al.mapping.Feature;
import kieker.develop.al.mapping.NamedElement;
import kieker.develop.al.mapping.NamedType;
import kieker.develop.al.mapping.Operation;
import kieker.develop.al.mapping.Parameter;
import kieker.develop.al.modelhandling.ForeignModelTypeProviderFactory;
import kieker.develop.al.modelhandling.IForeignModelTypeProvider;
import kieker.develop.al.scoping.ContainerParentScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class AspectLangScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  @Extension
  private ForeignModelTypeProviderFactory typeProviderFactory;
  
  public IScope scope_ContainerNode_container(final ContainerNode context, final EReference reference) {
    EObject _eContainer = context.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    if ((_eContainer_1 instanceof LocationQuery)) {
      Resource _eResource = context.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      final IForeignModelTypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(_resourceSet, null);
      Iterable<NamedElement> _allTypes = typeProvider.getAllTypes();
      final IScope result = new ContainerParentScope(_allTypes, context);
      return result;
    } else {
      return null;
    }
  }
  
  public IScope scope_Pointcut_returnType(final Pointcut context, final EReference reference) {
    LocationQuery _location = context.getLocation();
    final Node node = this.leaveNode(_location);
    if ((node instanceof ContainerNode)) {
      Resource _eResource = context.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      final IForeignModelTypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(_resourceSet, null);
      Iterable<NamedType> _allDataTyes = typeProvider.getAllDataTyes();
      return Scopes.scopeFor(_allDataTyes);
    } else {
      return IScope.NULLSCOPE;
    }
  }
  
  public IScope scope_Pointcut_method(final Pointcut context, final EReference reference) {
    LocationQuery _location = context.getLocation();
    final Node node = this.leaveNode(_location);
    if ((node instanceof ContainerNode)) {
      final Feature container = ((ContainerNode) node).getContainer();
      if ((container instanceof Container)) {
        EList<Operation> _operations = ((Container)container).getOperations();
        return Scopes.scopeFor(_operations);
      } else {
        return IScope.NULLSCOPE;
      }
    } else {
      return IScope.NULLSCOPE;
    }
  }
  
  public IScope scope_ParameterQuery_modifier(final ParameterQuery context, final EReference reference) {
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ParameterQuery_type(final ParameterQuery context, final EReference reference) {
    Resource _eResource = context.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final IForeignModelTypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(_resourceSet, null);
    Iterable<NamedType> _allDataTyes = typeProvider.getAllDataTyes();
    return Scopes.scopeFor(_allDataTyes);
  }
  
  public IScope scope_ParameterQuery_parameter(final ParameterQuery context, final EReference reference) {
    EObject _eContainer = context.eContainer();
    final Operation operation = ((OperationQuery) _eContainer).getOperationReference();
    EList<Parameter> _parameters = operation.getParameters();
    return Scopes.scopeFor(_parameters);
  }
  
  private Node leaveNode(final LocationQuery query) {
    Node _xifexpression = null;
    LocationQuery _specialization = query.getSpecialization();
    boolean _notEquals = (!Objects.equal(_specialization, null));
    if (_notEquals) {
      LocationQuery _specialization_1 = query.getSpecialization();
      _xifexpression = this.leaveNode(_specialization_1);
    } else {
      _xifexpression = query.getNode();
    }
    return _xifexpression;
  }
}
