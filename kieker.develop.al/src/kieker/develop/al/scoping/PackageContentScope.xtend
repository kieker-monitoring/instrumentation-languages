/***************************************************************************
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
 ***************************************************************************/
package kieker.develop.al.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EClass
import kieker.develop.al.aspectLang.AspectModel

/**
 * 
 * 
 * @author Reiner Jung
 * 
 * @since 1.0
 */
public class PackageContentScope implements IScope {
	
	/** Main aspect model. */
	private AspectModel model
	/** Resource set containing all resources of named in the model. */
	private ResourceSet resourceSet

	/**
	 * Create a new package content scope.
	 * 
	 * @param resourceSet the resource set
	 * @param model the aspect model
	 */
	new(ResourceSet resourceSet, AspectModel model) {
		this.model = model
		this.resourceSet = resourceSet
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.xtext.naming.QualifiedName)
	 */
	override IEObjectDescription getSingleElement(QualifiedName name) {
		System::out.println("PackageContentScope.getSingleElement(name) " + name)
		//val registeredPackage = model.eAllContents.filter(RegisteredPackage).findFirst[it.name.equals(name.firstSegment)]
		//if (registeredPackage !== null)
		//	registeredPackage.EPackage.findClassifierInPackageHierarchy(name.skipFirst(1))
		//else
			return null		
	}
		
	/**
	 * Find an classifier in a package hierarchy.
	 * 
	 * @param ePackage the package to be searched in
	 * @param name the relative qualified name of an element of the form (EPackage.)*EClassifier(.(EStructuralFeature.)*)?
	 * 
	 * @returns an IEObjectDescription for a EClassifier, EAttribute or EReference or null if
	 * no matching element was found.  
	 */
	def IEObjectDescription findClassifierInPackageHierarchy(EPackage ePackage, QualifiedName name) {
		if (name.segmentCount == 1)
			return findClassifierInPackage(ePackage, name)
		else {
			val subPackage = ePackage.ESubpackages.findFirst[it.name.equals(name.firstSegment)]
			if (subPackage !== null)
				return findClassifierInPackageHierarchy(subPackage, name)
			else // return null to indicate that no package was found
				return null
		} 
	}
	
	/**
	 * Find a classifier for the given relative qualified name in the given package.
	 * 
	 * @param ePackage the package to be searched in
	 * @param name the name of the classifier or a name starting with a classifier
	 * 
	 * @returns an IEObjectDescription for a EClassifier, EAttribute or EReference or null if
	 * no matching element was found.
	 */
	def IEObjectDescription findClassifierInPackage(EPackage pkg, QualifiedName name) {
		val classifier = pkg.EClassifiers.findFirst[it.name.equals(name.firstSegment)]
		if (classifier !== null)
			if (name.segmentCount == 1)
				return EObjectDescription.create(name, classifier)
			else
				return findPropertyInClassifier(classifier, name.skipFirst(1))
		else
			return null
	}
	
	/**
	 * Find a attribute or reference of a classifier, actually in a class, as EDataType does
	 * not have properties.
	 * 
	 * @param classifier the classifier to be searched in
	 * @param name the qualified name to be used to match
	 * 
	 * @returns either an EReference or an EAttribute
	 */
	def IEObjectDescription findPropertyInClassifier(EClassifier classifier, QualifiedName name) {
		if (classifier instanceof EClass) {
			val attribute = classifier.EAllAttributes.findFirst[it.name.equals(name.firstSegment)]
			if (attribute === null) {
				val reference = classifier.EAllReferences.findFirst[it.name.equals(name.firstSegment)]
				if (reference !== null) {
					if (name.segmentCount>1) 
						return findPropertyInClassifier(reference.EReferenceType, name.skipFirst(1))
					else
						return EObjectDescription.create(name, reference)
				} else
					return null
			} else
				return EObjectDescription.create(name, attribute)
		} else
			return null
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.xtext.naming.QualifiedName)
	 */
	override Iterable<IEObjectDescription> getElements(QualifiedName name) {
		System::out.println("PackageContentScope.getElements(name) " + name)
		// TODO Auto-generated method stub
		return null
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.emf.ecore.EObject)
	 */
	override IEObjectDescription getSingleElement(EObject object) {
		System::out.println("PackageContentScope.getSingleElement(object) " + object)
		// TODO Auto-generated method stub
		return null
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.IScope#getElements(org.eclipse.emf.ecore.EObject)
	 */
	override Iterable<IEObjectDescription> getElements(EObject object) {
		System::out.println("PackageContentScope.getElements(object) " + object)
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.IScope#getAllElements()
	 */
	override Iterable<IEObjectDescription> getAllElements() {
		System::out.println("PackageContentScope.getAllElements()")
		// TODO Auto-generated method stub
		return null
	}

}
