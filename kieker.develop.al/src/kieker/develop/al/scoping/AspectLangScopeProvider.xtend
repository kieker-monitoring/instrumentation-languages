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
package kieker.develop.al.scoping

import com.google.inject.Inject
import kieker.develop.al.aspectLang.ApplicationModel
import kieker.develop.al.aspectLang.CompositionQuery
import kieker.develop.al.aspectLang.ContainerNode
import kieker.develop.al.aspectLang.LocationQuery
import kieker.develop.al.aspectLang.Node
import kieker.develop.al.aspectLang.OperationQuery
import kieker.develop.al.aspectLang.ParameterQuery
import kieker.develop.al.aspectLang.Pointcut
import kieker.develop.al.mapping.Container
import kieker.develop.al.mapping.Operation
import kieker.develop.al.modelhandling.ForeignModelTypeProviderFactory
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class AspectLangScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Inject extension ForeignModelTypeProviderFactory typeProviderFactory
	
	def IScope scope_ContainerNode_container(ContainerNode context, EReference reference) {
		if (context.eContainer instanceof LocationQuery) {
			val location = (context.eContainer as LocationQuery).eContainer
			
			switch(location) {
				CompositionQuery: return (location.eContainer as LocationQuery).node.createLocationScope
				LocationQuery: return location.node.createLocationScope
				Pointcut: return location.model.createModelScope(context.eResource.resourceSet)
				default: return null
			}
			
		} else		
			return null
	}
	
	private def IScope createModelScope(ApplicationModel model, ResourceSet resourceSet) {
		val typeProvider = typeProviderFactory.getTypeProvider(resourceSet, model)
		return Scopes.scopeFor(typeProvider.allTypes)
	}
	
	
	private def IScope createLocationScope(Node node) {
		switch(node) {
			ContainerNode: {
				val feature = node.container
				switch(feature) {
					Container: return Scopes.scopeFor(feature.contents)
				}
			}
		}
		
		return null // null required here to cascade to default resolver
		
	}
	
	def IScope scope_Pointcut_returnType(Pointcut context, EReference reference) {
		val Node node = context.location.leaveNode
		if (node instanceof ContainerNode) {
			val typeProvider = typeProviderFactory.getTypeProvider(context.eResource.resourceSet, null)
			return Scopes.scopeFor(typeProvider.allDataTyes)
		} else {
			return IScope.NULLSCOPE
		}
	}
	
	def IScope scope_Pointcut_method(Pointcut context, EReference reference) {
		val Node node = context.location.leaveNode
		if (node instanceof ContainerNode) {
			val container = (node as ContainerNode).container
			if (container instanceof Container)
				return Scopes.scopeFor(container.operations)
			else
				return IScope.NULLSCOPE
		} else {
			return IScope.NULLSCOPE
		}
	}
		
	def IScope scope_ParameterQuery_modifier(ParameterQuery context, EReference reference) {
		// TODO modifier lookup
		return IScope.NULLSCOPE
	}
	
	def IScope scope_ParameterQuery_type(ParameterQuery context, EReference reference) {
		val typeProvider = typeProviderFactory.getTypeProvider(context.eResource.resourceSet, null)
		return Scopes.scopeFor(typeProvider.allDataTyes)
	}
	
	def IScope scope_ParameterQuery_parameter(ParameterQuery context, EReference reference) {
		val Operation operation = (context.eContainer as OperationQuery).operationReference
		return Scopes.scopeFor(operation.parameters)
	}
	

	
	private def Node leaveNode(LocationQuery query) {
		if (query.specialization != null)
			query.specialization.leaveNode
		else
			query.node
	}
		
}


