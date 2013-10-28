/*
 * Science Blog
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.rl.typing;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;

/**
 * @author Christian Schneider - Initial contribution
 */
public class PrimitiveMirror {

	/**
	 * Constructs the primitive mirror. It requires a type factory for primitive types described
	 * with strings.
	 * 
	 * @param typeFactory
	 *            The type factory
	 */
	public PrimitiveMirror() {
		System.out.println(PrimitiveMirror.class.getName() + "()");
	}

	/**
	 * Searches for an object in a resource described by a fragment.
	 * 
	 * @param resource
	 * @param fragment
	 * @param fallback
	 * @return
	 */
	public EObject getEObject(final Resource resource, final String fragment,
			final IFragmentProvider.Fallback fallback) {
		System.out.println(PrimitiveMirror.class.getName() + ".getEObject (" + resource + "," + fragment + "," + fallback + ")");
		for (final EObject obj : resource.getContents()) {
			final String otherFragment = this.getFragment(obj, fallback);
			if (fragment.equals(otherFragment)) {
				return obj;
			}
		}
		return fallback.getEObject(fragment);
	}

	// TODO Why do we need to hide something we do not inherit?
	/**
	 * This specialisation is introduced to hide the JVMType filtering. {@inheritDoc}
	 */
	public String getFragment(final EObject obj, final IFragmentProvider.Fallback fallback) {
		System.out.println(PrimitiveMirror.class.getName() + ".getFragment (" + obj + "," + fallback + ")");
		if (EcorePackage.eINSTANCE.getEDataType().isInstance(obj)) {
			return ((EDataType) obj).getName();
		} else {
			return fallback.getFragment(obj);
		}
	}

	/**
	 * Initialises a given type resource with the primitive types from the type enumeration.
	 * 
	 * @param typeResource
	 *            the type resource to be initialised
	 * 
	 */
	public void initialize(final TypeResource typeResource) {
		System.out.println(PrimitiveMirror.class.getName() + ".initialize (" + typeResource + ")");
		for (final PrimitiveTypes primitiveType : PrimitiveTypes.values()) {
			typeResource.getContents().add(primitiveType.getEType());
		}
	}
}
