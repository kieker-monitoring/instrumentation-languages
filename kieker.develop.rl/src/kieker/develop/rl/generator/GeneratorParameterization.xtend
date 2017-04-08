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

/**
 * Generator parameter POJO for configuration settings
 * which are not provided by the modeled artifacts or
 * default values for optional input.
 * 
 * @author Reiner Jung
 * @since 1.2
 */
class GeneratorParameterization {
	val String header
	val String author
	val String version
	
	new(String header, String author, String version) {
		this.header = header
		this.author = author
		this.version = version
	}
	
	def String getHeader() {
		return header
	}
	
	def String getAuthor() {
		return author
	}
	
	def String getVersion() {
		return version
	}
	
}