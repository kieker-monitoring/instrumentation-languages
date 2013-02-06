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
public abstract class TCPService extends AbstractService {

	private Map<Integer, Class<IMonitoringRecord>> recordList;
	protected Map<Integer, LookupEntity> recordMap;
	
	/**
	 * @param configuration
	 */
	public TCPService(Configuration configuration, Map<Integer, Class<IMonitoringRecord>> recordList) {
		super(configuration);
		this.recordList = recordList;
	}

	@Override
	protected void sourceSetup() throws Exception {
		recordMap = new HashMap<Integer,LookupEntity>();
		for (int key : recordList.keySet()) {
			Class<IMonitoringRecord> type = recordList.get(key);
			
			final Field parameterTypesField = type.getDeclaredField("TYPES");
			java.security.AccessController.doPrivileged(new PrivilegedAction<Object>() {
				public Object run() {
					parameterTypesField.setAccessible(true);
					return null;
				}
			});
			LookupEntity entity = new LookupEntity(type
			        .getConstructor(Object[].class), (Class<?>[]) parameterTypesField.get(null));
			recordMap.put(key, entity);
		}
	}

	

}
