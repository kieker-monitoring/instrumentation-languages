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
package de.cau.cs.se.instrumentation.al.validation;

import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.modelhandling.IModelMapper;
import de.cau.cs.se.instrumentation.al.validation.AbstractAspectLangValidator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AspectLangValidator extends AbstractAspectLangValidator {
  private final static String MODEL_MAPPER = "de.cau.cs.se.instrumentation.al.modelMapping";
  
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public void checkApplicationModel(final ApplicationModel model) {
    final IExtensionRegistry registry = Platform.getExtensionRegistry();
    final IConfigurationElement[] config = registry.getConfigurationElementsFor(AspectLangValidator.MODEL_MAPPER);
    try {
      final Function1<IConfigurationElement, Boolean> _function = (IConfigurationElement element) -> {
        try {
          boolean _xblockexpression = false;
          {
            final Object ext = element.createExecutableExtension("class");
            boolean _xifexpression = false;
            if ((ext instanceof IModelMapper)) {
              String _name = ((IModelMapper) ext).name();
              String _handler = model.getHandler();
              _xifexpression = _name.equals(_handler);
            } else {
              _xifexpression = false;
            }
            _xblockexpression = _xifexpression;
          }
          return Boolean.valueOf(_xblockexpression);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      final boolean handlerPresent = IterableExtensions.<IConfigurationElement>exists(((Iterable<IConfigurationElement>)Conversions.doWrapArray(config)), _function);
      if ((!handlerPresent)) {
        String _handler = model.getHandler();
        String _plus = ("No model handler for " + _handler);
        String _plus_1 = (_plus + " registered.");
        this.error(_plus_1, 
          AspectLangPackage.Literals.APPLICATION_MODEL__HANDLER, 
          AspectLangValidator.INVALID_NAME);
      }
    } catch (final Throwable _t) {
      if (_t instanceof CoreException) {
        final CoreException ex = (CoreException)_t;
        String _message = ex.getMessage();
        System.out.println(_message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
