/***************************************************************************
 * Copyright 2013 by
 *  + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *      + Software Engineering Group 
 *  and others.
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
package de.cau.cs.se.kieker.service.eclipse.job;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cau.cs.se.kieker.service.AbstractService;
import de.cau.cs.se.kieker.service.IServiceListener;

/**
 * Generic job for all Kieker bridge service implementations.
 * 
 * @author rju -- initial contribution
 * 
 */
public class KiekerServiceJob extends Job implements IServiceListener {

	private AbstractService service;
	private IProgressMonitor progressMonitor;

	/**
	 * Constructor.
	 * 
	 * @param name name to be shown in the job view
	 * @param service the service to be executed
	 */
	public KiekerServiceJob(final String name, final AbstractService service) {
		super(name);
		this.service = service;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
    protected IStatus run(final IProgressMonitor monitor) {
		this.progressMonitor = monitor;
	    try {
	    	this.progressMonitor.beginTask("Receiving ...", IProgressMonitor.UNKNOWN);
	        this.service.run();
	        this.progressMonitor.done();
	        return Status.OK_STATUS;
	        // CHECKSTYLE:OFF different services can produce different exceptions. They all have to be handled. 
        } catch (Exception e) {
        	// CHECKSTYLE:ON
	        return Status.CANCEL_STATUS;
        }
		
    }

	@Override
    public void handleEvent(final long count, final String message) {
		if (message == null) {
			this.progressMonitor.subTask("Received " + count + " records ...");
		} else {
			this.progressMonitor.subTask("Received " + count + " records. " + message);
		}
	}
 
}
