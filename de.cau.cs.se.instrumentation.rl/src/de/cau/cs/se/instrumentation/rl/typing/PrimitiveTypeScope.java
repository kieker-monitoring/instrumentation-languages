/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.rl.typing;

import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * 
 * 
 * @author Christian Schneider
 */
public class PrimitiveTypeScope extends AbstractScope {

	private final ITypeProvider typeProvider;

	private final IQualifiedNameConverter qualifiedNameConverter;

	private final Predicate<IEObjectDescription> filter;

	protected PrimitiveTypeScope(ITypeProvider typeProvider,
			IQualifiedNameConverter qualifiedNameConverter,
			Predicate<IEObjectDescription> filter) {
		super(IScope.NULLSCOPE, false);
		this.typeProvider = typeProvider;
		this.qualifiedNameConverter = qualifiedNameConverter;
		this.filter = filter;
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		try {
			EClassifier type = typeProvider
					.findTypeByName(qualifiedNameConverter.toString(name));
			if (type == null)
				return null;
			IEObjectDescription result = EObjectDescription.create(name, type);
			if (filter != null && !filter.apply(result))
				return null;
			return result;
		} catch (IllegalArgumentException e) {
			return null;
		}
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {
		IEObjectDescription result = getSingleElement(name);
		if (result != null)
			return singleton(result);
		return emptySet();
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {
		if (object instanceof JvmIdentifiableElement) {
			final Set<IEObjectDescription> result = singleton(EObjectDescription
					.create(qualifiedNameConverter
							.toQualifiedName(((JvmIdentifiableElement) object)
									.getQualifiedName()), object));
			return filterResult(result);
		}
		return emptySet();
	}

	protected Iterable<IEObjectDescription> filterResult(
			Iterable<IEObjectDescription> unfiltered) {
		if (filter == null)
			return unfiltered;
		return Iterables.filter(unfiltered, filter);
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		return filterResult(internalGetAllElements());
	}

	protected Iterable<IEObjectDescription> internalGetAllElements() {
		List<IEObjectDescription> types = Lists.newArrayList();

		for (EClassifier t : typeProvider.getAllTypes()) {
			types.add(createScopedElement(t.getName()));
		}

		return types;
	}

	protected IEObjectDescription createScopedElement(String fullyQualifiedName) {
		InternalEObject proxy = createProxy(fullyQualifiedName);
		IEObjectDescription eObjectDescription = EObjectDescription.create(
				qualifiedNameConverter.toQualifiedName(fullyQualifiedName),
				proxy);
		return eObjectDescription;
	}

	protected InternalEObject createProxy(String fullyQualifiedName) {
		URI uri = typeProvider.getTypeUriHelper().getFullURIForClass(
				fullyQualifiedName);
		InternalEObject proxy = (InternalEObject) EcoreFactory.eINSTANCE.createEDataType();
		proxy.eSetProxyURI(uri);
		return proxy;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
