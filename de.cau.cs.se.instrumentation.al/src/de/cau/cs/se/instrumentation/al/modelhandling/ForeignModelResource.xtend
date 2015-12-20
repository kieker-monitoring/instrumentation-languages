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
package de.cau.cs.se.instrumentation.al.modelhandling;

import de.cau.cs.se.instrumantation.model.structure.MappingModel
import de.cau.cs.se.instrumantation.model.structure.NamedElement
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel
import java.io.IOException
import java.io.InputStream
import java.util.Map
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import de.cau.cs.se.instrumantation.model.structure.NamedType

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class ForeignModelResource extends ResourceImpl {
	
	private static final String MODEL_MAPPER = "de.cau.cs.se.instrumentation.al.modelMapping"

	/** Model of the application to be instrumented. */
	private final ApplicationModel applicationModel
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
	public new(URI uri, ApplicationModel applicationModel) {
		super(uri)
		this.applicationModel = applicationModel
	}
	
	/**
	 * Return an EObject with the name specified by the uriFragment.
	 * 
	 * @param uriFragment
	 * 
	 * @return the EObject identified by the uriFragment or null if no such object exists. 
	 */
	override EObject getEObject(String uriFragment) {
		System.out.println("this.getContents " + this.getContents())
		if (!this.getContents().empty) {
			System.out.println("this.getContents get element " + this.getContents().get(0))
			val EObject object = (this.getContents()?.get(0) as MappingModel).contents?.findFirst[uriFragment.equals(this.getURIFragment(it))]
			if (object != null)
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
		if (this.getURI() != null) {
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
		if (this.applicationModel != null && !this.loading) {
			this.loading = true
						
			val registry = Platform.getExtensionRegistry()
  			val config = registry.getConfigurationElementsFor(MODEL_MAPPER)
	  		try {
	  			config.forEach[element |
	  				val ext = element.createExecutableExtension("class")
	  				if (ext instanceof IModelMapper) {
	  					val mapper = (ext as IModelMapper)
		          		if (mapper.name.equals(this.applicationModel.handler))
		          			resultModel = mapper.loadModel(this.applicationModel, this.getResourceSet())
		          			this.getContents().add(resultModel)
		          	}
  				]
		    } catch (CoreException ex) {
		      	System.out.println(ex.getMessage())
		    }
			
			this.loading = false;
		}
	}


	



}
