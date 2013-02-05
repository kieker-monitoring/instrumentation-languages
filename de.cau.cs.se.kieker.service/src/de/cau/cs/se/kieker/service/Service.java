package de.cau.cs.se.kieker.service;

import java.util.ArrayList;
import java.util.Collection;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.controller.IMonitoringController;
/**
 * 
 */
import kieker.monitoring.core.controller.MonitoringController;

/**
 * @author rju
 *
 */
public abstract class Service {

	private Configuration configuration;
	protected boolean active;
	protected long recordCount;
	private Exception exception;
	private Collection<ServiceListener> listeners;
	private long listenerUpdateInterval;
	
	/**
	 * 
	 */
	public Service(Configuration configuration) {
		this.configuration = configuration;
		this.listeners = new ArrayList<ServiceListener>();
		this.listenerUpdateInterval = 100;
	}
	
	public void run() throws Exception {
		sourceSetup();
		IMonitoringController kieker  = MonitoringController.createInstance(configuration);
		active = true;
		recordCount = 0;
		while (active) {
            try {
            	IMonitoringRecord record = deserialize();
	            if (record != null) {
					kieker.newMonitoringRecord(record);
					recordCount++;
					if (recordCount%listenerUpdateInterval == 0)
						updateState(null);
				} else
					active = false;
            } catch (Exception e) {
	            active = false;
	            this.exception = e;
	            updateState(e.getMessage());
            }	
		}
		updateState(null);
		kieker.terminateMonitoring();
		sourceClose();
	}

	private void updateState(String message) {
		for (ServiceListener listener : listeners)
			listener.handleEvent(recordCount, message);
    }
	
	public long getRecordCount() {
	    return recordCount;
    }

	protected abstract IMonitoringRecord deserialize() throws Exception;

	protected abstract void sourceSetup() throws Exception;
	
	protected abstract void sourceClose() throws Exception;
	
	/**
	 * @return the exception
	 */
    public Exception getException() {
	    return exception;
    }

	public void addListener(ServiceListener listener) {
		this.listeners.add(listener);
    }
	
	public void setListenerUpdateInterval(long listenerUpdateInterval) {
		this.listenerUpdateInterval = listenerUpdateInterval;
	}

}
