/***************************************************************************
 * Copyright 2013 by
 *  + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *      + Software Engineering Group 
 *  and others.
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
package de.cau.cs.se.kieker.service.eclipse.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author rju
 * 
 */
public class ServiceSetupTab extends AbstractLaunchConfigurationTab {

	private static final int SERVICE_TYPES = ServiceTypes.values().length;

	private Composite tab;
	private Text kiekerConfigurationText;
	private Text projectText;
	private Text clientIpText;
	private Text clientPortText;
	private Text serverPortText;
	private Text jmsPortText;
	
	private StackLayout stackLayout;

	private Composite serverParameterForm;
	private Composite clientParameterForm;
	private Composite jmsParameterForm;
	private Composite jmsEmbeddedParameterForm;

	private Button[] serviceTypeButtons;

	private Text jmsURLText;

	private Text jmsUserText;

	private Text jmsPasswordText;

	/**
	 * Empty default constructor (checkstyle proposition).
	 */
	public ServiceSetupTab() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		this.tab = new Composite(parent, SWT.NONE);
		setControl(this.tab);

		final GridLayout layout = new GridLayout(1, true);
		this.tab.setLayout(layout);

		createProject();
		createServiceSetup();
		createKiekerConfigurationSetup();
	}

	/**
	 * Create UI for the configuration file for Kieker.
	 */
	private void createKiekerConfigurationSetup() {
		final Group group = new Group(this.tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Kieker Storage");

		// content
		this.kiekerConfigurationText = new Text(group, SWT.BORDER);
		this.kiekerConfigurationText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.kiekerConfigurationText.setEditable(false);

		final Button button = new Button(group, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));

		button.setText("Location ...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final IFile selectedKiekerConfigutation = chooseKiekerConfiguration();
				if (selectedKiekerConfigutation != null) {
					// CHECKSTYLE:OFF this. not allowed
					kiekerConfigurationText.setText(selectedKiekerConfigutation
					        .getProjectRelativePath().toString());
					// CHECKSTYLE:ON
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	/**
	 * Create UI to setup the server connectivity.
	 */
	private void createServiceSetup() {
		final Group group = new Group(this.tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Serivce");

		// group layout
		final RowLayout layout = new RowLayout(SWT.VERTICAL);
		layout.wrap = false;
		layout.fill = true;
		layout.justify = false;
		group.setLayout(layout);

		// TODO Layout sucks big time

		// content
		// type selection

		final Composite selectionGroup = new Composite(group, SWT.NULL);

		final RowLayout selectionLayout = new RowLayout(SWT.HORIZONTAL);
		selectionLayout.wrap = false;
		selectionLayout.fill = true;
		selectionLayout.justify = false;
		selectionGroup.setLayout(selectionLayout);

		final Label label = new Label(selectionGroup, SWT.NULL);
		label.setText("Type:");

		// composite + stack layout for connection property form
		final Composite connectionGroup = new Composite(group, SWT.NULL);
		this.stackLayout = new StackLayout();
		connectionGroup.setLayout(this.stackLayout);

		this.serviceTypeButtons = new Button[SERVICE_TYPES];
		int typeCount = 0;
		for (ServiceTypes type : ServiceTypes.values()) {
			this.serviceTypeButtons[typeCount] = new Button(selectionGroup, SWT.RADIO);
			this.serviceTypeButtons[typeCount].setText(type.getLabel());
			this.serviceTypeButtons[typeCount].setData("type", type);
			this.serviceTypeButtons[typeCount].addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(final SelectionEvent event) {
					// CHECKSTYLE:OFF this not useful here
					for (Button button : serviceTypeButtons) {
						button.setSelection(false);
					}
					((Button) event.getSource()).setSelection(true);
					// attach the required form part
					updateServiceForm((ServiceTypes)((Button) event.getSource()).getData("type"));
					// CHECKSTYLE:ON
					connectionGroup.layout();
					updateLaunchConfigurationDialog();
				}
			});
			typeCount++;
		}

		// connection form elements
		createServerSetup(connectionGroup);
		createClientSetup(connectionGroup);
		createJMSSetup(connectionGroup);
		createJMSEmbeddedSetup(connectionGroup);

		// default is server
		this.serviceTypeButtons[ServiceTypes.TCP_SERVER.ordinal()].setSelection(true);
		stackLayout.topControl = this.serverParameterForm;
		connectionGroup.layout();
	}

	/**
	 * Select the service form fragment for the given service type.
	 *  
	 * @param serviceTypes the given service type
	 */
	protected void updateServiceForm(ServiceTypes serviceTypes) {
		switch (serviceTypes) {
		case TCP_SERVER:
			this.stackLayout.topControl = this.serverParameterForm;
			break;
		case TCP_MULTI_SERVER:
			this.stackLayout.topControl = this.serverParameterForm;
			break;
		case TCP_CLIENT:
			this.stackLayout.topControl = this.clientParameterForm;
			break;
		case JMS_CLIENT:
			this.stackLayout.topControl = this.jmsParameterForm;
			break;
		case JMS_EMBEDDED:
			this.stackLayout.topControl = this.jmsEmbeddedParameterForm;
			break;
		default:
			break;
		}
    }

	/**
	 * Setup form snippet for JMSEmbedded.
	 * 
	 * @param group
	 *            parent composite
	 */
	private void createJMSEmbeddedSetup(final Composite group) {
		this.jmsEmbeddedParameterForm = new Composite(group, SWT.NULL);

		final RowLayout connectionLayout = new RowLayout(SWT.HORIZONTAL);
		connectionLayout.wrap = false;
		connectionLayout.fill = true;
		connectionLayout.justify = false;
		this.jmsEmbeddedParameterForm.setLayout(connectionLayout);

		final Label label = new Label(this.jmsEmbeddedParameterForm, SWT.NULL);
		label.setText("Port:");

		this.jmsPortText = new Text(this.jmsEmbeddedParameterForm, SWT.SINGLE | SWT.BORDER);
	}

	/**
	 * Setup form snippet for JMS.
	 * 
	 * @param group
	 *            parent composite
	 */
	private void createJMSSetup(final Composite group) {
		this.jmsParameterForm = new Composite(group, SWT.NULL);

		final RowLayout connectionLayout = new RowLayout(SWT.HORIZONTAL);
		connectionLayout.wrap = false;
		connectionLayout.fill = true;
		connectionLayout.justify = false;
		this.jmsParameterForm.setLayout(connectionLayout);

		Label label = new Label(this.jmsParameterForm, SWT.NULL);
		label.setText("User:");

		this.jmsUserText = new Text(this.jmsParameterForm, SWT.SINGLE | SWT.BORDER);

		label = new Label(this.jmsParameterForm, SWT.NULL);
		label.setText("Password:");

		this.jmsPasswordText = new Text(this.jmsParameterForm, SWT.SINGLE | SWT.BORDER);
		this.jmsPasswordText.setEchoChar('*');

		label = new Label(this.jmsParameterForm, SWT.NULL);
		label.setText("URL:");

		this.jmsURLText = new Text(this.jmsParameterForm, SWT.SINGLE | SWT.BORDER);
		this.jmsURLText.setLayoutData(new RowData(150, SWT.DEFAULT));
	}

	/**
	 * Setup form snippet for TCP Server.
	 * 
	 * @param group
	 *            parent composite
	 */
	private void createServerSetup(final Composite group) {
		this.serverParameterForm = new Composite(group, SWT.NULL);

		final RowLayout connectionLayout = new RowLayout(SWT.HORIZONTAL);
		connectionLayout.wrap = false;
		connectionLayout.fill = true;
		connectionLayout.justify = false;
		this.serverParameterForm.setLayout(connectionLayout);

		final Label label = new Label(this.serverParameterForm, SWT.NULL);
		label.setText("Port:");

		this.serverPortText = new Text(this.serverParameterForm, SWT.SINGLE | SWT.BORDER);
	}

	/**
	 * Setup form snippet for TCP Client.
	 * 
	 * @param group
	 *            parent composite
	 */
	private void createClientSetup(final Composite group) {
		this.clientParameterForm = new Composite(group, SWT.NULL);

		final RowLayout connectionLayout = new RowLayout(SWT.HORIZONTAL);
		connectionLayout.wrap = false;
		connectionLayout.fill = true;
		connectionLayout.justify = false;
		this.clientParameterForm.setLayout(connectionLayout);

		Label label = new Label(this.clientParameterForm, SWT.NULL);
		label.setText("IP:");
		label.setEnabled(false);

		this.clientIpText = new Text(this.clientParameterForm, SWT.SINGLE | SWT.BORDER);
		this.clientIpText.setLayoutData(new RowData(200, SWT.DEFAULT));
		this.clientIpText.setEnabled(false);

		label = new Label(this.clientParameterForm, SWT.NULL);
		label.setText("Port:");

		this.clientPortText = new Text(this.clientParameterForm, SWT.SINGLE | SWT.BORDER);
	}

	/**
	 * Create UI to select a project for the run configuration.
	 */
	private void createProject() {
		final Group group = new Group(this.tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// group layout
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Project");

		// content
		this.projectText = new Text(group, SWT.SINGLE | SWT.BORDER);
		this.projectText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.projectText.setEditable(false);
		final Button button = new Button(group, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));
		button.setText("Browse ...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final IProject selectedProject = chooseProject();
				if (selectedProject != null) {
					// CHECKSTYLE:OFF this. not allowed
					projectText.setText(selectedProject.getName());
					// CHECKSTYLE:ON
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	/**
	 * Select a projects for this run configuration.
	 * 
	 * @return a reference to a project or null
	 */
	private IProject chooseProject() {
		final ILabelProvider labelProvider = new WorkbenchLabelProvider();
		final ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(),
		        labelProvider);
		dialog.setTitle("Project Selection");
		dialog.setMessage("Select a project to constrain your search.");
		dialog.setElements(ResourcesPlugin.getWorkspace().getRoot().getProjects());

		if (dialog.open() == Window.OK) {
			return (IProject) dialog.getFirstResult();
		}
		return null;
	}

	/**
	 * Choose a Kieker configuration file.
	 * 
	 * @return returns a Kieker configuration file as IFile or null
	 */
	private IFile chooseKiekerConfiguration() {
		final IProject selectedProject = ResourcesPlugin.getWorkspace().getRoot()
		        .getProject(this.projectText.getText());
		if (selectedProject != null) {
			final FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(
			        getShell(), false, selectedProject, IResource.FILE);
			dialog.setInitialPattern("*.properties");
			dialog.setTitle("Kieker Configuration File Selection");
			if (dialog.open() == Window.OK) {
				final Object[] folders = dialog.getResult();
				if (folders.length > 0) {
					return (IFile) folders[0];
				}
			}
		} else {
			final String[] buttonLabels = { "OK" };
			final MessageDialog message = new MessageDialog(getShell(), "Select Project", null,
			        "You have to select a project first", 0, buttonLabels, 0);
			message.open();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getControl()
	 */
	@Override
	public Control getControl() {
		return this.tab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, "");
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_IP, "localhost");
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_CLIENT_PORT, 9000);
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_SERVER_PORT, 9000);
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_JMS_PORT, 9000);
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE,
		        ServiceTypes.TCP_SERVER.name());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG, "");
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_USER, "");
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_PASSWORD, "");
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_URL, "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(final ILaunchConfiguration configuration) {
		try {
			// get data from the launch configuration an pass it to the form elements
			this.projectText.setText(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, ""));
			this.clientIpText.setText(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_IP, ""));
			this.clientPortText.setText(Integer.toString(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_CLIENT_PORT, 0)));
			this.serverPortText.setText(Integer.toString(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_SERVER_PORT, 0)));
			this.jmsPortText.setText(Integer.toString(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_JMS_PORT, 0)));
			this.jmsUserText.setText(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_USER, ""));
			this.jmsPasswordText.setText(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_PASSWORD, ""));
			this.jmsURLText.setText(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_URL, ""));
			final String typeName = configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE, "");
			for (final Button button : this.serviceTypeButtons) {
				button.setSelection(false);
			}
			try {
				this.serviceTypeButtons[ServiceTypes.valueOf(typeName).ordinal()]
				        .setSelection(true);
				updateServiceForm(ServiceTypes.valueOf(typeName));
			} catch (IllegalArgumentException e) {
				// the typeName refers not to a enumeration value
				this.serviceTypeButtons[ServiceTypes.TCP_SERVER.ordinal()].setSelection(true);
				updateServiceForm(ServiceTypes.TCP_SERVER);
			}

			this.kiekerConfigurationText.setText(configuration.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG, ""));
		} catch (final CoreException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		// Transfer data from the form to the launch configuration
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT,
		        this.projectText.getText());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG,
		        this.kiekerConfigurationText.getText());
		// set type, if none is specified (which is an error), set the default
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE,
		        ServiceTypes.TCP_SERVER.name());
		for (final Button button : this.serviceTypeButtons) {
			if (button.getSelection()) {
				configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE,
				        ((ServiceTypes) button.getData("type")).name());
				break;
			}
		}

		// JMS client
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_USER,
		        this.jmsUserText.getText());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_PASSWORD,
		        this.jmsPasswordText.getText());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_URL,
		        this.jmsURLText.getText());
		// JMS embedded
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_JMS_PORT,
		        parseInt(this.jmsPortText.getText()));
		// TCP client
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_IP,
		        this.clientIpText.getText());
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_CLIENT_PORT,
		        parseInt(this.clientPortText.getText()));
		// TCP server
		configuration.setAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_SERVER_PORT,
		        parseInt(this.serverPortText.getText()));

	}

	/**
	 * Parse a string for an integer and return either the integer or 0.
	 * 
	 * @param string
	 *            the port number as string
	 * @return Returns port number as integer (0 = no port)
	 */
	private int parseInt(final String string) {
		try {
			return Integer.parseInt(string);
		} catch (java.lang.NumberFormatException e) {
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(org.eclipse.debug
	 * .core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		try {
			final String project = launchConfig.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, "");
			final String kiekerConfiguration = launchConfig.getAttribute(
			        KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG, "");
			if ("".equals(project)) {
				setErrorMessage("Specify a valid project.");
			} else if (ResourcesPlugin.getWorkspace().getRoot().getProject(project) == null) {
				setErrorMessage("Project " + project + " cannot be found in the current workspace.");
			} else if ("".equals(kiekerConfiguration)) {
				setErrorMessage("Specify a Kieker configuration file.");
			} else if (!ResourcesPlugin.getWorkspace().getRoot().getProject(project)
			        .getFile(kiekerConfiguration).exists()) {
				setErrorMessage("Kieker configuration file " + kiekerConfiguration
				        + " cannot be found.");
				// TODO further checks
			} else {
				setErrorMessage(null);
				return true;
			}
		} catch (CoreException e) {
			// TODO check if this exception results from program errors or if it is a intended
			// result
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#canSave()
	 */
	@Override
	public boolean canSave() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return "Main";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getImage()
	 */
	@Override
	public Image getImage() {
		// FIXME make it fancy and add an image
		return null;
	}

}
