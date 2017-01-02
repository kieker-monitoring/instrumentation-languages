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
package kieker.develop.rl.typing.jar;

import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.Literal
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.RecordLangFactory
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.recordLang.Type
import java.io.IOException
import java.io.InputStream
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.IClassFile
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.resources.IMarker
import kieker.develop.rl.typing.base.BaseTypes
import kieker.develop.rl.recordLang.ComplexType

/**
 * broadly based on org.spp.cocome.behavior.pcm.handler.PCMModelResource
 * 
 * @author Yannic Kropp -- initial contribution
 * @author Reiner Jung
 * 
 */
public class JarModelResource extends ResourceImpl {
	
	val EXCLUDE_CLASSES = #[
		"java.io.Serializable",
		"java.lang.Comparable", "java.lang.Object", 
		"kieker.common.record.AbstractMonitoringRecord",
		"kieker.common.record.misc.RegistryRecord", // TODO this can be removed after supporting arrays officially.
		"kieker.common.record.IMonitoringRecord"
	]
	
	val rlFactory = RecordLangFactory.eINSTANCE
	var IProject project
	val Collection<Type> modelTypes = new ArrayList<Type>
	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param applicationModel the application model
	 */
	public new(URI uri, IProject project) {
		super(uri)
		this.project = project
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
			for (object : this.getContents()) {
				if (object instanceof Model) {
					val types = (object as Model).types
					val result = types.findFirst[type |
						type.name.endsWith("." + uriFragment) || 
						type.name.equals(uriFragment)
					]
					if (result != null)
						return result
				}
			}
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
	 * Return prepared set over all inferred types.
	 */	
	public def Iterable<Type> getAllTypes() {
		modelTypes
	}

	/**
	 * Create an result model for a given ecore model.
	 */
	private synchronized def createModel() {
		if (!this.isLoaded) {
			val javaProject = JavaCore.create(project)
			val iface = javaProject.findType("kieker.common.record.IMonitoringRecord")
			
			if (iface != null) {		
				/** find all types which are related to IMonitoringRecord */
				val hierarchy = iface.newTypeHierarchy(javaProject,null)
				val types = hierarchy.allTypes.filter[
					val name = it.fullyQualifiedName
					/**
					 * only use binary only classes for the model, as Java code belongs to the
					 * project and must be constructed via IRL.
					 */
					it.binary && !EXCLUDE_CLASSES.exists[it.equals(name)]
				]
				
				val models = new HashMap<String,Model>()
				/** create a model for each package */	
				types.forEach[type | if (models.get(type.packageFragment.elementName)==null)
					models.put(type.packageFragment.elementName, type.createModel)
				]
				
				val typeMap = new HashMap<IType,ComplexType>()
				/** create a type for each type. */
				types.forEach[type | 
					val modelType = type.createType
					models.get(type.packageFragment.elementName).types.add(modelType)
					typeMap.put(type, modelType)
					modelTypes.add(modelType)
				]
				
				/** link types. */
				types.forEach[type | type.linkType(typeMap)]
				
				if(models.values != null) {
					this.getContents().addAll(models.values)
				}
			} else {
				val m = project.createMarker(IMarker.PROBLEM)
				m.setAttribute(IMarker.LINE_NUMBER, 0)
				m.setAttribute(IMarker.MESSAGE, "The project does not contain the interface kieker.common.record.IMonitoringRecord")
				m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_LOW)
				m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO)
			}
		}
	}
	
	/**
	 * Link types.
	 */
	private def void linkType(IType type, Map<IType, ComplexType> typeMap) {
		val modelType = typeMap.get(type)
		switch(modelType) {
			TemplateType: {
				val hierarchy = type.newSupertypeHierarchy(null)
				hierarchy.getSuperInterfaces(type).forEach[iface |
					val template = typeMap.get(iface) 
					if (template != null)
						modelType.inherits.add(template as TemplateType)
				]
				
			}
			EventType: {
				val hierarchy = type.newSupertypeHierarchy(null)
				hierarchy.getSuperInterfaces(type).forEach[iface |
					val template = typeMap.get(iface) 
					if (template != null)
						modelType.inherits.add(template as TemplateType)
				]
				val superType = hierarchy.getSuperclass(type)
				if (superType != null) {
					modelType.parent = typeMap.get(superType) as EventType
				}
			}
		}
	}
	
	private def Model createModel(IType type) {
		val model = rlFactory.createModel
		model.name = type.packageFragment.elementName
		return model
	}
	
	private def ComplexType createType(IType type) {
		if (type.isInterface)
			type.createTemplateType
		else
			type.createEventType
	}
	
	private def EventType createEventType(IType type) {
		val result = rlFactory.createEventType
		
		result.name = type.elementName
		result.createAttributes(type)
		
		return result
	}
	
	private def TemplateType createTemplateType(IType type) {
		val result = rlFactory.createTemplateType
		
		result.name = type.elementName
		result.createAttributes(type)
		
		return result
	}
	
	/**
	 * Create constants and properties based on methods of
	 * an interface declaration.
	 * 
	 * @param result the template type which is extended by constant and property declarations
	 * @param type the class used to infer the constants and properties from
	 */
	def void createAttributes(TemplateType result, IType type) {
		type.methods.forEach[method |
			if (Flags.isPublic(method.flags)) {
				if (method.elementName.startsWith("get") &&
					!"getLoggingTimestamp".equals(method.elementName) &&
					!"getValueTypes".equals(method.elementName)
				) {
					/** create property */
					val property = rlFactory.createProperty
					property.name = method.elementName.substring(3).toFirstLower
					property.type = method.returnType.createType
				
					// TODO add constant and transient features later
					if (property.type == null) {
					createError(type.elementName, method.returnType, "property", property.name)
					} else {
						result.properties.add(property)
					}
				} else if (method.elementName.startsWith("is")) {
					/** create property */
					val property = rlFactory.createProperty
					property.name = method.elementName.substring(2).toFirstLower
					property.type = method.returnType.createType
					
					// TODO add constant and transient features later
					if (property.type == null) {
					createError(type.elementName, method.returnType, "property", property.name)
					} else {
						result.properties.add(property)
					}
				}	
			}
		]
	}
	
	/**
	 * Create constants and properties based on fields of
	 * a class declaration.
	 * 
	 * @param result the event type which is extended by constant and property declarations
	 * @param type the class used to infer the constants and properties from
	 */
	def void createAttributes(EventType result, IType type) {
		type.fields.forEach[field |	
			if (Flags.isPublic(field.flags) && Flags.isStatic(field.flags) && Flags.isFinal(field.flags)) {
				if (!field.elementName.startsWith("TYPE_SIZE") && 
					!"TYPES".equals(field.elementName) && 
					!field.elementName.startsWith("CACHED_KIEKERRECORDS")) {
					/** create constants */
					val constant = rlFactory.createConstant
					constant.name = field.elementName
					constant.type = field.typeSignature.createType
					constant.value = field.constant.createLiteral
					
					if (constant.type == null) {
						createError(type.elementName, field.typeSignature, "constant", constant.name)
					} else {
						result.constants.add(constant)
					}
				}
			} else if (Flags.isPrivate(field.flags) && Flags.isFinal(field.flags) && !Flags.isStatic(field.flags)) {
				/** create property */
				val property = rlFactory.createProperty
				property.name = field.elementName
				property.type = field.typeSignature.createType
				// TODO add constant and transient features later
				if (property.type == null) {
					createError(type.elementName, field.typeSignature, "property", property.name)
				} else {
					result.properties.add(property)
				}
			}			
		]
	}
	
	/**
	 * Create an error message in the problem list of Eclipse.
	 * 
	 * @param name name of the Java type
	 * @param attributeTypeSignature type signature of the attribute (constant/property)
	 * @param kind is either constant or property
	 * @param attributeName is the name of the processed attribute
	 */
	private def void createError(String name, String attributeTypeSignature, String kind, String attributeName) {
		val m = project.createMarker(IMarker.PROBLEM)
		m.setAttribute(IMarker.LINE_NUMBER, 0)
		m.setAttribute(IMarker.MESSAGE, "Kieker type " + name + " contains unsupported type " 
			+ attributeTypeSignature + " in " + kind + " declaration " + attributeName
		)
		m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_LOW)
		m.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR)
	}
	
	private def Literal createLiteral(Object object) {
		switch (object) {
			Integer: {
				val result = rlFactory.createIntLiteral
				result.value = object
				return result
			}
			Byte: {
				val result = rlFactory.createIntLiteral
				result.value = object
				return result
			}
			Boolean: {
				val result = rlFactory.createBooleanLiteral
				result.value = object
				return result
			}
			Character: {
				val result = rlFactory.createStringLiteral
				result.value = object.toString
				return result
			}
			Double: {
				val result = rlFactory.createFloatLiteral
				result.value = object.floatValue
				return result
			}
			Float: {
				val result = rlFactory.createFloatLiteral
				result.value = object
				return result
			}
			Long: {
				val result = rlFactory.createIntLiteral
				result.value = object.intValue
				return result
			}
			Short: {
				val result = rlFactory.createIntLiteral
				result.value = object.shortValue
				return result
			}
			String: {
				val result = rlFactory.createStringLiteral
				result.value = object
				return result
			}
			default: null	
		}
	}
	
	private def Classifier createType(String typeId) {
		val classifier = rlFactory.createClassifier
		var id = typeId 
		while (id.startsWith("[")) {
			id = id.substring(1)
			classifier.sizes += createArraySize(0)
		}
		switch(id) {
			case "B": classifier.type = BaseTypes.BYTE.getType
			case "C": classifier.type = BaseTypes.CHAR.getType
			case "D": classifier.type = BaseTypes.DOUBLE.getType
			case "F": classifier.type = BaseTypes.FLOAT.getType
			case "I": classifier.type = BaseTypes.INT.getType
			case "J": classifier.type = BaseTypes.LONG.getType
			case "S": classifier.type = BaseTypes.SHORT.getType
			case "Z": classifier.type = BaseTypes.BOOLEAN.getType
			case "Ljava.lang.String;": classifier.type = BaseTypes.STRING.getType
			case "QString;": classifier.type = BaseTypes.STRING.getType
			default:
				return null
		}
		
		return classifier
	}
	
	def createArraySize(int size) {
		val result = rlFactory.createArraySize
		result.size = size
		return result
	}
		

	
	/**
	 * find all types in a package fragment recursively.
	 */
	private def Collection<IType> findAllTypes(IPackageFragment fragment) {
		val result = new ArrayList<IType>()
		fragment.children.forEach[element |
			switch (element) {
				IPackageFragment: {
					if (element.elementName.startsWith("kieker"))
						result.addAll(element.findAllTypes)
				}
				IClassFile: result.add(element.getType())
				ICompilationUnit: result.addAll(element.types)
			}
		]
				
		return result
	}


	
	
}