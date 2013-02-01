/**
 * 
 */
package de.cau.cs.se.kieker.service.tcp;

import java.io.DataInputStream;
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
		final Socket socket = new Socket(hostname, port);
		in = new DataInputStream(socket.getInputStream());
    }

	@Override
    protected void sourceClose() throws Exception {
	    in.close();	    
    }

}
