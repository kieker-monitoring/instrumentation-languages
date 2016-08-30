package kieker.develop.semantics

import java.util.Collection
import kieker.develop.semantics.annotations.Annotation
import kieker.develop.semantics.annotations.TargetLanguage
import kieker.develop.semantics.annotations.Technology
import kieker.develop.semantics.annotations.Implementation

interface ISemanticExtension {
	def Collection<Annotation> getAnnotations()
	
	def Collection<Technology> getTechnologies()
	
	def Collection<TargetLanguage> getTargetLanguages()
	
	def Implementation getImplementation(Annotation semantics, Technology technology, TargetLanguage language)
}