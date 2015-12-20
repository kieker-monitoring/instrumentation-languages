package de.cau.cs.se.instrumentation.al.modelhandling

import de.cau.cs.se.instrumentation.al.mapping.MappingModel
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel
import org.eclipse.emf.ecore.resource.ResourceSet

interface IModelMapper {
	def MappingModel loadModel(ApplicationModel model, ResourceSet resourceSet)
	
	def String name()
}