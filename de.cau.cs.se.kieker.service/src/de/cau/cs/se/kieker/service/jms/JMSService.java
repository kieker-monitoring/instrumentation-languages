/**
 * 
 */
package de.cau.cs.se.kieker.service.jms;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;

import javax.jms.BytesMessage;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.Connection;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import de.cau.cs.se.kieker.service.Service;
import de.cau.cs.se.kieker.service.tcp.LookupEntity;

/**
 * @author rju
 * 
 */
public class JMSService extends Service {

	private int BUF_LEN = 65536;

	private Map<Integer, Class<IMonitoringRecord>> recordList;
	private String username;
	private String password;
	private URI uri;

	private MessageConsumer consumer;
	private Map<Integer, LookupEntity> recordMap;
	private byte buffer[] = new byte[BUF_LEN];
	private Connection connection;

	/**
	 * @param configuration
	 */
	public JMSService(Configuration configuration,
	        Map<Integer, Class<IMonitoringRecord>> recordList, String username, String password,
	        URI uri) {
		super(configuration);
		this.recordList = recordList;
		this.username = username;
		this.password = password;
		this.uri = uri;
	}

	@Override
	protected IMonitoringRecord deserialize() throws Exception {
		Message message = consumer.receive();
		if (message != null) {
			if (message instanceof BytesMessage) {
				return deserialize((BytesMessage) message);
			} else if (message instanceof TextMessage) {
				return deserialize(((TextMessage) message).getText().split(";"));
			} else {
				throw new Exception("Unsupported message type " + message.getClass().getCanonicalName());
			}
		} else
			return null;
	}

	/**
	 * deserialize BinaryMessages and store them in a IMonitoringRecord.
	 * 
	 * @param message
	 * @return A monitoring record for the given ByteMessage
	 * @throws Exception when the record id is unknown or the composition fails
	 */
	private IMonitoringRecord deserialize(BytesMessage message) throws Exception {
		final Integer id = message.readInt();
		final LookupEntity recordProperty = recordMap.get(id);
		if (recordProperty != null) {
			final Object values[] = new Object[recordProperty.parameterTypes.length];

			int i = 0;
			for (Class<?> parameterType : recordProperty.parameterTypes) {
				if (parameterType.equals(boolean.class)) {
					values[i] = message.readBoolean();
				} else if (parameterType.equals(Boolean.class)) {
					values[i] = new Boolean(message.readBoolean());
				} else if (parameterType.equals(byte.class)) {
					values[i] = message.readByte();
				} else if (parameterType.equals(Byte.class)) {
					values[i] = new Byte(message.readByte());
				} else if (parameterType.equals(short.class)) {
					values[i] = message.readShort();
				} else if (parameterType.equals(Short.class)) {
					values[i] = new Short(message.readShort());
				} else if (parameterType.equals(int.class)) {
					values[i] = message.readInt();
				} else if (parameterType.equals(Integer.class)) {
					values[i] = new Integer(message.readInt());
				} else if (parameterType.equals(long.class)) {
					values[i] = message.readLong();
				} else if (parameterType.equals(Long.class)) {
					values[i] = new Long(message.readLong());
				} else if (parameterType.equals(float.class)) {
					values[i] = message.readFloat();
				} else if (parameterType.equals(Float.class)) {
					values[i] = new Float(message.readFloat());
				} else if (parameterType.equals(double.class)) {
					values[i] = message.readDouble();
				} else if (parameterType.equals(Double.class)) {
					values[i] = new Double(message.readDouble());
				} else if (parameterType.equals(String.class)) {
					final int bufLen = message.readInt();
					message.readBytes(buffer, bufLen);
					values[i] = new String(buffer, 0, bufLen, "UTF-8");
				} else { // reference types
					throw new Exception("References are not yet supported.");
				}
				i++;
			}

			return recordProperty.constructor.newInstance(new Object[] { values });

		} else {
			throw new IOException("Record type " + id + " is not registered.");
		}
	}

	/**
	 * deserialize String array and store it in a IMonitoringRecord.
	 * 
	 * @param attributes
	 * @return A monitoring record for the given String array
	 * @throws Exception when the record id is unknown or the composition fails
	 */
	private IMonitoringRecord deserialize(String[] attributes) throws Exception {
		if (attributes.length > 0) {
			final Integer id = Integer.parseInt(attributes[0]);
			final LookupEntity recordProperty = recordMap.get(id);
			if (recordProperty != null) {
				final Object values[] = new Object[recordProperty.parameterTypes.length];

				int i = 0;
				for (Class<?> parameterType : recordProperty.parameterTypes) {
					if (parameterType.equals(boolean.class)) {
						values[i] = attributes[i + 1].equals("t");
					} else if (parameterType.equals(Boolean.class)) {
						values[i] = new Boolean(attributes[i + 1].equals("t"));
					} else if (parameterType.equals(byte.class)) {
						values[i] = Byte.parseByte(attributes[i + 1]);
					} else if (parameterType.equals(Byte.class)) {
						values[i] = new Byte(Byte.parseByte(attributes[i + 1]));
					} else if (parameterType.equals(short.class)) {
						values[i] = Short.parseShort(attributes[i + 1]);
					} else if (parameterType.equals(Short.class)) {
						values[i] = new Short(Short.parseShort(attributes[i + 1]));
					} else if (parameterType.equals(int.class)) {
						values[i] = Integer.parseInt(attributes[i + 1]);
					} else if (parameterType.equals(Integer.class)) {
						values[i] = new Integer(Integer.parseInt(attributes[i + 1]));
					} else if (parameterType.equals(long.class)) {
						values[i] = Long.parseLong(attributes[i + 1]);
					} else if (parameterType.equals(Long.class)) {
						values[i] = new Long(Long.parseLong(attributes[i + 1]));
					} else if (parameterType.equals(float.class)) {
						values[i] = Float.parseFloat(attributes[i + 1]);
					} else if (parameterType.equals(Float.class)) {
						values[i] = new Float(Float.parseFloat(attributes[i + 1]));
					} else if (parameterType.equals(double.class)) {
						values[i] = Double.parseDouble(attributes[i + 1]);
					} else if (parameterType.equals(Double.class)) {
						values[i] = new Double(Double.parseDouble(attributes[i + 1]));
					} else if (parameterType.equals(String.class)) {
						values[i] = attributes[i + 1];
					} else { // reference types
						throw new Exception("References are not yet supported.");
					}
					i++;
				}

				return recordProperty.constructor.newInstance(new Object[] { values });
			} else {
				throw new IOException("Record type " + id + " is not registered.");
			}
		} else {
			throw new IOException("Record structure is corrupt");
		}

	}

	@Override
	protected void sourceSetup() throws Exception {
		// setup value lookup
		recordMap = new HashMap<Integer, LookupEntity>();
		for (int key : recordList.keySet()) {
			Class<IMonitoringRecord> type = recordList.get(key);

			final Field parameterTypesField = type.getDeclaredField("TYPES");
			java.security.AccessController.doPrivileged(new PrivilegedAction<Object>() {
				public Object run() {
					parameterTypesField.setAccessible(true);
					return null;
				}
			});
			LookupEntity entity = new LookupEntity(type.getConstructor(Object[].class),
			        (Class<?>[]) parameterTypesField.get(null));
			recordMap.put(key, entity);
		}
		// setup connection
		ConnectionFactory factory;
		if (username != null && password != null)
			factory = new ActiveMQConnectionFactory(username, password, uri);
		else
			factory = new ActiveMQConnectionFactory(uri);
		connection = factory.createConnection();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("de.cau.cs.se.kieker.service");
		consumer = session.createConsumer(destination);

		connection.start();
	}

	@Override
	protected void sourceClose() throws Exception {
		connection.stop();
	}

}
