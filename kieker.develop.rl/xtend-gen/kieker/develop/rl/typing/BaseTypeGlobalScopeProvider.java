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
package kieker.develop.rl.typing;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import kieker.develop.rl.typing.BaseTypeProviderFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

@SuppressWarnings("all")
public class BaseTypeGlobalScopeProvider extends DefaultGlobalScopeProvider {
  @Inject
  private BaseTypeProviderFactory typeProviderFactory;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  @Override
  public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
    EClass _eReferenceType = reference.getEReferenceType();
    final IScope parentTypeScope = this.getParentTypeScope(resource, reference, filter, _eReferenceType);
    EClass _eReferenceType_1 = reference.getEReferenceType();
    return super.getScope(parentTypeScope, resource, false, _eReferenceType_1, filter);
  }
  
  public IScope getParentTypeScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter, final EClass referenceType) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field BaseType is undefined"
      + "\nsimpleName cannot be resolved");
  }
}
