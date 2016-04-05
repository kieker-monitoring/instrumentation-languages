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
package kieker.develop.rl.scoping;

import java.util.Collection;
import java.util.List;
import kieker.develop.rl.recordLang.ComplexType;
import kieker.develop.rl.recordLang.ForeignKey;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.validation.PropertyEvaluation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class RecordLangScopeProvider extends AbstractDeclarativeScopeProvider {
  /**
   * Define scope for foreign key reference.
   */
  public IScope scope_ForeignKey_propertyRef(final ForeignKey key, final EReference reference) {
    RecordType _recordType = key.getRecordType();
    List<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(_recordType);
    return Scopes.scopeFor(_collectAllProperties);
  }
  
  /**
   * Build a scope containing all properties.
   */
  public IScope scope_Property_referTo(final Property property, final EReference reference) {
    EObject _eContainer = property.eContainer();
    List<Property> _collectAllProperties = PropertyEvaluation.collectAllProperties(((ComplexType) _eContainer));
    return Scopes.scopeFor(_collectAllProperties);
  }
  
  /**
   * Internal function to collect all properties of a imported classifier.
   */
  public Collection<EStructuralFeature> getAllExternalProperties(final EClassifier classifier, final Class<EStructuralFeature> type) {
    final List<EStructuralFeature> result = EcoreUtil2.<EStructuralFeature>getAllContentsOfType(classifier, type);
    if ((classifier instanceof EClass)) {
      EList<EGenericType> _eGenericSuperTypes = ((EClass) classifier).getEGenericSuperTypes();
      for (final EGenericType generic : _eGenericSuperTypes) {
        EClassifier _eClassifier = generic.getEClassifier();
        Collection<EStructuralFeature> _allExternalProperties = this.getAllExternalProperties(_eClassifier, type);
        result.addAll(_allExternalProperties);
      }
    }
    return result;
  }
}
