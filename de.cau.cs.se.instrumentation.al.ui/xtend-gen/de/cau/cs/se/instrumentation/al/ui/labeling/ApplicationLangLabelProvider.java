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
package de.cau.cs.se.instrumentation.al.ui.labeling;

import com.google.inject.Inject;
import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumentation.al.applicationLang.Aspect;
import de.cau.cs.se.instrumentation.al.applicationLang.Collector;
import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.applicationLang.InsertionPoint;
import de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.applicationLang.Query;
import de.cau.cs.se.instrumentation.al.applicationLang.SubPathNode;
import de.cau.cs.se.instrumentation.al.applicationLang.WildcardNode;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class ApplicationLangLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public ApplicationLangLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final Aspect e) {
    return "aspect";
  }
  
  public CharSequence text(final ContainerNode e) {
    CharSequence _xifexpression = null;
    Container _container = e.getContainer();
    if ((_container instanceof NamedElement)) {
      Container _container_1 = e.getContainer();
      _xifexpression = ((NamedElement) _container_1).getName();
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Container is of type ");
      Container _container_2 = e.getContainer();
      Class<? extends Container> _class = _container_2.getClass();
      String _name = _class.getName();
      _builder.append(_name, "");
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public String text(final WildcardNode e) {
    return "*";
  }
  
  public String text(final SubPathNode e) {
    return "**";
  }
  
  public String text(final Query e) {
    return "query";
  }
  
  public String text(final LocationQuery e) {
    return "path";
  }
  
  public String text(final Collector e) {
    RecordType _type = e.getType();
    String _name = _type.getName();
    String _plus = (_name + " ");
    InsertionPoint _insertionPoint = e.getInsertionPoint();
    String _string = _insertionPoint.toString();
    return (_plus + _string);
  }
}
