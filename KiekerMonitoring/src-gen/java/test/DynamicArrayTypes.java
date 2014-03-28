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
 * @since 1.9
 */
public class DynamicArrayTypes extends AbstractMonitoringRecord implements IMonitoringRecord.Factory, IMonitoringRecord.BinaryFactory {
	public static final int SIZE = 34; // serialization size (without variable part of strings)
	private static final long serialVersionUID = 1396022535390L;
	
	private static final Class<?>[] TYPES = {
		boolean[].class, // DynamicArrayTypes.a
		byte[].class, // DynamicArrayTypes.b
		char[].class, // DynamicArrayTypes.c
		double[].class, // DynamicArrayTypes.d
		float[].class, // DynamicArrayTypes.f
		int[].class, // DynamicArrayTypes.g
		long[].class, // DynamicArrayTypes.h
		short[].class, // DynamicArrayTypes.i
		String[].class, // DynamicArrayTypes.s
	};
	
	
	private final boolean[] a;
	private final byte[] b;
	private final char[] c;
	private final double[] d;
	private final float[] f;
	private final int[] g;
	private final long[] h;
	private final short[] i;
	private final String[] s;

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
	public DynamicArrayTypes(final boolean[] a, final byte[] b, final char[] c, final double[] d, final float[] f, final int[] g, final long[] h, final short[] i, final String[] s) {
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
	public DynamicArrayTypes(final Object[] values) { // NOPMD (direct store of values)
		AbstractMonitoringRecord.checkArray(values, TYPES);
		this.a = (boolean[]) values[0];
		this.b = (byte[]) values[1];
		this.c = (char[]) values[2];
		this.d = (double[]) values[3];
		this.f = (float[]) values[4];
		this.g = (int[]) values[5];
		this.h = (long[]) values[6];
		this.i = (short[]) values[7];
		this.s = (String[]) values[8];
	}
	
	/**
	 * This constructor uses the given array to initialize the fields of this record.
	 * 
	 * @param values
	 *            The values for the record.
	 * @param valueTypes
	 *            The types of the elements in the first array.
	 */
	protected DynamicArrayTypes(final Object[] values, final Class<?>[] valueTypes) { // NOPMD (values stored directly)
		AbstractMonitoringRecord.checkArray(values, valueTypes);
		this.a = (boolean[]) values[0];
		this.b = (byte[]) values[1];
		this.c = (char[]) values[2];
		this.d = (double[]) values[3];
		this.f = (float[]) values[4];
		this.g = (int[]) values[5];
		this.h = (long[]) values[6];
		this.i = (short[]) values[7];
		this.s = (String[]) values[8];
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
	public DynamicArrayTypes(final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws BufferUnderflowException {
		// load array sizes
		int _a_size0 = buffer.getInt();
		a = new boolean[_a_size0];
		for (int i0=0;i0<_a_size0;i0++)
			this.a[i0] = buffer.get()==1?true:false;
		
		// load array sizes
		int _b_size0 = buffer.getInt();
		b = new byte[_b_size0];
		for (int i0=0;i0<_b_size0;i0++)
			this.b[i0] = buffer.get();
		
		// load array sizes
		int _c_size0 = buffer.getInt();
		c = new char[_c_size0];
		for (int i0=0;i0<_c_size0;i0++)
			this.c[i0] = buffer.getChar();
		
		// load array sizes
		int _d_size0 = buffer.getInt();
		d = new double[_d_size0];
		for (int i0=0;i0<_d_size0;i0++)
			this.d[i0] = buffer.getDouble();
		
		// load array sizes
		int _f_size0 = buffer.getInt();
		f = new float[_f_size0];
		for (int i0=0;i0<_f_size0;i0++)
			this.f[i0] = buffer.getFloat();
		
		// load array sizes
		int _g_size0 = buffer.getInt();
		g = new int[_g_size0];
		for (int i0=0;i0<_g_size0;i0++)
			this.g[i0] = buffer.getInt();
		
		// load array sizes
		int _h_size0 = buffer.getInt();
		h = new long[_h_size0];
		for (int i0=0;i0<_h_size0;i0++)
			this.h[i0] = buffer.getLong();
		
		// load array sizes
		int _i_size0 = buffer.getInt();
		i = new short[_i_size0];
		for (int i0=0;i0<_i_size0;i0++)
			this.i[i0] = buffer.getShort();
		
		// load array sizes
		int _s_size0 = buffer.getInt();
		s = new String[_s_size0];
		for (int i0=0;i0<_s_size0;i0++)
			this.s[i0] = stringRegistry.get(buffer.getInt());
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
		// store array sizes
		int _a_size0 = this.isA().length;
		buffer.putInt(_a_size0);
		for (int i0=0;i0<_a_size0;i0++)
			buffer.put((byte)(this.isA()[i0]?1:0));
		
		// store array sizes
		int _b_size0 = this.getB().length;
		buffer.putInt(_b_size0);
		for (int i0=0;i0<_b_size0;i0++)
			buffer.put((byte)this.getB()[i0]);
		
		// store array sizes
		int _c_size0 = this.getC().length;
		buffer.putInt(_c_size0);
		for (int i0=0;i0<_c_size0;i0++)
			buffer.putChar(this.getC()[i0]);
		
		// store array sizes
		int _d_size0 = this.getD().length;
		buffer.putInt(_d_size0);
		for (int i0=0;i0<_d_size0;i0++)
			buffer.putDouble(this.getD()[i0]);
		
		// store array sizes
		int _f_size0 = this.getF().length;
		buffer.putInt(_f_size0);
		for (int i0=0;i0<_f_size0;i0++)
			buffer.putFloat(this.getF()[i0]);
		
		// store array sizes
		int _g_size0 = this.getG().length;
		buffer.putInt(_g_size0);
		for (int i0=0;i0<_g_size0;i0++)
			buffer.putInt(this.getG()[i0]);
		
		// store array sizes
		int _h_size0 = this.getH().length;
		buffer.putInt(_h_size0);
		for (int i0=0;i0<_h_size0;i0++)
			buffer.putLong(this.getH()[i0]);
		
		// store array sizes
		int _i_size0 = this.getI().length;
		buffer.putInt(_i_size0);
		for (int i0=0;i0<_i_size0;i0++)
			buffer.putShort(this.getI()[i0]);
		
		// store array sizes
		int _s_size0 = this.getS().length;
		buffer.putInt(_s_size0);
		for (int i0=0;i0<_s_size0;i0++)
			buffer.putInt(stringRegistry.get(this.getS()[i0]));
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

	public final boolean[] isA() {
		return this.a;
	}
	
	public final byte[] getB() {
		return this.b;
	}
	
	public final char[] getC() {
		return this.c;
	}
	
	public final double[] getD() {
		return this.d;
	}
	
	public final float[] getF() {
		return this.f;
	}
	
	public final int[] getG() {
		return this.g;
	}
	
	public final long[] getH() {
		return this.h;
	}
	
	public final short[] getI() {
		return this.i;
	}
	
	public final String[] getS() {
		return this.s;
	}
	
}
