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
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.ModelImpl;
import de.cau.cs.se.instrumentation.rl.typing.jar.ClassFinder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelResource
 */
@SuppressWarnings("all")
public class JarModelResource extends ResourceImpl {
  /**
   * Integrate a foreign model.
   * 
   * @param uri of the foreign model
   * @param applicationModel the application model
   */
  public JarModelResource(final URI uri) {
    super(uri);
  }
  
  /**
   * Return an EObject with the name specified by the uriFragment.
   * 
   * @param uriFragment
   * 
   * @return the EObject identified by the uriFragment or null if no such object exists.
   */
  public EObject getEObject(final String uriFragment) {
    EList<EObject> _contents = this.getContents();
    boolean _isEmpty = _contents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EObject object = null;
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(this.getContents(), Object.class)).length); i++) {
        {
          EList<EObject> _contents_1 = this.getContents();
          EObject _get = _contents_1.get(i);
          EList<Type> types = ((ModelImpl) _get).getTypes();
          Iterator queue = types.iterator();
          while ((queue.hasNext() && Objects.equal(object, null))) {
            {
              Object _next = queue.next();
              Type a = ((Type) _next);
              boolean _or = false;
              String _name = a.getName();
              boolean _endsWith = _name.endsWith(("." + uriFragment));
              if (_endsWith) {
                _or = true;
              } else {
                String _name_1 = a.getName();
                boolean _equals = _name_1.equals(uriFragment);
                _or = _equals;
              }
              if (_or) {
                object = a;
              }
            }
          }
        }
      }
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
  public String getURIFragment(final EObject eObject) {
    if ((eObject instanceof Type)) {
      return ((Type) eObject).getName();
    } else {
      return super.getURIFragment(eObject);
    }
  }
  
  /**
   * load the resource iff it is not already loaded.
   */
  public void load(final Map<?, ?> options) throws IOException {
    if ((!this.isLoaded)) {
      this.doLoad(null, null);
    }
  }
  
  /**
   * Saving this resource is not allowed, as it is a virtual resource.
   */
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
  public EList<Type> getAllDataTypes() {
    return null;
  }
  
  /**
   * Create an result model for a given ecore model.
   */
  private boolean createModel() {
    boolean _xsynchronizedexpression = false;
    synchronized (this) {
      boolean _xblockexpression = false;
      {
        final ArrayList<String> jars = this.findJars();
        final ArrayList<ModelImpl> resultModels = this.evaluateJars(jars);
        boolean _xifexpression = false;
        boolean _notEquals = (!Objects.equal(resultModels, null));
        if (_notEquals) {
          EList<EObject> _contents = this.getContents();
          _xifexpression = _contents.addAll(resultModels);
        }
        _xblockexpression = _xifexpression;
      }
      _xsynchronizedexpression = _xblockexpression;
    }
    return _xsynchronizedexpression;
  }
  
  /**
   * locates all jars in  the current user directory
   */
  private ArrayList<String> findJars() {
    ArrayList<String> jars = new ArrayList<String>(0);
    ClassLoader _systemClassLoader = ClassLoader.getSystemClassLoader();
    final URL[] urls = ((URLClassLoader) _systemClassLoader).getURLs();
    for (final URL url : urls) {
      String _string = url.toString();
      boolean _endsWith = _string.endsWith(".jar");
      if (_endsWith) {
        String _path = url.getPath();
        jars.add(_path);
      }
    }
    return jars;
  }
  
  /**
   * starts model-creation for classes in the jars implementing IMonitoringRecord
   */
  private ArrayList<ModelImpl> evaluateJars(final ArrayList<String> jarUrls) {
    try {
      ArrayList<ModelImpl> result = new ArrayList<ModelImpl>(0);
      final ClassFinder classfinder = new ClassFinder();
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(jarUrls, Object.class)).length); i++) {
        {
          String _get = jarUrls.get(i);
          final ArrayList<ModelImpl> temp = classfinder.getModelsForJar(_get);
          boolean _notEquals = (!Objects.equal(temp, null));
          if (_notEquals) {
            result.addAll(temp);
          }
        }
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
