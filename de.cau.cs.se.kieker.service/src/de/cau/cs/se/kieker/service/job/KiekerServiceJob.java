/**
 * 
 */
package de.cau.cs.se.kieker.service.job;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.configuration.ConfigurationFactory;
import kieker.monitoring.core.controller.IMonitoringController;
import kieker.monitoring.core.controller.MonitoringController;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

import de.cau.cs.se.instrumentation.language.instrumentation.Model;
import de.cau.cs.se.instrumentation.language.instrumentation.Probe;
import de.cau.cs.se.instrumentation.language.instrumentation.Property;
import de.cau.cs.se.instrumentation.language.instrumentation.ReferenceProperty;

/**
 * @author rju
 * 
 */
public abstract class KiekerServiceJob extends Job {

	protected String ip;
	protected int port;
	private Map<Long, Probe> probeStructures;
	private final IMonitoringController kieker;

	public KiekerServiceJob(String name, Map<Long, Probe> probeStructures, Configuration configuration) {
		super(name);
		this.probeStructures = probeStructures;
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
	 */
	protected void transfer(DataInputStream in, IProgressMonitor monitor)
			throws IOException, InterruptedException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		do {
			// read structure ID
			long id = in.readLong();
			Probe probe = probeStructures.get(id);

			Object object = Class.forName(((Model)probe.eContainer()).getName() + "." + probe.getName()	+ "Record");
			// process data
			for (Property property : probe.getProperties()) {
				Field field = object.getClass().getField(property.getName());
				
				if (property.getType().getClass_().getInstanceTypeName().equals("Boolean")) {
					field.setBoolean(object, in.readBoolean());
				} else if (property.getType().getClass_().getInstanceTypeName().equals("Byte")) {
					field.setByte(object, in.readByte());
				} else if (property.getType().getClass_().getInstanceTypeName().equals("Short")) {
					field.setShort(object, in.readShort());
				} else if (property.getType().getClass_().getInstanceTypeName().equals("Integer")) {
					field.setInt(object, in.readInt());
				} else if (property.getType().getClass_().getInstanceTypeName().equals("Long")) {
					field.setLong(object, in.readLong());
				} else { // reference types
					// TODO the referenceId should be used to check on the type if necessary
					long referenceId = in.readLong();
					// TODO here we might need to resolve the package structure to find the correct name
					Object propertyObject = Class.forName(property.getType().getClass_().getName());
					if (in.readBoolean())
						field.set(object, deserializeObject(in, propertyObject, property.getProperties()));
					else
						field.set(object, propertyObject);
				}
			}
			kieker.newMonitoringRecord((IMonitoringRecord)object);
		} while (!monitor.isCanceled());
	}

	/**
	 * De-serialize an object reading from the input stream
	 * 
	 * @param in the input stream
	 * @param object
	 * @param properties
	 * 
	 * @return the de-serialized IMonitoringRecord object
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	 private Object deserializeObject(DataInputStream in, Object object,
				EList<ReferenceProperty> properties)
			throws IOException, ClassNotFoundException, SecurityException,
			NoSuchFieldException, IllegalArgumentException,
			IllegalAccessException {
	
		// process data
		for (ReferenceProperty property : properties) {
			Field field = object.getClass().getField(property.getRef().getName());
//			if (property.getRef().getEReferenceType().getName().equals("Boolean")) {
//				field.setBoolean(object, in.readBoolean());
//			} else if (property.getRef().getEReferenceType().getName().equals("Byte")) {
//				field.setByte(object, in.readByte());
//			} else if (property.getRef().getEReferenceType().getName().equals("Short")) {
//				field.setShort(object, in.readShort());
//			} else if (property.getRef().getEReferenceType().getName().equals("Integer")) {
//				field.setInt(object, in.readInt());
//			} else if (property.getRef().getEReferenceType().getName().equals("Long")) {
//				field.setLong(object, in.readLong());
//			} else { // reference types
//				long referenceId = in.readLong();
//				// TODO here we might need to resolve the package structure to find the correct name
//				Object propertyObject = Class.forName(property.getRef().getEReferenceType().getName());
//				if (in.readBoolean()) {
//					field.set(object, deserializeObject(in, propertyObject, property.getProperties()));
//				}
//			}
		}
		return object;
	}

}
