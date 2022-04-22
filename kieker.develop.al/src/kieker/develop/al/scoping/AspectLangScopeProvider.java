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
package kieker.develop.al.scoping;

import com.google.inject.Inject;
import kieker.develop.al.aspectLang.ApplicationModelHandle;
import kieker.develop.al.aspectLang.CompositionQuery;
import kieker.develop.al.aspectLang.ContainerNode;
import kieker.develop.al.aspectLang.LocationQuery;
import kieker.develop.al.aspectLang.Node;
import kieker.develop.al.aspectLang.OperationQuery;
import kieker.develop.al.aspectLang.ParameterQuery;
import kieker.develop.al.aspectLang.Property;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.mapping.Container;
import kieker.develop.al.mapping.Feature;
import kieker.develop.al.mapping.Operation;
import kieker.develop.al.modelhandling.IForeignModelTypeProvider;
import kieker.develop.al.modelhandling.ForeignModelTypeProviderFactory;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Extension;

import kieker.develop.al.aspectLang.SubQuery;
import kieker.develop.al.aspectLang.Annotation;
import kieker.develop.rl.generator.InternalErrorException;
import kieker.develop.rl.typing.semantics.SemanticAnnotationProvider;
import kieker.develop.rl.typing.semantics.SemanticAnnotationProviderFactory;

/**
 * This class contains custom scoping description.
 * 
 * see : https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it 
 * 
 * @author Reiner Jung
 * 
 * @since 1.0
 */
public class AspectLangScopeProvider extends AbstractAspectLangScopeProvider {
	
	@Inject
    @Extension
	private ForeignModelTypeProviderFactory typeProviderFactory;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		final IScope scope;
		try {
			if (context instanceof ContainerNode) {
				scope = scope_ContainerNode_container((ContainerNode)context, reference);
			} else if (context instanceof Annotation) {
				scope = scope_Annotation_technologies((Annotation)context, reference);
			} else if (context instanceof Pointcut) {
				if ("returnType".equals(reference.getName())) 
					scope = scope_Pointcut_returnType((Pointcut)context, reference);
				else if ("method".equals(reference.getName()))
					scope = scope_Pointcut_method((Pointcut)context, reference);
				else
					scope = null;
			} else if (context instanceof Property) {
				scope = scope_Property_annotation((Property)context, reference);
			} else if (context instanceof ParameterQuery) {
				if ("modifier".equals(reference.getName()))
					scope = scope_ParameterQuery_modifier((ParameterQuery)context, reference);
				else if ("type".equals(reference.getName()))
					scope = scope_ParameterQuery_type((ParameterQuery)context, reference);
				else if ("parameter".equals(reference.getName()))
					scope = scope_ParameterQuery_parameter((ParameterQuery)context, reference);
				else
					scope = null;
			} else
				scope = null;
			if (scope == null) {
				return super.getScope(context, reference);
			} else
				return scope;
		} catch(InternalErrorException ex) {
			return super.getScope(context, reference);			
		}
	}
	
	public IScope scope_ContainerNode_container(ContainerNode context, EReference reference) throws InternalErrorException {
		if (context.eContainer() instanceof LocationQuery) {
			EObject contextParent = ((LocationQuery)context.eContainer()).eContainer();
			
			if (contextParent instanceof CompositionQuery)
				return createLocationScope(((LocationQuery)contextParent.eContainer()).getNode());
			else if (contextParent instanceof LocationQuery)
				return createLocationScope(((LocationQuery)contextParent).getNode());
			else if (contextParent instanceof Pointcut)
				return createModelScope(((Pointcut)contextParent).getModel(),context.eResource().getResourceSet());
			else if (contextParent instanceof SubQuery)
				return createSubQueryScope(((CompositionQuery)contextParent.eContainer()));
			else
				return null;
		} else {	
			return null;
		}
	}
	
	private IScope scope_Annotation_technologies(Annotation context, EReference reference) {
		SemanticAnnotationProvider provider = SemanticAnnotationProviderFactory.getProvider(context.eResource().getResourceSet());
		return Scopes.scopeFor(provider.getAllTechnologies());
	}
			
	private IScope createModelScope(ApplicationModelHandle model, ResourceSet resourceSet) throws InternalErrorException {
		IForeignModelTypeProvider typeProvider = typeProviderFactory.getTypeProvider(resourceSet, model);
		return Scopes.scopeFor(typeProvider.getAllTypes());
	}
	
	
	private IScope createSubQueryScope(CompositionQuery context) {
		return createLocationScope(((LocationQuery)context.eContainer()).getNode());
	}
	
	
	/**
	 * Find the correct scope for the given node.
	 */
	private IScope createLocationScope(Node node) {
		if (node instanceof ContainerNode) {
			Object feature = ((ContainerNode)node).getContainer();
			if (feature instanceof Container)
				return Scopes.scopeFor(((Container)feature).getContents());
		}
		
		return null; // null required here to cascade to default resolver
		
	}
	
	private IScope scope_Pointcut_returnType(Pointcut context, EReference reference) throws InternalErrorException {
		Node node = leaveNode(context.getLocation());
		if (node instanceof ContainerNode) {
			IForeignModelTypeProvider typeProvider = typeProviderFactory.getTypeProvider(context.eResource().getResourceSet(), null);
			return Scopes.scopeFor(typeProvider.getAllDataTyes());
		} else {
			return IScope.NULLSCOPE;
		}
	}
	
	private IScope scope_Pointcut_method(Pointcut context, EReference reference) {
		Node node = leaveNode(context.getLocation());
		if (node instanceof ContainerNode) {
			Feature container = ((ContainerNode)node).getContainer();
			if (container instanceof Container)
				return Scopes.scopeFor(((Container)container).getOperations());
			else
				return IScope.NULLSCOPE;
		} else {
			return IScope.NULLSCOPE;
		}
	}
	
	/**
	 * Provide scope for semantic annotations.
	 */
	private IScope scope_Property_annotation(Property context, EReference reference) {
		SemanticAnnotationProvider annotationsProvider = SemanticAnnotationProviderFactory.getProvider(context.eResource().getResourceSet());
		return Scopes.scopeFor(annotationsProvider.getAllAnnotations());
	}
		
	private IScope scope_ParameterQuery_modifier(ParameterQuery context, EReference reference) {
		// TODO modifier lookup
		return IScope.NULLSCOPE;
	}
	
	private IScope scope_ParameterQuery_type(ParameterQuery context, EReference reference) throws InternalErrorException {
		IForeignModelTypeProvider typeProvider = typeProviderFactory.getTypeProvider(context.eResource().getResourceSet(), null);
		return Scopes.scopeFor(typeProvider.getAllDataTyes());
	}
	
	private IScope scope_ParameterQuery_parameter(ParameterQuery context, EReference reference) {
		Operation operation = ((OperationQuery)context.eContainer()).getOperationReference();
		return Scopes.scopeFor(operation.getParameters());
	}
	
	private Node leaveNode(LocationQuery query) {
		if (query.getSpecialization() != null)
			return leaveNode(query.getSpecialization());
		else
			return query.getNode();
	}
		
}


