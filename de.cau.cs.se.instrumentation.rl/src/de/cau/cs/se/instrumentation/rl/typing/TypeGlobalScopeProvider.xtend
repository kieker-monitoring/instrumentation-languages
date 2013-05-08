package de.cau.cs.se.instrumentation.rl.typing

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EClassifier

class TypeGlobalScopeProvider extends DefaultGlobalScopeProvider {
	@Inject
	private TypeProviderFactory typeProviderFactory;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

    override IScope getScope(Resource resource, EReference reference, Predicate filter) {
            val IScope parentTypeScope = resource.getParentTypeScope(reference, filter, reference.getEReferenceType());
            return super.getScope(parentTypeScope, resource, false, reference.getEReferenceType(), filter);
    }

    def IScope getParentTypeScope(Resource resource, EReference reference,
            Predicate filter, EClass referenceType) {
            	val top = EcoreFactory::eINSTANCE.createEClass()
        if (EcoreUtil2::isAssignableFrom(top, referenceType)) {
        	if (resource != null) {
        		val ResourceSet resourceSet = resource.getResourceSet()
    			if (resourceSet != null) {
        			val ITypeProvider typeProvider = typeProviderFactory.getTypeProvider(resourceSet)
					return new PrimitiveTypeScope(typeProvider, qualifiedNameConverter, filter)
				} else
    				throw new IllegalStateException("context must be contained in a resource set")
        	} else
    			throw new IllegalStateException("context must be contained in a resource")
        } else
        	return IScope::NULLSCOPE
    }
}