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
package de.cau.cs.se.instrumentation.rl.cli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.xtext.generator.IFileSystemAccess;

/**
 * File system access class used by the generator.
 * 
 * @author Reiner Jung
 * 
 */
public class HeadlessFileSystemAccess implements IFileSystemAccess {

	private String rootPath = "";

	/**
	 * Constructor for the headless file system access.
	 * 
	 * @param rootPath
	 *            root path where the files are stored
	 */
	public HeadlessFileSystemAccess(final String rootPath) {
		this.rootPath = rootPath;
	}

	/**
	 * Store the given contents at a place inside the rootPath specified by the fileName.
	 * 
	 * @param fileName
	 *            relative file name and path
	 * @param contents
	 *            the content to be stored
	 */
	public void generateFile(final String fileName, final CharSequence contents) {
		try {
			System.out.println("File: " + this.rootPath + "/" + fileName);
			final File file = new File(this.rootPath + "/" + fileName);
			file.getParentFile().mkdirs();
			final BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(contents.toString());
			writer.flush();
			writer.close();
		} catch (final UnsupportedEncodingException e) {
			System.out.println("Error: " + e.getLocalizedMessage() + "  " + fileName);
		} catch (final FileNotFoundException e) {
			System.out.println("Error: " + e.getLocalizedMessage() + "  " + fileName);
		} catch (final IOException e) {
			System.out.println("Error: " + e.getLocalizedMessage() + "  " + fileName);
		}
	}

	/**
	 * Store the given contents at a place inside the rootPath specified by the fileName.
	 * 
	 * @param fileName
	 *            relative file name and path
	 * @param outputConfigurationName
	 *            value is ignored, but printed on console
	 * @param contents
	 *            the content to be stored
	 */
	public void generateFile(final String fileName, final String outputConfigurationName,
			final CharSequence contents) {
		System.out.println("OutputconfigurationName " + outputConfigurationName);
		this.generateFile(fileName, contents);
	}

	/**
	 * Delete the specified file from the root path.
	 * 
	 * @param fileName
	 *            file to be deleted
	 */
	public void deleteFile(final String fileName) {
		final File file = new File(fileName);
		if (file.exists()) {
			file.delete();
		}
	}

}
