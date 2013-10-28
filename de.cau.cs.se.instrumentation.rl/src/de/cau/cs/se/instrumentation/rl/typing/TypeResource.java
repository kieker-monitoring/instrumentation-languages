/*
 * Copyright 2006, Itemis
 * Copyright 2012, Reiner Jung (AG SE)
 */
package de.cau.cs.se.instrumentation.rl.typing;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.resource.IFragmentProvider;

/**
 * Simulates a real resource for primitive types.
 * 
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Reiner Jung - Adaptation for a general typ approach
 */
public class TypeResource extends ResourceImpl {

	private PrimitiveMirror mirror;

	private final IFragmentProvider.Fallback fragmentProviderFallback = new IFragmentProvider.Fallback() {

		@Override
		public String getFragment(final EObject obj) {
			return TypeResource.super.getURIFragment(obj);
		}

		@Override
		public EObject getEObject(final String fragment) {
			return TypeResource.super.getEObject(fragment);
		}
	};

	public TypeResource() {
		super();
		System.out.println(TypeResource.class.getName() + ":" + this + "()");
	}

	public TypeResource(final URI uri, final PrimitiveMirror mirror) {
		super(uri);
		System.out.println(TypeResource.class.getName() + ":" + this + "(" + uri + "," + mirror + ")");
		this.mirror = mirror;
	}

	@Override
	public EObject getEObject(final String uriFragment) {
		if (this.mirror != null) {
			final EObject result = this.mirror.getEObject(this, uriFragment, this.fragmentProviderFallback);
			return result;
		}
		return super.getEObject(uriFragment);
	}

	@Override
	public String getURIFragment(final EObject eObject) {
		System.out.println(TypeResource.class.getName() + ".getURIFragment (" + eObject + ")");
		if (this.mirror != null) {
			final String result = this.mirror.getFragment(eObject, this.fragmentProviderFallback);
			return result;
		}
		return super.getURIFragment(eObject);
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
			if ((this.getURI() != null) && (this.mirror != null)) {
				this.mirror.initialize(this);
			}
		} catch (final Exception e) {
			throw new IOException(e.getMessage());
		}
	}

}
