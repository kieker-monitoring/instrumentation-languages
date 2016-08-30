package kieker.develop.rl.scoping

import java.util.Collection
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.Semantics

interface ISemanticAnnotationHandler {
	
	def Collection<Annotation> getAnnotations()
	
	def Semantics getSemantics()
}