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
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelResource
 * 
 * @author Yannic Kropp -- initial contribution
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class JarModelResource extends ResourceImpl {
  private final Object rlFactory /* Skipped initializer because of errors */;
  
  private IProject project;
  
  private final /* Collection<Type> */Object modelTypes /* Skipped initializer because of errors */;
  
  /**
   * Integrate a foreign model.
   * 
   * @param uri of the foreign model
   * @param applicationModel the application model
   */
  public JarModelResource(final URI uri, final IProject project) {
    super(uri);
    this.project = project;
  }
  
  /**
   * Return an EObject with the name specified by the uriFragment.
   * 
   * @param uriFragment
   * 
   * @return the EObject identified by the uriFragment or null if no such object exists.
   */
  @Override
  public EObject getEObject(final String uriFragment) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nThe method or field name is undefined for the type Object"
      + "\nThe method or field name is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ntypes cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\nendsWith cannot be resolved"
      + "\n|| cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n!= cannot be resolved");
  }
  
  /**
   * Compute the uriFragment for a given EObject.
   * 
   * @param eObject the object the fragment is computed for.
   * 
   * @return returns the uriFragment for the given object.
   */
  @Override
  public String getURIFragment(final EObject eObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nType cannot be resolved to a type."
      + "\nType cannot be resolved to a type."
      + "\nname cannot be resolved");
  }
  
  /**
   * load the resource iff it is not already loaded.
   */
  @Override
  public void load(final Map<?, ?> options) throws IOException {
    if ((!this.isLoaded)) {
      this.doLoad(null, null);
    }
  }
  
  /**
   * Saving this resource is not allowed, as it is a virtual resource.
   */
  @Override
  public void save(final Map<?, ?> options) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  /**
   * This routine is called from ResourceImpl load after the load method above is triggered.
   * It initializes the primitive type mirror.
   * 
   * @param inputStream
   * @param options
   * 
   * @throws IOException
   */
  @Override
  public void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    URI _uRI = this.getURI();
    boolean _notEquals = (!Objects.equal(_uRI, null));
    if (_notEquals) {
      this.createModel();
    } else {
      try {
        throw new IOException("URI not set on ForeignModelResource.onLoad");
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  /**
   * Return prepared set over all inferred types.
   */
  public /* Iterable<Type> */Object getAllTypes() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JarModelResource.modelTypes refers to the missing type Type");
  }
  
  /**
   * Create an result model for a given ecore model.
   */
  private synchronized Boolean createModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nComplexType cannot be resolved to a type."
      + "\nThe method createModel(IType) from the type JarModelResource refers to the missing type Model"
      + "\nThe method createType(IType) from the type JarModelResource refers to the missing type ComplexType"
      + "\nThe field JarModelResource.modelTypes refers to the missing type Type"
      + "\nThe method linkType(IType, Map<IType, ComplexType>) from the type JarModelResource refers to the missing type ComplexType"
      + "\n== cannot be resolved"
      + "\ntypes cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  /**
   * Link types.
   */
  private void linkType(final IType type, final /* Map<IType, ComplexType> */Object typeMap) {
    throw new Error("Unresolved compilation problems:"
      + "\nTemplateType cannot be resolved to a type."
      + "\nTemplateType cannot be resolved to a type."
      + "\nRecordType cannot be resolved to a type."
      + "\nTemplateType cannot be resolved to a type."
      + "\nRecordType cannot be resolved to a type."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nadd cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nparents cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nparent cannot be resolved");
  }
  
  private /* Model */Object createModel(final IType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\ncreateModel cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  private /* ComplexType */Object createType(final IType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createTemplateType(IType) from the type JarModelResource refers to the missing type ComplexType"
      + "\nThe method createRecordType(IType) from the type JarModelResource refers to the missing type ComplexType");
  }
  
  private /* ComplexType */Object createRecordType(final IType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\ncreateRecordType cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateAttributes cannot be resolved");
  }
  
  private /* ComplexType */Object createTemplateType(final IType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\ncreateTemplateType cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncreateAttributes cannot be resolved");
  }
  
  public void createAttributes(final /* ComplexType */Object result, final IType type) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe method createType(String) from the type JarModelResource refers to the missing type Classifier"
      + "\nThe method createLiteral(Object) from the type JarModelResource refers to the missing type Literal"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe method createType(String) from the type JarModelResource refers to the missing type Classifier"
      + "\ncreateConstant cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nconstants cannot be resolved"
      + "\nadd cannot be resolved"
      + "\ncreateProperty cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nadd cannot be resolved");
  }
  
  private /* Literal */Object createLiteral(final Object object) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\ncreateIntLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateIntLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateBooleanLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateStringLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateFloatLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateFloatLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateIntLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateIntLiteral cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\ncreateStringLiteral cannot be resolved"
      + "\nvalue cannot be resolved");
  }
  
  private /* Classifier */Object createType(final String typeId) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe method or field getType is undefined for the type BaseTypes"
      + "\nThe field JarModelResource.rlFactory refers to the missing type Object"
      + "\ncreateClassifier cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntype cannot be resolved");
  }
  
  /**
   * find all types in a package fragment recursively.
   */
  private Collection<IType> findAllTypes(final IPackageFragment fragment) {
    try {
      final ArrayList<IType> result = new ArrayList<IType>();
      IJavaElement[] _children = fragment.getChildren();
      final Consumer<IJavaElement> _function = (IJavaElement element) -> {
        try {
          boolean _matched = false;
          if (element instanceof IPackageFragment) {
            _matched=true;
            String _elementName = ((IPackageFragment)element).getElementName();
            boolean _startsWith = _elementName.startsWith("kieker");
            if (_startsWith) {
              Collection<IType> _findAllTypes = this.findAllTypes(((IPackageFragment)element));
              result.addAll(_findAllTypes);
            }
          }
          if (!_matched) {
            if (element instanceof IClassFile) {
              _matched=true;
              IType _type = ((IClassFile)element).getType();
              result.add(_type);
            }
          }
          if (!_matched) {
            if (element instanceof ICompilationUnit) {
              _matched=true;
              IType[] _types = ((ICompilationUnit)element).getTypes();
              CollectionExtensions.<IType>addAll(result, _types);
            }
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      ((List<IJavaElement>)Conversions.doWrapArray(_children)).forEach(_function);
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
