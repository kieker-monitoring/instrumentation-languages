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
public class StaticArray extends AbstractMonitoringRecord implements IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory {
	public static final int SIZE = 8; // serialization size (without variable part of strings)
	private static final long serialVersionUID = 1395682704787L;
	
	private static final Class<?>[] TYPES = {
		int[].class, // StaticArray.v
		int[][][].class, // StaticArray.combi
	};
	
	public static final int[] V = { 1, 2, 3, 4 };
	
	private final int[] v;
	private final int[][][] combi;

	/**
	 * Creates a new instance of this class using the given parameters.
	 * 
	 * @param v
	 *            v
	 * @param combi
	 *            combi
	 */
	public StaticArray(final int[] v, final int[][][] combi) {
		this.v = v;
		this.combi = combi;
	}

	/**
	 * This constructor converts the given array into a record. It is recommended to use the array which is the result of a call to {@link #toArray()}.
	 * 
	 * @param values
	 *            The values for the record.
	 */
	public StaticArray(final Object[] values) { // NOPMD (direct store of values)
		AbstractMonitoringRecord.checkArray(values, TYPES);
		this.v = (int[]) values[0];
		this.combi = (int[][][]) values[1];
	}
	
	/**
	 * This constructor uses the given array to initialize the fields of this record.
	 * 
	 * @param values
	 *            The values for the record.
	 * @param valueTypes
	 *            The types of the elements in the first array.
	 */
	protected StaticArray(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
		AbstractMonitoringRecord.checkArray(values, valueTypes);
		this.v = (int[]) values[0];
		this.combi = (int[][][]) values[1];
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
	public StaticArray(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
		// load array sizes
		v = new int[4];
		for (int i0=0;i0<4;i0++)
			this.v[i0] = buffer.getInt();
		
		// load array sizes
		int _combi_size1 = buffer.getInt();
		combi = new int[2][_combi_size1][2];
		for (int i0=0;i0<2;i0++)
			for (int i1=0;i1<_combi_size1;i1++)
				for (int i2=0;i2<2;i2++)
					this.combi[i0][i1][i2] = buffer.getInt();
	}

	/**
	 * {@inheritDoc}
	 */
	public Object[] toArray() {
		return new Object[] {
			this.getV(),
			this.getCombi()
		};
	}

	/**
	 * {@inheritDoc}
	 */
	public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
		// store array sizes
		for (int i0=0;i0<4;i0++)
			buffer.putInt(this.getV()[i0]);
		
		// store array sizes
		int _combi_size1 = this.getCombi()[0].length;
		buffer.putInt(_combi_size1);
		for (int i0=0;i0<2;i0++)
			for (int i1=0;i1<_combi_size1;i1++)
				for (int i2=0;i2<2;i2++)
					buffer.putInt(this.getCombi()[i0][i1][i2]);
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

	public final int[] getV() {
		return this.v;
	}
	
	public final int[][][] getCombi() {
		return this.combi;
	}
	
}
