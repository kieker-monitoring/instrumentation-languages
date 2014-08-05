package de.cau.cs.se.instrumentation.rl.ouput.config;

import java.util.Set;

import com.google.inject.ImplementedBy;

/**
 * @author Michael Clay - Initial contribution and API
 * @author Reiner Jung - adaptation for IRL
 */
@ImplementedBy(RecordLangOutputConfigurationProvider.class)
public interface IRecordLangOutputConfigurationProvider {
	Set<RecordLangOutputConfiguration> getOutputConfigurations();

	class Delegate implements IRecordLangOutputConfigurationProvider {
		private final IRecordLangOutputConfigurationProvider delegate;

		public IRecordLangOutputConfigurationProvider getDelegate() {
			return this.delegate;
		}

		public Delegate(final IRecordLangOutputConfigurationProvider delegate) {
			super();
			this.delegate = delegate;
		}

		public Set<RecordLangOutputConfiguration> getOutputConfigurations() {
			return this.delegate.getOutputConfigurations();
		}

	}
}
