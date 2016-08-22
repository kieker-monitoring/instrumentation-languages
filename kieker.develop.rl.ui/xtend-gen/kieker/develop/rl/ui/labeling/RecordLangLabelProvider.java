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
package kieker.develop.rl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class RecordLangLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public RecordLangLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public Object text(final /* kieker.develop.rl.recordLang.Property */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntext cannot be resolved");
  }
  
  public String text(final /* kieker.develop.rl.recordLang.StringLiteral */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved");
  }
  
  public Object text(final /* kieker.develop.rl.recordLang.IntLiteral */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved");
  }
  
  public String text(final /* kieker.develop.rl.recordLang.ArrayLiteral */Object e) {
    return "array";
  }
  
  public Object text(final /* kieker.develop.rl.recordLang.FloatLiteral */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved");
  }
  
  public String text(final /* kieker.develop.rl.recordLang.BooleanLiteral */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nvalue cannot be resolved");
  }
  
  public Object text(final /* kieker.develop.rl.recordLang.Classifier */Object e) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to Iterable<?>"
      + "\nType mismatch: cannot convert from Object to Iterable<?>"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nsizes cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  public String image(final /* kieker.develop.rl.recordLang.Property */Object e) {
    return "property.gif";
  }
  
  public String image(final /* kieker.develop.rl.recordLang.Constant */Object e) {
    return "constant.gif";
  }
  
  public String image(final /* kieker.develop.rl.recordLang.RecordType */Object e) {
    return "record.png";
  }
  
  public String image(final /* kieker.develop.rl.recordLang.TemplateType */Object e) {
    return "template.png";
  }
  
  public String image(final /* kieker.develop.rl.recordLang.Model */Object e) {
    return "package.gif";
  }
}
