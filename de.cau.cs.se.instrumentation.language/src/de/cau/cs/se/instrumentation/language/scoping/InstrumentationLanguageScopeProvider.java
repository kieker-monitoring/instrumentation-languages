/*
 * MAMBA - Measurement Architecture for Model-Based Analysis
 *
 * http://http://se.informatik.uni-kiel.de/research/projects/mamba
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.language.scoping;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;

import com.google.common.base.Predicate;

import de.cau.cs.se.instrumentation.language.instrumentation.Classifier;
import de.cau.cs.se.instrumentation.language.instrumentation.Package;
import de.cau.cs.se.instrumentation.language.instrumentation.Property;
import de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on how and when to use
 * it
 * 
 * @author rju - initial contribution
 */
public class InstrumentationLanguageScopeProvider extends AbstractDeclarativeScopeProvider {

	/**
	 * Find scope for the package property in the Package rule.
	 * 
	 * @param context
	 *            The Package-object of the resulting model.
	 * @param reference
	 *            The EReference-reference object of the AST.
	 * @return The scope for the package attribute.
	 */
	public IScope scope_Package_package(final Package context, final EReference reference) {
		IScope result = new FilteringScope(delegateGetScope(context, reference),
		        new Predicate<IEObjectDescription>() {

			        @Override
			        public boolean apply(final IEObjectDescription input) {
				        String isNSURI = input.getUserData("nsURI");
				        return "true".equals(isNSURI);
			        }
		        });
		return result;
	}

	IScope scope_Classifier_class(final Classifier classifier, final EReference reference) {
		return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(
		        classifier.getPackage().getPackage(), EClassifier.class));
	}

	IScope scope_ReferenceProperty_ref(final ReferenceProperty property, final EReference reference) {
		// Check if the parent is a property or a nested property reference.
		if (property.eContainer() instanceof Property) {
			// For properties you can directly access the EClassifier via getClass_.
			return Scopes.scopeFor(getAllProperties(((Property) property.eContainer()).getType()
			        .getClass_(), EStructuralFeature.class));
		} else if (property.eContainer() instanceof ReferenceProperty) {
			/*
			 * If the present property is nested in another property, then the type for the parent
			 * property can be found in the structural feature, which is located in the ref
			 * attribute of the parent.
			 */
			EStructuralFeature parent = ((ReferenceProperty) property.eContainer()).getRef();
			// Also, only EReferences refer to classes and can therefore have properties
			if (parent instanceof EReference) {
				return Scopes.scopeFor(getAllProperties(((EReference) parent).getEReferenceType(),
				        EStructuralFeature.class));
			} else {
				// Attributes as such do not have properties.
				return null;
			}
		} else {
			// illegal type
			return null;
		}
	}

	private Collection<EStructuralFeature> getAllProperties(final EClassifier classifier,
	        final Class<EStructuralFeature> type) {
		List<EStructuralFeature> result = EcoreUtil2.getAllContentsOfType(classifier, type);
		if (classifier instanceof EClass) {
			for (EGenericType generic : ((EClass) classifier).getEGenericSuperTypes()) {
				result.addAll(getAllProperties(generic.getEClassifier(), type));
			}
		}
		return result;
	}

}
