/**
 * 
 */
package de.cau.cs.se.instrumentation.al.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EClass
import de.cau.cs.se.instrumentation.al.applicationLang.Model
import de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage

/**
 * @author Reiner Jung
 *
 */
public class PackageContentScope implements IScope {
	
	private Model model
	private ResourceSet resourceSet

	new(ResourceSet resourceSet, Model model) {
		System.out.println("PackageContentScope")
		this.model = model
		this.resourceSet = resourceSet
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.scoping.IScope#getSingleElement(org.eclipse.xtext.naming.QualifiedName)
	 */
	override IEObjectDescription getSingleElement(QualifiedName name) {
		System::out.println("PackageContentScope.getSingleElement(name) " + name)
		val registeredPackage = model.eAllContents.filter(RegisteredPackage).findFirst[it.name.equals(name.firstSegment)]
		if (registeredPackage != null)
			registeredPackage.EPackage.findClassifierInPackageHierarchy(name.skipFirst(1))
		else
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
			if (subPackage != null)
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
		if (classifier != null)
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
			val clazz = classifier as EClass
			val attribute = clazz.EAllAttributes.findFirst[it.name.equals(name.firstSegment)]
			if (attribute == null) {
				val reference = clazz.EAllReferences.findFirst[it.name.equals(name.firstSegment)]
				if (reference != null) {
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
