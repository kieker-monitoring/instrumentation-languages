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
import java.net.ServerSocket;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

/**
 * @author rju
 * 
 */
public class TCPSingleServerService extends AbstractTCPService {
	private static final int BUF_LEN = 65536;

	private int port;
	private ServerSocket serverSocket;
	private DataInputStream in;

	private byte[] buffer = new byte[BUF_LEN];

	/**
	 * Construct TCPSingleService.
	 * 
	 * @param configuration
	 *            Kieker configuration object
	 * @param recordList
	 *            map of IMonitoringRecords to ids
	 * @param port
	 *            Port the server listens to
	 */
	public TCPSingleServerService(final Configuration configuration,
			final Map<Integer, Class<IMonitoringRecord>> recordList, final int port) {
		super(configuration, recordList);
		this.port = port;
	}

	@Override
	protected void sourceSetup() throws Exception {
		super.sourceSetup();
		this.serverSocket = new ServerSocket(this.port);
		this.in = new DataInputStream(this.serverSocket.accept().getInputStream());
	}

	@Override
	protected void sourceClose() throws Exception {
		this.in.close();
		this.serverSocket.close();
	}

	/**
	 * De-serialize an object reading from the input stream.
	 * 
	 * @return the de-serialized IMonitoringRecord object or null if the stream was terminated by
	 *         the client.
	 * 
	 * @throws Exception
	 *             IOException when an unknown id is received which cannot be mapped to an IMonitoringRecord
	 */
	@Override
	protected IMonitoringRecord deserialize() throws Exception {
		// read structure ID
		try {
			final Integer id = this.in.readInt();
			final LookupEntity recordProperty = lookupEntityMap.get(id);
			if (recordProperty != null) {
				final Object[] values = new Object[recordProperty.parameterTypes.length];

				int i = 0;
				for (Class<?> parameterType : recordProperty.parameterTypes) {
					if (boolean.class.equals(parameterType)) {
						values[i] = this.in.readBoolean();
					} else if (Boolean.class.equals(parameterType)) {
						// CHECKSTYLE:OFF would be a great idea, however could be present in a IMonitoringRecord
						values[i] = new Boolean(this.in.readBoolean());
						// CHECKSTYLE:ON
					} else if (byte.class.equals(parameterType)) {
						values[i] = this.in.readByte();
					} else if (Byte.class.equals(parameterType)) {
						values[i] = new Byte(this.in.readByte());
					} else if (short.class.equals(parameterType)) {
						values[i] = this.in.readShort();
					} else if (Short.class.equals(parameterType)) {
						values[i] = new Short(this.in.readShort());
					} else if (int.class.equals(parameterType)) {
						values[i] = this.in.readInt();
					} else if (Integer.class.equals(parameterType)) {
						values[i] = new Integer(this.in.readInt());
					} else if (long.class.equals(parameterType)) {
						values[i] = this.in.readLong();
					} else if (Long.class.equals(parameterType)) {
						values[i] = new Long(this.in.readLong());
					} else if (float.class.equals(parameterType)) {
						values[i] = this.in.readFloat();
					} else if (Float.class.equals(parameterType)) {
						values[i] = new Float(this.in.readFloat());
					} else if (double.class.equals(parameterType)) {
						values[i] = this.in.readDouble();
					} else if (Double.class.equals(parameterType)) {
						values[i] = new Double(this.in.readDouble());
					} else if (String.class.equals(parameterType)) {
						final int bufLen = this.in.readInt();
						this.in.read(this.buffer, 0, bufLen);
						values[i] = new String(this.buffer, 0, bufLen, "UTF-8");
					} else { // reference types
						// TODO the following code is non standard and will not work
						values[i] = this.deserialize();
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
