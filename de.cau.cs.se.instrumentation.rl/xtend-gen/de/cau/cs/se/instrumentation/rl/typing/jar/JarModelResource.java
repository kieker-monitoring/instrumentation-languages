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
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Constant;
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Literal;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangFactory;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.typing.PrimitiveTypes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelResource
 * 
 * @author Yannic Kropp -- initial contribution
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public class JarModelResource extends ResourceImpl {
  private final RecordLangFactory rlFactory = RecordLangFactory.eINSTANCE;
  
  private IProject project;
  
  private final Collection<Type> modelTypes = new ArrayList<Type>();
  
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
    EList<EObject> _contents = this.getContents();
    boolean _isEmpty = _contents.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EObject> _contents_1 = this.getContents();
      for (final EObject object : _contents_1) {
        if ((object instanceof Model)) {
          final EList<Type> types = ((Model) object).getTypes();
          final Function1<Type, Boolean> _function = (Type type) -> {
            boolean _or = false;
            String _name = type.getName();
            boolean _endsWith = _name.endsWith(("." + uriFragment));
            if (_endsWith) {
              _or = true;
            } else {
              String _name_1 = type.getName();
              boolean _equals = _name_1.equals(uriFragment);
              _or = _equals;
            }
            return Boolean.valueOf(_or);
          };
          final Type result = IterableExtensions.<Type>findFirst(types, _function);
          boolean _notEquals = (!Objects.equal(result, null));
          if (_notEquals) {
            return result;
          }
        }
      }
      return super.getEObject(uriFragment);
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
    if ((eObject instanceof Type)) {
      return ((Type) eObject).getName();
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
  public Iterable<Type> getAllTypes() {
    return this.modelTypes;
  }
  
  /**
   * Create an result model for a given ecore model.
   */
  private synchronized boolean createModel() {
    try {
      boolean _xifexpression = false;
      if ((!this.isLoaded)) {
        boolean _xblockexpression = false;
        {
          final IJavaProject javaProject = JavaCore.create(this.project);
          final IType iface = javaProject.findType("kieker.common.record.IMonitoringRecord");
          final ITypeHierarchy hierarchy = iface.newTypeHierarchy(javaProject, null);
          IType[] _allTypes = hierarchy.getAllTypes();
          final Function1<IType, Boolean> _function = (IType it) -> {
            boolean _xblockexpression_1 = false;
            {
              final String name = it.getFullyQualifiedName();
              boolean _or = false;
              boolean _or_1 = false;
              boolean _equals = name.equals("java.io.Serializable");
              if (_equals) {
                _or_1 = true;
              } else {
                boolean _equals_1 = name.equals("java.lang.Comparable");
                _or_1 = _equals_1;
              }
              if (_or_1) {
                _or = true;
              } else {
                boolean _equals_2 = name.equals("java.lang.Object");
                _or = _equals_2;
              }
              _xblockexpression_1 = (!_or);
            }
            return Boolean.valueOf(_xblockexpression_1);
          };
          final Iterable<IType> types = IterableExtensions.<IType>filter(((Iterable<IType>)Conversions.doWrapArray(_allTypes)), _function);
          final HashMap<String, Model> models = new HashMap<String, Model>();
          final Consumer<IType> _function_1 = (IType type) -> {
            IPackageFragment _packageFragment = type.getPackageFragment();
            String _elementName = _packageFragment.getElementName();
            Model _get = models.get(_elementName);
            boolean _equals = Objects.equal(_get, null);
            if (_equals) {
              IPackageFragment _packageFragment_1 = type.getPackageFragment();
              String _elementName_1 = _packageFragment_1.getElementName();
              Model _createModel = this.createModel(type);
              models.put(_elementName_1, _createModel);
            }
          };
          types.forEach(_function_1);
          final HashMap<IType, Type> typeMap = new HashMap<IType, Type>();
          final Consumer<IType> _function_2 = (IType type) -> {
            final Type modelType = this.createType(type);
            IPackageFragment _packageFragment = type.getPackageFragment();
            String _elementName = _packageFragment.getElementName();
            Model _get = models.get(_elementName);
            EList<Type> _types = _get.getTypes();
            _types.add(modelType);
            typeMap.put(type, modelType);
            this.modelTypes.add(modelType);
          };
          types.forEach(_function_2);
          final Consumer<IType> _function_3 = (IType type) -> {
            this.linkType(type, typeMap);
          };
          types.forEach(_function_3);
          boolean _xifexpression_1 = false;
          Collection<Model> _values = models.values();
          boolean _notEquals = (!Objects.equal(_values, null));
          if (_notEquals) {
            EList<EObject> _contents = this.getContents();
            Collection<Model> _values_1 = models.values();
            _xifexpression_1 = _contents.addAll(_values_1);
          }
          _xblockexpression = _xifexpression_1;
        }
        _xifexpression = _xblockexpression;
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Link types.
   */
  private void linkType(final IType type, final Map<IType, Type> typeMap) {
    try {
      final Type modelType = typeMap.get(type);
      boolean _matched = false;
      if (!_matched) {
        if (modelType instanceof TemplateType) {
          _matched=true;
          final ITypeHierarchy hierarchy = type.newSupertypeHierarchy(null);
          IType[] _superInterfaces = hierarchy.getSuperInterfaces(type);
          final Consumer<IType> _function = (IType iface) -> {
            final Type template = typeMap.get(iface);
            boolean _notEquals = (!Objects.equal(template, null));
            if (_notEquals) {
              EList<TemplateType> _parents = ((TemplateType)modelType).getParents();
              _parents.add(((TemplateType) template));
            }
          };
          ((List<IType>)Conversions.doWrapArray(_superInterfaces)).forEach(_function);
        }
      }
      if (!_matched) {
        if (modelType instanceof RecordType) {
          _matched=true;
          final ITypeHierarchy hierarchy = type.newSupertypeHierarchy(null);
          IType[] _superInterfaces = hierarchy.getSuperInterfaces(type);
          final Consumer<IType> _function = (IType iface) -> {
            final Type template = typeMap.get(iface);
            boolean _notEquals = (!Objects.equal(template, null));
            if (_notEquals) {
              EList<TemplateType> _parents = ((RecordType)modelType).getParents();
              _parents.add(((TemplateType) template));
            }
          };
          ((List<IType>)Conversions.doWrapArray(_superInterfaces)).forEach(_function);
          final IType superType = hierarchy.getSuperclass(type);
          boolean _notEquals = (!Objects.equal(superType, null));
          if (_notEquals) {
            Type _get = typeMap.get(superType);
            ((RecordType)modelType).setParent(((RecordType) _get));
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Model createModel(final IType type) {
    final Model model = this.rlFactory.createModel();
    IPackageFragment _packageFragment = type.getPackageFragment();
    String _elementName = _packageFragment.getElementName();
    model.setName(_elementName);
    return model;
  }
  
  private Type createType(final IType type) {
    try {
      Type _xifexpression = null;
      boolean _isInterface = type.isInterface();
      if (_isInterface) {
        _xifexpression = this.createTemplateType(type);
      } else {
        _xifexpression = this.createRecordType(type);
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Type createRecordType(final IType type) {
    final RecordType result = this.rlFactory.createRecordType();
    String _elementName = type.getElementName();
    result.setName(_elementName);
    this.createAttributes(result, type);
    return result;
  }
  
  private Type createTemplateType(final IType type) {
    final TemplateType result = this.rlFactory.createTemplateType();
    String _elementName = type.getElementName();
    result.setName(_elementName);
    this.createAttributes(result, type);
    return result;
  }
  
  public void createAttributes(final Type result, final IType type) {
    try {
      IField[] _fields = type.getFields();
      final Consumer<IField> _function = (IField field) -> {
        try {
          boolean _and = false;
          boolean _and_1 = false;
          int _flags = field.getFlags();
          boolean _isPublic = Flags.isPublic(_flags);
          if (!_isPublic) {
            _and_1 = false;
          } else {
            int _flags_1 = field.getFlags();
            boolean _isStatic = Flags.isStatic(_flags_1);
            _and_1 = _isStatic;
          }
          if (!_and_1) {
            _and = false;
          } else {
            int _flags_2 = field.getFlags();
            boolean _isFinal = Flags.isFinal(_flags_2);
            _and = _isFinal;
          }
          if (_and) {
            boolean _and_2 = false;
            boolean _and_3 = false;
            String _elementName = field.getElementName();
            boolean _startsWith = _elementName.startsWith("TYPE_SIZE");
            boolean _not = (!_startsWith);
            if (!_not) {
              _and_3 = false;
            } else {
              String _elementName_1 = field.getElementName();
              boolean _equals = "TYPES".equals(_elementName_1);
              boolean _not_1 = (!_equals);
              _and_3 = _not_1;
            }
            if (!_and_3) {
              _and_2 = false;
            } else {
              String _elementName_2 = field.getElementName();
              boolean _startsWith_1 = _elementName_2.startsWith("CACHED_KIEKERRECORDS");
              boolean _not_2 = (!_startsWith_1);
              _and_2 = _not_2;
            }
            if (_and_2) {
              final Constant constant = this.rlFactory.createConstant();
              String _elementName_3 = field.getElementName();
              constant.setName(_elementName_3);
              String _typeSignature = field.getTypeSignature();
              Classifier _createType = this.createType(_typeSignature);
              constant.setType(_createType);
              Object _constant = field.getConstant();
              Literal _createLiteral = this.createLiteral(_constant);
              constant.setValue(_createLiteral);
              EList<Constant> _constants = result.getConstants();
              _constants.add(constant);
            }
          } else {
            boolean _and_4 = false;
            boolean _and_5 = false;
            int _flags_3 = field.getFlags();
            boolean _isPrivate = Flags.isPrivate(_flags_3);
            if (!_isPrivate) {
              _and_5 = false;
            } else {
              int _flags_4 = field.getFlags();
              boolean _isFinal_1 = Flags.isFinal(_flags_4);
              _and_5 = _isFinal_1;
            }
            if (!_and_5) {
              _and_4 = false;
            } else {
              int _flags_5 = field.getFlags();
              boolean _isStatic_1 = Flags.isStatic(_flags_5);
              boolean _not_3 = (!_isStatic_1);
              _and_4 = _not_3;
            }
            if (_and_4) {
              final Property property = this.rlFactory.createProperty();
              String _elementName_4 = field.getElementName();
              property.setName(_elementName_4);
              String _typeSignature_1 = field.getTypeSignature();
              Classifier _createType_1 = this.createType(_typeSignature_1);
              property.setType(_createType_1);
              EList<Property> _properties = result.getProperties();
              _properties.add(property);
            }
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      ((List<IField>)Conversions.doWrapArray(_fields)).forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private Literal createLiteral(final Object object) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (object instanceof Integer) {
        _matched=true;
        final IntLiteral result = this.rlFactory.createIntLiteral();
        result.setValue(((Integer) object).intValue());
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Byte) {
        _matched=true;
        final IntLiteral result = this.rlFactory.createIntLiteral();
        result.setValue(((Byte) object).byteValue());
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Boolean) {
        _matched=true;
        final BooleanLiteral result = this.rlFactory.createBooleanLiteral();
        result.setValue(((Boolean)object));
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Character) {
        _matched=true;
        final StringLiteral result = this.rlFactory.createStringLiteral();
        String _string = ((Character)object).toString();
        result.setValue(_string);
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Double) {
        _matched=true;
        final FloatLiteral result = this.rlFactory.createFloatLiteral();
        float _floatValue = ((Double)object).floatValue();
        result.setValue(Float.valueOf(_floatValue));
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Float) {
        _matched=true;
        final FloatLiteral result = this.rlFactory.createFloatLiteral();
        result.setValue(((Float)object));
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Long) {
        _matched=true;
        final IntLiteral result = this.rlFactory.createIntLiteral();
        int _intValue = ((Long)object).intValue();
        result.setValue(_intValue);
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof Short) {
        _matched=true;
        final IntLiteral result = this.rlFactory.createIntLiteral();
        short _shortValue = ((Short)object).shortValue();
        result.setValue(_shortValue);
        return result;
      }
    }
    if (!_matched) {
      if (object instanceof String) {
        _matched=true;
        final StringLiteral result = this.rlFactory.createStringLiteral();
        result.setValue(((String)object));
        return result;
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return ((Literal)_switchResult);
  }
  
  private Classifier createType(final String typeId) {
    final Classifier classifier = this.rlFactory.createClassifier();
    switch (typeId) {
      case "B":
        EDataType _eType = PrimitiveTypes.EBYTE.getEType();
        classifier.setClass(_eType);
        break;
      case "C":
        EDataType _eType_1 = PrimitiveTypes.ECHAR.getEType();
        classifier.setClass(_eType_1);
        break;
      case "D":
        EDataType _eType_2 = PrimitiveTypes.EDOUBLE.getEType();
        classifier.setClass(_eType_2);
        break;
      case "F":
        EDataType _eType_3 = PrimitiveTypes.EFLOAT.getEType();
        classifier.setClass(_eType_3);
        break;
      case "I":
        EDataType _eType_4 = PrimitiveTypes.EINT.getEType();
        classifier.setClass(_eType_4);
        break;
      case "J":
        EDataType _eType_5 = PrimitiveTypes.ELONG.getEType();
        classifier.setClass(_eType_5);
        break;
      case "S":
        EDataType _eType_6 = PrimitiveTypes.ESHORT.getEType();
        classifier.setClass(_eType_6);
        break;
      case "Z":
        EDataType _eType_7 = PrimitiveTypes.EBOOLEAN.getEType();
        classifier.setClass(_eType_7);
        break;
      case "Ljava.lang.String;":
        EDataType _eType_8 = PrimitiveTypes.ESTRING.getEType();
        classifier.setClass(_eType_8);
        break;
    }
    return classifier;
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
          if (!_matched) {
            if (element instanceof IPackageFragment) {
              _matched=true;
              String _elementName = ((IPackageFragment)element).getElementName();
              boolean _startsWith = _elementName.startsWith("kieker");
              if (_startsWith) {
                Collection<IType> _findAllTypes = this.findAllTypes(((IPackageFragment)element));
                result.addAll(_findAllTypes);
              }
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
