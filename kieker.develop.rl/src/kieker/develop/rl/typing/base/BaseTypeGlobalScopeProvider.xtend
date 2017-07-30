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
package kieker.develop.rl.typing.base

import com.google.common.base.Predicate
import kieker.develop.rl.recordLang.BaseType
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import kieker.develop.rl.typing.ITypeProvider
import kieker.develop.rl.generator.InternalErrorException
import org.eclipse.xtext.naming.IQualifiedNameConverter
import kieker.develop.rl.typing.IGlobalIRLScopeProvider

/**
 * Base type global scope provider.
 * 
 * @author Christian Schneider
 * @author Reiner Jung
 * @since 1.0
 */
class BaseTypeGlobalScopeProvider implements IGlobalIRLScopeProvider {
	
    override IScope getParentTypeScope(ResourceSet resourceSet, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType, IQualifiedNameConverter qualifiedNameConverter) throws InternalErrorException {
        // check whether the reference type is a type of any kind 
        if (referenceType.name.equals(BaseType.simpleName)) {
        	val ITypeProvider typeProvider = BaseTypeProviderFactory.getTypeProvider(resourceSet)
			return new BaseTypeScope(typeProvider, qualifiedNameConverter, filter)
        } else
        	return IScope::NULLSCOPE
    }
}
