/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.rl.typing;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * Simulates a real resource for primitive types.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Reiner Jung - Adaptation for a general type approach; rewrite 2013
 */
public class TypeResource extends ResourceImpl {

	public TypeResource() {
		super();
	}

	public TypeResource(final URI uri) {
		super(uri);
	}

	@Override
	public EObject getEObject(final String uriFragment) {
		if (this.getContents().size() == 0) {
			// TODO Resource contents is empty, this should not happen.
			/*
			 * I debugged this issue, but could not find the cause of it. I wondered that
			 * multiple TypeProvider instances are used and therefore multiple TypeResources.
			 * However, the problem occurs after the creation of a new TypeResource when the
			 * old is accessed again. Then the contents of the resource is gone. Debugging
			 * did not provide signification insight in what and where the contents is emptied
			 * or replaced.
			 * 
			 * However, to circumvent this bug, the following code refills the content.
			 */
			for (final PrimitiveTypes primitiveType : PrimitiveTypes.values()) {
				this.getContents().add(primitiveType.getEType());
			}
		}
		for (final EObject obj : this.getContents()) {
			if (uriFragment.equals(this.getURIFragment(obj))) {
				return obj;
			}
		}
		return super.getEObject(uriFragment);
	}

	@Override
	public String getURIFragment(final EObject eObject) {
		if (EcorePackage.eINSTANCE.getEDataType().isInstance(eObject)) {
			return ((EDataType) eObject).getName();
		} else {
			return super.getURIFragment(eObject);
		}
	}

	@Override
	public void load(final Map<?, ?> options) throws IOException {
		if (!this.isLoaded) {
			this.load(null, options);
		}
	}

	@Override
	public void save(final Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}

	/**
	 * This routine is called from ResourceImpl load after the load method above is triggered.
	 * It initialises the primitive type mirror.
	 * 
	 * The input stream is always empty in this context and the options are ignored.
	 */
	@Override
	protected void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
		try {
			if (this.getURI() != null) {
				for (final PrimitiveTypes primitiveType : PrimitiveTypes.values()) {
					this.getContents().add(primitiveType.getEType());
				}
			} else {
				try {
					throw new IOException("Malformed URI in TypeResource.onLoad");
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		} catch (final Exception e) {
			throw new IOException(e.getMessage());
		}
	}

}
