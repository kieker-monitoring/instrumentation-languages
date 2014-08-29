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
package de.cau.cs.se.instrumentation.rl.generator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import de.cau.cs.se.instrumentation.rl.ouput.config.OutletConfiguration;

/**
 * Configuration and registration of IRL generators.
 * The class also contains functions for derived values based on the
 * configuration values.
 * 
 * @author Reiner Jung
 * 
 * @since 1.0
 * 
 */
public class GeneratorConfiguration {
	/** list of all generators to support RecordType */
	public final static Class<?>[] recordTypeGenerators = {
		de.cau.cs.se.instrumentation.rl.generator.c.main.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.c.header.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.java.record.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.java.junit.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.perl.RecordTypeGenerator.class
	};

	/** list of all generators to support PartialRecordType */
	public final static Class<?>[] partialRecordTypeGenerators = {
		de.cau.cs.se.instrumentation.rl.generator.java.record.PartialRecordTypeGenerator.class
	};

	/** list of all outlet configurations */
	public final static OutletConfiguration[] outletConfigurations = {
		new OutletConfiguration("java", "Java Output Folder", "./src-gen/java"),
		new OutletConfiguration("junit", "Junit Output Folder", "./test-gen/common"),
		new OutletConfiguration("c", "C Output Folder", "./src-gen/c"),
		new OutletConfiguration("perl", "Perl Output Folder", "./src-gen/perl")
	};

	/**
	 * Return a list of all registered generators.
	 */
	public static List<String> getPresentGenerators() {
		final List<String> presentLanguages = new ArrayList<String>();
		try {
			for (final Class<?> generatorType : recordTypeGenerators) {
				@SuppressWarnings("unchecked")
				final AbstractRecordTypeGenerator cg = ((Class<AbstractRecordTypeGenerator>) generatorType).
						getConstructor().newInstance();
				boolean exists = false;
				for (final String existingType : presentLanguages) {
					if (existingType.equals(cg.outletType())) {
						exists = true;
						break;
					}
				}
				if (!exists) {
					presentLanguages.add(cg.outletType());
				}
			}
		} catch (final InstantiationException e) {
			e.printStackTrace();
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		} catch (final IllegalArgumentException e) {
			e.printStackTrace();
		} catch (final InvocationTargetException e) {
			e.printStackTrace();
		} catch (final NoSuchMethodException e) {
			e.printStackTrace();
		} catch (final SecurityException e) {
			e.printStackTrace();
		}

		return presentLanguages;
	}
}
