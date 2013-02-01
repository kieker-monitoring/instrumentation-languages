/**
 * 
 */
package de.cau.cs.se.kieker.service.eclipse.job;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * @author rju
 *
 */
public class ClientKiekerServiceJob extends KiekerServiceJob {
	
	private String fqn;
	private int port;

	public ClientKiekerServiceJob(String name, String fqn, int port, Map<Integer, Class<IMonitoringRecord>> recordList, Configuration configuration) {
		super(name, recordList, configuration);
		this.fqn = fqn;
		this.port = port;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			final Socket socket = new Socket(fqn, port);
			final DataInputStream in = new DataInputStream(socket.getInputStream());
			transfer(in, monitor);
			socket.close();
		} catch (final UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (final InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        } catch (NoSuchMethodException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
        }
		return Status.OK_STATUS;
	}
}
