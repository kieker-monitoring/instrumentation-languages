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
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.util.RuntimeIOException;

import kieker.common.logging.Log;
import kieker.common.logging.LogFactory;
import kieker.develop.rl.outlet.AbstractOutletConfiguration;
import kieker.develop.rl.recordLang.ComplexType;

/**
 * File system access class used by the generator.
 *
 * @author Reiner Jung
 *
 */
public class DirectIOFileSystemAccess implements IFileSystemAccess2 {

	/** Central logger for the compiler. */
	private static final Log LOG = LogFactory.getLog(DirectIOFileSystemAccess.class);

	private final String projectPathPrefix;

	private final Collection<AbstractOutletConfiguration<ComplexType, Object>> outlets;

	/**
	 * Constructor for the headless file system access.
	 *
	 * @param projectPathPrefix
	 *            root path where the files are stored
	 * @param configurations
	 */
	public DirectIOFileSystemAccess(final String projectPathPrefix, final Collection<AbstractOutletConfiguration<ComplexType, Object>> outlets) {
		this.projectPathPrefix = projectPathPrefix;
		this.outlets = outlets;
	}

	/**
	 * Store the given contents at a place inside the rootPath specified by the fileName.
	 *
	 * @param fileName
	 *            relative file name and path
	 * @param contents
	 *            the content to be stored
	 */
	@Override
	public void generateFile(final String fileName, final CharSequence contents) {
		this.generateFile(fileName, "none", contents);
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
	@Override
	public void generateFile(final String fileName, final String outputConfigurationName,
			final CharSequence contents) {
		LOG.info(">> " + fileName);
		final AbstractOutletConfiguration<ComplexType, Object> outlet = this.getOutletConfiguration(outputConfigurationName);
		if (outlet != null) {
			try {
				final String targetFilePath = this.projectPathPrefix + File.separator + outlet.getDirectory() + File.separator + fileName;
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
		} else {
			LOG.error("Output for " + outputConfigurationName + " not configured. Language not supported.");
		}
	}

	/**
	 * Find a output configuration based on its name.
	 *
	 * @param outputConfigurationName
	 *            the output configuration name
	 * @return either a valid output configuration or null if no such output configuration exist
	 */
	private AbstractOutletConfiguration<ComplexType, Object> getOutletConfiguration(final String outputConfigurationName) {
		for (final AbstractOutletConfiguration<ComplexType, Object> configuration : this.outlets) {
			if (configuration.getName().equals(outputConfigurationName)) {
				return configuration;
			}
		}
		return null;
	}

	/**
	 * Delete the specified file from the root path.
	 *
	 * @param fileName
	 *            file to be deleted
	 */
	@Override
	public void deleteFile(final String fileName) {
		LOG.info("Delete " + this.projectPathPrefix + File.separator + fileName);
		final File file = new File(this.projectPathPrefix + File.separator + fileName);
		if (file.exists()) {
			file.delete();
		}
	}

	@Override
	public void deleteFile(final String fileName, final String outputConfigurationName) {
		this.deleteFile(fileName);
	}

	@Override
	public URI getURI(final String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getURI(final String arg0, final String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateFile(final String fileName, final InputStream content) throws RuntimeIOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void generateFile(final String fileName, final String outputConfigurationName, final InputStream content) throws RuntimeIOException {
		// TODO Auto-generated method stub

	}

	@Override
	public InputStream readBinaryFile(final String arg0) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream readBinaryFile(final String arg0, final String arg1) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharSequence readTextFile(final String arg0) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharSequence readTextFile(final String arg0, final String arg1) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFile(final String arg0) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFile(final String arg0, final String arg1) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return false;
	}

}
