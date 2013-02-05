/**
 * 
 */
package de.cau.cs.se.kieker.service.jms;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.activemq.broker.BrokerService;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

/**
 * @author rju
 *
 */
public class JMSEmbeddedService extends JMSService {
	private BrokerService broker;
	private int port;
	
	/**
	 * @param configuration
	 * @param recordList 
	 * @throws URISyntaxException 
	 */
	public JMSEmbeddedService(Configuration configuration, Map<Integer, Class<IMonitoringRecord>> recordList, int port) throws URISyntaxException {
		super(configuration, recordList, null, null,new URI("tcp://localhost:" + port));
		this.port = port;
	}

	@Override
    protected void sourceSetup() throws Exception {
		broker = new BrokerService();
        broker.setUseJmx(true);
        broker.addConnector("tcp://localhost:" + port);
        broker.start();
        super.sourceSetup();
    }

	@Override
    protected void sourceClose() throws Exception {
		super.sourceClose();
	    broker.stop();	    
    }

}
