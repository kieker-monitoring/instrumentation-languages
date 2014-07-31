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

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class provides a fixed scanFolder routine for the StandaloneSetup.
 * (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=440869)
 * 
 * @author Reiner Jung
 * 
 */
public class StandaloneSetup extends org.eclipse.emf.mwe.utils.StandaloneSetup {

	private final Log log = LogFactory.getLog(this.getClass());

	/**
	 * Explicit constructor.
	 */
	public StandaloneSetup() {
		super();
	}

	@Override
	protected boolean scanFolder(final File f, final Set<String> visitedPathes) {
		try {
			if (!visitedPathes.add(f.getCanonicalPath())) {
				return true;
			}
		} catch (final IOException e) {
			this.log.error(e.getMessage(), e);
			return true;
		}
		final File[] files = f.listFiles();
		boolean containsProject = false;
		if (files != null) {
			for (final File file : files) {
				if (file.exists() && file.isDirectory() && !file.getName().startsWith(".")) {
					containsProject |= this.scanFolder(file, visitedPathes);
				} else if (".project".equals(file.getName())) {
					this.registerProject(file);
					containsProject = true;
				} else if (file.getName().endsWith(".jar")) {
					this.registerBundle(file);
				}
			}
		}

		return containsProject;
	}
}
