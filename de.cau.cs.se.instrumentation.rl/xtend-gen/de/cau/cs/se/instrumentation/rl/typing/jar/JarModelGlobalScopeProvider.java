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
package de.cau.cs.se.instrumentation.rl.typing.jar;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import de.cau.cs.se.instrumentation.rl.typing.TypeGlobalScopeProvider;
import de.cau.cs.se.instrumentation.rl.typing.jar.IJarModelTypeProvider;
import de.cau.cs.se.instrumentation.rl.typing.jar.JarModelTypeProviderFactory;
import de.cau.cs.se.instrumentation.rl.typing.jar.JarModelTypeScope;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

@SuppressWarnings("all")
public class JarModelGlobalScopeProvider extends TypeGlobalScopeProvider {
  @Inject
  private JarModelTypeProviderFactory jarModeltypeProviderFactory;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  public IScope getParentTypeScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter, final EClass referenceType) {
    IScope _xifexpression = null;
    boolean _isAssignableFrom = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.ECLASSIFIER, referenceType);
    if (_isAssignableFrom) {
      _xifexpression = super.getParentTypeScope(resource, reference, filter, referenceType);
    } else {
      boolean _isAssignableFrom_1 = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.EPACKAGE, referenceType);
      if (_isAssignableFrom_1) {
        return IScope.NULLSCOPE;
      } else {
        boolean _notEquals = (!Objects.equal(resource, null));
        if (_notEquals) {
          final ResourceSet resourceSet = resource.getResourceSet();
          boolean _notEquals_1 = (!Objects.equal(resourceSet, null));
          if (_notEquals_1) {
            final IJarModelTypeProvider typeProvider = this.jarModeltypeProviderFactory.getTypeProvider(resourceSet);
            return new JarModelTypeScope(typeProvider, this.qualifiedNameConverter, filter);
          } else {
            throw new IllegalStateException("context must be contained in a resource set");
          }
        } else {
          throw new IllegalStateException("context must be contained in a resource");
        }
      }
    }
    return _xifexpression;
  }
}
