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

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EcorePackage$Literals
import org.eclipse.xtext.resource.IEObjectDescription
import de.cau.cs.se.instrumentation.rl.typing.TypeProviderFactory
import de.cau.cs.se.instrumentation.rl.typing.ITypeProvider
import de.cau.cs.se.instrumentation.rl.typing.PrimitiveTypeScope

class JarModelGlobalScopeProvider extends DefaultGlobalScopeProvider {
	@Inject
	private JarModelTypeProviderFactory jarModeltypeProviderFactory;
	@Inject
	private TypeProviderFactory typeProviderFactory

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

    override IScope getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
    	val IScope parentTypeScope = resource.getParentTypeScope(reference, filter, reference.getEReferenceType())
        return super.getScope(parentTypeScope, resource, false, reference.getEReferenceType(), filter)
    }

    def IScope getParentTypeScope(Resource resource, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType) {
        // check whether the reference type is a type of any kind 
        if (EcoreUtil2::isAssignableFrom(Literals::ECLASSIFIER, referenceType)) {
        	if (resource != null) {
        		val ResourceSet resourceSet = resource.getResourceSet()
    			if (resourceSet != null) {
        			val ITypeProvider typeProvider = typeProviderFactory.getTypeProvider(resourceSet)
					return new PrimitiveTypeScope(typeProvider, qualifiedNameConverter, filter)
				} else
    				throw new IllegalStateException("context must be contained in a resource set")
        	} else
    			throw new IllegalStateException("context must be contained in a resource")
        } else {
        	if (resource != null) {
        		val ResourceSet resourceSet = resource.getResourceSet()
    			if (resourceSet != null) {
        			val IJarModelTypeProvider typeProvider = jarModeltypeProviderFactory.getTypeProvider(resourceSet)
					return new JarModelTypeScope(typeProvider, qualifiedNameConverter, filter)
				} else
    				throw new IllegalStateException("context must be contained in a resource set")
        	} else
    			throw new IllegalStateException("context must be contained in a resource")
        	
        }
        	//return IScope::NULLSCOPE
        	
    }
}
