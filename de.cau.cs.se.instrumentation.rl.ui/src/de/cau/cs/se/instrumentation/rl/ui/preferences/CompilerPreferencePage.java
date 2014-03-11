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

	/**
	 * Set grid layout.
	 */
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

	/**
	 * Initialize preference page view.
	 * 
	 * @param workbench the corresponding workbench in eclipse
	 */
	public void init(final IWorkbench workbench) {
		setPreferenceStore(RecordLangActivator.getInstance()
				.getPreferenceStore());
		setDescription("Setup generator destination directories");
	}

}
