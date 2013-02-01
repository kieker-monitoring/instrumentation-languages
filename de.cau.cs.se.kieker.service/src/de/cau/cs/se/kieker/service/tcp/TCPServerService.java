/**
 * 
 */
package de.cau.cs.se.kieker.service.tcp;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

/**
 * @author rju
 *
 */
public class TCPServerService extends TCPService {

	private int port;

	/**
	 * @param configuration
	 * @param recordList
	 */
	public TCPServerService(Configuration configuration,
	        Map<Integer, Class<IMonitoringRecord>> recordList, int port) {
		super(configuration, recordList);
		this.port = port;
	}

	@Override
    protected void sourceSetup() throws Exception {
		final ServerSocket serverSocket = new ServerSocket(port);
		final Socket socket = serverSocket.accept();
		in = new DataInputStream(socket.getInputStream());
    }

	@Override
    protected void sourceClose() throws Exception {
	    in.close();	    
    }

}
