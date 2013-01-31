/**
 * 
 */
package de.cau.cs.se.kieker.service.launch;

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

	private Composite tab;
	private Text kiekerConfigurationText;
	private Text projectText;
	private Label ipLabel;
	private Text ipText;
	private Label portLabel;
	private Text portText;
	private Button typeClientButton;
	private Button typeServerButton;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		tab = new Composite(parent, SWT.NONE);
		setControl(tab);

		final GridLayout layout = new GridLayout(1, true);
		tab.setLayout(layout);

		createProject();
		createServiceSetup();
		createKiekerConfigurationSetup();
	}

	/**
	 * Create UI for the configuration file for Kieker
	 */
	private void createKiekerConfigurationSetup() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Kieker Storage");

		// content
		kiekerConfigurationText = new Text(group, SWT.BORDER);
		kiekerConfigurationText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		kiekerConfigurationText.setEditable(false);

		final Button button = new Button(group, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));

		button.setText("Location ...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IFile selectedKiekerConfigutation = chooseKiekerConfiguration();
				if (selectedKiekerConfigutation != null) {
					kiekerConfigurationText.setText(selectedKiekerConfigutation.getProjectRelativePath()
							.toString());
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	/**
	 * Create UI to setup the server connectivity
	 */
	private void createServiceSetup() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		group.setText("Serivce");
		
		// group layout
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		layout.wrap = false;
		layout.fill = true;
		layout.justify = false;
		group.setLayout(layout);

		// TODO Layout sucks big time
		
		// content
		// type selection
		
		final Composite selectionGroup = new Composite(group, SWT.NULL);
		
		RowLayout selectionLayout = new RowLayout(SWT.HORIZONTAL);
		selectionLayout.wrap = false;
		selectionLayout.fill = true;
		selectionLayout.justify = false;
		selectionGroup.setLayout(selectionLayout);
		
		Label label = new Label (selectionGroup, SWT.NULL);
		label.setText("Type:");
		typeClientButton = new Button (selectionGroup, SWT.RADIO);
		typeClientButton.setText("Client");
		typeServerButton = new Button (selectionGroup, SWT.RADIO);
		typeServerButton.setText("Server");
		typeServerButton.setSelection (true); // default is server
		
		typeClientButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				typeClientButton.setSelection(true);
				typeServerButton.setSelection(false);
				ipText.setEnabled(true);
				ipLabel.setEnabled(true);
			}
		});
		typeServerButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				typeClientButton.setSelection(false);
				typeServerButton.setSelection(true);
				ipText.setEnabled(false);
				ipLabel.setEnabled(false);
			}
		});

		// connection detail
		final Composite connectionGroup = new Composite(group, SWT.NULL);
		
		RowLayout connectionLayout = new RowLayout(SWT.HORIZONTAL);
		connectionLayout.wrap = false;
		connectionLayout.fill = true;
		connectionLayout.justify = false;
		connectionGroup.setLayout(connectionLayout);
		
		ipLabel = new Label (connectionGroup, SWT.NULL);
		ipLabel.setText("IP:");
		ipLabel.setEnabled(false);
		
		ipText = new Text (connectionGroup, SWT.SINGLE | SWT.BORDER); 
		ipText.setLayoutData(new RowData (200,SWT.DEFAULT));
		ipText.setEnabled(false);
		
		portLabel = new Label (connectionGroup, SWT.NULL);
		portLabel.setText("Port:");

		portText = new Text (connectionGroup, SWT.SINGLE | SWT.BORDER); 
	}

	/**
	 * Create UI to select a project for the run configuration
	 */
	private void createProject() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// group layout
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Project");

		// content
		projectText = new Text(group, SWT.SINGLE | SWT.BORDER);
		projectText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		projectText.setEditable(false);
		final Button button = new Button(group, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));
		button.setText("Browse ...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IProject selectedProject = chooseProject();
				if (selectedProject != null) {
					projectText.setText(selectedProject.getName());
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	/**
	 * Select a projects for this run configuration
	 * 
	 * @return a reference to a project or null
	 */
	private IProject chooseProject() {
		final ILabelProvider labelProvider = new WorkbenchLabelProvider();
		final ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				getShell(), labelProvider);
		dialog.setTitle("Project Selection");
		dialog.setMessage("Select a project to constrain your search.");
		dialog.setElements(ResourcesPlugin.getWorkspace().getRoot()
				.getProjects());

		if (dialog.open() == Window.OK) {
			return (IProject) dialog.getFirstResult();
		}
		return null;
	}

	
	/**
	 * Choose a Kieker configuration file
	 * 
	 * @return returns a Kieker configuration file as IFile or null
	 */
	private IFile chooseKiekerConfiguration() {
		IProject selectedProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectText.getText());
		if (selectedProject != null) {
			FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(
					getShell(), false, selectedProject, IResource.FILE);
			dialog.setInitialPattern("*.properties");
			dialog.setTitle("Kieker Configuration File Selection");
			if (dialog.open() == Window.OK) {
				final Object[] folders = dialog.getResult();
				if (folders.length > 0)
					return (IFile) folders[0];
			}
		} else {
			String[] buttonLabels = { "OK" };
			final MessageDialog message = new MessageDialog(getShell(),
					"Select Project", null,
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
		return tab;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, "");
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_IP, "localhost");
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_PORT, 9000);
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE, "SERVER");
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG, "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			// get data from the launch configuration an pass it to the form elements
			projectText.setText(configuration.getAttribute(
					KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, ""));
			ipText.setText(configuration.getAttribute(
					KiekerServiceLaunchConfigurationDelegate.ATTR_IP, ""));
			portText.setText(Integer.toString(configuration.getAttribute(
					KiekerServiceLaunchConfigurationDelegate.ATTR_PORT, 0)));
			if (configuration.getAttribute(
					KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE, "").equals("CLIENT")) {
				typeClientButton.setSelection(true);
				typeServerButton.setSelection(false);
			} else {
				typeClientButton.setSelection(false);
				typeServerButton.setSelection(true);
			}
			kiekerConfigurationText.setText(configuration.getAttribute(
					KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG, ""));
		} catch (final CoreException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// Transfer data from the form to the launch configuration
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT,
				projectText.getText());
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG,
				kiekerConfigurationText.getText());
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_IP,
				ipText.getText());
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_PORT,
				Integer.parseInt(portText.getText()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#isValid(org.eclipse.debug
	 * .core.ILaunchConfiguration)
	 */
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		try {
			String project = launchConfig.getAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, "");
			String kiekerConfiguration = launchConfig.getAttribute(KiekerServiceLaunchConfigurationDelegate.ATTR_KIEKER_CONFIG, "");
	        if (project.equals(""))
	        	setErrorMessage("Specify a valid project.");
	        else if (ResourcesPlugin.getWorkspace().getRoot().getProject(project) == null)
	        	setErrorMessage("Project " + project + " cannot be found in the current workspace.");
	        else if (kiekerConfiguration.equals(""))
	        	setErrorMessage("Specify a Kieker configuration file.");
	        else if (!ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFile(kiekerConfiguration).exists())
	        	setErrorMessage("Kieker configuration file " + kiekerConfiguration + " cannot be found.");
	        // TODO further checks
	        else {
	        	setErrorMessage(null);
	        	return true;
	        }
        } catch (CoreException e) {
        	// TODO check if this exception results from program errors or if it is a intended result
	        // TODO Auto-generated catch block
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
