/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.generator.java;

/**
 * This class lists all features of the generator for specific
 * Kieker target versions. The version name pattern is
 * major.minor.release-suffix
 * where major is compulsory, other values are optional.
 * The values for major, minor and release are integer values, where
 * suffix can be any string. A missing minor or release is automatically
 * substituted for 0.
 * Furthermore, the range values are always included, e.g.,
 * 1.0:1.2 includes all version form 1.0.0 to 1.2.0. That includes
 * 1.0.1, 1.0.2, 1.1, ... up until 1.2, 1.2.0, but not 1.2.1 or later.
 * 
 * @author Reiner Jung
 *
 */
public final class GeneratorFeatures {	
	/** ByteBuffer support: factory, constructor and initFromBytes feature. */
	public static final String BYTE_BUFFER_DESERIALIZER = "1.0:1.12";
	
	/** ObjectArray support: factory, constructor and initFromArray feature. */
	public static final String ARRAY_DESERIALIZER = "1.0:1.13";
	
	/** Generic deserializer support: factory, constructor. */
	public static final String GENERIC_DESERIALIZER = "1.13:";
	
	/**
	 * Configuration class. Should not be instantiated.
	 */
	private GeneratorFeatures() {}
}
