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
package kieker.develop.al.validation;

import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AspectLangValidator /* implements AbstractAspectLangValidator  */{
  private final static String MODEL_MAPPER = "kieker.develop.al.modelMapping";
  
  public final static String INVALID_NAME = "invalidName";
  
  @Check
  public Object checkApplicationModel(final /* ApplicationModel */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method error(String, Object, String) is undefined"
      + "\nAspectLangPackage$Literals cannot be resolved to a type."
      + "\nhandler cannot be resolved"
      + "\nhandler cannot be resolved"
      + "\nAPPLICATION_MODEL__HANDLER cannot be resolved");
  }
}
