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
import de.cau.cs.se.instrumentation.rl.generator.AbstractTagTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.c.RecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.java.PartialRecordTypeGenerator;
import de.cau.cs.se.instrumentation.rl.generator.java.TagTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.TagType;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
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
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      final String author = "Generic Kieker";
      final String version = "1.9";
      final Class<?>[] recordTypeGenerators = { RecordTypeGenerator.class, de.cau.cs.se.instrumentation.rl.generator.cheader.RecordTypeGenerator.class, de.cau.cs.se.instrumentation.rl.generator.java.RecordTypeGenerator.class, de.cau.cs.se.instrumentation.rl.generator.perl.RecordTypeGenerator.class };
      final Class<?>[] partialRecordTypeGenerators = { PartialRecordTypeGenerator.class };
      final Class<?>[] tagTypeGenerators = { TagTypeGenerator.class };
      for (final Class<?> generator : recordTypeGenerators) {
        {
          Constructor<? extends Object> _constructor = generator.getConstructor();
          Object _newInstance = _constructor.newInstance();
          final AbstractRecordTypeGenerator cg = ((AbstractRecordTypeGenerator) _newInstance);
          TreeIterator<EObject> _allContents = resource.getAllContents();
          Iterator<RecordType> _filter = Iterators.<RecordType>filter(_allContents, RecordType.class);
          final Procedure1<RecordType> _function = new Procedure1<RecordType>() {
            public void apply(final RecordType type) {
              String _fileName = cg.fileName(type);
              CharSequence _createContent = cg.createContent(type, author, version);
              fsa.generateFile(_fileName, _createContent);
            }
          };
          IteratorExtensions.<RecordType>forEach(_filter, _function);
        }
      }
      for (final Class<?> generator_1 : partialRecordTypeGenerators) {
        {
          Constructor<? extends Object> _constructor = generator_1.getConstructor();
          Object _newInstance = _constructor.newInstance();
          final AbstractPartialRecordTypeGenerator cg = ((AbstractPartialRecordTypeGenerator) _newInstance);
          TreeIterator<EObject> _allContents = resource.getAllContents();
          Iterator<PartialRecordType> _filter = Iterators.<PartialRecordType>filter(_allContents, PartialRecordType.class);
          final Procedure1<PartialRecordType> _function = new Procedure1<PartialRecordType>() {
            public void apply(final PartialRecordType type) {
              String _fileName = cg.fileName(type);
              CharSequence _createContent = cg.createContent(type, author, version);
              fsa.generateFile(_fileName, _createContent);
            }
          };
          IteratorExtensions.<PartialRecordType>forEach(_filter, _function);
        }
      }
      for (final Class<?> generator_2 : tagTypeGenerators) {
        {
          Constructor<? extends Object> _constructor = generator_2.getConstructor();
          Object _newInstance = _constructor.newInstance();
          final AbstractTagTypeGenerator cg = ((AbstractTagTypeGenerator) _newInstance);
          TreeIterator<EObject> _allContents = resource.getAllContents();
          Iterator<TagType> _filter = Iterators.<TagType>filter(_allContents, TagType.class);
          final Procedure1<TagType> _function = new Procedure1<TagType>() {
            public void apply(final TagType type) {
              String _fileName = cg.fileName(type);
              CharSequence _createContent = cg.createContent(type, author, version);
              fsa.generateFile(_fileName, _createContent);
            }
          };
          IteratorExtensions.<TagType>forEach(_filter, _function);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
