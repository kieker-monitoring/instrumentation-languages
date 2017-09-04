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
package kieker.develop.rl.generator

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.rl.recordLang.ComplexType

/**
 * Abstract type generator realizing common parameters.
 * 
 * @param <S>
 * @param <T>
 * 
 * @author Reiner Jung
 */
abstract class AbstractTypeGenerator<S extends ComplexType, T> implements IGenerator<S, T>, IAcceptType, IConfigureParameters {

	protected String header
	
	protected String author
	
	protected String version
	
	protected Version targetVersion
	
	override configure(String targetVersion, String header, String author, String version) {
		this.targetVersion = new Version(targetVersion)
		this.header = header
		this.author = author
		this.version = version
	}
		
	/**
	 * Tests whether the given range includes the pre set targetVersion.
	 * The range is defined by two version values separated by :
	 * 
	 * @param range range values.
	 * @returns true if the targetVersion is inside the range
	 */
	def boolean isSupported(String range) {
		var String lowVersion
		var String highVersion
		val rangeValues = range.split(":");
		if (rangeValues.size == 2) {
			lowVersion = rangeValues.get(0)
			highVersion = rangeValues.get(1)
		} else {
			if (range.startsWith(":")) {
				lowVersion = ""
				highVersion = rangeValues.get(0)
			} else if (range.endsWith(":")) {
				lowVersion = rangeValues.get(0)
				highVersion = ""
			} else
				return false
		}
		
		if (lowVersion.empty) {
			if (highVersion.empty) {
				return true
			} else {
				val high = new Version(highVersion)
				return high.equalHigher(targetVersion)			
			}
		} else if (highVersion.empty) {
			val low = new Version(lowVersion)
			return low.equalLower(low)
		} else {
			val low = new Version(lowVersion)
			val high = new Version(highVersion)
		
			return low.equalLower(targetVersion) && high.equalHigher(targetVersion)
		}			
	}
	
	/**
	 * Primary code generation function.
	 * 
	 * @params type
	 * 		one record type to be used to create monitoring record
	 */
	override generate(S input) {
		val definedAuthor = if (input.author === null) this.author else input.author
		val definedVersion = if (input.since === null) this.version else input.since

		return createOutputModel(input, targetVersion, header, definedAuthor, definedVersion)
	}
		
	protected abstract def T createOutputModel(S type, Version targetVersion, String header, String author, String version)
	
}

/**
 * Represents the compiler target code version.
 */
class Version {
	int major
	int minor
	int release
	
	new(String version) {
		val values = version.split("\\.")
		if (values.size>0)
			major = Integer.parseInt(values.get(0))
		else
			major = 0
		if (values.size>1)	
			minor = Integer.parseInt(values.get(1))
		else
			minor = 0
		if (values.size == 3)
			release = Integer.parseInt(values.get(2))
		else
			release = 0			
	}
	
	def boolean equalLower(Version compare) {
		if (major < compare.major) {
			return true
		} else if (major > compare.major) {
			return false
		} else {
			if (minor < compare.minor) {
				return true
			} else if ( minor > compare.minor) {
				return false
			} else {
				return release <= compare.release
			}
		}
	}
	
	def boolean equalHigher(Version compare) {
		if (major > compare.major) {
			return true
		} else if (major < compare.major) {
			return false
		} else {
			if (minor > compare.minor) {
				return true
			} else if ( minor < compare.minor) {
				return false
			} else {
				return release >= compare.release
			}
		}
	}
}