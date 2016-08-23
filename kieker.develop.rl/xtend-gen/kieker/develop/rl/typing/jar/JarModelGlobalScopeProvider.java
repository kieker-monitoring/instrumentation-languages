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
package kieker.develop.rl.typing.jar;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.typing.ITypeProvider;
import kieker.develop.rl.typing.base.BaseTypeGlobalScopeProvider;
import kieker.develop.rl.typing.jar.JarModelTypeProviderFactory;
import kieker.develop.rl.typing.jar.JarModelTypeScope;
import kieker.develop.rl.typing.semantics.AnnotationProvider;
import kieker.develop.rl.typing.semantics.AnnotationProviderFactory;
import kieker.develop.rl.typing.semantics.AnnotationScope;
import kieker.develop.semantics.annotations.Annotation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
    final IScope scope = super.getParentTypeScope(resource, reference, filter, referenceType);
    boolean _notEquals = (!Objects.equal(scope, IScope.NULLSCOPE));
    if (_notEquals) {
      return scope;
    } else {
      String _name = referenceType.getName();
      String _simpleName = Annotation.class.getSimpleName();
      boolean _equals = _name.equals(_simpleName);
      if (_equals) {
        boolean _notEquals_1 = (!Objects.equal(resource, null));
        if (_notEquals_1) {
          final ResourceSet resourceSet = resource.getResourceSet();
          boolean _notEquals_2 = (!Objects.equal(resourceSet, null));
          if (_notEquals_2) {
            final AnnotationProvider typeProvider = AnnotationProviderFactory.getTypeProvider(resourceSet);
            return new AnnotationScope(typeProvider, this.qualifiedNameConverter, filter);
          } else {
            throw new IllegalStateException("context must be contained in a resource set");
          }
        } else {
          throw new IllegalStateException("context must be contained in a resource");
        }
      } else {
        if ((referenceType.getName().equals(TemplateType.class.getSimpleName()) || referenceType.getName().equals(RecordType.class.getSimpleName()))) {
          boolean _notEquals_3 = (!Objects.equal(resource, null));
          if (_notEquals_3) {
            final ResourceSet resourceSet_1 = resource.getResourceSet();
            boolean _notEquals_4 = (!Objects.equal(resourceSet_1, null));
            if (_notEquals_4) {
              try {
                final IWorkspace workspace = ResourcesPlugin.getWorkspace();
                final IWorkspaceRoot root = workspace.getRoot();
                URI _uRI = resource.getURI();
                String _string = _uRI.toString();
                final String uri = _string.replaceFirst("platform:/resource", "");
                Path _path = new Path(uri);
                IFile _file = root.getFile(_path);
                final IProject project = _file.getProject();
                final ITypeProvider typeProvider_1 = JarModelTypeProviderFactory.getTypeProvider(project, resourceSet_1);
                return new JarModelTypeScope(typeProvider_1, this.qualifiedNameConverter, filter);
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
              throw new IllegalStateException("context must be contained in a resource set");
            }
          } else {
            throw new IllegalStateException("context must be contained in a resource");
          }
        } else {
          return IScope.NULLSCOPE;
        }
      }
    }
  }
}
