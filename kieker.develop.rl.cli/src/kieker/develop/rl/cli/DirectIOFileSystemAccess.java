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
package kieker.develop.rl.cli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * File system access class used by the generator.
 *
 * @author Reiner Jung
 *
 */
public class DirectIOFileSystemAccess {

	/** Central logger for the compiler. */
	private static final Logger LOG = LogManager.getLogger(DirectIOFileSystemAccess.class);

	private final String projectHostPath;


	/**
	 * Constructor for the headless file system access.
	 *
	 * @param projectHostPath
	 *            root path where the files are stored
	 * @param configurations
	 */
	public DirectIOFileSystemAccess(final String projectHostPath) {
		this.projectHostPath = projectHostPath;
	}

	/**
	 * Store the given contents at a place inside the rootPath specified by the fileName.
	 *
	 * @param fileName
	 *            relative file name and path
	 * @param targetDirectory
	 *            targetDirectory
	 * @param contents
	 *            the content to be stored
	 */
	public void generateFile(final String fileName, final String targetDirectory,
		final CharSequence contents) {
		try {
			final String targetFilePath = this.projectHostPath + File.separator + targetDirectory + File.separator + fileName;
			LOG.info("Create " + targetFilePath);
			final File file = new File(targetFilePath);
			file.getParentFile().mkdirs();
			final BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(contents.toString());
			writer.flush();
			writer.close();
		} catch (final UnsupportedEncodingException e) {
			LOG.error("Error: " + fileName, e);
		} catch (final FileNotFoundException e) {
			LOG.error("Error: " + fileName, e);
		} catch (final IOException e) {
			LOG.error("Error: " + fileName, e);
		}
	}


}
