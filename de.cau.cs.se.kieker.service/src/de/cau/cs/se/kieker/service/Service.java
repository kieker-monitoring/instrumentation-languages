package de.cau.cs.se.kieker.service;

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
	
	/**
	 * 
	 */
	public Service(Configuration configuration) {
		this.configuration = configuration;
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

	protected abstract IMonitoringRecord deserialize() throws Exception;

	protected abstract void sourceSetup() throws Exception;
	
	protected abstract void sourceClose() throws Exception;
	
	protected abstract void updateState();

	/**
	 * @return the exception
	 */
    public Exception getException() {
	    return exception;
    }

}
