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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cau.cs.se.instrumantation.model.structure.Container;
import de.cau.cs.se.instrumantation.model.structure.ContainerModifier;
import de.cau.cs.se.instrumantation.model.structure.Containment;
import de.cau.cs.se.instrumantation.model.structure.Model;
import de.cau.cs.se.instrumantation.model.structure.NamedElement;
import de.cau.cs.se.instrumantation.model.structure.StructureFactory;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;
import de.uka.ipd.sdq.pcm.PcmPackage;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.CompleteComponentType;
import de.uka.ipd.sdq.pcm.repository.CompositeComponent;

/**
 * Simulates a real source by mapping the a PCM model to our model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class ForeignModelResource extends ResourceImpl {

	StructureFactory structure = StructureFactory.eINSTANCE;
	private ApplicationModel model;

	public ForeignModelResource(final URI uri, ApplicationModel model) {
		super(uri);
		this.model = model;
	}

	@Override
	public EObject getEObject(final String uriFragment) {
		System.out.println("getObject " + uriFragment);
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
			this.doLoad(null,null);
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
				// for (final primitiveType : PrimitiveTypes.values()) {
				// this.getContents().add(primitiveType.getEType());
				// }
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
		final Model resultModel = this.structure.createModel();
		resultModel.setName("TradingSystem");
		this.getContents().add(resultModel);
		
		if (model != null) {
			PcmPackage.eINSTANCE.eClass();
			
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("repository", new XMIResourceFactoryImpl());
			
		    // Obtain a new resource set
		    ResourceSet resourceSet = new ResourceSetImpl();
		    
			System.out.println ("model " + model);
			System.out.println ("model file " + model.getModel());
			
			// Get the resource
		    Resource source = resourceSet.getResource(URI.createFileURI(model.getModel()), true);
			
			System.out.println("source " + source);

			Iterator<EObject> iterator = source.getAllContents();
			while (iterator.hasNext()) {
				EObject o = iterator.next();
				if (o instanceof de.uka.ipd.sdq.pcm.core.entity.NamedElement) {
					String entityName = ((de.uka.ipd.sdq.pcm.core.entity.NamedElement)o).getEntityName();
					List<String> names = new ArrayList<String>();
					for (String name : entityName.split("\\.")) names.add(name);
									
					if ((o instanceof BasicComponent) ||
							(o instanceof CompositeComponent) ||
							(o instanceof CompleteComponentType)) 
						findNode(resultModel,names);
					else
						System.out.println("Node " + o.eClass());
				} else
					System.out.println("Node " + o.eClass());
			}
			System.out.println("-- done -- ");

		}
		
		// fill model
		final Container container = this.structure.createContainer();
		container.setName("Application");
		final ContainerModifier containerModifier = this.structure.createContainerModifier();
		containerModifier.setName("in");
		container.setModifier(containerModifier);
		resultModel.getContents().add(container);
		
	}

	private void findNode(Model container, List<String> names) {
		if (container.getName().equals(names.get(0))) {
			names.remove(0);
			findNode(container, container.getContents(), names);
		}
		
	}
	
	private void findNode(Containment parent, List<Container> containers, List<String> names) {
		for (Container c : containers) {
			if (c.getName().equals(names.get(0))) {
				names.remove(0);
				findNode(c,c.getContents(),names);
			}
		}
		
		// no node found, create one
		final Container container = this.structure.createContainer();
		container.setName(names.get(0));
		parent.getContents().add(container);
		this.getContents().add(container); // this line might not be necessary
		
		names.remove(0);
		parent = container;
		
		for (String name : names) {
			final Container child = this.structure.createContainer();
			child.setName(name);
			parent.getContents().add(child);
			this.getContents().add(child); // this line might not be necessary
			parent = container;
		}
	}
}
