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

import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

import de.cau.cs.se.kieker.service.AbstractService;

/**
 * @author rju
 * 
 */
public abstract class AbstractTCPService extends AbstractService {

	protected Map<Integer, LookupEntity> lookupEntityMap;
	
	private Map<Integer, Class<IMonitoringRecord>> recordMap;
	
	/**
	 * AbstractTCPService constructor.
	 * 
	 * @param configuration Kieker configuration
	 * @param recordMap IMonitoringRecord to id map
	 */
	public AbstractTCPService(final Configuration configuration, final Map<Integer, Class<IMonitoringRecord>> recordMap) {
		super(configuration);
		this.recordMap = recordMap;
	}

	@Override
	protected void sourceSetup() throws Exception {
		this.lookupEntityMap = new HashMap<Integer, LookupEntity>();
		for (final int key : this.recordMap.keySet()) {
			final Class<IMonitoringRecord> type = this.recordMap.get(key);
			
			final Field parameterTypesField = type.getDeclaredField("TYPES");
			java.security.AccessController.doPrivileged(new PrivilegedAction<Object>() {
				public Object run() {
					parameterTypesField.setAccessible(true);
					return null;
				}
			});
			final LookupEntity entity = new LookupEntity(type
			        .getConstructor(Object[].class), (Class<?>[]) parameterTypesField.get(null));
			this.lookupEntityMap.put(key, entity);
		}
	}

	

}
