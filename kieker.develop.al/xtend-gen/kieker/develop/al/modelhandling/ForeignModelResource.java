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
package kieker.develop.al.modelhandling;

import com.google.common.base.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kieker.develop.al.mapping.Container;
import kieker.develop.al.mapping.MappingModel;
import kieker.develop.al.mapping.NamedElement;
import kieker.develop.al.mapping.NamedType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 */
@SuppressWarnings("all")
public class ForeignModelResource extends ResourceImpl {
  private final static String MODEL_MAPPER = "kieker.develop.al.modelMapping";
  
  /**
   * Model of the application to be instrumented.
   */
  private final /* ApplicationModel */Object applicationModel;
  
  /**
   * Resulting hierarchy model.
   */
  private MappingModel resultModel;
  
  /**
   * Helper variable to prohibit recursion of model loading.
   */
  private boolean loading = false;
  
  /**
   * Integrate a foreign model.
   * 
   * @param uri of the foreign model
   * @param applicationModel the application model
   */
  public ForeignModelResource(final URI uri, final /* ApplicationModel */Object applicationModel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ForeignModelResource.applicationModel refers to the missing type ApplicationModel");
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
    EList<EObject> _contents = this.getContents();
    String _plus = ("this.getContents " + _contents);
    System.out.println(_plus);
    EList<EObject> _contents_1 = this.getContents();
    boolean _isEmpty = _contents_1.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EObject> _contents_2 = this.getContents();
      EObject _get = _contents_2.get(0);
      String _plus_1 = ("this.getContents get element " + _get);
      System.out.println(_plus_1);
      EList<EObject> _contents_3 = this.getContents();
      EObject _get_1 = null;
      if (_contents_3!=null) {
        _get_1=_contents_3.get(0);
      }
      EList<Container> _contents_4 = ((MappingModel) _get_1).getContents();
      Container _findFirst = null;
      if (_contents_4!=null) {
        final Function1<Container, Boolean> _function = (Container it) -> {
          String _uRIFragment = this.getURIFragment(it);
          return Boolean.valueOf(uriFragment.equals(_uRIFragment));
        };
        _findFirst=IterableExtensions.<Container>findFirst(_contents_4, _function);
      }
      final EObject object = _findFirst;
      boolean _notEquals = (!Objects.equal(object, null));
      if (_notEquals) {
        return object;
      } else {
        return super.getEObject(uriFragment);
      }
    } else {
      return super.getEObject(uriFragment);
    }
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
    if ((eObject instanceof NamedElement)) {
      return ((NamedElement) eObject).getName();
    } else {
      return super.getURIFragment(eObject);
    }
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
   * TODO fix documentation
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
   * Helper routine to get a special part of the result model.
   */
  public EList<NamedType> getAllDataTypes() {
    return this.resultModel.getTypes();
  }
  
  /**
   * Create an result model for a given ecore model.
   */
  private synchronized boolean createModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ForeignModelResource.applicationModel refers to the missing type ApplicationModel"
      + "\nThe field ForeignModelResource.applicationModel refers to the missing type ApplicationModel"
      + "\nThe method loadModel(ApplicationModel, ResourceSet) from the type IModelMapper refers to the missing type ApplicationModel"
      + "\nThe field ForeignModelResource.applicationModel refers to the missing type ApplicationModel"
      + "\n!= cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nhandler cannot be resolved");
  }
}
