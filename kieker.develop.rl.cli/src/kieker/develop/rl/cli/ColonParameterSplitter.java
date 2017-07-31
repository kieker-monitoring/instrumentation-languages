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
package kieker.develop.rl.cli;

import java.util.Arrays;
import java.util.List;

import com.beust.jcommander.converters.IParameterSplitter;

/**
 * Colon parameter Splitter for parsing paramters with JCommander.
 *
 * @author Reiner Jung
 *
 */
public class ColonParameterSplitter implements IParameterSplitter {

	public ColonParameterSplitter() {

	}

	@Override
	public List<String> split(final String argument) {
		return Arrays.asList(argument.split(":"));
	}

}
