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
package kieker.develop.rl.cli.typing.library

import com.google.common.base.Predicate
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.TemplateType
import kieker.develop.rl.typing.ITypeProvider
import kieker.develop.rl.typing.library.ILibraryModelGlobalScopeProvider
import kieker.develop.rl.typing.library.JarModelTypeScope
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

/**
 * Provider for the global scope for models for JAR files.
 * 
 * @author Yannic Kropp -- initial contribution
 * @author Reiner Jung
 * @since 1.2
 */
class GuavaModelGlobalScopeProvider implements ILibraryModelGlobalScopeProvider {

	override IScope getParentTypeScope(ResourceSet resourceSet, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType, IQualifiedNameConverter qualifiedNameConverter) throws InternalErrorException {
        if (referenceType.name.equals(TemplateType.simpleName) 
        	|| referenceType.name.equals(EventType.simpleName)) {
	   		try {
	    		val ITypeProvider typeProvider = GuavaModelTypeProviderFactory.getTypeProvider(resourceSet)
	    		return new JarModelTypeScope(typeProvider, qualifiedNameConverter, filter)
			} catch (IllegalStateException e) {
				System.out.println("No workspace present")
				return IScope.NULLSCOPE
			}
        } else
        	return IScope.NULLSCOPE
        	
    }
}
