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
package de.cau.cs.se.instrumentation.al.modelhandling;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.inject.Inject;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;

/**
 * The type provider factory controls the type provider, which is created by this class.
 * 
 * @author Christian Schneider - derived this class from
 *         org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory
 * @author Reiner Jung - commentary and cleanups
 */
public class ForeignModelTypeProviderFactory {

	@Inject
	public ForeignModelTypeProviderFactory() {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @return Returns the type provider for primitive types.
	 */
	public IForeignModelTypeProvider getTypeProvider(final ResourceSet resourceSet, ApplicationModel model) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet may not be null.");
		} else {
			final Object o = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(ForeignModelTypeURIHelper.PROTOCOL);
			if (o != null) {
				if (!(o instanceof IForeignModelTypeProvider)) {
					// TODO something went terribly wrong, to be save create a new type provider
					return this.createTypeProvider(resourceSet, model);
				} else {
					return (IForeignModelTypeProvider) o;
				}
			} else {
				return this.createTypeProvider(resourceSet, model);
			}
		}
	}

	/**
	 * Create a new type provider for primitive types and register it with the resource.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @return Returns the new type provider.
	 */
	private IForeignModelTypeProvider createTypeProvider(final ResourceSet resourceSet, ApplicationModel model) {
		final IForeignModelTypeProvider typeProvider = new ForeignModelTypeProvider(resourceSet, model);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(ForeignModelTypeURIHelper.PROTOCOL, typeProvider);
		return typeProvider;

	}



}
