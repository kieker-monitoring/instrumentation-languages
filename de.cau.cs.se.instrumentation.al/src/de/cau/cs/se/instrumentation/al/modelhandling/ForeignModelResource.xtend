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
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel
import de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.HashMap
import java.util.Collection
import de.cau.cs.se.instrumantation.model.structure.Method
import de.cau.cs.se.instrumantation.model.structure.Model
import de.cau.cs.se.instrumantation.model.structure.Parameter
import de.cau.cs.se.instrumantation.model.structure.ParameterModifier
import de.cau.cs.se.instrumantation.model.structure.Type

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class ForeignModelResource extends ResourceImpl {

	/** hierarchy mapping model factory. */
	private final StructureFactory structureFactory = StructureFactory.eINSTANCE
	/** Aspect language model. */
	private final ApplicationModel aspectModel
	/** Resulting hierarchy model. */
	private Model resultModel
	/** Helper variable to prohibit recursion of model loading. */
	private boolean loading = false
	/** Map containing all interface declarations. */
	private final Map<String,EObject> interfaceMap = new HashMap<String,EObject>()
	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param model the application model
	 */
	public new(URI uri, ApplicationModel aspectModel) {
		super(uri)
		this.aspectModel = aspectModel
	}

	/**
	 * Return an EObject with the name specified by the uriFragment.
	 * 
	 * @param uriFragment
	 * 
	 * @return the EObject identified by the uriFragment or null if no such object exists. 
	 */
	override EObject getEObject(String uriFragment) {
		val EObject object = (this.getContents().get(0) as Model).contents.findFirst[uriFragment.equals(this.getURIFragment(it))]
		if (object != null)
			return object
		else {
			return super.getEObject(uriFragment)
		}
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
		} else if (eObject instanceof Container) {
			return (eObject as Container).name 
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
		return this.resultModel.types
	}

	/**
	 * Create an result model for a given ecore model.
	 */
	private def createModel() {
		if (this.aspectModel != null && !this.loading) {
			this.loading = true
			// register the meta model (package) and its packages (Steinberg 2009, EMF 15.3.4)
			val List<RegisteredPackage> usePackages = this.aspectModel.getUsePackages()
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
			val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(this.aspectModel.getModel(), true), true)

			// create main result model
			this.resultModel = this.structureFactory.createModel()
			// determine all interfaces
			determineInterfaces(source)
			// compose container hierarchy
			determineContainerHierarchy(source)
			// contents must be called via its getter otherwise xtend will used the variable which may
			// result in an null pointer result
			this.getContents().add(this.resultModel)
			this.loading = false;
		}
	}

	/**
	 * Scan the application model (i.e. in PCM the repository) and determine the container hierarchy.
	 * The hierarchy does not differentiate between packages, components or classes as only the
	 * hierarchy must be known.
	 * 
	 * @param source
	 */
	private def determineContainerHierarchy(Resource source) {
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject object = iterator.next()
			if (object.eClass().getName().equals("Repository")) {
				val components = object.getFeature("components__Repository") as EList<EObject>
				for (EObject component : components) {
					val container = this.structureFactory.createContainer()
					val fullQualifiedName = component.getFeature("entityName") as String
					val names = fullQualifiedName.split('\\.')
					if (names.size == 0)
						names.add(fullQualifiedName as String)
					val QualifiedName name = QualifiedName.create(names)
					container.setName(name.getLastSegment())
					container.addInterfaces(component)
					insertContainerInHierarchy(this.resultModel,container,name)
				}				
			}
		}

	}
	
	/**
	 * Identify the interfaces a given container implements and add that interface
	 * to the hierarchy structure.
	 * 
	 * @param container the container the interfaces are added to
	 * @param component the PCM model component
	 */
	private def void addInterfaces(Container container, EObject component) {
		val providedInterfaces = component.getFeature("providedRoles_InterfaceProvidingEntity") as EList<EObject>
		for (EObject providedInterface : providedInterfaces) {
			val name = providedInterface.getFeature("entityName") as String
			val interfaze = this.structureFactory.createContainer()
			val interfazeDeclaration = this.interfaceMap.get(name)
			interfaze.setName(name)
			interfaze.methods.createMethods(interfazeDeclaration.determineMethods)
			container.contents.add(interfaze)
		}
	}
		
	/**
	 * Create methods for an interface in the intermediate model.
	 */
	private def void createMethods(EList<Method> list, Collection<EObject> objects) {
		objects.forEach[signature | list.add(createMethod(signature))]
	}
	
	/**
	 * Construct a method in the application model based on the PCM structure.
	 * 
	 * @param signature the method signature from the PCM repository to be used to create
	 * the application model method signature.
	 * 
	 * @return returns an application model method declaration.
	 */
	private def Method createMethod(EObject signature) {
		val method = this.structureFactory.createMethod()
		method.setName(signature.getFeature("entityName") as String)
		val modifier = this.structureFactory.createMethodModifier()
		modifier.setName("public")
		method.setModifier(modifier)
		// returnType__OperationSignature
		// TODO define void type instead of null
		method.setReturnType(signature.getReferenceFeature("returnType__OperationSignature")?.createTypeReference)
		// parameters__OperationSignature
		val parameters = signature.getFeature("parameters__OperationSignature") as Collection<EObject>
		parameters.forEach[parameter | method.parameters.add(createParameter(parameter))]
		return method
	}
	
	/**
	 * Create an application model parameter.
	 * 
	 * @param object the parameter declaration in PCM which is used to create the application
	 * model parameter.
	 * 
	 * @return the application model parameter
	 */
	private def Parameter createParameter(EObject object) {
		val parameter = this.structureFactory.createParameter()
		parameter.setName(object.getFeature("parameterName") as String)
		parameter.setModifier(object.getFeature("modifier__Parameter").createParameterModifier)
		parameter.setType(object.getReferenceFeature("dataType__Parameter")?.createTypeReference)
		
		return parameter
	}
	
	/**
	 * Create a reference to a type declaration.
	 * 
	 * @param the PCM type reference to be mapped to an application model reference.
	 * 
	 * @return returns the application model type reference.
	 */
	private def createTypeReference(EObject object) {
		val typeReference = this.structureFactory.createTypeReference()
		if (object.eClass != null) {
			if (object.eClass.name != null) {
				switch (object.eClass.name) {
					case 'CompositeDataType' : typeReference.setType((object.getFeature("entityName") as String).findCompositeType)	
					case 'PrimitiveDataType' : typeReference.setType(object.getFeature("type").findPrimitiveType)
				}
			} else { // TODO: this is a temporary measure
				typeReference.setType(emptyType)
			}
		} else { // TODO: this is a temporary measure
			typeReference.setType(emptyType)
		}
		return typeReference
	}
	
	/**
	 * Emergency routine if the type is not found.
	 * 
	 * @return returns the empty type.
	 */
	private def emptyType() {
		var type = this.resultModel.types.findFirst[it.name.equals("EMPTY")]
		if (type == null) {
			type = this.structureFactory.createType()
			type.setName("EMPTY")
			this.resultModel.types.add(type)
		}
		return type
	}
	
	/**
	 * Determine an primitive type. If the primitive type is missing, it is created.
	 * 
	 * @param type name as object
	 * 
	 * @return return a primitive type conforming to the PCM type.
	 */
	private def findPrimitiveType(Object object) {
		// TODO fix this. No side effects please.
		val typeName = object.toString
		var type = this.resultModel.types.findFirst[it.name.equals(typeName)]
		if (type == null) {
			type = this.structureFactory.createType()
			type.setName(typeName)
			this.resultModel.types.add(type)
		}
		return type
	}
	
	/**
	 * Method has side effect. TODO fix this. No side effects please.
	 * 
	 * @param name of the complex type.
	 */
	private def findCompositeType(String typeName) {
		var type = this.resultModel.types.findFirst[it.name.equals(typeName)]
		if (type == null) {
			type = this.structureFactory.createType()
			type.setName(typeName)
			this.resultModel.types.add(type)
		}
		return type
	}
	
	private def ParameterModifier createParameterModifier(Object object) {
		val modifier = this.structureFactory.createParameterModifier()
		return modifier
	}
	
	/**
	 * Determine which methods are defined in an interface.
	 */
	private def Collection<EObject> determineMethods(EObject interfazeDeclaration) {
		// parentInterfaces__Interface
		// TODO inherit signatures
		// signatures__OperationInterface
		return interfazeDeclaration.getFeature("signatures__OperationInterface") as Collection<EObject>
	}
	
	/**
	 * Find dynamically a feature of an object.
	 */
	private def Object getFeature(EObject object, String featureName) {
		val EStructuralFeature feature = object.eClass.getEStructuralFeature(featureName)
		return object.eGet(feature)
	}
	
	/**
	 * Find dynamically an reference feature of an object.
	 */
	private def EObject getReferenceFeature(EObject object, String featureName) {
		val EStructuralFeature feature = object.eClass.getEStructuralFeature(featureName)
		if (feature instanceof EReference)
			return object.eGet(feature) as EObject
		else
			return null
	}

	/**
	 * Insert component type in the container hierarchy. If necessary establish that hierarchy.
	 */
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
					val newContainer = this.structureFactory.createContainer()
					newContainer.setName(name)
					runningParent.contents.add(newContainer)
					runningParent = newContainer
				}
				runningParent.contents.add(entity)
			}
		}
	}

	/**
	 * What does this routine do?
	 */
	private def addEntityToParentContainer(Containment parent, Container entity) {
		if (!parent.contents.exists[it.name.equals(entity.name)]) {
			parent.contents.add(entity)
		} else
			System::out.println("Double container declaration")
	}

	/**
	 * Determine all interfaces in the given source.
	 * 
	 * @param source
	 *            the resource containing the PCM model
	 */
	private def determineInterfaces(Resource source) {
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject object = iterator.next()
			if (object.eClass().getName().equals("Repository")) {
				val reference = object.eClass().getEStructuralFeature("interfaces__Repository") as EReference
				val interfaces = object.eGet(reference) as EList<EObject>
				for (EObject interfaze : interfaces) {
					val fullQualifiedName = interfaze.eGet(interfaze.eClass().getEStructuralFeature("entityName")) as String
					interfaceMap.put (fullQualifiedName, interfaze)
				}
			}
		}
	}

}
