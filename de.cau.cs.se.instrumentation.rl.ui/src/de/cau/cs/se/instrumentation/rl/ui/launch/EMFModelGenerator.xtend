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
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EDataType

class EMFModelGenerator {
	
	private ResourceSet resourceSet
	private EcoreFactory factory = EcoreFactory.eINSTANCE
	
	/**
	 * Constructor.
	 */
	public new (ResourceSet resourceSet) {
		this.resourceSet = resourceSet
	}
	
	def void doGenerate (IFile file, Resource destination) {
		val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(file.getFullPath().toPortableString(), true), true)
		
		source.allContents.filter(typeof(Model)).
			forEach[type | type.composePackageHierarchy(destination)]
		source.allContents.filter(typeof(PartialRecordType)).
			forEach[type | destination.insert(type.composeInterface(destination), (type.eContainer as Model).name)]
		source.allContents.filter(typeof(RecordType)).
			forEach[type | destination.insert(type.composeClass(destination), (type.eContainer as Model).name)]
	}
	
	/**
	 * Check if a package hierarchy exists for the given model and if not
	 * add one to the hierarchy. For all root packages add that to the resource
	 */
	def void composePackageHierarchy(Model model, Resource resource) {
		val String[] modelName = model.name.split('\\.')
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
		resource.contents.filter(typeof(EPackage)).findFirst[packagePath.get(0).equals(it.name)].findAndinsert(classifier,packagePath.tail)
	}
	
	def void findAndinsert(EPackage pkg, EClassifier classifier, Iterable<String> packagePath) {
		if (packagePath.empty)
			pkg.EClassifiers.add(classifier)
		else
			pkg.ESubpackages.findFirst[packagePath.get(0).equals(it.name)].findAndinsert(classifier,packagePath.tail)
	}
	
	/**
	 * Compose an EMF class for the given record type.
	 */
	def EClass composeClass(RecordType type, Resource resource) {
		val EClass clazz = factory.createEClass()
		clazz.setName(type.name)
		clazz.setAbstract(type.abstract)
		clazz.setInterface(false)
		
		if (type.parent != null) {
			clazz.ESuperTypes.add(type.parent.findResultClass(resource))
		}
		if (!type.parents.empty) {
			type.parents.forEach[iface | clazz.ESuperTypes.add(iface.findResultClass(resource))]
		}
		
		type.properties.forEach[property | clazz.getEStructuralFeatures.add(property.composeProperty)]
		
		return clazz
	}
	
	def EAttribute composeProperty(Property property) {
		val attribute = factory.createEAttribute()
		attribute.setName(property.name)
		System.out.println(" attribute " + property.name)
		if (property.type != null) {
			if (property.type.class_ != null) {
				attribute.setEType(property.type.class_.name.mapToEMfLiteral)		
			}
		}
		return attribute
	}
	
	def EDataType getMapToEMfLiteral(String name) {
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
	def EClass composeInterface(PartialRecordType type, Resource resource) {
		val EClass clazz = factory.createEClass()
		clazz.setName(type.name)
		clazz.setInterface(true)
		clazz.setAbstract(true)
		
		return clazz
	}
	
}