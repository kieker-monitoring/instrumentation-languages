package kieker.develop.al.handler.pcm

import kieker.develop.al.mapping.Container
import kieker.develop.al.mapping.Containment
import kieker.develop.al.mapping.MappingModel
import kieker.develop.al.mapping.Operation
import kieker.develop.al.mapping.Parameter
import kieker.develop.al.mapping.ParameterModifier
import kieker.develop.al.mapping.MappingFactory
import kieker.develop.al.aspectLang.ApplicationModel
import kieker.develop.al.modelhandling.IModelMapper
import java.util.Collection
import java.util.HashMap
import java.util.Iterator
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.QualifiedName
import java.util.ArrayList
import kieker.develop.al.aspectLang.Technology

class PCMModelMapper implements IModelMapper {
	
	/** hierarchy mapping model factory. */
	private final MappingFactory mappingFactory = MappingFactory.eINSTANCE
	
	private MappingModel result
	
	private Map<String, EObject> interfaceMap = new HashMap<String, EObject>()
	
	override loadModel(ApplicationModel input, ResourceSet resourceSet) {
		
		// Get the resource
		val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(input.getModel(), true), true)

		// create main result model
		this.result = this.mappingFactory.createMappingModel()
		// determine all interfaces
		determineInterfaces(source)
		// compose container hierarchy
		determineContainerHierarchy(source)
		// contents must be called via its getter otherwise xtend will used the variable which may
		// result in an null pointer result
		return this.result
	}
	
	override name() {
		return "pcm"
	}
	
	override targetTechnologies() {
		return #{ Technology.ASPECT_J, Technology.SERVLET, Technology.JAVA_EE }
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
					val container = this.mappingFactory.createContainer()
					val fullQualifiedName = component.getFeature("entityName") as String
					val names = fullQualifiedName.split('\\.')
					if (names.size == 0)
						names.add(fullQualifiedName as String)
					val QualifiedName name = QualifiedName.create(names)
					container.setName(name.getLastSegment())
					container.setPredecessor(component)
					container.addInterfaces(component)
					insertContainerInHierarchy(this.result,container,name)
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
			val interfaze = this.mappingFactory.createContainer()
			val interfazeDeclaration = this.interfaceMap.get(name)
			interfaze.setName(name)
			interfaze.setPredecessor(providedInterface)
			interfaze.operations.createMethods(interfazeDeclaration.determineMethods)
			container.contents.add(interfaze)
		}
	}
		
	/**
	 * Create methods for an interface in the intermediate model.
	 */
	private def void createMethods(EList<Operation> list, Collection<EObject> objects) {
		objects.forEach[signature | list.add(createOperation(signature))]
	}
	
	/**
	 * Construct a method in the application model based on the PCM structure.
	 * 
	 * @param signature the method signature from the PCM repository to be used to create
	 * the application model method signature.
	 * 
	 * @return returns an application model method declaration.
	 */
	private def Operation createOperation(EObject signature) {
		val method = this.mappingFactory.createOperation()
		method.setName(signature.getFeature("entityName") as String)
		method.setPredecessor(signature)
		val modifier = this.mappingFactory.createOperationModifier()
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
		val parameter = this.mappingFactory.createParameter()
		parameter.setName(object.getFeature("parameterName") as String)
		parameter.setPredecessor(object)
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
		val typeReference = this.mappingFactory.createTypeReference()
		typeReference.setPredecessor(object)
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
		var type = this.result.types.findFirst[it.name.equals("EMPTY")]
		if (type == null) {
			type = this.mappingFactory.createNamedType()
			type.setName("EMPTY")
			this.result.types.add(type)
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
		var type = this.result.types.findFirst[it.name.equals(typeName)]
		if (type == null) {
			type = this.mappingFactory.createNamedType()
			type.setName(typeName)
			this.result.types.add(type)
		}
		return type
	}
	
	/**
	 * Method has side effect. TODO fix this. No side effects please.
	 * 
	 * @param name of the complex type.
	 */
	private def findCompositeType(String typeName) {
		var type = this.result.types.findFirst[it.name.equals(typeName)]
		if (type == null) {
			type = this.mappingFactory.createNamedType()
			type.setName(typeName)
			this.result.types.add(type)
		}
		return type
	}
	
	private def ParameterModifier createParameterModifier(Object object) {
		val modifier = this.mappingFactory.createParameterModifier()
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
					val newContainer = this.mappingFactory.createContainer()
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
	
}