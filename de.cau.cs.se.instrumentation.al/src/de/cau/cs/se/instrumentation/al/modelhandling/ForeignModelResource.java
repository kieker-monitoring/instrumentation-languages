/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.al.modelhandling;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.Containment;
import de.cau.cs.se.instrumantation.model.structure.Method;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.ParameterModifier;
import de.cau.cs.se.instrumantation.model.structure.StructureFactory;
import de.cau.cs.se.instrumantation.model.structure.Type;
import de.cau.cs.se.instrumantation.model.structure.TypeReference;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;
import de.uka.ipd.sdq.pcm.PcmPackage;
import de.uka.ipd.sdq.pcm.core.entity.InterfaceProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.CompleteComponentType;
import de.uka.ipd.sdq.pcm.repository.CompositeComponent;
import de.uka.ipd.sdq.pcm.repository.DataType;
import de.uka.ipd.sdq.pcm.repository.Interface;
import de.uka.ipd.sdq.pcm.repository.OperationInterface;
import de.uka.ipd.sdq.pcm.repository.OperationSignature;
import de.uka.ipd.sdq.pcm.repository.Parameter;
import de.uka.ipd.sdq.pcm.repository.PrimitiveDataType;
import de.uka.ipd.sdq.pcm.repository.ProvidedRole;
import de.uka.ipd.sdq.pcm.repository.RequiredRole;

/**
 * Simulates a real source by mapping the a PCM model to our model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class ForeignModelResource extends ResourceImpl {

	private final StructureFactory structure = StructureFactory.eINSTANCE;
	private final ApplicationModel applicationModel;
	private de.cau.cs.se.instrumantation.model.structure.Model resultModel;
	private Map<String, Interface> interfaceMap;

	public ForeignModelResource(final URI uri, final ApplicationModel model) {
		super(uri);
		this.applicationModel = model;
	}

	@Override
	public EObject getEObject(final String uriFragment) {
		// System.out.println("getObject " + uriFragment);
		if (this.getContents().size() == 0) {
			// TODO Resource contents is empty, this should not happen.
			/*
			 * I debugged this issue, but could not find the cause of it. I wondered that
			 * multiple TypeProvider instances are used and therefore multiple TypeResources.
			 * However, the problem occurs after the creation of a new TypeResource when the
			 * old is accessed again. Then the contents of the resource is gone. Debugging
			 * did not provide signification insight in what and where the contents is emptied
			 * or replaced.
			 * 
			 * However, to circumvent this bug, the following code refills the content.
			 */
			// TODO reconstruct model
			this.createModel();
		}
		for (final EObject obj : this.getContents()) {
			if (uriFragment.equals(this.getURIFragment(obj))) {
				return obj;
			}
		}
		return super.getEObject(uriFragment);
	}

	@Override
	public String getURIFragment(final EObject eObject) {
		if (eObject instanceof NamedElement) {
			return ((NamedElement) eObject).getName();
		} else {
			return super.getURIFragment(eObject);
		}
	}

	@Override
	public void load(final Map<?, ?> options) throws IOException {
		if (!this.isLoaded) {
			this.doLoad(null, null);
		}
	}

	@Override
	public void save(final Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}

	/**
	 * This routine is called from ResourceImpl load after the load method above is triggered.
	 * It initialises the primitive type mirror.
	 * 
	 * The input stream is always empty in this context and the options are ignored.
	 */
	@Override
	protected void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
		try {
			if (this.getURI() != null) {
				this.createModel();
			} else {
				try {
					throw new IOException("Malformed URI in TypeResource.onLoad");
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		} catch (final Exception e) {
			throw new IOException(e.getMessage());
		}
	}

	private void createModel() {
		if (this.applicationModel != null) {
			PcmPackage.eINSTANCE.eClass();

			final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			final Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("repository", new XMIResourceFactoryImpl());

			// Obtain a new resource set
			final ResourceSet resourceSet = new ResourceSetImpl();

			// Get the resource
			final Resource source = resourceSet.getResource(URI.createPlatformResourceURI(this.applicationModel.getModel(), true), true);

			// create main result model
			this.resultModel = this.structure.createModel();
			// determine all interfaces
			this.determineInterfaces(source);
			// determine all datatypes
			this.determineDataTypes(source);
			// compose container hierarchy
			this.determineContainerHierarchy(source);
		}
	}

	/**
	 * 
	 * @param source
	 */
	private void determineContainerHierarchy(final Resource source) {
		final Iterator<EObject> iterator = source.getAllContents();
		while (iterator.hasNext()) {
			final EObject o = iterator.next();
			if ((o instanceof BasicComponent) ||
					(o instanceof CompositeComponent) ||
					(o instanceof CompleteComponentType)) {
				final String[] names = ((de.uka.ipd.sdq.pcm.core.entity.NamedElement) o).getEntityName().split("\\.");
				final EList<ProvidedRole> providedRoles = ((InterfaceProvidingRequiringEntity) o).getProvidedRoles_InterfaceProvidingEntity();
				final EList<RequiredRole> requiredRoles = ((InterfaceProvidingRequiringEntity) o).getRequiredRoles_InterfaceRequiringEntity();
				this.createNode(this.resultModel, this.resultModel.getContents(), names, 0, providedRoles, requiredRoles);
			}
		}

	}

	/**
	 * 
	 * @param source
	 */
	private void determineDataTypes(final Resource source) {
		final Iterator<EObject> iterator = source.getAllContents();
		while (iterator.hasNext()) {
			final EObject o = iterator.next();
			if (o instanceof PrimitiveDataType) {
				final PrimitiveDataType dataType = (PrimitiveDataType) o;
				if (!this.contains(this.resultModel.getTypes(), dataType.getType().getLiteral())) {
					final Type type = this.structure.createType();
					type.setName(dataType.getType().getLiteral());
					this.resultModel.getTypes().add(type);
				}
			}
		}
	}

	/**
	 * 
	 * @param types
	 * @param literal
	 * @return
	 */
	private boolean contains(final EList<Type> types, final String literal) {
		for (final Type type : types) {
			if (type.getName().equals(literal)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Determine all interfaces in the given source.
	 * 
	 * @param source
	 *            the resource containing the PCM model
	 */
	private void determineInterfaces(final Resource source) {
		this.interfaceMap = new HashMap<String, Interface>();
		final Iterator<EObject> iterator = source.getAllContents();
		while (iterator.hasNext()) {
			final EObject o = iterator.next();
			if (o instanceof Interface) {
				final Interface iface = (Interface) o;
				this.interfaceMap.put(iface.getEntityName(), iface);
			}
		}
	}

	/**
	 * 
	 * @param parent
	 * @param containers
	 * @param names
	 * @param level
	 * @param providedRoles
	 * @param requiredRoles
	 */
	private void createNode(Containment parent, final List<Container> containers, final String[] names, final int level,
			final EList<ProvidedRole> providedRoles, final EList<RequiredRole> requiredRoles) {
		for (final Container c : containers) {
			if (c.getName().equals(names[level])) {
				this.createNode(c, c.getContents(), names, level + 1, providedRoles, requiredRoles);
			}
		}

		// no node found, create one
		for (int i = level; i < names.length; i++) {
			final Container child = this.structure.createContainer();
			child.setName(names[i]);
			parent.getContents().add(child);
			this.getContents().add(child); // this line might not be necessary
			parent = child;
		}

		// add provided and required role
		for (final ProvidedRole provided : providedRoles) {
			System.out.println("provided " + provided.getEntityName());
			final Interface iface = this.interfaceMap.get(provided.getEntityName());
			final Container child = this.structure.createContainer();
			child.setName(iface.getEntityName());
			parent.getContents().add(child);
			this.getContents().add(child); // this line might not be necessary

			if (iface instanceof OperationInterface) {
				this.addMethods((OperationInterface) iface, child);
			}
		}
	}

	/**
	 * 
	 * @param iface
	 * @param container
	 */
	private void addMethods(final OperationInterface iface, final Container container) {
		for (final OperationSignature signature : iface.getSignatures__OperationInterface()) {
			final Method method = this.structure.createMethod();
			method.setName(signature.getEntityName());
			method.setReturnType(this.convertReturnType(signature.getReturnType__OperationSignature()));
			// transfer parameter
			for (final Parameter pcmParameter : signature.getParameters__OperationSignature()) {
				final de.cau.cs.se.instrumantation.model.structure.Parameter parameter = this.structure.createParameter();
				parameter.setName(pcmParameter.getParameterName());
				parameter.setModifier(this.convertParameterModifier(pcmParameter.getModifier__Parameter()));
				method.getParameters().add(parameter);
			}

			container.getMethods().add(method);
			this.contents.add(method);
		}
	}

	/**
	 * 
	 * @param pcmReturnType
	 * @return
	 */
	private TypeReference convertReturnType(final DataType pcmReturnType) {
		final TypeReference returnType = this.structure.createTypeReference();
		// TODO this is incomplete check for all different DataType
		if (pcmReturnType.getRepository__DataType() != null) {
			returnType.setType(this.findType(pcmReturnType.getRepository__DataType().getEntityName()));
		} else {
			final Type eType = this.structure.createType();
			eType.setName("EEEK");
			returnType.setType(eType);
		}
		return returnType;
	}

	/**
	 * 
	 * @param typeName
	 * @return
	 */
	private Type findType(final String typeName) {
		for (final Type type : this.resultModel.getTypes()) {
			if (type.getName().equals(typeName)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param pcmModifier
	 * @return
	 */
	private ParameterModifier convertParameterModifier(final de.uka.ipd.sdq.pcm.repository.ParameterModifier pcmModifier) {
		final ParameterModifier modifier = this.structure.createParameterModifier();
		modifier.setName(pcmModifier.getLiteral());
		return modifier;
	}

}
