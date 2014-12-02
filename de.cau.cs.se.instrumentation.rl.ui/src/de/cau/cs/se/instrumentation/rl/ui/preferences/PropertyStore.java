package de.cau.cs.se.instrumentation.rl.ui.preferences;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;

/**
 * Represents the properties of a specific resource in context of a specific property page.
 * Used by FieldEditorOverlayPage.
 *
 * created after https://www.eclipse.org/articles/Article-Mutatis-mutandis/overlay-pages.html
 *
 * @author Yannic Kropp
 *
 */
public class PropertyStore extends PreferenceStore {

	private final IResource resource;
	private final IPreferenceStore workbenchStore;
	private final String pageId;
	private boolean inserting = false;

	public PropertyStore(
			final IResource resource,
			final IPreferenceStore workbenchStore,
			final String pageId) {
		this.resource = resource;
		this.workbenchStore = workbenchStore;
		this.pageId = pageId;
	}

	/*** Write modified values back to properties ***/

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPersistentPreferenceStore#save()
	 */
	@Override
	public void save() throws IOException {
		this.writeProperties();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferenceStore#save(java.io.OutputStream, java.lang.String)
	 */
	@Override
	public void save(final OutputStream out, final String header) throws IOException {
		this.writeProperties();
	}

	/**
	 * Writes modified preferences into resource properties.
	 */
	private void writeProperties() throws IOException {
		final String[] preferences = super.preferenceNames();
		for (final String name : preferences) {
			try {
				this.setProperty(name, this.getString(name));
			} catch (final CoreException e) {
				throw new IOException("Cannot write resource property" + name);
			}
		}
	}

	/**
	 * Convenience method to set a property
	 * @param name - the preference name
	 * @param value - the property value or null to delete the property
	 * @throws CoreException
	 */
	private void setProperty(final String name, final String value) throws CoreException {
		this.resource.setPersistentProperty(new QualifiedName(this.pageId, name), value);
	}

	/*** Get default values (Delegate to workbench store) ***/

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDefaultBoolean(java.lang.String)
	 */
	@Override
	public boolean getDefaultBoolean(final String name) {
		return this.workbenchStore.getDefaultBoolean(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDefaultDouble(java.lang.String)
	 */
	@Override
	public double getDefaultDouble(final String name) {
		return this.workbenchStore.getDefaultDouble(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDefaultFloat(java.lang.String)
	 */
	@Override
	public float getDefaultFloat(final String name) {
		return this.workbenchStore.getDefaultFloat(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDefaultInt(java.lang.String)
	 */
	@Override
	public int getDefaultInt(final String name) {
		return this.workbenchStore.getDefaultInt(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDefaultLong(java.lang.String)
	 */
	@Override
	public long getDefaultLong(final String name) {
		return this.workbenchStore.getDefaultLong(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDefaultString(java.lang.String)
	 */
	@Override
	public String getDefaultString(final String name) {
		return this.workbenchStore.getDefaultString(name);
	}

	/*** Get property values ***/

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getBoolean(java.lang.String)
	 */
	@Override
	public boolean getBoolean(final String name) {
		this.insertValue(name);
		return super.getBoolean(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getDouble(java.lang.String)
	 */
	@Override
	public double getDouble(final String name) {
		this.insertValue(name);
		return super.getDouble(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getFloat(java.lang.String)
	 */
	@Override
	public float getFloat(final String name) {
		this.insertValue(name);
		return super.getFloat(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getInt(java.lang.String)
	 */
	@Override
	public int getInt(final String name) {
		this.insertValue(name);
		return super.getInt(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getLong(java.lang.String)
	 */
	@Override
	public long getLong(final String name) {
		this.insertValue(name);
		return super.getLong(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#getString(java.lang.String)
	 */
	@Override
	public String getString(final String name) {
		this.insertValue(name);
		return super.getString(name);
	}

	/**
	 * @param name
	 */
	private synchronized void insertValue(final String name) {
		if (this.inserting) {
			return;
		}
		if (super.contains(name)) {
			return;
		}
		this.inserting = true;
		String prop = null;
		try {
			prop = this.getProperty(name);
		} catch (final CoreException e) {
		}
		if (prop == null) {
			prop = this.workbenchStore.getString(name);
		}
		if (prop != null) {
			this.setValue(name, prop);
		}
		this.inserting = false;
	}

	/**
	 * Convenience method to fetch a property
	 * @param name - the preference name
	 * @return - the property value
	 * @throws CoreException
	 */
	private String getProperty(final String name) throws CoreException {
		return this.resource.getPersistentProperty(new QualifiedName(this.pageId, name));
	}

	/*** Misc ***/

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#contains(java.lang.String)
	 */
	@Override
	public boolean contains(final String name) {
		return this.workbenchStore.contains(name);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#setToDefault(java.lang.String)
	 */
	@Override
	public void setToDefault(final String name) {
		this.setValue(name, this.getDefaultString(name));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferenceStore#isDefault(java.lang.String)
	 */
	@Override
	public boolean isDefault(final String name) {
		final String defaultValue = this.getDefaultString(name);
		if (defaultValue == null) {
			return false;
		}
		return defaultValue.equals(this.getString(name));
	}

}

