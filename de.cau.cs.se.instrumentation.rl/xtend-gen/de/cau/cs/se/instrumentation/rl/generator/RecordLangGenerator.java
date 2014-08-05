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
package de.cau.cs.se.instrumentation.rl.generator;

import com.google.common.collect.Iterators;
import de.cau.cs.se.instrumentation.rl.generator.AbstractPartialRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.AbstractRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.AbstractTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.c.RecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.java.PartialRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates one single files per record for java, c, and perl.
 */
@SuppressWarnings("all")
public class RecordLangGenerator implements IGenerator {
  private final static String className = "de.cau.cs.se.instrumentation.rl.generator.RecordLangGenerator";
  
  public final static String JAVA_DIR_PROPERTY = (RecordLangGenerator.className + ".JAVA_DIR_PROPERTY");
  
  public final static String JAVA_CHECK_PROPERTY = (RecordLangGenerator.className + ".JAVA_CHECK_PROPERTY");
  
  public final static String C_DIR_PROPERTY = (RecordLangGenerator.className + ".C_DIR_PROPERTY");
  
  public final static String C_CHECK_PROPERTY = (RecordLangGenerator.className + ".C_CHECK_PROPERTY");
  
  public final static String PERL_DIR_PROPERTY = (RecordLangGenerator.className + ".PERL_DIR_PROPERTY");
  
  public final static String PERL_CHECK_PROPERTY = (RecordLangGenerator.className + ".PERL_CHECK_PROPERTY");
  
  public final static String AUTHOR_PROPERTY = (RecordLangGenerator.className + ".AUTHOR_PROPERTY");
  
  public final static String VERSION_PROPERTY = (RecordLangGenerator.className + ".VERSION_PROPERTY");
  
  private String _version = "1.10";
  
  public String getVersion() {
    return this._version;
  }
  
  public void setVersion(final String version) {
    this._version = version;
  }
  
  private String _author = "Generic Kieker";
  
  public String getAuthor() {
    return this._author;
  }
  
  public void setAuthor(final String author) {
    this._author = author;
  }
  
  private String[] _selectedLanguageTypes = { "java" };
  
  public String[] getSelectedLanguageTypes() {
    return this._selectedLanguageTypes;
  }
  
  public void setSelectedLanguageTypes(final String[] selectedLanguageTypes) {
    this._selectedLanguageTypes = selectedLanguageTypes;
  }
  
  private boolean _languageSpecificTargetFolder = false;
  
  public boolean isLanguageSpecificTargetFolder() {
    return this._languageSpecificTargetFolder;
  }
  
  public void setLanguageSpecificTargetFolder(final boolean languageSpecificTargetFolder) {
    this._languageSpecificTargetFolder = languageSpecificTargetFolder;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      URI _uRI = resource.getURI();
      boolean _isPlatformResource = _uRI.isPlatformResource();
      if (_isPlatformResource) {
        final Class<?>[] recordTypeGenerators = { RecordTypeGenerator.class, de.cau.cs.se.instrumentation.rl.generator.cheader.RecordTypeGenerator.class, de.cau.cs.se.instrumentation.rl.generator.java.RecordTypeGenerator.class, de.cau.cs.se.instrumentation.rl.generator.perl.RecordTypeGenerator.class };
        final Class<?>[] partialRecordTypeGenerators = { PartialRecordTypeGenerator.class };
        for (final Class<?> generator : recordTypeGenerators) {
          {
            Constructor<?> _constructor = generator.getConstructor();
            Object _newInstance = _constructor.newInstance();
            final AbstractRecordTypeGenerator cg = ((AbstractRecordTypeGenerator) _newInstance);
            boolean _isActive = this.isActive(cg);
            if (_isActive) {
              boolean _isLanguageSpecificTargetFolder = this.isLanguageSpecificTargetFolder();
              cg.languageSpecificFolder = _isLanguageSpecificTargetFolder;
              TreeIterator<EObject> _allContents = resource.getAllContents();
              Iterator<RecordType> _filter = Iterators.<RecordType>filter(_allContents, RecordType.class);
              final Procedure1<RecordType> _function = new Procedure1<RecordType>() {
                public void apply(final RecordType type) {
                  String _fileName = cg.fileName(type);
                  String _languageType = cg.getLanguageType();
                  String _author = RecordLangGenerator.this.getAuthor();
                  String _version = RecordLangGenerator.this.getVersion();
                  CharSequence _createContent = cg.createContent(type, _author, _version);
                  fsa.generateFile(_fileName, _languageType, _createContent);
                }
              };
              IteratorExtensions.<RecordType>forEach(_filter, _function);
            }
          }
        }
        for (final Class<?> generator_1 : partialRecordTypeGenerators) {
          {
            Constructor<?> _constructor = generator_1.getConstructor();
            Object _newInstance = _constructor.newInstance();
            final AbstractPartialRecordTypeGenerator cg = ((AbstractPartialRecordTypeGenerator) _newInstance);
            boolean _isActive = this.isActive(cg);
            if (_isActive) {
              boolean _isLanguageSpecificTargetFolder = this.isLanguageSpecificTargetFolder();
              cg.languageSpecificFolder = _isLanguageSpecificTargetFolder;
              TreeIterator<EObject> _allContents = resource.getAllContents();
              Iterator<PartialRecordType> _filter = Iterators.<PartialRecordType>filter(_allContents, PartialRecordType.class);
              final Procedure1<PartialRecordType> _function = new Procedure1<PartialRecordType>() {
                public void apply(final PartialRecordType type) {
                  String _fileName = cg.fileName(type);
                  String _languageType = cg.getLanguageType();
                  String _author = RecordLangGenerator.this.getAuthor();
                  String _version = RecordLangGenerator.this.getVersion();
                  CharSequence _createContent = cg.createContent(type, _author, _version);
                  fsa.generateFile(_fileName, _languageType, _createContent);
                }
              };
              IteratorExtensions.<PartialRecordType>forEach(_filter, _function);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean isActive(final AbstractTypeGenerator generator) {
    String[] _selectedLanguageTypes = this.getSelectedLanguageTypes();
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
      public Boolean apply(final String it) {
        String _languageType = generator.getLanguageType();
        return Boolean.valueOf(_languageType.equals(it));
      }
    };
    return IterableExtensions.<String>exists(((Iterable<String>)Conversions.doWrapArray(_selectedLanguageTypes)), _function);
  }
}
