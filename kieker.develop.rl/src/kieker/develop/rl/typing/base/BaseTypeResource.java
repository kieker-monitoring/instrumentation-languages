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
package kieker.develop.rl.typing.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.RecordLangPackage;

/**
 * Simulates a real resource for primitive types.
 *
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Reiner Jung - Adaptation for a general type approach; rewrite 2013
 *
 * @since 1.0
 */
public class BaseTypeResource extends ResourceImpl {

	/**
	 * Construct the type resource with an URI.
	 *
	 * @param uri
	 *            the URI of the fake resource
	 */
	public BaseTypeResource(final URI uri) {
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
			for (final BaseTypes primitiveType : BaseTypes.values()) {
				this.getContents().add(primitiveType.getType());
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
		if (RecordLangPackage.eINSTANCE.getBaseType().isInstance(eObject)) {
			return ((BaseType) eObject).getName();
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
	 * It initializes the primitive type mirror.
	 *
	 * The input stream is always empty in this context and the options are ignored.
	 *
	 * @param inputStream
	 *            the field is ignored, as this resource is an in memory resource.
	 * @param options
	 *            ignored field, as the resource is an in memory resource.
	 * @throws IOException
	 *             when the URI is malformed.
	 */
	@Override
	protected void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
		if (this.getURI() != null) {
			for (final BaseTypes primitiveType : BaseTypes.values()) {
				this.getContents().add(primitiveType.getType());
			}
		} else {
			try {
				throw new IOException("Malformed URI in TypeResource.onLoad");
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}

}
