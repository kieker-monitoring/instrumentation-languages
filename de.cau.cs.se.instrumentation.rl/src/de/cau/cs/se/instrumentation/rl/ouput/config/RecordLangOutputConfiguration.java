package de.cau.cs.se.instrumentation.rl.ouput.config;

import org.eclipse.xtext.generator.OutputConfiguration;

public class RecordLangOutputConfiguration extends OutputConfiguration {

	/** true indicates the the compiler is active. */
	private boolean active;

	public RecordLangOutputConfiguration(final String name) {
		super(name);
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

}
