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
package de.cau.cs.se.instrumentation.al.scoping

import com.google.inject.Inject

import de.cau.cs.se.instrumentation.al.aspectLang.Query
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery
import de.cau.cs.se.instrumentation.al.aspectLang.Node
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern
import de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage
import de.cau.cs.se.instrumentation.al.modelhandling.ForeignModelTypeProviderFactory
import de.cau.cs.se.instrumantation.model.structure.Method

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class AspectLangScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
	
	@Inject extension ForeignModelTypeProviderFactory typeProviderFactory
	
	def IScope scope_ContainerNode_container(ContainerNode context, EReference reference) {
		if (context.eContainer.eContainer instanceof LocationQuery) {
			val typeProvider = typeProviderFactory.getTypeProvider(context.eResource.resourceSet, null)
			val IScope result = new ContainerParentScope(typeProvider.allTypes, context)   
			return result
		} else {
			return null // null required here to cascade to default resolver
		}
	}

	def IScope scope_Query_returnType(Query context, EReference reference) {
		val Node node = context.location.leaveNode
		if (node instanceof ContainerNode) {
			val typeProvider = typeProviderFactory.getTypeProvider(context.eResource.resourceSet, null)
			return Scopes.scopeFor(typeProvider.allDataTyes)
		} else {
			return IScope.NULLSCOPE
		}
	}
	
	def IScope scope_Query_method(Query context, EReference reference) {
		val Node node = context.location.leaveNode
		if (node instanceof ContainerNode) {
			return Scopes.scopeFor((node as ContainerNode).container.methods)
		} else {
			return IScope.NULLSCOPE
		}
	}
	
	def IScope scope_ParameterPattern_modifier(ParameterPattern context, EReference reference) {
		// TODO modifier lookup
		return IScope.NULLSCOPE
	}
	
	def IScope scope_ParameterPattern_type(ParameterPattern context, EReference reference) {
		val typeProvider = typeProviderFactory.getTypeProvider(context.eResource.resourceSet, null)
		return Scopes.scopeFor(typeProvider.allDataTyes)
	}
	
	def IScope scope_ParameterPattern_parameter(ParameterPattern context, EReference reference) {
		val Method method = (context.eContainer as Query).method
		return Scopes.scopeFor(method.parameters)
	}
	
	private def Node leaveNode(LocationQuery query) {
		if (query.specialization != null)
			query.specialization.leaveNode
		else
			query.node
	}
	
		/**
	 * Find scope for the package property in the MetaModel rule.
	 * 
	 * @param context
	 *            The Package-object of the resulting model.
	 * @param reference
	 *            The EReference-reference object of the AST.
	 * @return The scope for the package attribute.
	 */
	def IScope scope_RegisteredPackage_ePackage(RegisteredPackage context, EReference reference) {
		val IScope result = new EPackageScope(context.eResource().getResourceSet())
		return result
	}
	
}


