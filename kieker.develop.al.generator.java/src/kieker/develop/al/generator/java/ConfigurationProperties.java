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
package kieker.develop.al.generator.java;

/**
 * Configuration properties for Java code generation.
 *
 * @author Reiner Jung
 *
 */
public final class ConfigurationProperties {

	public static final String LANG_JAVA = "java";

	public static final String TECH_ASPECT_J = "AspectJ";
	public static final String TECH_JAVA_EE = "JavaEE";
	public static final String TECH_SERVLET = "Spring";
	public static final String TECH_SPRING = "Spring";

	public static final String ASPECT_J_ADVICE_OUTLET_ID = "java";
	public static final String JAVA_EE_ADVICE_OUTLET_ID = "java";
	public static final String SERVLET_ADVICE_OUTLET_ID = "java";
	public static final String SPRING_ADVICE_OUTLET_ID = "java";

	public static final String ASPECT_J_CONFIGURATION_OUTLET_ID = "java";
	public static final String JAVA_EE_CONFIGURATION_OUTLET_ID = "java";
	public static final String SERVLET_CONFIGURATION_OUTLET_ID = "java";
	public static final String SPRING_CONFIGURATION_OUTLET_ID = "java";

	/**
	 * Utility class. Make sure the class cannot be instantiated.
	 */
	private ConfigurationProperties() {}
}
