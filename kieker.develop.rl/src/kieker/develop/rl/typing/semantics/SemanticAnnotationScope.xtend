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
package kieker.develop.rl.typing.semantics

import com.google.common.base.Predicate
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope
import java.util.ArrayList
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.xtext.resource.EObjectDescription
import kieker.develop.semantics.annotations.AnnotationsFactory

/**
 * Scope for semantic annotations.
 * 
 * @author Reiner Jung
 * @since 1.3
 */
class SemanticAnnotationScope extends AbstractScope {
	
	private val SemanticAnnotationProvider semanticAnnotationProvider;

	private val IQualifiedNameConverter qualifiedNameConverter;

	private val Predicate<IEObjectDescription> filter;
	
	new(SemanticAnnotationProvider semanticAnnotationProvider, IQualifiedNameConverter qualifiedNameConverter, 
		Predicate<IEObjectDescription> filter) {
		super(IScope.NULLSCOPE, false)
		this.semanticAnnotationProvider = semanticAnnotationProvider
		this.qualifiedNameConverter = qualifiedNameConverter
		this.filter = filter		
	}
	
	override protected getAllLocalElements() {
		val annotations = new ArrayList<IEObjectDescription>

		this.semanticAnnotationProvider.allAnnotations.forEach[
			annotations.add(this.createScopedElement(it.getName()))
		]
		
		return annotations
	}
	
	private def IEObjectDescription createScopedElement(String fullyQualifiedName) {
		val InternalEObject proxy = this.createProxy(fullyQualifiedName)
		val IEObjectDescription eObjectDescription = EObjectDescription.create(
				this.qualifiedNameConverter.toQualifiedName(fullyQualifiedName),
				proxy);
		return eObjectDescription
	}
	
	private def InternalEObject createProxy(String fullyQualifiedName) {
		val uri = semanticAnnotationProvider.getFullURIForClass(fullyQualifiedName)
		// TODO fix this: could be component or interface or method?
		val InternalEObject proxy = AnnotationsFactory.eINSTANCE.createAnnotation() as InternalEObject
		proxy.eSetProxyURI(uri)
		return proxy
	}
}