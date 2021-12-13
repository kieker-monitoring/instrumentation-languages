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

import kieker.develop.geco.ITraceModelProvider
import java.util.ArrayList
import kieker.develop.al.aspectLang.ApplicationModelHandle
import kieker.develop.al.modelhandling.IModelMapper
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.common.types.JvmType

/**
 * Create mapping model for Java classes.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class JavaModelMapper implements IModelMapper<JvmType, JvmType> {
				
	/**
	 * Create a mapping model for a Java project.
	 * 
	 * @param handle handle referencing the Java project
	 * @param resourceSet corresponding resource set for the IAL file
	 */
	override loadModel(ApplicationModelHandle handle, ResourceSet resourceSet) {
			
		val IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot()
		val javaProject = root.getProject(handle.model).getJavaProject
				
		return JavaCreateMappingModel.createMappingModel(javaProject, resourceSet)
	}
		
	/**
     * Get Java project of a project.
     */
    private def IJavaProject getJavaProject(IProject project) {
    	if (project.hasNature(JavaCore.NATURE_ID)) {
        	return JavaCore.create(project)
        } else
            return null
    }
	
	
	override name() { "java" }
	
	override traceModelProvider(URI uri, ResourceSet resourceSet) {
		val provider = new ITraceModelProvider<JvmType, JvmType>() {
			
			val mappings = new ArrayList<JvmType>()
			
			override add(JvmType source, JvmType target) {
				mappings.add(source)
			}
			
			override lookup(JvmType source) {
				return mappings.filter[it == source]
			}
			
			override <TV extends JvmType> lookup(JvmType source, Class<TV> targetClass) {
				return mappings.filter[it == source].filter(targetClass)
			}
			
			override <SV extends JvmType,TV extends JvmType> lookup(Class<SV> sourceClass, Class<TV> targetClass) {
				return mappings.filter(sourceClass).filter(targetClass)
			}
			
			override <SV extends JvmType> allSources(Class<SV> sourceClass) {
				return mappings.filter(sourceClass)
			}
			
			override reverseLookup(JvmType target) {
				return mappings.filter[target == it]
			}
			
			override <SV extends JvmType,TV extends JvmType> subset(Class<SV> sourceClass, Class<TV> targetClass) {
				return null
			}
					
		}
		return provider
	}
	
}