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

import java.io.IOException
import java.io.InputStream
import java.util.Iterator
import java.util.List
import java.util.Map

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import de.cau.cs.se.instrumantation.model.structure.Container
import de.cau.cs.se.instrumantation.model.structure.Containment
import de.cau.cs.se.instrumantation.model.structure.NamedElement
import de.cau.cs.se.instrumantation.model.structure.StructureFactory
import de.cau.cs.se.instrumantation.model.structure.Type
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel
import de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage
import org.eclipse.xtext.naming.QualifiedName

/**
 * Simulates a real source by mapping the a PCM model to our model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class ForeignModelResource extends ResourceImpl {

	private final StructureFactory structure = StructureFactory.eINSTANCE
	private final ApplicationModel applicationModel
	private de.cau.cs.se.instrumantation.model.structure.Model resultModel
	private boolean loading = false
	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param model the application model
	 */
	public new(URI uri, ApplicationModel model) {
		super(uri)
		this.applicationModel = model
	}

	override EObject getEObject(String uriFragment) {
		//if (this.getContents().size == 0) {
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
			// TODO reconstruct model
			// this.createModel()
		//}
		System::out.println("ForeignModelResource.getEObject(uriFragment) " + uriFragment)
		val EObject object = this.getContents().findFirst[uriFragment.equals(this.getURIFragment(it))]
		if (object != null)
			return object
		else { 
			System::out.println("\tcontents did not include " + uriFragment)
			return super.getEObject(uriFragment)
		}
	}

	override String getURIFragment(EObject eObject) {
		System::out.println("ForeignModelResource.getURIFragment(eObject) " + eObject)
		if (eObject instanceof NamedElement) {
			return (eObject as NamedElement).getName()
		} else {
			return super.getURIFragment(eObject)
		}
	}

	override void load(Map<?, ?> options) throws IOException {
		if (!this.isLoaded) {
			this.doLoad(null, null)
		}
	}

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
		System::out.println("ForeignModelResource.doLoad(inputStream, options) " + inputStream + ", " + options)
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

	private def createModel() {
		System::out.println("ForeignModelResource.createModel() " + this.loading)
		if (this.applicationModel != null && !this.loading) {
			this.loading = true
			// register the meta model (package) and its packages (Steinberg 2009, EMF 15.3.4)
			val List<RegisteredPackage> usePackages = this.applicationModel.getUsePackages()
			for (RegisteredPackage usePackage : usePackages) {
				val ResourceSet resourceSet = usePackage.getEPackage().eResource().getResourceSet()
				usePackage.eResource().getContents().get(0)
				
				resourceSet.getPackageRegistry().put(usePackage.getEPackage().getNsURI(), usePackage.getEPackage())
				
				// register the XMI facility for repository (this is not correct, as this is limiting)
				val Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE
				val Map<String, Object> extensiontoFactoryMap = registry.getExtensionToFactoryMap()
				extensiontoFactoryMap.put(usePackage.getEPackage().getName(), new XMIResourceFactoryImpl())
			}

			// Get the resource
			val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(this.applicationModel.getModel(), true), true)

			// create main result model
			this.resultModel = this.structure.createModel()
			// determine all interfaces
			determineInterfaces(source)
			// determine all datatypes
			determineDataTypes(source)
			// compose container hierarchy
			determineContainerHierarchy(source)
			// contents must be called via its getter otherwise xtend will used the variable which may
			// result in an null pointer result
			this.getContents().addAll(this.resultModel.contents)
			this.loading = false;
			System::out.println("ForeignModelResource.createModel() " + this.contents.size)
		}
	}

	/**
	 * 
	 * @param source
	 */
	private def determineContainerHierarchy(Resource source) {
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject object = iterator.next()
			if (object.eClass().getName().equals("Repository")) {
				val reference = object.eClass().getEStructuralFeature("components__Repository") as EReference
				val components = object.eGet(reference) as EList<EObject>
				for (EObject component : components) {
					val container = this.structure.createContainer()
					val fullQualifiedName = component.eGet(component.eClass().getEStructuralFeature("entityName")) as String
					val names = fullQualifiedName.split('\\.')
					if (names.size == 0)
						names.add(fullQualifiedName as String)
					val QualifiedName name = QualifiedName.create(names)
					container.setName(name.getLastSegment())
					insertContainerInHierarchy(this.resultModel,container,name)
				}				
			}
		}

	}

	private def void insertContainerInHierarchy(Containment parent, Container entity,
			QualifiedName fullQualifiedName) {
		if (fullQualifiedName.getSegmentCount() == 1) {
			addEntityToParentContainer(parent,entity)
		} else {
			// recurse into container hierarchy
			val container = parent.contents.findFirst[it.name.equals(fullQualifiedName.firstSegment)]
			if (container != null) 
				insertContainerInHierarchy(container,entity,fullQualifiedName.skipFirst(1))
			else { // no match found, create missing container
				var runningParent = parent
				for (String name : fullQualifiedName.skipLast(1).segments) {
					val newContainer = this.structure.createContainer()
					newContainer.setName(name)
					// NOTE maybe this call must be removed. 
					// this.getContents().add(newContainer)
					runningParent.contents.add(newContainer)
					runningParent = newContainer
				}
				// NOTE maybe this call must be removed. 
				//this.getContents().add(entity)
				runningParent.contents.add(entity)
			}
		}
	}

	private def addEntityToParentContainer(Containment parent, Container entity) {
		if (!parent.contents.exists[it.name.equals(entity.name)]) {
			// NOTE maybe this call must be removed. 
			// this.getContents().add(entity)
			parent.contents.add(entity)
		} else
			System::out.println("Double container declaration")
	}

	/**
	 * 
	 * @param source
	 */
	private def determineDataTypes(Resource source) {
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject o = iterator.next()
			
		}
	}

	/**
	 * 
	 * @param types
	 * @param literal
	 * @return
	 */
	private def boolean contains(EList<Type> types, String literal) {
		for (Type type : types) {
			if (type.getName().equals(literal)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Determine all interfaces in the given source.
	 * 
	 * @param source
	 *            the resource containing the PCM model
	 */
	private def determineInterfaces(Resource source) {
		
	}

	

	/**
	 * 
	 * @param typeName
	 * @return
	 */
	private def Type findType(String typeName) {
		for (Type type : this.resultModel.getTypes()) {
			if (type.getName().equals(typeName)) {
				return type
			}
		}
		return null
	}



}
