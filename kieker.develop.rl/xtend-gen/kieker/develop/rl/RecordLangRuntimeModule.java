/**
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl;

import com.google.inject.Binder;
import com.google.inject.Singleton;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.ScopedBindingBuilder;
import kieker.develop.rl.AbstractRecordLangRuntimeModule;
import kieker.develop.rl.ouput.config.RecordLangOutputConfigurationProvider;
import kieker.develop.rl.typing.jar.JarModelGlobalScopeProvider;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class RecordLangRuntimeModule extends AbstractRecordLangRuntimeModule {
  /**
   * {@inheritDoc}<br>
   * This extension registers the custom {@link TypeGlobalScopeProvider} that realizes e.g. the
   * correct linking of primitive data types. The implementation of that part is broadly transfered
   * from the JVMTypes binding.
   */
  @Override
  public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
    return JarModelGlobalScopeProvider.class;
  }
  
  /**
   * Register my own output outlet provider. We need an outlet for each language.
   */
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    AnnotatedBindingBuilder<IOutputConfigurationProvider> _bind = binder.<IOutputConfigurationProvider>bind(IOutputConfigurationProvider.class);
    ScopedBindingBuilder _to = _bind.to(RecordLangOutputConfigurationProvider.class);
    _to.in(Singleton.class);
  }
}
