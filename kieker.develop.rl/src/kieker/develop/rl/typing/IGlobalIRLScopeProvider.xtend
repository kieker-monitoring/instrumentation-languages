package kieker.develop.rl.typing

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope

import com.google.common.base.Predicate

import kieker.develop.rl.generator.InternalErrorException

interface IGlobalIRLScopeProvider {
	
	def IScope getParentTypeScope(ResourceSet resourceSet, EReference reference,
            Predicate<IEObjectDescription> filter, EClass referenceType, IQualifiedNameConverter qualifiedNameConverter) throws InternalErrorException
}