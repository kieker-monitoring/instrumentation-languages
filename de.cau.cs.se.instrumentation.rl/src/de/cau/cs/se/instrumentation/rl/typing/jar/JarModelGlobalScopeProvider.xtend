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
package de.cau.cs.se.instrumentation.rl.typing.jar;

import com.google.common.base.Predicate
import com.google.inject.Inject
import de.cau.cs.se.instrumentation.rl.typing.BaseTypeGlobalScopeProvider
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage.Literals
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import de.cau.cs.se.instrumentation.rl.typing.ITypeProvider
import de.cau.cs.se.instrumentation.rl.recordLang.BaseType

class JarModelGlobalScopeProvider extends BaseTypeGlobalScopeProvider {
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	override IScope getParentTypeScope(Resource resource, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType) {
        // check whether the reference type is a type of any kind 
        if (referenceType.name.equals(BaseType.simpleName)) {
        	super.getParentTypeScope(resource, reference, filter, referenceType)
        } else if (EcoreUtil2::isAssignableFrom(Literals::EPACKAGE, referenceType)) {
        	return IScope.NULLSCOPE
        } else {
        	if (resource != null) {
        		val ResourceSet resourceSet = resource.getResourceSet()
        		val root = ResourcesPlugin.getWorkspace().getRoot()
        		val uri = resource.URI.toString.replaceFirst("platform:/resource", "") 
        		val project = root.getFile(new Path(uri)).project
    
    			if (resourceSet != null) {
        			val ITypeProvider typeProvider = JarModelTypeProviderFactory.getTypeProvider(project, resourceSet)
					return new JarModelTypeScope(typeProvider, qualifiedNameConverter, filter)
				} else
    				throw new IllegalStateException("context must be contained in a resource set") 
        	} else
    			throw new IllegalStateException("context must be contained in a resource") 
        	
        }
        	
    }
}
