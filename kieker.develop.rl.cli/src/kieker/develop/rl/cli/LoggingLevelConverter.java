/***************************************************************************
 * Copyright 2018 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.rl.cli;

import org.apache.log4j.Level;

/**
 * Level converter for specifying the log level at command line.
 *
 * @author Reiner Jung
 *
 */
public class LoggingLevelConverter implements com.beust.jcommander.IStringConverter<Level> {

	/**
	 * Create a LoggingLevelConverter.
	 */
	public LoggingLevelConverter() {
		// default constructor
	}

	@Override
	public Level convert(final String levelName) {
		return Level.toLevel(levelName);
	}

}
