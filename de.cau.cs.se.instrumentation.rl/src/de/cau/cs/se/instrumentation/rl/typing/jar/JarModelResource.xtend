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
package de.cau.cs.se.instrumentation.rl.typing.jar;

import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.impl.ModelImpl
import java.io.IOException
import java.io.InputStream
import java.net.URL
import java.util.ArrayList
import java.util.Iterator
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceImpl

/**
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelResource
 * 
 * @author Yannic Kropp
 * 
 */
public class JarModelResource extends ResourceImpl{
	
	var URI projectURI

	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param applicationModel the application model
	 */
	public new(URI uri, URI projUri) {
		super(uri)
		this.projectURI = projUri
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
			var EObject object = null
			for (var i = 0; i < this.getContents.length; i ++){
				var types = (this.getContents().get(i) as ModelImpl).getTypes()
				var Iterator queue = types.iterator()
				while (queue.hasNext() && object == null) {
					var a = queue.next() as Type;
					if (a.getName().endsWith("." + uriFragment) || a.getName().equals(uriFragment)) {
						object = a
						}
					}			
			}		
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
		if (eObject instanceof Type) {
			return (eObject as Type).name
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
	def EList<Type> getAllDataTypes() {
		return null
	}

	/**
	 * Create an result model for a given ecore model.
	 */
	private def createModel() {
		synchronized(this) {				
				val ArrayList<URL> jars = this.findJars()
				val ArrayList<ModelImpl> resultModels = this.evaluateJars(jars)
				if(resultModels != null){
					this.getContents().addAll(resultModels)
				}
		}
	}
	
	/**
	 * locates all jars in  the current user directory
	 */
	 private def ArrayList<URL> findJars(){
		val ProjectResolver temp = new ProjectResolver(this.projectURI)
		return temp.findUrls()
	}
	
	/**
	 * starts model-creation for classes in the jars implementing IMonitoringRecord
	 */
	private def ArrayList<ModelImpl> evaluateJars(ArrayList<URL> jarUrls){
		var result = new ArrayList<ModelImpl>(0)
		val ClassFinder classfinder = new ClassFinder(jarUrls);
		for(var int i = 0; i<jarUrls.length; i++){
			val temp = classfinder.getModelsForJar(jarUrls.get(i))
			//System.out.println(temp)
			if(temp != null){
				result.addAll(temp)
			}
		}	
		return result;
	}
}