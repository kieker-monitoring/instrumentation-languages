/**
 * 
 */
package de.cau.cs.se.kieker.service.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import de.cau.cs.se.kieker.service.Service;

/**
 * @author rju
 *
 */
public abstract class TCPService extends Service {
	
	protected DataInputStream in;
	private Map<Integer, Class<IMonitoringRecord>> recordList;
	
	/**
	 * @param configuration
	 */
	public TCPService(Configuration configuration, Map<Integer, Class<IMonitoringRecord>> recordList) {
		super(configuration);
		this.recordList = recordList;
	}

	@Override
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
		protected IMonitoringRecord deserialize() throws Exception {
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
							values[i] = deserialize();
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
