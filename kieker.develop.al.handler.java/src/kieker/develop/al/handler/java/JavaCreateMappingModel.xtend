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
package kieker.develop.al.handler.java

import kieker.develop.al.mapping.Container
import kieker.develop.al.mapping.Containment
import kieker.develop.al.mapping.MappingFactory
import kieker.develop.al.mapping.MappingModel
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.access.jdt.JdtTypeProvider

/**
 * Create the mapping model for a specific java project.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class JavaCreateMappingModel {
	
	/**
	 * Create the mapping model.
	 * 
	 * @param project the Java project to be mapped
	 * @param resourceSet the resource set to be used to handle the loaded models
	 * 
	 * @return returns the new mapping model
	 */
	static def MappingModel createMappingModel(IJavaProject project, ResourceSet resourceSet) {
		val typeProvider = new JdtTypeProvider(project, resourceSet)
		
		val model = MappingFactory.eINSTANCE.createMappingModel()
								
		/**
	 	 * Create containers for a packages in the package fragment root.
	 	 * Do not create a container for the package fragment root itself, as they
	 	 * refer to their respective source folder, e.g., src, src-gen
	 	 */
		project.getPackageFragmentRoots.forEach[
			it.children.forEach[it.createPackageContainer(model, typeProvider)]
		]
	
		return model	
	}
	
	/**
	 * Create a container for a package or class inside a package root.
	 * 
	 * @param element package or compilation unit
	 * @param model the mapping model to be filled with additional container information
	 * @param typeProvider provider and resolver for types
	 */
	private static def void createPackageContainer(IJavaElement element, MappingModel model, JdtTypeProvider provider) {		
		if (element instanceof IPackageFragment) {
			element.children.forEach[it.createPackageContainer(model, provider)]			
		} else if (element instanceof ICompilationUnit) {
			element.allTypes.forEach[type |
				val containerHierarchy = type.fullyQualifiedName.split("\\.")
				val leave = model.createContainerPath(containerHierarchy, 0)
				val jvmType = provider.findTypeByName(type.fullyQualifiedName)
				leave.predecessor = jvmType
				
				switch(jvmType) {
					JvmGenericType: jvmType.allFeatures.filter(JvmOperation).forEach[op | leave.createOperation(op)]
					default: println("Operation lookup for " + jvmType.getClass().canonicalName + " not supported")
				}		
			]
		} else {
			// TODO support other sources or ignore other sources
			//println("Type " + element.getClass().toString)
		}
	}
	
	private static def void createOperation(Container container, JvmOperation jvmOperation) {
		val operation = MappingFactory.eINSTANCE.createOperation
		operation.name = jvmOperation.simpleName
		operation.modifier = MappingFactory.eINSTANCE.createOperationModifier
		operation.modifier.name = jvmOperation.visibility.name().toLowerCase
		
		// TODO support for returnType
		// TODO support for operation parameters
		
		container.operations.add(operation)	
	}
	
	/**
	 * Create or find recursivly containers for a given path.
	 * Creates containers only if such container is missing.
	 * 
	 * @param parent the parent containment
	 * @param containerHierarchy an array containing one entry for each hierarchy level.
	 * @param index hierarchy level
	 * 
	 * @return the leave container created
	 */
	private static def Container createContainerPath(Containment parent, String[] containerHierarchy, int index) {
		var nestedPackage = parent.contents.findFirst[it.name.equals(containerHierarchy.get(index))]
		if (nestedPackage == null) {
			nestedPackage = parent.createPackage(containerHierarchy.get(index))
		}
		if ((index+1) < containerHierarchy.length)
			return nestedPackage.createContainerPath(containerHierarchy, index+1)
		else
			return nestedPackage
	}
	
	/**
	 * Create a package container.
	 * 
	 * @param parent the parent container where the new container is inserted into
	 * @param name the name of the container
	 * 
	 * @return a new container for a package
	 */
	private static def Container createPackage(Containment parent, String name) {
		val container = MappingFactory.eINSTANCE.createContainer
		
		container.name = name
		container.predecessor = null // packages are only virtual
		parent.contents.add(container)
		
		return container
	}
}