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

public class LanguageSetup {
	public final static Class<?>[] recordTypeGenerators = {
		de.cau.cs.se.instrumentation.rl.generator.c.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.cheader.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.java.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.java.junit.RecordTypeGenerator.class,
		de.cau.cs.se.instrumentation.rl.generator.perl.RecordTypeGenerator.class
	};

	// list all generators to support PartialRecordType
	public final static Class<?>[] partialRecordTypeGenerators = {
		de.cau.cs.se.instrumentation.rl.generator.java.PartialRecordTypeGenerator.class
	};

	/**
	 * Return a list of all registered generators.
	 */
	public static List<String> getPresentLanguages() {
		final List<String> presentLanguages = new ArrayList<String>();
		try {
			for (final Class<?> generatorType : recordTypeGenerators) {
				final AbstractRecordTypeGenerator cg = ((Class<AbstractRecordTypeGenerator>) generatorType).
						getConstructor().newInstance();
				boolean exists = false;
				for (final String existingType : presentLanguages) {
					if (existingType.equals(cg.getLanguageType())) {
						exists = true;
						break;
					}
				}
				if (!exists) {
					presentLanguages.add(cg.getLanguageType());
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
