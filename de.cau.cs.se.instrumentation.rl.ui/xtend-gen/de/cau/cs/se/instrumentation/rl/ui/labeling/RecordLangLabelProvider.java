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
package de.cau.cs.se.instrumentation.rl.ui.labeling;

import com.google.inject.Inject;
import de.cau.cs.se.instrumentation.rl.recordLang.ArrayLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Constant;
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

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
  
  public String text(final Property e) {
    String _name = e.getName();
    String _plus = (_name + " : ");
    Classifier _type = e.getType();
    String _text = this.text(_type);
    return (_plus + _text);
  }
  
  public String text(final StringLiteral e) {
    String _value = e.getValue();
    String _plus = ("\'" + _value);
    return (_plus + "\'");
  }
  
  public int text(final IntLiteral e) {
    return e.getValue();
  }
  
  public String text(final ArrayLiteral e) {
    return "array";
  }
  
  public Float text(final FloatLiteral e) {
    return e.getValue();
  }
  
  public String text(final BooleanLiteral e) {
    String _xifexpression = null;
    Boolean _value = e.getValue();
    if ((_value).booleanValue()) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    return _xifexpression;
  }
  
  public String text(final Classifier e) {
    EClassifier _class_ = e.getClass_();
    String _name = _class_.getName();
    EList<ArraySize> _sizes = e.getSizes();
    final Function1<ArraySize, String> _function = (ArraySize it) -> {
      Object _xifexpression = null;
      int _size = it.getSize();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        _xifexpression = Integer.valueOf(it.getSize());
      } else {
        _xifexpression = "";
      }
      String _plus = ("[" + ((Comparable<?>)_xifexpression));
      return (_plus + "]");
    };
    List<String> _map = ListExtensions.<ArraySize, String>map(_sizes, _function);
    String _join = IterableExtensions.join(_map);
    return (_name + _join);
  }
  
  public String image(final Property e) {
    return "property.gif";
  }
  
  public String image(final Constant e) {
    return "constant.gif";
  }
  
  public String image(final RecordType e) {
    return "record.png";
  }
  
  public String image(final TemplateType e) {
    return "template.png";
  }
  
  public String image(final Model e) {
    return "package.gif";
  }
}
