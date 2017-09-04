/**
 * 
 */
package kieker.develop.rl.generator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import kieker.develop.rl.recordLang.ComplexType;
import kieker.develop.rl.recordLang.RecordLangFactory;

/**
 * @author reiner
 *
 */
public class TestAbstractTypeGenerator {
	
	private static final String HEADER = "HEADER";
	private static final String AUTHOR = "AUTHOR";
	private static final String VERSION = "VERSION";
	private static final Version TARGET_VERSION = new Version("1.2");
	private AbstractTypeGenerator<ComplexType, String> generator;
	private final ComplexType type = RecordLangFactory.eINSTANCE.createEventType();

	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		generator = new AbstractTypeGenerator<ComplexType, String>() {

			@Override
			public boolean accepts(ComplexType type) {
				return true;
			}

			@Override
			protected String createOutputModel(ComplexType type, Version targetVersion, String header, String author,
					String version) {
				return type.getName() + "::" + header + "::" + author + "::" + version;
			}
			
		};
		type.setName("EmptyRecord");
		generator.configure("1.2", HEADER, AUTHOR, VERSION);
	}

	/**
	 * Test method for {@link kieker.develop.rl.generator.AbstractTypeGenerator#isSupported(java.lang.String)}.
	 */
	@Test
	public void testIsSupported() {
		assertEquals("Range error, 1.2 should be in 1.0:1.2 ", true, generator.isSupported("1.0:1.2"));
		assertEquals("Range error, 1.2 should be in 1.2:0:1.3 ", true, generator.isSupported("1.2:1.3"));
		assertEquals("Range error, 1.2 should be out 1:2.1:1.3 ", false, generator.isSupported("1.2.1:1.3"));
		assertEquals("Range error, 1.2 should be in 1.0:", true, generator.isSupported("1.0:"));
		assertEquals("Range error, 1.2 should be in :1.2 ", true, generator.isSupported(":1.2"));
		assertEquals("Range error, 1.2 should be in 1.2:", true, generator.isSupported("1.2:"));
		assertEquals("Range error, 1.2 should be out 1.2.1:", true, generator.isSupported("1.2.1:"));
	}
	
	/**
	 * Test method for {@link kieker.develop.rl.generator.AbstractTypeGenerator#createOutputModel(kieker.develop.rl.recordLang.ComplexType, kieker.develop.rl.generator.Version, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCreateOutputModel() {
		String[] result = generator.createOutputModel(type, TARGET_VERSION, HEADER, AUTHOR, VERSION).split("::");
		assertEquals("Missing parameter", 4, result.length);
		assertArrayEquals("Wrong values in code generation", new String[] { type.getName(), HEADER, AUTHOR, VERSION }, result);
	}

}
