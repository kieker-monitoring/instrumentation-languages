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
	 * Construct a new JMS service consumer and an embedded JMS service.
	 * 
	 * @param configuration
	 *            Kieker configuration object
	 * @param recordMap
	 *            IMonitoringRecord id map
	 * @param port
	 * 			  Port the JMS service is listening to
	 * @throws URISyntaxException
	 *             if the URI is malformed. Most likely will not happen.
	 */
	public JMSEmbeddedService(final Configuration configuration, final Map<Integer, Class<IMonitoringRecord>> recordMap, final int port) throws URISyntaxException {
		super(configuration, recordMap, null, null, new URI("tcp://localhost:" + port));
		this.port = port;
	}

	@Override
	protected void sourceSetup() throws Exception {
		this.broker = new BrokerService();
		this.broker.setUseJmx(true);
		this.broker.addConnector("tcp://localhost:" + this.port);
		this.broker.start();
		super.sourceSetup();
	}

	@Override
	protected void sourceClose() throws Exception {
		super.sourceClose();
		this.broker.stop();
	}

}
