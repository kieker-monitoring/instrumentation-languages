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

import com.google.common.base.Predicate
import com.google.inject.Inject
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.typing.ITypeProvider
import kieker.develop.rl.typing.base.BaseTypeGlobalScopeProvider
import kieker.develop.rl.typing.semantics.AnnotationProviderFactory
import kieker.develop.rl.typing.semantics.AnnotationScope
import kieker.develop.semantics.annotations.Annotation
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

class JarModelGlobalScopeProvider extends BaseTypeGlobalScopeProvider {
	
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	override IScope getParentTypeScope(Resource resource, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType) {
        val scope = super.getParentTypeScope(resource, reference, filter, referenceType)
        if (scope != IScope.NULLSCOPE) {
        	return scope
        } else if (referenceType.name.equals(Annotation.simpleName)) {
        	if (resource != null) {
        		val ResourceSet resourceSet = resource.getResourceSet()
        		if (resourceSet != null) {
        			val typeProvider = AnnotationProviderFactory.getTypeProvider(resourceSet)
					return new AnnotationScope(typeProvider, qualifiedNameConverter, filter)
        		} else
	    			throw new IllegalStateException("context must be contained in a resource set") 
        	} else
    			throw new IllegalStateException("context must be contained in a resource") 
        } else if (referenceType.name.equals(TemplateType.simpleName) 
        	|| referenceType.name.equals(EventType.simpleName)) {
        	if (resource != null) {
        		val ResourceSet resourceSet = resource.getResourceSet()
        		if (resourceSet != null) {
	        		try {
	        			val workspace = ResourcesPlugin.getWorkspace()
	        			val root = workspace.getRoot()
		        		val uri = resource.URI.toString.replaceFirst("platform:/resource", "") 
		        		val project = root.getFile(new Path(uri)).project
		        		
	        			val ITypeProvider typeProvider = JarModelTypeProviderFactory.getTypeProvider(project, resourceSet)
						return new JarModelTypeScope(typeProvider, qualifiedNameConverter, filter)
	        		} catch (IllegalStateException e) {
	        			System.out.println("No workspace present")
	        			return IScope.NULLSCOPE
	        		}
        		} else
	    			throw new IllegalStateException("context must be contained in a resource set") 
        	} else
    			throw new IllegalStateException("context must be contained in a resource") 
        	
        } else
        	return IScope.NULLSCOPE
        	
    }
}
