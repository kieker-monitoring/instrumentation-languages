package kieker.develop.rl.scoping

import com.google.inject.Singleton
import java.util.Collection
import java.util.HashMap
import java.util.Map
import kieker.develop.semantics.ISemanticExtension
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.AnnotationsFactory
import kieker.develop.semantics.annotations.Semantics
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform

@Singleton
class SemanticAnnotationHandler implements ISemanticAnnotationHandler {
	private static final String SEMANTIC_ANNOTATION = "kieker.develop.semantics.SemanticAnnotation"
	
	val Semantics model = AnnotationsFactory.eINSTANCE.createSemantics
		
	new() {	
		val Map<String,Annotation> annotations = new HashMap<String,Annotation>()
		
		val registry = Platform.getExtensionRegistry()
		val config = registry.getConfigurationElementsFor(SEMANTIC_ANNOTATION)
  		try {
  			config.forEach[element |
  				val ext = element.createExecutableExtension("annotations")
  				if (ext instanceof ISemanticExtension) {
  					val semanticExtension = (ext as ISemanticExtension)
	          		semanticExtension.annotations.forEach[
	          			if (annotations.containsKey(it.name)) {
	          				annotations.get(it.name).implementations += it.implementations
	          			} else {
	          				val annotationDecl = AnnotationsFactory.eINSTANCE.createAnnotation()
	          				annotationDecl.name = it.name
	          				annotationDecl.implementations += it.implementations
	          				annotations.put(it.name, annotationDecl)
	          				model.annotations += annotationDecl
	          			}
	          		]
	          	}
			]
	    } catch (CoreException ex) {
	      	System.out.println(ex.getMessage())
	    }
	}
	
	override Semantics getSemantics() {
		System.out.println("get semantics")
		return model
	}
		
	override Collection<Annotation> getAnnotations() {
		return model.annotations
	}
}