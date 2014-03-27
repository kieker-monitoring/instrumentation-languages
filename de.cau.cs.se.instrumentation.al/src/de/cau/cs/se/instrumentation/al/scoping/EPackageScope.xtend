package de.cau.cs.se.instrumentation.al.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.EObjectDescription
import java.util.Collection
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

class EPackageScope implements IScope {
	
	private ResourceSet resourceSet

	/**
	 * Create a new EPackageScope in the context of a resource set.
	 * 
	 * @param resourceSet the resource set where the packages should be searched for. 
	 */
	new (ResourceSet resourceSet) {
		this.resourceSet = resourceSet
	}

	override IEObjectDescription getSingleElement(QualifiedName name) {
		System.out.println("EPackageScope.getSingleElement(name) " + name)
		val URI ePackageURI = URI.createURI(name.toString(), true)
		var EPackage ePackage = null;
		if (ePackageURI.fragment() == null) {
			var Resource resource = resourceSet.getResource(ePackageURI, true);
			if (resource.getContents().isEmpty())
				return null
			else
				ePackage = resource.getContents().get(0) as EPackage
		} else { // TODO handling fragments fails
			ePackage = resourceSet.getEObject(ePackageURI, true) as EPackage
		}
		return EObjectDescription.create(name, ePackage)
	}

	override Iterable<IEObjectDescription> getElements(QualifiedName name) {
		System.out.println("EPackageScope.getElements(name) " + name)
		val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
		result.add(this.getSingleElement(name))
		return result
	}

	override IEObjectDescription getSingleElement(EObject object) {
		System.out.println("EPackageScope.getSingleElement(object) " + object)
		// TODO what shall we return here?
		//if (object instanceof EPackage) {
		//	return EObjectDescription.create(((EPackage)object).eResource().getURI().toString(), object)
		//} else
			return null
	}

	override Iterable<IEObjectDescription> getElements(EObject object) {
		System.out.println("EPackageScope.getElements(object) " + object)
		val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
		result.add(this.getSingleElement(object))
		return result
	}

	override Iterable<IEObjectDescription> getAllElements() {
		System.out.println("EPackageScope.getAllElements()")
		val Collection<IEObjectDescription> result = new ArrayList<IEObjectDescription>()
		// what must be returned by this? all ePackage URIs?
		return result
	}
	
}