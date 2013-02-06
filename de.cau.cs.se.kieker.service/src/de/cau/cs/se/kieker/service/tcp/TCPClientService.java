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
package de.cau.cs.se.kieker.service.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

/**
 * @author rju
 *
 */
public class TCPClientService extends TCPService {

	private int port;
	private String hostname;

	private int BUF_LEN = 65536;
	private byte buffer[] = new byte[BUF_LEN];
	
	private DataInputStream in;



	/**
	 * @param configuration
	 * @param recordList
	 */
	public TCPClientService(Configuration configuration,
	        Map<Integer, Class<IMonitoringRecord>> recordList, String hostname, int port) {
		super(configuration, recordList);
		this.port = port;
		this.hostname = hostname;
	}

	@Override
    protected void sourceSetup() throws Exception {
		super.sourceSetup();
		final Socket socket = new Socket(hostname, port);
		in = new DataInputStream(socket.getInputStream());
    }

	@Override
    protected void sourceClose() throws Exception {
	    in.close();	    
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
			final Integer id = in.readInt();
			final LookupEntity recordProperty = recordMap.get(id);
			if (recordProperty != null) {
				final Object values[] = new Object[recordProperty.parameterTypes.length];

				int i = 0;
				for (Class<?> parameterType : recordProperty.parameterTypes) {
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
						final int bufLen = in.readInt();
						in.read(buffer, 0, bufLen);
						values[i] = new String(buffer, 0, bufLen, "UTF-8");
					} else { // reference types
						values[i] = deserialize();
					}
					i++;
				}

				return recordProperty.constructor.newInstance(new Object[] { values });
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
