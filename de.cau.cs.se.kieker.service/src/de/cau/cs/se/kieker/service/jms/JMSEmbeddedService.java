/**
 * 
 */
package de.cau.cs.se.kieker.service.jms;

import org.apache.activemq.broker.BrokerService;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import de.cau.cs.se.kieker.service.Service;

/**
 * @author rju
 *
 */
public class JMSEmbeddedService extends Service {
	private BrokerService broker;
	private int port;

	/**
	 * @param configuration
	 */
	public JMSEmbeddedService(Configuration configuration, int port) {
		super(configuration);
		this.port = port;
	}

	@Override
    protected IMonitoringRecord deserialize() throws Exception {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    protected void sourceSetup() throws Exception {
		broker = new BrokerService();
        broker.setUseJmx(true);
        broker.addConnector("tcp://localhost:" + port);
        broker.start();
    }

	@Override
    protected void sourceClose() throws Exception {
	    broker.stop();	    
    }

}
