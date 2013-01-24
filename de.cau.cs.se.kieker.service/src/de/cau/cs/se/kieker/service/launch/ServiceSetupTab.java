/**
 * 
 */
package de.cau.cs.se.kieker.service.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author rju
 * 
 */
public class ServiceSetupTab extends AbstractLaunchConfigurationTab {

	private Composite tab;
	private Text logText;
	private Text projectText;
	private Text setupText;
	private Text samplingText;
	private IProject selectedProject;
	private IFile selectedSetup;
	private IFolder selectedLog;

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
	}

	private void createLogging() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Logging");

		// content
		logText = new Text(group, SWT.BORDER);
		logText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		logText.setEditable(false);

		final Button button = new Button(group, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));

		button.setText("Location ...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedLog = chooseLog();
				if (selectedLog != null) {
					logText.setText(selectedLog.getProjectRelativePath()
							.toString());
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	private void createSimulationSetup() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Simulation");

		// content
		setupText = new Text(group, SWT.SINGLE | SWT.BORDER | SWT.READ_ONLY);
		setupText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		setupText.setEditable(false);

		final Button button = new Button(group, SWT.BORDER);
		button.setLayoutData(new GridData(GridData.END));

		button.setText("Browse ...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedSetup = chooseSetup();
				if (selectedSetup != null) {
					setupText.setText(selectedSetup.getProjectRelativePath()
							.toString());
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	private void createProject() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
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
				selectedProject = chooseProject();
				if (selectedProject != null) {
					projectText.setText(selectedProject.getName());
				}
				updateLaunchConfigurationDialog();
			}
		});
	}

	private void createSamplingRate() {
		final Group group = new Group(tab, SWT.SHADOW_ETCHED_IN);
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		group.setText("Sampling Rate");

		// content
		samplingText = new Text(group, SWT.SINGLE | SWT.BORDER);
		samplingText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		samplingText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		Label label = new Label(group, SWT.BORDER);
		label.setText(" (miliseconds)");
	}

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

	private IFile chooseSetup() {
		if (selectedProject != null) {
			FilteredResourcesSelectionDialog dialog = new FilteredResourcesSelectionDialog(
					getShell(), false, selectedProject, IResource.FILE);
			dialog.setInitialPattern("*.setup");
			dialog.setTitle("Simulation Setup File Selection");
			dialog.setMessage("Select simulation setup file.");
			if (dialog.open() == Window.OK) {
				final Object[] files = dialog.getResult();
				if (files.length > 0)
					return (IFile) files[0];
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

	private IFolder chooseLog() {
		if (selectedProject != null) {
			// FIXME this dialog is not very applicable
			final ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
					getShell(), selectedProject, IResource.FOLDER);
			dialog.setTitle("Simulation Log Folder Selection");
			if (dialog.open() == Window.OK) {
				final Object[] folders = dialog.getResult();
				if (folders.length > 0)
					return (IFolder) folders[0];
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
				KiekerServiceLaunchConfigurationDelegate.ATTR_PORT, "9000");
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_TYPE, "SERVER");
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_PROBE, "");
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
			projectText.setText(configuration.getAttribute(
					KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT, ""));
			if (!projectText.getText().equals("")) {
				selectedProject = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(projectText.getText());
				if (selectedProject != null) {
					selectedSetup = selectedProject
							.getFile(setupText.getText());
					selectedLog = selectedProject.getFolder(logText.getText());
				} else {
					selectedSetup = null;
					selectedLog = null;
				}
			} else {
				selectedProject = null;
				selectedSetup = null;
				selectedLog = null;
			}
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
		configuration.setAttribute(
				KiekerServiceLaunchConfigurationDelegate.ATTR_PROJECT,
				projectText.getText());
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
		if (selectedProject == null)
			setErrorMessage("Specify a valid project");
		else if (selectedSetup == null)
			setErrorMessage("Specify a value simulation setup");
		else if (selectedLog == null)
			setErrorMessage("Specify a log directory");
		else {
			try {
				Integer.parseInt(samplingText.getText());
				setErrorMessage(null);
				return true;
			} catch (NumberFormatException e) {
				setErrorMessage("Specify a numeric (integer) sampling rate");
			}
		}
		// FIXME check if log directory exists
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
