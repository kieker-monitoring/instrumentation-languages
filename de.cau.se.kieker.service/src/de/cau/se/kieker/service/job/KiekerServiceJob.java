/**
 * 
 */
package de.cau.se.kieker.service.job;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.controller.IMonitoringController;
import kieker.monitoring.core.controller.MonitoringController;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;

import de.cau.se.instrumentation.language.probeLang.Probe;
import de.cau.se.instrumentation.language.probeLang.Property;
import de.cau.se.instrumentation.language.probeLang.ReferenceProperty;

/**
 * @author rju
 * 
 */
public abstract class KiekerServiceJob extends Job {

	protected String ip;
	protected int port;
	private Map<Long, Probe> probeStructures;
	// couldn't that be injectecd?
	private final IMonitoringController kieker;

	public KiekerServiceJob(String name, Map<Long, Probe> probeStructures) {
		super(name);
		this.probeStructures = probeStructures;
		this.kieker  = MonitoringController.getInstance();
	}

	/**
	 * main loop for data retrieval
	 * 
	 * @param in
	 * @param out
	 * @param monitor
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

			Object object = Class.forName("de.cau.se.kieker." + probe.getName()	+ "Record");
			// process data
			for (Property property : probe.getProperties()) {
				Field field = object.getClass().getField(property.getName());
				if (property.getType().getInstanceTypeName().equals("Boolean")) {
					field.setBoolean(object, in.readBoolean());
				} else if (property.getType().getInstanceTypeName().equals("Byte")) {
					field.setByte(object, in.readByte());
				} else if (property.getType().getInstanceTypeName().equals("Short")) {
					field.setShort(object, in.readShort());
				} else if (property.getType().getInstanceTypeName()
						.equals("Integer")) {
					field.setInt(object, in.readInt());
				} else if (property.getType().getInstanceTypeName().equals("Long")) {
					field.setLong(object, in.readLong());
				} else { // reference types
					// TODO the referenceId should be used to check on the type if necessary
					long referenceId = in.readLong();
					// TODO here we might need to resolve the package structure to find the correct name
					Object propertyObject = Class.forName(property.getType().getName());
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
	 * Deserialize an object reading from the input stream
	 * 
	 * @param in the input stream
	 * @param object
	 * @param properties
	 * @return the deserialized IMonitoringRecord object
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
			if (property.getRef().getEReferenceType().getName().equals("Boolean")) {
				field.setBoolean(object, in.readBoolean());
			} else if (property.getRef().getEReferenceType().getName().equals("Byte")) {
				field.setByte(object, in.readByte());
			} else if (property.getRef().getEReferenceType().getName().equals("Short")) {
				field.setShort(object, in.readShort());
			} else if (property.getRef().getEReferenceType().getName().equals("Integer")) {
				field.setInt(object, in.readInt());
			} else if (property.getRef().getEReferenceType().getName().equals("Long")) {
				field.setLong(object, in.readLong());
			} else { // reference types
				long referenceId = in.readLong();
				// TODO here we might need to resolve the package structure to find the correct name
				Object propertyObject = Class.forName(property.getRef().getEReferenceType().getName());
				if (in.readBoolean()) {
					field.set(object, deserializeObject(in, propertyObject, property.getProperties()));
				}
			}
		}
		return object;
	}

}
