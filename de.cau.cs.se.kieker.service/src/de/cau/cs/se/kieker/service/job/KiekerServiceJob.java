/**
 * 
 */
package de.cau.cs.se.kieker.service.job;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.AbstractMonitoringRecord;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.controller.IMonitoringController;
import kieker.monitoring.core.controller.MonitoringController;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;


/**
 * @author rju
 * 
 */
public abstract class KiekerServiceJob extends Job {

	protected String ip;
	protected int port;
	private Map<Long, Class<IMonitoringRecord>> recordList;
	private final IMonitoringController kieker;

	public KiekerServiceJob(String name, Map<Long, Class<IMonitoringRecord>> recordList, Configuration configuration) {
		super(name);
		this.recordList = recordList;
		this.kieker  = MonitoringController.createInstance(configuration);
	}

	/**
	 * main loop for data retrieval
	 * 
	 * @param in
	 * @param monitor
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws IllegalAccessException 
	 * @throws NoSuchFieldException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws InstantiationException 
	 */
	protected void transfer(DataInputStream in, IProgressMonitor monitor)
			throws IOException, InterruptedException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
		do {
			kieker.newMonitoringRecord(deserialize(in,monitor));
		} while (!monitor.isCanceled());
	}

	/**
	 * Collect all attributes of a monitoring record and return them in a Collection
	 * 
	 * @param type
	 * @return Collection of Class Fields
	 */
	private Collection<Field> compileFields(Class<? super IMonitoringRecord> type) {
		Collection<Field> results;
		
		if (!type.getCanonicalName().equals(AbstractMonitoringRecord.class.getCanonicalName())) {
			results = compileFields(type.getSuperclass());
		} else
			results = new ArrayList<Field>();
		for (Field field : type.getDeclaredFields())
			results.add(field);
		return results;
	}

	/**
	 * De-serialize an object reading from the input stream
	 * 
	 * @param in the input stream
	 * @param monitor
	 * 
	 * @return the de-serialized IMonitoringRecord object
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException 
	 */
	 private IMonitoringRecord deserialize(DataInputStream in, IProgressMonitor monitor)
			throws IOException, ClassNotFoundException, SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException, InstantiationException {
		 // read structure ID
		 long id = in.readLong();
					
		Class<IMonitoringRecord> type = recordList.get(id);
		if (type != null) {
			IMonitoringRecord record = type.newInstance();
			
			for (Field field : compileFields(type)) {	
				if (field.getType().getCanonicalName().equals(Boolean.class.getCanonicalName())) {
					field.setBoolean(record, in.readBoolean());
				} else if (field.getType().getCanonicalName().equals(Byte.class.getCanonicalName())) {
					field.setByte(record, in.readByte());
				} else if (field.getType().getCanonicalName().equals(Short.class.getCanonicalName())) {
					field.setShort(record, in.readShort());
				} else if (field.getType().getCanonicalName().equals(Integer.class.getCanonicalName())) {
					field.setInt(record, in.readInt());
				} else if (field.getType().getCanonicalName().equals(Long.class.getCanonicalName())) {
					field.setLong(record, in.readLong());
				} else { // reference types
					field.set(record, deserialize(in,monitor));
				}
			}
			return record;
		} else {
			monitor.done(); // tell the monitor that we have a communication error right NOW
			throw new IOException("Record type " + id + " is not registered.");
		}
	}

}
