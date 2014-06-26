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
package de.cau.cs.se.instrumentation.rl.ui.launch

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EPackage
import org.eclipse.core.resources.IFile
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EcoreFactory
import de.cau.cs.se.instrumentation.rl.recordLang.Model
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import org.eclipse.emf.ecore.EAttribute
import de.cau.cs.se.instrumentation.rl.recordLang.Property
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EStructuralFeature
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier

/**
 * Provides an example generator for EMF models out of IRL specification.
 * 
 * @author Reiner Jung
 */
class EMFModelGenerator {
	
	private val static SERVICE_PACKAGE = 'kieker.common.model'
	
	private ResourceSet resourceSet
	private EcoreFactory factory = EcoreFactory.eINSTANCE
	private EClass abstractRecordClass
	
	/**
	 * Constructor.
	 */
	public new (ResourceSet resourceSet) {
		this.resourceSet = resourceSet
	}
	
	/**
	 * Primary generation method.
	 * 
	 * @param file the IRL file to be interpreted
	 * @param destination the EMF model resource
	 */
	def void doGenerate (IFile file, Resource destination) {
		System.out.println ("FILE " + file.toString)
		val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(file.getFullPath().toPortableString(), true), true)

		// create basic classes and interfaces
		abstractRecordClass = createAbstractRecordClass()
		
		// TODO containment main class missing, think of further required infrastructure
	
				
		// create package hierarchy
		source.allContents.filter(typeof(Model)).forEach[type | type.composePackageHierarchy(destination)]
		composePackageHierarchy(SERVICE_PACKAGE.split('\\.'), destination)

		// TODO make this configurable
		destination.insert(abstractRecordClass, 'kieker.common.record')		
		destination.insert(createContainmentClass(), SERVICE_PACKAGE)

		// create classes and interfaces
		source.allContents.filter(typeof(PartialRecordType)).
			forEach[type | destination.insert(type.createInterface, (type.eContainer as Model).name)]
		source.allContents.filter(typeof(RecordType)).
			forEach[type | destination.insert(type.createClass, (type.eContainer as Model).name)]

		// complete declaration classes and interfaces
		source.allContents.filter(typeof(PartialRecordType)).forEach[type | type.composeInterface(destination)]
		source.allContents.filter(typeof(RecordType)).forEach[type | type.composeClass(destination)]
	}
	
	/**
	 * Create the abstract record of Kieker which is hidden from IRL.
	 */
	def createAbstractRecordClass() {
		val EClass clazz = factory.createEClass()
		clazz.setName("AbstractMonitoringRecord")
		clazz.setAbstract(true)
		clazz.setInterface(false)
		
		val attribute = factory.createEAttribute()
		attribute.setName('loggingTimestamp')
		attribute.setEType("long".mapToEMFLiteral)							
		clazz.getEStructuralFeatures.add(attribute)			
						
		return clazz
	}
	
	def createContainmentClass() {
		val EClass clazz = factory.createEClass()
		clazz.setName("MonitoringModel")
		clazz.setAbstract(false)
		clazz.setInterface(false)
		
		val reference = factory.createEReference()
		reference.setName('data')
		reference.setEType(abstractRecordClass)
		reference.setContainment(true)
		reference.setLowerBound(0)
		reference.setUpperBound(-1)
		reference.setOrdered(true)
		
		clazz.getEStructuralFeatures.add(reference)
		
		return clazz
	}
		
	/**
	 * Check if a package hierarchy exists for the given model and if not
	 * add one to the hierarchy. For all root packages add that to the resource
	 */
	def void composePackageHierarchy(Model model, Resource resource) {
		val String[] modelName = model.name.split('\\.')
		composePackageHierarchy(modelName,resource)
	}
	
	def void composePackageHierarchy(String[] modelName, Resource resource) {
		resource.contents.filter(typeof(EPackage)).forEach[p | if (p.name.equals(modelName.get(0))) checkChildPackages(modelName.tail, p)]
		if (!resource.contents.filter(typeof(EPackage)).exists[p | p.name.equals(modelName.get(0))]) {
			// unknown root node create node tree
			val EPackage rootNode = composePackage(modelName.get(0), "http://www.kieker-monitoring.net")
			
			createPackageChain(modelName.tail, rootNode)
			
			resource.contents.add(rootNode)
		}
	}
		
	/**
	 * Check recursively if all child packages exist. If not create.
	 */
	def void checkChildPackages(Iterable<String> modelName, EPackage parent) {
		if (modelName.empty)
			return 
		val nodeName = modelName.get(0)
		val tailList = modelName.tail
		
		parent.ESubpackages.forEach[p | if (p.name.equals(nodeName)) checkChildPackages(tailList, p)]
		if (!parent.ESubpackages.exists[p | p.name.equals(nodeName)]) {
			createPackageChain(modelName, parent)
		}
	}
	
	/**
	 * Compose a package based on a name and the parent package URI.
	 */
	def EPackage composePackage(String name, String parentURI) {
		val EPackage p = factory.createEPackage()
		p.setName(name)
		p.setNsPrefix(name)
		p.setNsURI(parentURI + "/" + name)
		
		return p
	}
	
	/**
	 * Create a package chain.
	 */
	def void createPackageChain(Iterable<String> modelName, EPackage parent) {
		var EPackage p  = parent
			
		for (String nodeName : modelName) {
			val EPackage subPackage = composePackage(nodeName, p.nsURI)
			p.ESubpackages.add(subPackage)
			p = subPackage
		}
	}
	
	def void insert(Resource resource, EClassifier classifier, String packageName) {
		val packagePath = packageName.split('\\.')
		resource.contents.filter(typeof(EPackage)).findFirst[packagePath.get(0).equals(it.name)].findAndInsert(classifier,packagePath.tail)
	}
	
	def void findAndInsert(EPackage pkg, EClassifier classifier, Iterable<String> packagePath) {
		if (packagePath.empty) {
			if (!pkg.EClassifiers.exists[it.name.equals(classifier.name)])
				pkg.EClassifiers.add(classifier)
		} else
			pkg.ESubpackages.findFirst[packagePath.get(0).equals(it.name)].findAndInsert(classifier,packagePath.tail)
	}
	
	/**
	 * Search for a class in the resource specified by the record type.
	 */
	def EClass findResultClass(Type type, Resource resource) {
		val packagePath = (type.eContainer as Model).name.split('\\.')
		
		val pkg = resource.contents.filter(typeof(EPackage)).findFirst[p | p.name.equals(packagePath.get(0))]
		return type.findResultClass(pkg,packagePath.tail)
	}
	
	def EClass findResultClass(Type type, EPackage pkg, Iterable<String> packagePath) {
		if (packagePath.empty) { // we reached the end of the package hierarchy. 
			return pkg.EClassifiers.findFirst[clazz | clazz.name.equals(type.name)] as EClass
		} else {
			val subpkg = pkg.ESubpackages.findFirst[p | p.name.equals(packagePath.get(0))]
			if (subpkg == null) {
				return null
			} else {
				return type.findResultClass(subpkg, packagePath.tail)
			}
		}
	}
	
	/**
	 * Compose an EMF interface for the given partial record type/template.
	 */
	def EClass createInterface(PartialRecordType type) {
		val EClass clazz = factory.createEClass()
		clazz.setName(type.name)
		clazz.setInterface(true)
		clazz.setAbstract(true)
	
		return clazz
	}
	
	/**
	 * Compose an EMF class for the given record type.
	 */
	def EClass createClass(RecordType type) {
		val EClass clazz = factory.createEClass()
		clazz.setName(type.name)
		clazz.setAbstract(type.abstract)
		clazz.setInterface(false)
						
		return clazz
	}
	
	/**
	 * Complete the interface construction with inheritance and attributes.
	 */
	def void composeInterface(PartialRecordType type, Resource resource) {
		val EClass clazz = type.findResultClass(resource)
		
		if (!type.parents.empty) {
			type.parents.forEach[iface | clazz.ESuperTypes.add(iface.findResultClass(resource))]
		}
		type.properties.forEach[property | clazz.getEStructuralFeatures.addUnique(property.composeProperty)]
	}
	
	/**
	 * Complete the class construction with inheritance and attributes.
	 */
	def void composeClass(RecordType type, Resource resource) {
		val EClass clazz = type.findResultClass(resource)
		
		if (type.parent != null) {
			clazz.ESuperTypes.add(type.parent.findResultClass(resource))
		} else {
			clazz.ESuperTypes.add(abstractRecordClass)
		}
		if (!type.parents.empty) {
			type.parents.forEach[iface | clazz.ESuperTypes.add(iface.findResultClass(resource))]
		}
		type.properties.forEach[property | clazz.getEStructuralFeatures.addUnique(property.composeProperty)]
	}
	
	/**
	 * Check if a given feature already exists.
	 */
	def void addUnique(EList<EStructuralFeature> list, EAttribute attribute) {
		if (!list.exists[it.name.equals(attribute.name)]) list.add(attribute)
	}
	
	/**
	 * Create an EMF attribute for a given IRL property.
	 */
	def EAttribute composeProperty(Property property) {
		val attribute = factory.createEAttribute()
		attribute.setName(property.name)
		// TODO EMF only supports single dimension arrays
		var Classifier type = null
		if (property.type != null) {
			attribute.setDerived(false)
			if (property.type.class_ != null) {
				type = property.type		
			}
		} else { // property is derived
			attribute.setDerived(true)
			var originalProperty = property
			while (originalProperty.referTo != null)
				originalProperty = originalProperty.referTo			
			type = originalProperty.type
		}
		
		System.out.println("t " + type)
		attribute.setEType(type.class_.name.mapToEMFLiteral)
		if (type.sizes != null) {
			if (!type.sizes.empty) {
				val size = type.sizes.get(0).size
				if (size == 0) {
					attribute.setLowerBound(0)
					attribute.setUpperBound(-1)
				} else {
					attribute.setLowerBound(size)
					attribute.setUpperBound(size)
				}
			} else {
				attribute.setLowerBound(1)
				attribute.setUpperBound(1)
			}
		} else {
			attribute.setLowerBound(1)
			attribute.setUpperBound(1)
		}
		
		return attribute
	}
		
	def EDataType getMapToEMFLiteral(String name) {
		switch(name) {
			case 'byte' : EcorePackage.Literals.EBYTE
			case 'short' : EcorePackage.Literals.ESHORT
			case 'int' : EcorePackage.Literals.EINT
			case 'long' : EcorePackage.Literals.ELONG
			case 'float' : EcorePackage.Literals.EFLOAT
			case 'double' : EcorePackage.Literals.EDOUBLE
			case 'string' : EcorePackage.Literals.ESTRING
			case 'boolean' : EcorePackage.Literals.EBOOLEAN
			default : EcorePackage.Literals.EBOOLEAN
		}
	}
	
}