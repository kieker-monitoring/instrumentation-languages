package kieker.develop.rl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferenceNodeVisitor;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class CLIPreferenceStore implements IEclipsePreferences {

	public static final IEclipsePreferences INSTANCE = CLIPreferenceStore.createInstance();

	private final Map<String, String> values = new HashMap<>();

	public CLIPreferenceStore() {

	}

	private static IEclipsePreferences createInstance() {
		if (INSTANCE == null) {
			return new CLIPreferenceStore();
		} else {
			return INSTANCE;
		}
	}

	@Override
	public void put(final String key, final String value) {
		this.values.put(key, value);
	}

	@Override
	public String get(final String key, final String def) {
		return this.values.get(key);
	}

	@Override
	public void remove(final String key) {
		this.values.remove(key);
	}

	@Override
	public void clear() throws BackingStoreException {
		this.values.clear();
	}

	@Override
	public void putInt(final String key, final int value) {
		this.values.put(key, String.valueOf(value));
	}

	@Override
	public int getInt(final String key, final int def) {
		final String value = this.values.get(key);
		if (value == null) {
			return def;
		} else {
			return Integer.parseInt(value);
		}
	}

	@Override
	public void putLong(final String key, final long value) {
		this.values.put(key, String.valueOf(value));
	}

	@Override
	public long getLong(final String key, final long def) {
		final String value = this.values.get(key);
		if (value == null) {
			return def;
		} else {
			return Long.parseLong(value);
		}
	}

	@Override
	public void putBoolean(final String key, final boolean value) {
		this.values.put(key, String.valueOf(value));
	}

	@Override
	public boolean getBoolean(final String key, final boolean def) {
		final String value = this.values.get(key);
		if (value == null) {
			return def;
		} else {
			return Boolean.parseBoolean(value);
		}
	}

	@Override
	public void putFloat(final String key, final float value) {
		this.values.put(key, String.valueOf(value));
	}

	@Override
	public float getFloat(final String key, final float def) {
		final String value = this.values.get(key);
		if (value == null) {
			return def;
		} else {
			return Float.parseFloat(value);
		}
	}

	@Override
	public void putDouble(final String key, final double value) {
		this.values.put(key, String.valueOf(value));
	}

	@Override
	public double getDouble(final String key, final double def) {
		final String value = this.values.get(key);
		if (value == null) {
			return def;
		} else {
			return Double.parseDouble(value);
		}
	}

	@Override
	public void putByteArray(final String key, final byte[] value) {
		this.values.put(key, String.valueOf(value));
	}

	@Override
	public byte[] getByteArray(final String key, final byte[] def) {
		/** only in memory store. */
		return null;
	}

	@Override
	public String[] keys() throws BackingStoreException {
		return this.values.keySet().toArray(new String[this.values.keySet().size()]);
	}

	@Override
	public String[] childrenNames() throws BackingStoreException {
		return null;
	}

	@Override
	public Preferences parent() {
		return null;
	}

	@Override
	public boolean nodeExists(final String pathName) throws BackingStoreException {
		return false;
	}

	@Override
	public String name() {
		return "in-memory";
	}

	@Override
	public String absolutePath() {
		return null;
	}

	@Override
	public void flush() throws BackingStoreException {
		/** only in memory store. */

	}

	@Override
	public void sync() throws BackingStoreException {
		/** only in memory store. */

	}

	@Override
	public void addNodeChangeListener(final INodeChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeNodeChangeListener(final INodeChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPreferenceChangeListener(final IPreferenceChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePreferenceChangeListener(final IPreferenceChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeNode() throws BackingStoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public Preferences node(final String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(final IPreferenceNodeVisitor visitor) throws BackingStoreException {
		// TODO Auto-generated method stub

	}

}
