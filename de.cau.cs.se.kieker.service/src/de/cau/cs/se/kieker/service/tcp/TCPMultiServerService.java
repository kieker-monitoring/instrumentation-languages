/**
 * 
 */
package de.cau.cs.se.kieker.service.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

/**
 * @author rju
 *
 */
public class TCPMultiServerService extends TCPService {

	private int QUEUE_CAPACITY = 10;
	
	private int port;
	private List<Runnable> serviceThreads = new ArrayList<Runnable>();
	private BlockingQueue<IMonitoringRecord> recordQueue;
	
	private ServerSocket serverSocket;

	/**
	 * @param configuration
	 * @param recordList
	 */
	public TCPMultiServerService(Configuration configuration,
	        Map<Integer, Class<IMonitoringRecord>> recordList, int port) {
		super(configuration, recordList);
		this.port = port;
	}

	@Override
    protected void sourceSetup() throws Exception {
		super.sourceSetup();
		recordQueue = new ArrayBlockingQueue<IMonitoringRecord>(QUEUE_CAPACITY);
		serverSocket = new ServerSocket(port);
		new ListenerThread();
    }

	@Override
    protected void sourceClose() throws Exception {
		serverSocket.close();
    }

	@Override
    protected IMonitoringRecord deserialize() throws Exception {
	    return recordQueue.take();
    }
	
	class ListenerThread implements Runnable {
		
		@Override
        public void run() {
            // accept client connections
			try {
				while (active) 
					serviceThreads.add(new ServiceThread(serverSocket.accept()));
            } catch (IOException e) {
                active = false;
            }
			
        }	
	}
	
	class ServiceThread implements Runnable {
		private DataInputStream in;
		private final Socket socket;
		private int BUF_LEN = 65536;
		private byte buffer[] = new byte[BUF_LEN];
		
		public ServiceThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
        public void run() {
            while (active) {
            	try {
                    in = new DataInputStream(socket.getInputStream());
                    recordQueue.put(deserialize());
                } catch (IOException e) {
                    active = false;
                    System.out.println("Listener " + Thread.currentThread().getId() + " died. Cause " + e.getMessage());
                } catch (Exception e) {
                	active = false;
                    System.out.println("Listener " + Thread.currentThread().getId() + " died. Cause " + e.getMessage());
                }
            }
            try {
	            socket.close();
            } catch (IOException e) {
	            // ignore, as server is shutting down anyway.
            }
        }
			
		private IMonitoringRecord deserialize() throws Exception {
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

}
