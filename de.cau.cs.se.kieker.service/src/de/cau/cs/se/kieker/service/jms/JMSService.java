/**
 * 
 */
package de.cau.cs.se.kieker.service.jms;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import de.cau.cs.se.kieker.service.Service;

/**
 * @author rju
 *
 */
public class JMSService extends Service {

	/**
	 * @param configuration
	 */
	public JMSService(Configuration configuration) {
		super(configuration);
		// TODO Auto-generated constructor stub
	}

	@Override
    protected IMonitoringRecord deserialize() throws Exception {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    protected void sourceSetup() throws Exception {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    protected void sourceClose() throws Exception {
	    // TODO Auto-generated method stub
	    
    }

}
