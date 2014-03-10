/**
 * 
 */
package de.cau.cs.se.instrumentation.rl.ui.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.se.instrumentation.rl.ui.internal.RecordLangActivator;

/**
 * @author rju
 * 
 */
public class CompilerPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public CompilerPreferencePage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		addField(new DirectoryFieldEditor("JAVA_SOURCE_PATH",
				"&Java source directory:", getFieldEditorParent()));
		addField(new DirectoryFieldEditor("C_SOURCE_PATH",
				"&C/C++ source directory:", getFieldEditorParent()));
		addField(new DirectoryFieldEditor("PERL_SOURCE_PATH",
				"&Perl source directory:", getFieldEditorParent()));
	}

	public void init(IWorkbench workbench) {
		setPreferenceStore(RecordLangActivator.getInstance()
				.getPreferenceStore());
		setDescription("Setup generator destination directories");
	}

}
