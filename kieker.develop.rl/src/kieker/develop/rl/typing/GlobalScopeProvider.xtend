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
package kieker.develop.rl.typing

import com.google.common.base.Predicate
import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.eclipse.emf.ecore.EClass
import kieker.develop.rl.typing.base.BaseTypeGlobalScopeProvider
import kieker.develop.rl.typing.semantics.SemanticAnnotationGlobalScopeProvider
import org.eclipse.emf.ecore.resource.ResourceSet
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.typing.library.ILibraryModelGlobalScopeProvider

/**
 * Umbrella class for all global scopes.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
public class GlobalScopeProvider extends DefaultGlobalScopeProvider {

	@Inject
	protected IQualifiedNameConverter qualifiedNameConverter
	
	@Inject
	private BaseTypeGlobalScopeProvider baseTypeGlobalScopeProvider
	
	@Inject
	private ILibraryModelGlobalScopeProvider libraryGlobalScopeProvider
	
	@Inject
	private SemanticAnnotationGlobalScopeProvider semanticAnnotationGlobalScopeProvider

	override IScope	getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
        val IScope parentTypeScope = resource.getParentTypeScope(reference, filter, reference.getEReferenceType());
        return super.getScope(parentTypeScope, resource, false, reference.getEReferenceType(), filter)
	}
	
	private def IScope getParentTypeScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter, EClass referenceType) {
		if (resource !== null) {
       		val ResourceSet resourceSet = resource.getResourceSet()
    		if (resourceSet !== null) {
				val scope = baseTypeGlobalScopeProvider.getParentTypeScope(resourceSet, reference, filter, referenceType, qualifiedNameConverter)
				if (scope === IScope.NULLSCOPE) {
					val libraryScope = libraryGlobalScopeProvider.getParentTypeScope(resourceSet, reference, filter, referenceType, qualifiedNameConverter)
					if (libraryScope === IScope.NULLSCOPE) {
						return semanticAnnotationGlobalScopeProvider.getParentTypeScope(resourceSet, reference, filter, referenceType, qualifiedNameConverter)
					} else
						return libraryScope
				} else
					return scope
			} else
    			throw new InternalErrorException("context must be contained in a resource set") 
       	} else
   			throw new InternalErrorException("context must be contained in a resource") 
	}

}
