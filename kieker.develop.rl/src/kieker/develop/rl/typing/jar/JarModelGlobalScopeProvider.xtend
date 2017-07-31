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
package kieker.develop.rl.typing.jar

import com.google.common.base.Predicate
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.typing.IGlobalIRLScopeProvider
import kieker.develop.rl.typing.ITypeProvider
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import kieker.develop.rl.typing.jar.guava.GuavaModelTypeProviderFactory
import kieker.develop.rl.typing.jar.jdt.JDTModelTypeProviderFactory

/**
 * Provider for the global scope for models for JAR files.
 * 
 * @author Yannic Kropp -- initial contribution
 * @author Reiner Jung
 * @since 1.2
 */
class JarModelGlobalScopeProvider implements IGlobalIRLScopeProvider {

	override IScope getParentTypeScope(ResourceSet resourceSet, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType, IQualifiedNameConverter qualifiedNameConverter) throws InternalErrorException {
        if (referenceType.name.equals(TemplateType.simpleName) 
        	|| referenceType.name.equals(EventType.simpleName)) {
	   		try {
				val workspace = ResourcesPlugin.getWorkspace()
				val root = workspace.getRoot()
				val resource = resourceSet.resources.get(0)

				if (resource.URI.isPlatformResource) {
		    		val uri = resource.URI.toString.replaceFirst("platform:/resource", "") 
		    		val project = root.getFile(new Path(uri)).project
		    		
		    		val ITypeProvider typeProvider = JDTModelTypeProviderFactory.getTypeProvider(project, resourceSet)
					return new JarModelTypeScope(typeProvider, qualifiedNameConverter, filter)
		    	} else {
		    		val ITypeProvider typeProvider = GuavaModelTypeProviderFactory.getTypeProvider(resourceSet)
		    		return new JarModelTypeScope(typeProvider, qualifiedNameConverter, filter)
		    	}
			} catch (IllegalStateException e) {
				System.out.println("No workspace present")
				return IScope.NULLSCOPE
			}
        } else
        	return IScope.NULLSCOPE
        	
    }
}
