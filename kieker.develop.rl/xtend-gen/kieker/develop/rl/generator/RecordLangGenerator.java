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
package kieker.develop.rl.generator;

import com.google.common.collect.Iterators;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import kieker.develop.rl.generator.AbstractRecordTypeGenerator;
import kieker.develop.rl.generator.AbstractTemplateTypeGenerator;
import kieker.develop.rl.generator.GeneratorConfiguration;
import kieker.develop.rl.preferences.TargetsPreferences;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.TemplateType;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates one single files per record for java, c, and perl.
 */
@SuppressWarnings("all")
public class RecordLangGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      URI _uRI = resource.getURI();
      boolean _isPlatformResource = _uRI.isPlatformResource();
      if (_isPlatformResource) {
        final String version = TargetsPreferences.getVersionID();
        final String author = TargetsPreferences.getAuthorName();
        for (final Class<?> generator : GeneratorConfiguration.RECORD_TYPE_GENERATORS) {
          {
            Constructor<?> _constructor = generator.getConstructor();
            Object _newInstance = _constructor.newInstance();
            final AbstractRecordTypeGenerator cg = ((AbstractRecordTypeGenerator) _newInstance);
            String _id = cg.getId();
            boolean _isGeneratorActive = TargetsPreferences.isGeneratorActive(_id);
            if (_isGeneratorActive) {
              TreeIterator<EObject> _allContents = resource.getAllContents();
              Iterator<RecordType> _filter = Iterators.<RecordType>filter(_allContents, RecordType.class);
              final Procedure1<RecordType> _function = (RecordType type) -> {
                boolean _or = false;
                boolean _supportsAbstractRecordType = cg.supportsAbstractRecordType();
                if (_supportsAbstractRecordType) {
                  _or = true;
                } else {
                  boolean _and = false;
                  boolean _supportsAbstractRecordType_1 = cg.supportsAbstractRecordType();
                  boolean _not = (!_supportsAbstractRecordType_1);
                  if (!_not) {
                    _and = false;
                  } else {
                    boolean _isAbstract = type.isAbstract();
                    boolean _not_1 = (!_isAbstract);
                    _and = _not_1;
                  }
                  _or = _and;
                }
                if (_or) {
                  String _fileName = cg.getFileName(type);
                  String _outletType = cg.getOutletType();
                  CharSequence _createContent = cg.createContent(type, author, version);
                  fsa.generateFile(_fileName, _outletType, _createContent);
                }
              };
              IteratorExtensions.<RecordType>forEach(_filter, _function);
            }
          }
        }
        for (final Class<?> generator_1 : GeneratorConfiguration.TEMPLATE_TYPE_GENERATORS) {
          {
            Constructor<?> _constructor = generator_1.getConstructor();
            Object _newInstance = _constructor.newInstance();
            final AbstractTemplateTypeGenerator cg = ((AbstractTemplateTypeGenerator) _newInstance);
            String _id = cg.getId();
            boolean _isGeneratorActive = TargetsPreferences.isGeneratorActive(_id);
            if (_isGeneratorActive) {
              TreeIterator<EObject> _allContents = resource.getAllContents();
              Iterator<TemplateType> _filter = Iterators.<TemplateType>filter(_allContents, TemplateType.class);
              final Procedure1<TemplateType> _function = (TemplateType type) -> {
                String _fileName = cg.getFileName(type);
                String _outletType = cg.getOutletType();
                CharSequence _createContent = cg.createContent(type, author, version);
                fsa.generateFile(_fileName, _outletType, _createContent);
              };
              IteratorExtensions.<TemplateType>forEach(_filter, _function);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
