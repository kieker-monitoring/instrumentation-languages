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

import java.io.IOException
import java.io.InputStream
import java.util.Iterator
import java.util.List
import java.util.Map

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl

import java.util.ArrayList
import de.cau.cs.se.instrumentation.rl.recordLang.Type

import de.cau.cs.se.instrumentation.rl.typing.jar.ClassFinder;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.ModelImpl
import java.net.URLClassLoader
import java.net.URL

/**
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelResource
 */
public class JarModelResource extends ResourceImpl {

	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param applicationModel the application model
	 */
	public new(URI uri) {
		super(uri)
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
			val EObject object = null // (this.getContents()?.get(0) as Model).contents?.findFirst[uriFragment.equals(this.getURIFragment(it))] TODO this way it's always null -> change?
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
	def EList<Type> getAllDataTypes() {
		return null
	}

	/**
	 * Create an result model for a given ecore model.
	 */
	private def createModel() {
		synchronized(this) {				
				//create main result model
				System.out.println("createModel start") //TODO rausnehmen
				val ArrayList<String> jars = this.findJars()
				System.out.println("jars.length : " + jars.length)	//TODO rausnehmen
				val ArrayList<ModelImpl> resultModels = this.evaluateJars(jars)
				if(resultModels != null){
					this.getContents().addAll(resultModels)
				}
				System.out.println("createModel end") //TODO rausnehmen
		}
	}
	
	/**
	 * locates all jars in  the current user directory
	 */
	 private def ArrayList<String> findJars(){
		var ArrayList<String> jars = new ArrayList<String>(0)
        val URL[] urls = (ClassLoader.getSystemClassLoader() as URLClassLoader).getURLs()
        for(URL url: urls){
        	if(url.toString.endsWith(".jar")){
        		jars.add(url.path)      		
        	}
        }
		return jars	
	}
	
	/**
	 * starts model-creation for classes in the jars implementing IMonitoringRecord
	 */
	private def ArrayList<ModelImpl> evaluateJars(ArrayList<String> jarUrls){
		System.out.println("evaluateJars")//TODO rausnehmen
		var result = new ArrayList<ModelImpl>(0)
		val ClassFinder classfinder = new ClassFinder();
		for(var int i = 0; i<jarUrls.length; i++){
			val temp = classfinder.getModelsForJar(jarUrls.get(i))
			System.out.println(temp)//TODO rausnehmen
			if(temp != null){
				result.addAll(temp)
			}
		}	
		return result;
	}
}