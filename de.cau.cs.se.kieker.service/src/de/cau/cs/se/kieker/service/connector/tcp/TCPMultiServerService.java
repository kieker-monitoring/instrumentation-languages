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
package de.cau.cs.se.kieker.service.connector.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import kieker.common.record.IMonitoringRecord;

import de.cau.cs.se.kieker.service.LookupEntity;

/**
 * @author rju
 *
 */
public class TCPMultiServerService extends AbstractTCPService {

	private static final int QUEUE_CAPACITY = 10;
	
	private int port;
	private BlockingQueue<IMonitoringRecord> recordQueue;
	
	private ServerSocket serverSocket;
	
	private boolean active;

	/**
	 * Construct new TCPMultiServerService.
	 * 
	 * @param recordMap IMonitoringRecord to id map
	 * @param port TCP port the service listens to
	 */
	public TCPMultiServerService(final Map<Integer, Class<IMonitoringRecord>> recordMap, final int port) {
		super(recordMap);
		this.port = port;
		this.active = true;
	}

	@Override
    public void sourceSetup() throws Exception {
		super.sourceSetup();
		this.recordQueue = new ArrayBlockingQueue<IMonitoringRecord>(QUEUE_CAPACITY);
		this.serverSocket = new ServerSocket(this.port);
		new Runnable() {
			
			@Override
	        public void run() {
	            // accept client connections
				// CHECKSTYLE:OFF checkstyle does not understand that serverSocket and active are from the outer class
				try {
					while (active) {
						new ServiceThread(serverSocket.accept());
					}
	            } catch (IOException e) {
	                active = false;
	            }
				// CHECKSTYLE:ON
	        }	
		};
    }

	@Override
    public void sourceClose() throws Exception {
		this.active = false;
		this.serverSocket.close();
    }

	@Override
    public IMonitoringRecord deserialize() throws Exception {
	    return this.recordQueue.take();
    }

	
	/**
	 * 
	 * @author rju
	 *
	 */
	class ServiceThread implements Runnable {
		private static final int BUF_LEN = 65536;

		private DataInputStream in;
		private final Socket socket;
		private byte[] buffer = new byte[BUF_LEN];
		
		/**
		 * Create a service thread.
		 * 
		 * @param socket service socket
		 */
		public ServiceThread(final Socket socket) {
			this.socket = socket;
		}
		
		@Override
        public void run() {
			// CHECKSTYLE:OFF checkstyle does not understand that recordQueue is from the outer class
            while (active) {
            	try {
                    this.in = new DataInputStream(this.socket.getInputStream());
                    recordQueue.put(deserialize());
                } catch (IOException e) {
                    active = false;
                    System.out.println("Listener " + Thread.currentThread().getId() + " died. Cause " + e.getMessage());
                } catch (InterruptedException e) {
                	active = false;
                    System.out.println("Listener " + Thread.currentThread().getId() + " died. Cause " + e.getMessage());
                    // deserialize does return Exception, therefore at the moment checkstyle has to accept this.
				} catch (Exception e) {
					active = false;
                    System.out.println("Listener " + Thread.currentThread().getId() + " died. Cause " + e.getMessage());
                }
            }
            // CHECKSTYLE:ON
            try {
            	this.socket.close();
            } catch (IOException e) {
	            // ignore, as server is shutting down anyway.
            }
        }
			
		/**
		 * Deserialize a received record.
		 * 
		 * @return a new IMonitoringRecord
		 * @throws Exception throws IOException when unknown record ID is read.
		 */
		private IMonitoringRecord deserialize() throws Exception {
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

}
