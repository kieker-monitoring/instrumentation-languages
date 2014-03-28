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
package de.cau.cs.se.instrumentation.al.modelhandling;

import com.google.common.base.Objects;
import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.Containment;
import de.cau.cs.se.instrumantation.model.structure.Model;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.StructureFactory;
import de.cau.cs.se.instrumantation.model.structure.Type;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Simulates a real source by mapping the a PCM model to our model.
 * 
 * @author Reiner Jung - initial contribution
 */
@SuppressWarnings("all")
public class ForeignModelResource extends ResourceImpl {
  private final StructureFactory structure = StructureFactory.eINSTANCE;
  
  private final ApplicationModel applicationModel;
  
  private Model resultModel;
  
  private boolean loading = false;
  
  /**
   * Integrate a foreign model.
   * 
   * @param uri of the foreign model
   * @param model the application model
   */
  public ForeignModelResource(final URI uri, final ApplicationModel model) {
    super(uri);
    this.applicationModel = model;
  }
  
  public EObject getEObject(final String uriFragment) {
    System.out.println(("ForeignModelResource.getEObject(uriFragment) " + uriFragment));
    EList<EObject> _contents = this.getContents();
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
      public Boolean apply(final EObject it) {
        String _uRIFragment = ForeignModelResource.this.getURIFragment(it);
        return Boolean.valueOf(uriFragment.equals(_uRIFragment));
      }
    };
    final EObject object = IterableExtensions.<EObject>findFirst(_contents, _function);
    boolean _notEquals = (!Objects.equal(object, null));
    if (_notEquals) {
      return object;
    } else {
      System.out.println(("\tcontents did not include " + uriFragment));
      return super.getEObject(uriFragment);
    }
  }
  
  public String getURIFragment(final EObject eObject) {
    System.out.println(("ForeignModelResource.getURIFragment(eObject) " + eObject));
    if ((eObject instanceof NamedElement)) {
      return ((NamedElement) eObject).getName();
    } else {
      return super.getURIFragment(eObject);
    }
  }
  
  public void load(final Map<?,?> options) throws IOException {
    if ((!this.isLoaded)) {
      this.doLoad(null, null);
    }
  }
  
  public void save(final Map<?,?> options) throws IOException {
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
  public void doLoad(final InputStream inputStream, final Map<?,?> options) throws IOException {
    System.out.println(((("ForeignModelResource.doLoad(inputStream, options) " + inputStream) + ", ") + options));
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
  
  private void createModel() {
    System.out.println(("ForeignModelResource.createModel() " + Boolean.valueOf(this.loading)));
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this.applicationModel, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (!this.loading);
    }
    if (_and) {
      this.loading = true;
      final List<RegisteredPackage> usePackages = this.applicationModel.getUsePackages();
      for (final RegisteredPackage usePackage : usePackages) {
        {
          EPackage _ePackage = usePackage.getEPackage();
          Resource _eResource = _ePackage.eResource();
          final ResourceSet resourceSet = _eResource.getResourceSet();
          Resource _eResource_1 = usePackage.eResource();
          EList<EObject> _contents = _eResource_1.getContents();
          _contents.get(0);
          EPackage.Registry _packageRegistry = resourceSet.getPackageRegistry();
          EPackage _ePackage_1 = usePackage.getEPackage();
          String _nsURI = _ePackage_1.getNsURI();
          EPackage _ePackage_2 = usePackage.getEPackage();
          _packageRegistry.put(_nsURI, _ePackage_2);
          final Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
          final Map<String,Object> extensiontoFactoryMap = registry.getExtensionToFactoryMap();
          EPackage _ePackage_3 = usePackage.getEPackage();
          String _name = _ePackage_3.getName();
          XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
          extensiontoFactoryMap.put(_name, _xMIResourceFactoryImpl);
        }
      }
      String _model = this.applicationModel.getModel();
      URI _createPlatformResourceURI = URI.createPlatformResourceURI(_model, true);
      final Resource source = this.resourceSet.getResource(_createPlatformResourceURI, true);
      Model _createModel = this.structure.createModel();
      this.resultModel = _createModel;
      this.determineInterfaces(source);
      this.determineDataTypes(source);
      this.determineContainerHierarchy(source);
      EList<EObject> _contents = this.getContents();
      EList<Container> _contents_1 = this.resultModel.getContents();
      _contents.addAll(_contents_1);
      this.loading = false;
      int _size = this.contents.size();
      String _plus = ("ForeignModelResource.createModel() " + Integer.valueOf(_size));
      System.out.println(_plus);
    }
  }
  
  /**
   * @param source
   */
  private void determineContainerHierarchy(final Resource source) {
    final Iterator<EObject> iterator = source.getAllContents();
    boolean _hasNext = iterator.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final EObject object = iterator.next();
        EClass _eClass = object.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Repository");
        if (_equals) {
          EClass _eClass_1 = object.eClass();
          EStructuralFeature _eStructuralFeature = _eClass_1.getEStructuralFeature("components__Repository");
          final EReference reference = ((EReference) _eStructuralFeature);
          Object _eGet = object.eGet(reference);
          final EList<EObject> components = ((EList<EObject>) _eGet);
          for (final EObject component : components) {
            {
              final Container container = this.structure.createContainer();
              EClass _eClass_2 = component.eClass();
              EStructuralFeature _eStructuralFeature_1 = _eClass_2.getEStructuralFeature("entityName");
              Object _eGet_1 = component.eGet(_eStructuralFeature_1);
              final String fullQualifiedName = ((String) _eGet_1);
              final String[] names = fullQualifiedName.split("\\.");
              int _size = ((List<String>)Conversions.doWrapArray(names)).size();
              boolean _equals_1 = (_size == 0);
              if (_equals_1) {
                ((List<String>)Conversions.doWrapArray(names)).add(((String) fullQualifiedName));
              }
              final QualifiedName name = QualifiedName.create(names);
              String _lastSegment = name.getLastSegment();
              container.setName(_lastSegment);
              this.insertContainerInHierarchy(this.resultModel, container, name);
            }
          }
        }
      }
      boolean _hasNext_1 = iterator.hasNext();
      _while = _hasNext_1;
    }
  }
  
  private void insertContainerInHierarchy(final Containment parent, final Container entity, final QualifiedName fullQualifiedName) {
    int _segmentCount = fullQualifiedName.getSegmentCount();
    boolean _equals = (_segmentCount == 1);
    if (_equals) {
      this.addEntityToParentContainer(parent, entity);
    } else {
      EList<Container> _contents = parent.getContents();
      final Function1<Container,Boolean> _function = new Function1<Container,Boolean>() {
        public Boolean apply(final Container it) {
          String _name = it.getName();
          String _firstSegment = fullQualifiedName.getFirstSegment();
          return Boolean.valueOf(_name.equals(_firstSegment));
        }
      };
      final Container container = IterableExtensions.<Container>findFirst(_contents, _function);
      boolean _notEquals = (!Objects.equal(container, null));
      if (_notEquals) {
        QualifiedName _skipFirst = fullQualifiedName.skipFirst(1);
        this.insertContainerInHierarchy(container, entity, _skipFirst);
      } else {
        Containment runningParent = parent;
        QualifiedName _skipLast = fullQualifiedName.skipLast(1);
        List<String> _segments = _skipLast.getSegments();
        for (final String name : _segments) {
          {
            final Container newContainer = this.structure.createContainer();
            newContainer.setName(name);
            EList<Container> _contents_1 = runningParent.getContents();
            _contents_1.add(newContainer);
            runningParent = newContainer;
          }
        }
        EList<Container> _contents_1 = runningParent.getContents();
        _contents_1.add(entity);
      }
    }
  }
  
  private Boolean addEntityToParentContainer(final Containment parent, final Container entity) {
    boolean _xifexpression = false;
    EList<Container> _contents = parent.getContents();
    final Function1<Container,Boolean> _function = new Function1<Container,Boolean>() {
      public Boolean apply(final Container it) {
        String _name = it.getName();
        String _name_1 = entity.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      }
    };
    boolean _exists = IterableExtensions.<Container>exists(_contents, _function);
    boolean _not = (!_exists);
    if (_not) {
      EList<Container> _contents_1 = parent.getContents();
      _xifexpression = _contents_1.add(entity);
    } else {
      System.out.println("Double container declaration");
    }
    return _xifexpression;
  }
  
  /**
   * @param source
   */
  private void determineDataTypes(final Resource source) {
    final Iterator<EObject> iterator = source.getAllContents();
    boolean _hasNext = iterator.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      final EObject o = iterator.next();
      boolean _hasNext_1 = iterator.hasNext();
      _while = _hasNext_1;
    }
  }
  
  /**
   * @param types
   * @param literal
   * @return
   */
  private boolean contains(final EList<Type> types, final String literal) {
    for (final Type type : types) {
      String _name = type.getName();
      boolean _equals = _name.equals(literal);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Determine all interfaces in the given source.
   * 
   * @param source
   *            the resource containing the PCM model
   */
  private Object determineInterfaces(final Resource source) {
    return null;
  }
  
  /**
   * @param typeName
   * @return
   */
  private Type findType(final String typeName) {
    EList<Type> _types = this.resultModel.getTypes();
    for (final Type type : _types) {
      String _name = type.getName();
      boolean _equals = _name.equals(typeName);
      if (_equals) {
        return type;
      }
    }
    return null;
  }
}
