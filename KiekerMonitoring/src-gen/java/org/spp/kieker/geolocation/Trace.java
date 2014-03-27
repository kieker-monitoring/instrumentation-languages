/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
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

package org.spp.kieker.geolocation;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

import kieker.common.record.AbstractMonitoringRecord;
import kieker.common.record.IMonitoringRecord;
import kieker.common.util.registry.IRegistry;


/**
 * @author Generic Kieker
 * 
 * @since 1.9
 */
public class Trace extends AbstractMonitoringRecord implements IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory {
	public static final int SIZE = 8; // serialization size (without variable part of strings)
	private static final long serialVersionUID = 1395951938984L;
	
	private static final Class<?>[] TYPES = {
		int[][].class, // Trace.reply
		String[].class, // Trace.hostname
	};
	
	public static final String[] HOSTNAME = { "" };
	
	private final int[][] reply;
	private final String[] hostname;

	/**
	 * Creates a new instance of this class using the given parameters.
	 * 
	 * @param reply
	 *            reply
	 * @param hostname
	 *            hostname
	 */
	public Trace(final int[][] reply, final String[] hostname) {
		this.reply = reply;
		this.hostname = hostname;
	}

	/**
	 * This constructor converts the given array into a record. It is recommended to use the array which is the result of a call to {@link #toArray()}.
	 * 
	 * @param values
	 *            The values for the record.
	 */
	public Trace(final Object[] values) { // NOPMD (direct store of values)
		AbstractMonitoringRecord.checkArray(values, TYPES);
		this.reply = (int[][]) values[0];
		this.hostname = (String[]) values[1];
	}
	
	/**
	 * This constructor uses the given array to initialize the fields of this record.
	 * 
	 * @param values
	 *            The values for the record.
	 * @param valueTypes
	 *            The types of the elements in the first array.
	 */
	protected Trace(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
		AbstractMonitoringRecord.checkArray(values, valueTypes);
		this.reply = (int[][]) values[0];
		this.hostname = (String[]) values[1];
	}

	/**
	 * This constructor converts the given array into a record.
	 * 
	 * @param buffer
	 *            The bytes for the record.
	 * 
	 * @throws BufferUnderflowException
	 *             if buffer not sufficient
	 */
	public Trace(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
		// load array sizes
		int _reply_size0 = buffer.getInt();
		int _reply_size1 = buffer.getInt();
		reply = new int[_reply_size0][_reply_size1];
		for (int i0=0;i0<_reply_size0;i0++)
			for (int i1=0;i1<_reply_size1;i1++)
				this.reply[i0][i1] = buffer.getInt();
		
		// load array sizes
		int _hostname_size0 = buffer.getInt();
		hostname = new String[_hostname_size0];
		for (int i0=0;i0<_hostname_size0;i0++)
			this.hostname[i0] = stringRegistry.get(buffer.getInt());
	}

	/**
	 * {@inheritDoc}
	 */
	public Object[] toArray() {
		return new Object[] {
			this.getReply(),
			this.getHostname()
		};
	}

	/**
	 * {@inheritDoc}
	 */
	public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
		// store array sizes
		int _reply_size0 = this.getReply().length;
		buffer.putInt(_reply_size0);
		int _reply_size1 = this.getReply()[0].length;
		buffer.putInt(_reply_size1);
		for (int i0=0;i0<_reply_size0;i0++)
			for (int i1=0;i1<_reply_size1;i1++)
				buffer.putInt(this.getReply()[i0][i1]);
		
		// store array sizes
		int _hostname_size0 = this.getHostname().length;
		buffer.putInt(_hostname_size0);
		for (int i0=0;i0<_hostname_size0;i0++)
			buffer.putInt(stringRegistry.get(this.getHostname()[i0]));
	}

	/**
	 * {@inheritDoc}
	 */
	public Class<?>[] getValueTypes() {
		return TYPES; // NOPMD
	}

	/**
	 * {@inheritDoc}
	 */
	public int getSize() {
		return SIZE;
	}
	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.Factory} mechanism. Hence, this method is not implemented.
	 */
	@Deprecated
	public void initFromArray(final Object[] values) {
		throw new UnsupportedOperationException();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @deprecated This record uses the {@link kieker.common.record.IMonitoringRecord.BinaryFactory} mechanism. Hence, this method is not implemented.
	 */
	@Deprecated
	public void initFromBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
		throw new UnsupportedOperationException();
	}

	public final int[][] getReply() {
		return this.reply;
	}
	
	public final String[] getHostname() {
		return this.hostname;
	}
	
}
