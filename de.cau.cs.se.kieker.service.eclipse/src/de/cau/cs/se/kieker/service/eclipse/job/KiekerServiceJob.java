/**
 * 
 */
package de.cau.cs.se.kieker.service.eclipse.job;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cau.cs.se.kieker.service.AbstractService;
import de.cau.cs.se.kieker.service.IServiceListener;

/**
 * @author rju
 * 
 */
public class KiekerServiceJob extends Job implements IServiceListener {

	private AbstractService service;
	private IProgressMonitor monitor;

	public KiekerServiceJob(String name, AbstractService service) {
		super(name);
		this.service = service;
	}

	@Override
    protected IStatus run(IProgressMonitor monitor) {
		this.monitor = monitor;
	    try {
	    	monitor.beginTask("Receiving ...", IProgressMonitor.UNKNOWN);
	        service.run();
	        monitor.done();
	        return Status.OK_STATUS;
        } catch (Exception e) {
	        return Status.CANCEL_STATUS;
        }
		
    }

	@Override
    public void handleEvent(long count, String message) {
		if (message == null)
			monitor.subTask("Received " + count + " records ...");
		else
			monitor.subTask("Received " + count + " records. " + message);
	}
 
}
