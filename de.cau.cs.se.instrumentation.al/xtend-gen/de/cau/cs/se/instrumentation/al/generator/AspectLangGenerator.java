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
package de.cau.cs.se.instrumentation.al.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class AspectLangGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Iterator<Aspect> aspects = Iterators.<Aspect>filter(_allContents, Aspect.class);
    final Procedure1<Aspect> _function = new Procedure1<Aspect>() {
      public void apply(final Aspect it) {
        AspectLangGenerator.this.createProbe(it, fsa);
      }
    };
    IteratorExtensions.<Aspect>forEach(aspects, _function);
    final Procedure1<Aspect> _function_1 = new Procedure1<Aspect>() {
      public void apply(final Aspect it) {
        AspectLangGenerator.this.createConfiguration(it, fsa);
      }
    };
    IteratorExtensions.<Aspect>forEach(aspects, _function_1);
  }
  
  /**
   * Generate configuration for the given aspect.
   */
  public void createConfiguration(final Aspect aspect, final IFileSystemAccess access) {
    Annotation _annotation = aspect.getAnnotation();
    EList<Annotation> _annotations = _annotation.getAnnotations();
    final Procedure1<Annotation> _function = new Procedure1<Annotation>() {
      public void apply(final Annotation annotation) {
        String _switchResult = null;
        String _name = annotation.getName();
        final String _switchValue = _name;
        boolean _matched = false;
        if (!_matched) {
          if (Objects.equal(_switchValue,"J2EE")) {
            _matched=true;
            String _createJ2EEConfiguration = AspectLangGenerator.this.createJ2EEConfiguration(aspect, access);
            _switchResult = _createJ2EEConfiguration;
          }
        }
        if (!_matched) {
          if (Objects.equal(_switchValue,"Spring")) {
            _matched=true;
            String _createSpringConfiguration = AspectLangGenerator.this.createSpringConfiguration(aspect, access);
            _switchResult = _createSpringConfiguration;
          }
        }
        access.generateFile("configuration.txt", _switchResult);
      }
    };
    IterableExtensions.<Annotation>forEach(_annotations, _function);
  }
  
  public String createSpringConfiguration(final Aspect aspect, final IFileSystemAccess access) {
    return "TODO: auto-generated method stub";
  }
  
  public String createJ2EEConfiguration(final Aspect aspect, final IFileSystemAccess access) {
    return "TODO: auto-generated method stub";
  }
  
  public void createProbe(final Aspect aspect, final IFileSystemAccess access) {
  }
}
