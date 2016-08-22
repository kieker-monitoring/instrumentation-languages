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

import java.util.List;
import java.util.function.Consumer;
import kieker.develop.rl.preferences.TargetsPreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.service.prefs.Preferences;

/**
 * Generates one single files per record for java, c, and perl.
 */
@SuppressWarnings("all")
public class RecordLangGenerator implements IGenerator2 {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    URI _uRI = resource.getURI();
    boolean _isPlatformResource = _uRI.isPlatformResource();
    if (_isPlatformResource) {
      final IEclipsePreferences preferenceStore = TargetsPreferences.getPreferenceStore();
      URI _uRI_1 = resource.getURI();
      List<String> _segmentsList = _uRI_1.segmentsList();
      final String project = _segmentsList.get(1);
      final Preferences projectStore = preferenceStore.node(project);
      this.v(projectStore);
      this.runGenerators(preferenceStore, resource, fsa);
    }
  }
  
  public void v(final Preferences preferences) {
    try {
      String[] _childrenNames = preferences.childrenNames();
      final Consumer<String> _function = (String it) -> {
        System.out.println((">> " + it));
      };
      ((List<String>)Conversions.doWrapArray(_childrenNames)).forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void runGenerators(final IEclipsePreferences preferenceStore, final Resource resource, final IFileSystemAccess fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nRecordType cannot be resolved to a type."
      + "\nTemplateType cannot be resolved to a type."
      + "\nThe method or field abstract is undefined for the type void"
      + "\nThe method getFileName(Type) from the type AbstractTypeGenerator refers to the missing type Type"
      + "\nThe method generate(RecordType) from the type AbstractRecordTypeGenerator refers to the missing type RecordType"
      + "\nThe method getFileName(Type) from the type AbstractTypeGenerator refers to the missing type Type"
      + "\nThe method generate(TemplateType) from the type AbstractTemplateTypeGenerator refers to the missing type TemplateType"
      + "\n! cannot be resolved");
  }
  
  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
}
