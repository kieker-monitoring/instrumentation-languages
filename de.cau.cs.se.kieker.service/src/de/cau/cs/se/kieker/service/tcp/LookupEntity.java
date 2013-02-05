/**
 * 
 */
package de.cau.cs.se.kieker.service.tcp;

import java.lang.reflect.Constructor;

import kieker.common.record.IMonitoringRecord;

/**
 * @author rju
 *
 */
public final class LookupEntity {
	public final Class<?>[] parameterTypes;
	public final Constructor<? extends IMonitoringRecord> constructor;
	
	public LookupEntity(Constructor<? extends IMonitoringRecord> constructor, Class<?>[] parameterTypes) {
		this.parameterTypes = parameterTypes;
		this.constructor = constructor;
	}
}
