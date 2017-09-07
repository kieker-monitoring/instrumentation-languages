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
package kieker.develop.rl.generator.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import kieker.develop.rl.generator.AbstractTypeGenerator;
import kieker.develop.rl.generator.Version;
import kieker.develop.rl.recordLang.ComplexType;
import kieker.develop.rl.recordLang.RecordLangFactory;

/**
 * @author reiner
 *
 */
public class TestAbstractTypeGenerator { // NOCS -- its a test

	private static final String HEADER = "HEADER";
	private static final String AUTHOR = "AUTHOR";
	private static final String VERSION = "VERSION";
	private static final String TARGET_VERSION = "1.2";
	private AbstractTypeGenerator<ComplexType, String> generator;
	private final ComplexType emptyTestType = RecordLangFactory.eINSTANCE.createEventType();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.generator = new AbstractTypeGenerator<ComplexType, String>() {

			@Override
			public boolean accepts(final ComplexType type) {
				return true;
			}

			@Override
			protected String createOutputModel(final ComplexType type, final Version targetVersion, final String header,
					final String author, final String version) {
				return type.getName() + "::" + header + "::" + author + "::" + version;
			}

		};
		this.emptyTestType.setName("EmptyRecord");
		this.generator.configure(TestAbstractTypeGenerator.TARGET_VERSION, TestAbstractTypeGenerator.HEADER,
				TestAbstractTypeGenerator.AUTHOR, TestAbstractTypeGenerator.VERSION);
	}

	/**
	 * Test method for
	 * {@link kieker.develop.rl.generator.AbstractTypeGenerator#isSupported(java.lang.String)}.
	 */
	@Test
	public void testIsSupported() {
		final String[] inRanges = new String[] { "1.0:1.2", "1.2:1.3", "1.0:", ":1.2", "1.2:", "1.2:1.3", };
		for (final String range : inRanges) {
			Assert.assertEquals("Range error, " + TestAbstractTypeGenerator.TARGET_VERSION + " should be in " + range,
					true, this.generator.isSupported(range));
		}
		final String[] outRanges = new String[] { "1.2.1:1.3", "1.2.1:", };
		for (final String range : outRanges) {
			Assert.assertEquals("Range error, " + TestAbstractTypeGenerator.TARGET_VERSION + " should be out " + range,
					false, this.generator.isSupported(range));
		}
	}

	/**
	 * Test method for
	 * {@link kieker.develop.rl.generator.AbstractTypeGenerator#createOutputModel(kieker.develop.rl.recordLang.ComplexType, kieker.develop.rl.generator.Version, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGenerate() {
		final String[] result = this.generator.generate(this.emptyTestType).split("::");
		Assert.assertEquals("Missing parameter", 4, result.length);
		Assert.assertArrayEquals("Wrong values in code generation",
				new String[] { this.emptyTestType.getName(), TestAbstractTypeGenerator.HEADER,
						TestAbstractTypeGenerator.AUTHOR, TestAbstractTypeGenerator.VERSION, },
				result);
	}

}
