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
import com.google.inject.Inject;
import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.Parameter;
import de.cau.cs.se.instrumantation.model.structure.Type;
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.Node;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern;
import de.cau.cs.se.instrumentation.al.aspectLang.Query;
import de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage;
import de.cau.cs.se.instrumentation.al.modelhandling.ForeignModelTypeProviderFactory;
import de.cau.cs.se.instrumentation.al.modelhandling.IForeignModelTypeProvider;
import de.cau.cs.se.instrumentation.al.scoping.ContainerParentScope;
import de.cau.cs.se.instrumentation.al.scoping.EPackageScope;
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
  
  public IScope scope_Query_returnType(final Query context, final EReference reference) {
    LocationQuery _location = context.getLocation();
    final Node node = this.leaveNode(_location);
    if ((node instanceof ContainerNode)) {
      Resource _eResource = context.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      final IForeignModelTypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(_resourceSet, null);
      Iterable<Type> _allDataTyes = typeProvider.getAllDataTyes();
      return Scopes.scopeFor(_allDataTyes);
    } else {
      return IScope.NULLSCOPE;
    }
  }
  
  public IScope scope_Query_method(final Query context, final EReference reference) {
    LocationQuery _location = context.getLocation();
    final Node node = this.leaveNode(_location);
    if ((node instanceof ContainerNode)) {
      Container _container = ((ContainerNode) node).getContainer();
      EList<Method> _methods = _container.getMethods();
      return Scopes.scopeFor(_methods);
    } else {
      return IScope.NULLSCOPE;
    }
  }
  
  public IScope scope_ParameterPattern_modifier(final ParameterPattern context, final EReference reference) {
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ParameterPattern_type(final ParameterPattern context, final EReference reference) {
    Resource _eResource = context.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final IForeignModelTypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(_resourceSet, null);
    Iterable<Type> _allDataTyes = typeProvider.getAllDataTyes();
    return Scopes.scopeFor(_allDataTyes);
  }
  
  public IScope scope_ParameterPattern_parameter(final ParameterPattern context, final EReference reference) {
    EObject _eContainer = context.eContainer();
    final Method method = ((MethodQuery) _eContainer).getMethodReference();
    EList<Parameter> _parameters = method.getParameters();
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
  
  /**
   * Find scope for the package property in the MetaModel rule.
   * 
   * @param context
   *            The Package-object of the resulting model.
   * @param reference
   *            The EReference-reference object of the AST.
   * @return The scope for the package attribute.
   */
  public IScope scope_RegisteredPackage_ePackage(final RegisteredPackage context, final EReference reference) {
    Resource _eResource = context.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    final IScope result = new EPackageScope(_resourceSet);
    return result;
  }
}
