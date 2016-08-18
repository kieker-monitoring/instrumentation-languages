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

import com.google.inject.Inject;
import kieker.develop.al.modelhandling.ForeignModelTypeProviderFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.scoping.IScope;
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
  
  public IScope scope_ContainerNode_container(final /* ContainerNode */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nLocationQuery cannot be resolved to a type."
      + "\nLocationQuery cannot be resolved to a type."
      + "\nCompositionQuery cannot be resolved to a type."
      + "\nLocationQuery cannot be resolved to a type."
      + "\nLocationQuery cannot be resolved to a type."
      + "\nPointcut cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\neContainer cannot be resolved"
      + "\nnode cannot be resolved"
      + "\ncreateLocationScope cannot be resolved"
      + "\nnode cannot be resolved"
      + "\ncreateLocationScope cannot be resolved"
      + "\nmodel cannot be resolved"
      + "\ncreateModelScope cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved");
  }
  
  private IScope createModelScope(final /* ApplicationModel */Object model, final ResourceSet resourceSet) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeProvider(ResourceSet, ApplicationModel) is undefined for the type ForeignModelTypeProviderFactory"
      + "\nallTypes cannot be resolved");
  }
  
  private IScope createLocationScope(final /* Node */Object node) {
    throw new Error("Unresolved compilation problems:"
      + "\nContainerNode cannot be resolved to a type."
      + "\ncontainer cannot be resolved"
      + "\ncontents cannot be resolved");
  }
  
  public IScope scope_Pointcut_returnType(final /* Pointcut */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nNode cannot be resolved to a type."
      + "\nContainerNode cannot be resolved to a type."
      + "\nThe method getTypeProvider(Object, Object) is undefined for the type ForeignModelTypeProviderFactory"
      + "\nlocation cannot be resolved"
      + "\nleaveNode cannot be resolved"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nallDataTyes cannot be resolved");
  }
  
  public IScope scope_Pointcut_method(final /* Pointcut */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nNode cannot be resolved to a type."
      + "\nContainerNode cannot be resolved to a type."
      + "\nContainerNode cannot be resolved to a type."
      + "\nlocation cannot be resolved"
      + "\nleaveNode cannot be resolved"
      + "\ncontainer cannot be resolved"
      + "\noperations cannot be resolved");
  }
  
  public IScope scope_ParameterQuery_modifier(final /* ParameterQuery */Object context, final EReference reference) {
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_ParameterQuery_type(final /* ParameterQuery */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getTypeProvider(Object, Object) is undefined for the type ForeignModelTypeProviderFactory"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\nallDataTyes cannot be resolved");
  }
  
  public IScope scope_ParameterQuery_parameter(final /* ParameterQuery */Object context, final EReference reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nOperationQuery cannot be resolved to a type."
      + "\neContainer cannot be resolved"
      + "\noperationReference cannot be resolved");
  }
  
  private /* Node */Object leaveNode(final /* LocationQuery */Object query) {
    throw new Error("Unresolved compilation problems:"
      + "\nspecialization cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nspecialization cannot be resolved"
      + "\nleaveNode cannot be resolved"
      + "\nnode cannot be resolved");
  }
}
