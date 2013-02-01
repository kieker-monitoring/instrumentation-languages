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
	protected long count;
	private Exception exception;
	private Collection<ServiceListener> listeners;
	
	/**
	 * 
	 */
	public Service(Configuration configuration) {
		this.configuration = configuration;
		this.listeners = new ArrayList<ServiceListener>();
	}
	
	public void run() throws Exception {
		sourceSetup();
		IMonitoringController kieker  = MonitoringController.createInstance(configuration);
		active = true;
		count = 0;
		while (active) {
            try {
            	IMonitoringRecord record = deserialize();
	            if (record != null) {
					kieker.newMonitoringRecord(record);
					count++;
					updateState();
				}
            } catch (Exception e) {
	            active = false;
	            this.exception = e;
            }	
		}
		kieker.terminateMonitoring();
		sourceClose();
	}

	private void updateState() {
	    // TODO Auto-generated method stub
	    
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

}
