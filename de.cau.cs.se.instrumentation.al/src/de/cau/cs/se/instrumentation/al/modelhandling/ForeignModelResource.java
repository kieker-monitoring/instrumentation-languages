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
package de.cau.cs.se.instrumentation.al.modelhandling;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.StructureFactory;
import de.cau.cs.se.instrumantation.model.structure.Type;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;

/**
 * Simulates a real source by mapping the a PCM model to our model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class ForeignModelResource extends ResourceImpl {

	private final StructureFactory structure = StructureFactory.eINSTANCE;
	private final ApplicationModel applicationModel;
	private de.cau.cs.se.instrumantation.model.structure.Model resultModel;
	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param model the application model
	 */
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
	 * TODO fix documentation
	 * 
	 * @param inputStream
	 * @param options
	 * 
	 * @throws IOException
	 */
	@Override
	protected void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
		if (this.getURI() != null) {
			this.createModel();
		} else {
			try {
				throw new IOException("Malformed URI in TypeResource.onLoad");
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void createModel() {
		if (this.applicationModel != null) {

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



}
