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

package test;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

import kieker.common.record.AbstractMonitoringRecord;
import kieker.common.record.IMonitoringRecord;
import kieker.common.util.registry.IRegistry;


/**
 * @author Generic Kieker
 * 
 * @since 1.10
 */
public class SimpleTypes extends AbstractMonitoringRecord implements IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory {
	public static final int SIZE = 34; // serialization size (without variable part of strings)
	private static final long serialVersionUID = 1395754982858L;
	
	private static final Class<?>[] TYPES = {
		boolean.class, // SimpleTypes.a
		byte.class, // SimpleTypes.b
		char.class, // SimpleTypes.c
		double.class, // SimpleTypes.d
		float.class, // SimpleTypes.f
		int.class, // SimpleTypes.g
		long.class, // SimpleTypes.h
		short.class, // SimpleTypes.i
		String.class, // SimpleTypes.s
	};
	
	public static final boolean A = true;
	public static final byte B = 4;
	public static final char C = '4';
	public static final double D = 4.4;
	public static final float F = 4.3f;
	public static final int G = 44;
	public static final long H = 444;
	public static final short I = 123;
	public static final String S = "some demo string";
	
	private final boolean a;
	private final byte b;
	private final char c;
	private final double d;
	private final float f;
	private final int g;
	private final long h;
	private final short i;
	private final String s;

	/**
	 * Creates a new instance of this class using the given parameters.
	 * 
	 * @param a
	 *            a
	 * @param b
	 *            b
	 * @param c
	 *            c
	 * @param d
	 *            d
	 * @param f
	 *            f
	 * @param g
	 *            g
	 * @param h
	 *            h
	 * @param i
	 *            i
	 * @param s
	 *            s
	 */
	public SimpleTypes(final boolean a, final byte b, final char c, final double d, final float f, final int g, final long h, final short i, final String s) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.s = s;
	}

	/**
	 * This constructor converts the given array into a record. It is recommended to use the array which is the result of a call to {@link #toArray()}.
	 * 
	 * @param values
	 *            The values for the record.
	 */
	public SimpleTypes(final Object[] values) { // NOPMD (direct store of values)
		AbstractMonitoringRecord.checkArray(values, TYPES);
		this.a = (boolean) values[0];
		this.b = (byte) values[1];
		this.c = (char) values[2];
		this.d = (double) values[3];
		this.f = (float) values[4];
		this.g = (int) values[5];
		this.h = (long) values[6];
		this.i = (short) values[7];
		this.s = (String) values[8];
	}
	
	/**
	 * This constructor uses the given array to initialize the fields of this record.
	 * 
	 * @param values
	 *            The values for the record.
	 * @param valueTypes
	 *            The types of the elements in the first array.
	 */
	protected SimpleTypes(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
		AbstractMonitoringRecord.checkArray(values, valueTypes);
		this.a = (boolean) values[0];
		this.b = (byte) values[1];
		this.c = (char) values[2];
		this.d = (double) values[3];
		this.f = (float) values[4];
		this.g = (int) values[5];
		this.h = (long) values[6];
		this.i = (short) values[7];
		this.s = (String) values[8];
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
	public SimpleTypes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
		this.a = buffer.get()==1?true:false;
		this.b = buffer.get();
		this.c = buffer.getChar();
		this.d = buffer.getDouble();
		this.f = buffer.getFloat();
		this.g = buffer.getInt();
		this.h = buffer.getLong();
		this.i = buffer.getShort();
		this.s = stringRegistry.get(buffer.getInt());
	}

	/**
	 * {@inheritDoc}
	 */
	public Object[] toArray() {
		return new Object[] {
			this.isA(),
			this.getB(),
			this.getC(),
			this.getD(),
			this.getF(),
			this.getG(),
			this.getH(),
			this.getI(),
			this.getS()
		};
	}

	/**
	 * {@inheritDoc}
	 */
	public void writeBytes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferOverflowException {
		buffer.put((byte)(this.isA()?1:0));
		buffer.put((byte)this.getB());
		buffer.putChar(this.getC());
		buffer.putDouble(this.getD());
		buffer.putFloat(this.getF());
		buffer.putInt(this.getG());
		buffer.putLong(this.getH());
		buffer.putShort(this.getI());
		buffer.putInt(stringRegistry.get(this.getS()));
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

	public final boolean isA() {
		return this.a;
	}
	
	public final byte getB() {
		return this.b;
	}
	
	public final char getC() {
		return this.c;
	}
	
	public final double getD() {
		return this.d;
	}
	
	public final float getF() {
		return this.f;
	}
	
	public final int getG() {
		return this.g;
	}
	
	public final long getH() {
		return this.h;
	}
	
	public final short getI() {
		return this.i;
	}
	
	public final String getS() {
		return this.s;
	}
	
}
