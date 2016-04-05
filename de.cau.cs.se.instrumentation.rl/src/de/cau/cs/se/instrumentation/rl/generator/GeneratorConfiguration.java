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
package kieker.tools.rl.generator;

import kieker.tools.rl.ouput.config.OutletConfiguration;

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
public final class GeneratorConfiguration {
	/** list of all generators to support RecordType. */
	public static final Class<?>[] RECORD_TYPE_GENERATORS = {
		kieker.tools.rl.generator.c.main.RecordTypeGenerator.class,
		kieker.tools.rl.generator.c.header.RecordTypeGenerator.class,
		kieker.tools.rl.generator.java.record.RecordTypeGenerator.class,
		kieker.tools.rl.generator.java.junit.RecordTypeGenerator.class,
		kieker.tools.rl.generator.java.factory.RecordFactoryTypeGenerator.class,
		kieker.tools.rl.generator.perl.RecordTypeGenerator.class,
		kieker.tools.rl.generator.delphi.RecordTypeGenerator.class,
	};

	/** list of all generators to support TemplateType. */
	public static final Class<?>[] TEMPLATE_TYPE_GENERATORS = {
		kieker.tools.rl.generator.java.record.TemplateTypeGenerator.class,
	};

	/** list of all outlet configurations. */
	public static final OutletConfiguration[] OUTLET_CONFIGURATIONS = {
		new OutletConfiguration("java", "Java Output Folder", "./src-gen/java"),
		new OutletConfiguration("java-factory", "Java Factory Output Folder", "./src-gen/java-factory"),
		new OutletConfiguration("junit", "Junit Output Folder", "./test-gen/common"),
		new OutletConfiguration("c", "C Output Folder", "./src-gen/c"),
		new OutletConfiguration("perl", "Perl Output Folder", "./src-gen/perl"),
		new OutletConfiguration("delphi", "Delphi Output Folder", "./src-gen/delphi"),
	};

	/**
	 * Empty default constructor.
	 */
	private GeneratorConfiguration() {
		// utility class nothing to do here
	}
}
