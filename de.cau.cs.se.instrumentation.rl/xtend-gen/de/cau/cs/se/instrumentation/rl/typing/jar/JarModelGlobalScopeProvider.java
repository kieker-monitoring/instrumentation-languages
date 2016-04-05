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
package kieker.tools.rl.typing.jar;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import kieker.tools.rl.recordLang.BaseType;
import kieker.tools.rl.typing.BaseTypeGlobalScopeProvider;
import kieker.tools.rl.typing.ITypeProvider;
import kieker.tools.rl.typing.jar.JarModelTypeProviderFactory;
import kieker.tools.rl.typing.jar.JarModelTypeScope;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class JarModelGlobalScopeProvider extends BaseTypeGlobalScopeProvider {
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  @Override
  public IScope getParentTypeScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter, final EClass referenceType) {
    IScope _xifexpression = null;
    String _name = referenceType.getName();
    String _simpleName = BaseType.class.getSimpleName();
    boolean _equals = _name.equals(_simpleName);
    if (_equals) {
      _xifexpression = super.getParentTypeScope(resource, reference, filter, referenceType);
    } else {
      boolean _isAssignableFrom = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.EPACKAGE, referenceType);
      if (_isAssignableFrom) {
        return IScope.NULLSCOPE;
      } else {
        boolean _notEquals = (!Objects.equal(resource, null));
        if (_notEquals) {
          final ResourceSet resourceSet = resource.getResourceSet();
          try {
            final IWorkspace workspace = ResourcesPlugin.getWorkspace();
            final IWorkspaceRoot root = workspace.getRoot();
            URI _uRI = resource.getURI();
            String _string = _uRI.toString();
            final String uri = _string.replaceFirst("platform:/resource", "");
            Path _path = new Path(uri);
            IFile _file = root.getFile(_path);
            final IProject project = _file.getProject();
            boolean _notEquals_1 = (!Objects.equal(resourceSet, null));
            if (_notEquals_1) {
              final ITypeProvider typeProvider = JarModelTypeProviderFactory.getTypeProvider(project, resourceSet);
              return new JarModelTypeScope(typeProvider, this.qualifiedNameConverter, filter);
            } else {
              throw new IllegalStateException("context must be contained in a resource set");
            }
          } catch (final Throwable _t) {
            if (_t instanceof IllegalStateException) {
              final IllegalStateException e = (IllegalStateException)_t;
              System.out.println("No workspace present");
              return IScope.NULLSCOPE;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } else {
          throw new IllegalStateException("context must be contained in a resource");
        }
      }
    }
    return _xifexpression;
  }
}
