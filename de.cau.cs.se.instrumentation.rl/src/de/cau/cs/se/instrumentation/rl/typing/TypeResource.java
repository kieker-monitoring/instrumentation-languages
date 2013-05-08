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
	
	private IFragmentProvider.Fallback fragmentProviderFallback = new IFragmentProvider.Fallback() {
		
		public String getFragment(EObject obj) {
			return TypeResource.super.getURIFragment(obj);
		}
		
		public EObject getEObject(String fragment) {
			return TypeResource.super.getEObject(fragment);
		}
	};
	
	public TypeResource() {
		super();
	}

	public TypeResource(URI uri, PrimitiveMirror mirror) {
		super(uri);
		this.mirror = mirror;
	}

	@Override
	public EObject getEObject(String uriFragment) {
		if (mirror != null) {
			EObject result = mirror.getEObject(this, uriFragment, fragmentProviderFallback);
			return result;
		}
		return super.getEObject(uriFragment);
	}
	
	@Override
	public String getURIFragment(EObject eObject) {
		if (mirror != null) {
			String result = mirror.getFragment(eObject, fragmentProviderFallback);
			return result;
		}
		return super.getURIFragment(eObject);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		if (!isLoaded) {
			load(null, options);
		}
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * This routine is called from ResourceImpl load after the load method above is triggered.
	 * It initialises the primitive type mirror.
	 * 
	 * The input stream is always empty in this context and the options are ignored.
	 */
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		try {
			if (getURI() != null && mirror != null) {
				mirror.initialize(this);
			}
		} catch(Exception e) {
			throw new IOException(e.getMessage());
		}
	}

}
