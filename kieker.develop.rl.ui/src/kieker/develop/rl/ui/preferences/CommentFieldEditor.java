/***************************************************************************
 * Copyright 2016 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.ui.preferences;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.Bullet;
import org.eclipse.swt.custom.LineStyleEvent;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.ST;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.GlyphMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

/**
 * Editor for a the header comment fields in the preference tab.
 *
 * @author Reiner Jung
 *
 */
public class CommentFieldEditor extends FieldEditor {

	private Composite top;
	private StyledText commentText;

	/**
	 * Constructor for the comment field.
	 *
	 * @param name the name of the editor
	 * @param label the label of the editor
	 * @param fieldEditorParent the context where the editor is placed in
	 */
	public CommentFieldEditor(final String name, final String label, final Composite fieldEditorParent) {
		super(name, label, fieldEditorParent);
	}

	@Override
	protected void adjustForNumColumns(final int numColumns) {
		((GridData) this.top.getLayoutData()).horizontalSpan = numColumns;
	}

	@Override
	protected void doFillIntoGrid(final Composite parent, final int numColumns) {
		this.top = parent;

		final GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = numColumns;
		this.top.setLayoutData(gd);

		final Label label = this.getLabelControl(this.top);
		final GridData labelData = new GridData();
		labelData.horizontalSpan = numColumns;
		label.setLayoutData(labelData);

		this.commentText = new StyledText(this.top, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		final GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = this.convertVerticalDLUsToPixels(parent, 50);
		this.commentText.setLayoutData(layoutData);

		this.commentText.addLineStyleListener(new LineStyleListener() {
			@Override
			public void lineGetStyle(final LineStyleEvent event) {
				// Using ST.BULLET_NUMBER sometimes results in weird alignment.
				//event.bulletIndex = styledText.getLineAtOffset(event.lineOffset);
				final StyleRange styleRange = new StyleRange();
				styleRange.foreground = Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
				final int maxLine = CommentFieldEditor.this.commentText.getLineCount();
				final int bulletLength = Integer.toString(maxLine).length();
				// Width of number character is half the height in monospaced font, add 1 character width for right padding.
				final int bulletWidth = ((bulletLength + 1) * CommentFieldEditor.this.commentText.getLineHeight()) / 2;
				styleRange.metrics = new GlyphMetrics(0, 0, bulletWidth);
				event.bullet = new Bullet(ST.BULLET_TEXT, styleRange);
				// getLineAtOffset() returns a zero-based line index.
				final int bulletLine = CommentFieldEditor.this.commentText.getLineAtOffset(event.lineOffset) + 1;
				event.bullet.text = String.format("%" + bulletLength + "s", bulletLine);
			}
		});

		this.commentText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(final ModifyEvent e) {
				// For line number redrawing.
				CommentFieldEditor.this.commentText.redraw();
			}
		});

	}

	@Override
	protected void doLoad() {
		final String comment = this.getPreferenceStore().getString(this.getPreferenceName());
		if (comment != null) {
			this.commentText.setText(comment);
		}
	}

	@Override
	protected void doLoadDefault() {
		final String comment = this.getPreferenceStore().getDefaultString(this.getPreferenceName());
		if (comment != null) {
			this.commentText.setText(comment);
		}
	}

	@Override
	protected void doStore() {
		this.getPreferenceStore().setValue(this.getPreferenceName(), this.commentText.getText());
	}

	@Override
	public int getNumberOfControls() {
		return 1;
	}

}
