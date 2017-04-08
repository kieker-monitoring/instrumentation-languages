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
package kieker.develop.al.modelhandling;

import java.io.IOException
import java.io.InputStream
import java.util.Map
import kieker.develop.al.aspectLang.ApplicationModelHandle
import kieker.develop.al.mapping.MappingModel
import kieker.develop.al.mapping.NamedElement
import kieker.develop.al.mapping.NamedType
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceImpl

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 * 
 * @since 1.0
 */
public class ForeignModelResource extends ResourceImpl {
	
	ModelMapperProviderFactory modelMapperProviderFactory = ModelMapperProviderFactory.createInstance
	
	/** Model of the application to be instrumented. */
	private final ApplicationModelHandle applicationModelHandle
	/** Resulting hierarchy model. */
	private MappingModel resultModel
	/** Helper variable to prohibit recursion of model loading. */
	private boolean loading = false

	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param applicationModel the application model
	 */
	public new(URI uri, ApplicationModelHandle applicationModelHandle) {
		super(uri)
		this.applicationModelHandle = applicationModelHandle
	}

	/**
	 * Return an EObject with the name specified by the uriFragment.
	 * 
	 * @param uriFragment
	 * 
	 * @return the EObject identified by the uriFragment or null if no such object exists. 
	 */
	override EObject getEObject(String uriFragment) {
		if (!this.getContents().empty) {
			val EObject object = (this.getContents()?.get(0) as MappingModel).contents?.findFirst [
				uriFragment.equals(this.getURIFragment(it))
			]
			if (object !== null)
				return object
			else
				return super.getEObject(uriFragment)
		} else
			return super.getEObject(uriFragment)
	}

	/**
	 * Compute the uriFragment for a given EObject.
	 * 
	 * @param eObject the object the fragment is computed for.
	 * 
	 * @return returns the uriFragment for the given object.
	 */
	override String getURIFragment(EObject eObject) {
		if (eObject instanceof NamedElement) {
			return (eObject as NamedElement).name
		} else {
			return super.getURIFragment(eObject)
		}
	}

	/**
	 * load the resource iff it is not already loaded.
	 */
	override void load(Map<?, ?> options) throws IOException {
		if (!this.isLoaded) {
			this.doLoad(null, null)
		}
	}

	/**
	 * Saving this resource is not allowed, as it is a virtual resource.
	 */
	override void save(Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException()
	}

	/**
	 * This routine is called from ResourceImpl load after the load method above is triggered.
	 * It initializes the primitive type mirror.
	 * 
	 * TODO fix documentation
	 * 
	 * @param inputStream
	 * @param options
	 * 
	 * @throws IOException
	 */
	override void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		if (this.getURI() !== null) {
			this.createModel()
		} else {
			try {
				throw new IOException("URI not set on ForeignModelResource.onLoad");
			} catch (IOException e) {
				e.printStackTrace()
			}
		}
	}

	/**
	 * Helper routine to get a special part of the result model.
	 */
	def EList<NamedType> getAllDataTypes() {
		return this.resultModel.types
	}

	/**
	 * Create an result model for a given ecore model.
	 */
	private def synchronized createModel() {
		if (this.applicationModelHandle !== null && !this.loading) {
			this.loading = true

			val modelMapper = modelMapperProviderFactory.provider.modelMappers.get(applicationModelHandle.handler)
			
			if (modelMapper !== null) {
				resultModel = modelMapper.loadModel(this.applicationModelHandle, this.getResourceSet())
				this.getContents().add(resultModel)
			}

			this.loading = false;
		}
	}

}
