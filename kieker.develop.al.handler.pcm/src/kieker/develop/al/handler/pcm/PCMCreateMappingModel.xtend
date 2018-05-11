/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.al.handler.pcm

import java.util.Collection
import java.util.HashMap
import java.util.Iterator
import java.util.Map
import kieker.develop.al.mapping.Container
import kieker.develop.al.mapping.Containment
import kieker.develop.al.mapping.MappingFactory
import kieker.develop.al.mapping.MappingModel
import kieker.develop.al.mapping.Operation
import kieker.develop.al.mapping.Parameter
import kieker.develop.al.mapping.ParameterModifier
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import java.util.ArrayList
import java.util.Arrays

/**
 * Construct a mapping model for a given PCM model.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class PCMCreateMappingModel {
		
	/**
	 * Create the mapping model for a given model URI.
	 * 
	 * @param modelURI the URI refering to the PCM model
	 * @param resourceSet the resource set to be used to load models
	 * 
	 * @return returns the mapping model
	 */
	def static createMappingModel(String modelURI, ResourceSet resourceSet) {
		val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(modelURI, true), true)
	
		// create main result model
		val result = MappingFactory.eINSTANCE.createMappingModel()
		// determine all interfaces
		val interfaceMap=PCMCreateMappingModel.createInterfaces(source)
		// compose container hierarchy
		PCMCreateMappingModel.createContainerHierarchy(source, result, interfaceMap)
		// contents must be called via its getter otherwise xtend will used the variable which may
		// result in an null pointer result
		
		return result
	}
		
	/**
	 * Determine all interfaces in the given source.
	 * 
	 * @param source
	 *            the resource containing the PCM model
	 */
	private static def createInterfaces(Resource source) {
		val Map<String, EObject> interfaceMap = new HashMap<String, EObject>()
		
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
		
		return interfaceMap
	}
	
	/**
	 * Scan the application model (i.e. in PCM the repository) and determine the container hierarchy.
	 * The hierarchy does not differentiate between packages, components or classes as only the
	 * hierarchy must be known.
	 * 
	 * @param source the resource
	 * @param model the mapping model to be extended
	 * @param interfaceMap a lookup table for all interfaces
	 * 
	 * @return returns the modified mapping model
	 */
	private static def MappingModel createContainerHierarchy(Resource source, MappingModel model,
		Map<String, EObject> interfaceMap
	) {
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject object = iterator.next()
			if (object.eClass().getName().equals("Repository")) {
				val components = object.getFeature("components__Repository") as EList<EObject>
				for (EObject component : components) {
					val container = MappingFactory.eINSTANCE.createContainer()
					val entityName = (component.getFeature("entityName") as String).trim
					val segments = new ArrayList<String>(Arrays.asList(entityName.split('\\.')))
					if (segments.size == 0)
						segments.add(entityName as String)
					val QualifiedName qualifiedName = QualifiedName.create(segments)
					container.setName(qualifiedName.getLastSegment())
					container.setPredecessor(component)
					container.addInterfaces(component, interfaceMap, model)
					insertContainerInHierarchy(model, container, qualifiedName)
				}				
			}
		}
		return model
	}
	
	/**
	 * Identify the interfaces a given container implements and add that interface
	 * to the hierarchy structure.
	 * 
	 * @param container the container the interfaces are added to
	 * @param component the PCM model component
	 */
	private static def void addInterfaces(Container container, EObject component, 
		Map<String, EObject> interfaceMap, MappingModel model
	) {
		val providedInterfaces = component.getFeature("providedRoles_InterfaceProvidingEntity") as EList<EObject>
		for (EObject providedInterface : providedInterfaces) {
			val name = providedInterface.getFeature("entityName") as String
			val interfaze = MappingFactory.eINSTANCE.createContainer()
			val interfazeDeclaration = interfaceMap.get(name)
			if (interfazeDeclaration !== null) {
				interfaze.setName(name)
				interfaze.setPredecessor(providedInterface)
				interfaze.operations.createMethods(interfazeDeclaration.determineMethods, model)
				container.contents.add(interfaze)
			}
		}
	}
	
	/**
	 * Create methods for an interface in the intermediate model.
	 */
	private static def void createMethods(EList<Operation> list, Collection<EObject> objects, MappingModel model) {
		objects.forEach[signature | list.add(createOperation(signature, model))]
	}
	
	/**
	 * Construct a method in the application model based on the PCM structure.
	 * 
	 * @param signature the method signature from the PCM repository to be used to create
	 * the application model method signature.
	 * 
	 * @return returns an application model method declaration.
	 */
	private static def Operation createOperation(EObject signature, MappingModel model) {
		val method = MappingFactory.eINSTANCE.createOperation()
		method.setName(signature.getFeature("entityName") as String)
		method.setPredecessor(signature)
		val modifier = MappingFactory.eINSTANCE.createOperationModifier()
		modifier.setName("public")
		method.setModifier(modifier)
		// returnType__OperationSignature
		// TODO define void type instead of null
		
		val reference = signature.getReferenceFeature("returnType__OperationSignature")
		if (reference !== null)
			method.setReturnType(reference.createTypeReference(model))
		// parameters__OperationSignature
		val parameters = signature.getFeature("parameters__OperationSignature") as Collection<EObject>
		parameters.forEach[parameter | method.parameters.add(parameter.createParameter(model))]
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
	private static def Parameter createParameter(EObject object, MappingModel model) {
		val parameter = MappingFactory.eINSTANCE.createParameter()
		parameter.setName(object.getFeature("parameterName") as String)
		parameter.setPredecessor(object)
		parameter.setModifier(object.getFeature("modifier__Parameter").createParameterModifier)
		
		val reference = object.getReferenceFeature("dataType__Parameter")
		if (reference !== null) {
			parameter.setType(reference.createTypeReference(model))
		}
		
		return parameter
	}
	
	/**
	 * Create a reference to a type declaration.
	 * 
	 * @param the PCM type reference to be mapped to an application model reference.
	 * 
	 * @return returns the application model type reference.
	 */
	private static def createTypeReference(EObject object, MappingModel model) {
		val typeReference = MappingFactory.eINSTANCE.createTypeReference()
		typeReference.setPredecessor(object)
		if (object.eClass !== null) {
			if (object.eClass.name !== null) {
				switch (object.eClass.name) {
					case 'CompositeDataType' : {
						val typeName = object.getFeature("entityName") as String
						val type = model.findCompositeType(typeName)
						if (type === null) {
							typeReference.setType(createNamedType(typeName))
						} else
							typeReference.setType(type)	
					}
					case 'PrimitiveDataType' : {
						val typeName = object.getFeature("type").toString
						val type = model.findPrimitiveType(typeName)
						if (type === null)
							typeReference.setType(createNamedType(typeName))
						else
							typeReference.setType(type)	
					}
				}
			} else { // TODO: this is a temporary measure, better set correct type
				typeReference.setType(model.emptyType)
			}
		} else { // TODO: this is a temporary measure, better set correct type
			typeReference.setType(model.emptyType)
		}
		return typeReference
	}
	
	
	private static def createNamedType(String name) {
		val type = MappingFactory.eINSTANCE.createNamedType()
		type.name = name
		
		return type
	}
	
	/**
	 * Emergency routine if the type is not found.
	 * 
	 * @return returns the empty type.
	 */
	private static def emptyType(MappingModel result) {
		var type = result.types.findFirst[it.name.equals("EMPTY")]
		if (type === null) {
			type = MappingFactory.eINSTANCE.createNamedType()
			type.setName("EMPTY")
			result.types.add(type)
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
	private static def findPrimitiveType(MappingModel model, Object object) {
		return model.types.findFirst[it.name.equals(object.toString)]
	}
	
	/**
	 * Method has side effect. TODO fix this. No side effects please.
	 * 
	 * @param name of the complex type.
	 */
	private static def findCompositeType(MappingModel result, String typeName) {
		return result.types.findFirst[it.name.equals(typeName)]
	}
	
	private static def ParameterModifier createParameterModifier(Object object) {
		val modifier = MappingFactory.eINSTANCE.createParameterModifier()
		return modifier
	}
	
	/**
	 * Determine which methods are defined in an interface.
	 */
	private static def Collection<EObject> determineMethods(EObject interfazeDeclaration) {
		// parentInterfaces__Interface
		// TODO inherit signatures
		// signatures__OperationInterface
		return interfazeDeclaration.getFeature("signatures__OperationInterface") as Collection<EObject>
	}
	
	/**
	 * Find dynamically a feature of an object.
	 */
	private static def Object getFeature(EObject object, String featureName) {
		val EStructuralFeature feature = object.eClass.getEStructuralFeature(featureName)
		return object.eGet(feature)
	}
	
	/**
	 * Find dynamically an reference feature of an object.
	 */
	private static def EObject getReferenceFeature(EObject object, String featureName) {
		val EStructuralFeature feature = object.eClass.getEStructuralFeature(featureName)
		if (feature instanceof EReference)
			return object.eGet(feature) as EObject
		else
			return null
	}

	/**
	 * Insert component type in the container hierarchy. If necessary establish that hierarchy.
	 */
	private static def void insertContainerInHierarchy(Containment parent, Container entity,
			QualifiedName fullQualifiedName) {
		if (fullQualifiedName.getSegmentCount() == 1) {
			addEntityToParentContainer(parent, entity)
		} else {
			// recurse into container hierarchy
			val container = parent.contents.findFirst[it.name.equals(fullQualifiedName.firstSegment)]
			if (container !== null) 
				insertContainerInHierarchy(container,entity,fullQualifiedName.skipFirst(1))
			else { // no match found, create missing container
				var runningParent = parent
				for (String name : fullQualifiedName.skipLast(1).segments) {
					val newContainer = MappingFactory.eINSTANCE.createContainer()
					newContainer.setName(name)
					runningParent.contents.add(newContainer)
					runningParent = newContainer
				}
				runningParent.contents.add(entity)
			}
		}
	}

	/**
	 * Add node only if no node with that name already exists.
	 * 
	 * @param parent the containment
	 * @param entity the container to be added to the containment
	 */
	private static def addEntityToParentContainer(Containment parent, Container entity) {
		if (!parent.contents.exists[it.name.equals(entity.name)]) {
			parent.contents.add(entity)
		} else
			System::out.println("Double container declaration")
	}
		
}
