/**
 * 
 */
package de.cau.cs.se.kieker.service.eclipse.job;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.PrivilegedAction;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.controller.IMonitoringController;
import kieker.monitoring.core.controller.MonitoringController;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

/**
 * @author rju
 * 
 */
public abstract class KiekerServiceJob extends Job {

	protected String ip;
	protected int port;
	private Map<Integer, Class<IMonitoringRecord>> recordList;
	private final IMonitoringController kieker;

	public KiekerServiceJob(String name, Map<Integer, Class<IMonitoringRecord>> recordList,
	        Configuration configuration) {
		super(name);
		this.recordList = recordList;
		this.kieker = MonitoringController.createInstance(configuration); // Create a Kieker
		                                                                  // monitoring instance
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
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 */
	protected void transfer(DataInputStream in, IProgressMonitor monitor) throws IOException,
	        InterruptedException, SecurityException, IllegalArgumentException,
	        ClassNotFoundException, NoSuchFieldException, IllegalAccessException,
	        InstantiationException, InvocationTargetException, NoSuchMethodException {
		long count = 0;
		IMonitoringRecord record;
		monitor.beginTask("Receiving ...", IProgressMonitor.UNKNOWN);
		do {
			record = deserialize(in);
			if (record != null) {
				kieker.newMonitoringRecord(record);
				count++;
				if (count<100 || count%100==0)
					monitor.subTask("Received " + count + " records ...");
			} else
				monitor.done();
		} while (!monitor.isCanceled() && record != null);
		kieker.terminateMonitoring();
	}

	/**
	 * De-serialize an object reading from the input stream.
	 * 
	 * @param in
	 *            the input stream
	 * @param monitor
	 * 
	 * @return the de-serialized IMonitoringRecord object or null if the stream was terminated by
	 *         the client.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	private IMonitoringRecord deserialize(DataInputStream in)
	        throws IOException, ClassNotFoundException, SecurityException, NoSuchFieldException,
	        IllegalArgumentException, IllegalAccessException, InstantiationException,
	        InvocationTargetException, NoSuchMethodException {
		// read structure ID
		try {
			Integer id = in.readInt();

			Class<IMonitoringRecord> type = recordList.get(id);
			if (type != null) {
				final Constructor<? extends IMonitoringRecord> constructor = type
				        .getConstructor(Object[].class);
				final Field parameterTypesField = type.getDeclaredField("TYPES");
				java.security.AccessController.doPrivileged(new PrivilegedAction<Object>() {
					public Object run() {
						parameterTypesField.setAccessible(true);
						return null;
					}
				});
				final Class<?>[] parameterTypes = (Class<?>[]) parameterTypesField.get(null);

				Object values[] = new Object[parameterTypes.length];

				int i = 0;
				for (Class<?> parameterType : parameterTypes) {
					if (parameterType.equals(boolean.class)) {
						values[i] = in.readBoolean();
					} else if (parameterType.equals(Boolean.class)) {
						values[i] = new Boolean(in.readBoolean());
					} else if (parameterType.equals(byte.class)) {
						values[i] = in.readByte();
					} else if (parameterType.equals(Byte.class)) {
						values[i] = new Byte(in.readByte());
					} else if (parameterType.equals(short.class)) {
						values[i] = in.readShort();
					} else if (parameterType.equals(Short.class)) {
						values[i] = new Short(in.readShort());
					} else if (parameterType.equals(int.class)) {
						values[i] = in.readInt();
					} else if (parameterType.equals(Integer.class)) {
						values[i] = new Integer(in.readInt());
					} else if (parameterType.equals(long.class)) {
						values[i] = in.readLong();
					} else if (parameterType.equals(Long.class)) {
						values[i] = new Long(in.readLong());
					} else if (parameterType.equals(float.class)) {
						values[i] = in.readFloat();
					} else if (parameterType.equals(Float.class)) {
						values[i] = new Float(in.readFloat());
					} else if (parameterType.equals(double.class)) {
						values[i] = in.readDouble();
					} else if (parameterType.equals(Double.class)) {
						values[i] = new Double(in.readDouble());
					} else if (parameterType.equals(String.class)) {
						int bufLen = in.readInt();
						byte buffer[] = new byte[bufLen];
						in.read(buffer, 0, bufLen);
						values[i] = new String(buffer, "UTF-8");
					} else { // reference types
						values[i] = deserialize(in);
					}
					i++;
				}

				return constructor.newInstance(new Object[] { values });
			} else {
				throw new IOException("Record type " + id + " is not registered.");
			}
		} catch (java.net.SocketException e) {
			// this means the client stopped sending, stop service and leave.
			return null;
		} catch (java.io.EOFException e) {
			// interruption, client may have died unexpectedly
			return null;
		}
	}

}
