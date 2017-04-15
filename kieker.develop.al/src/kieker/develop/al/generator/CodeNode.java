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
package kieker.develop.al.generator;

/**
 * Represents a node in source code model.
 *
 * TODO this is a temporary measure and must be replaced by a more general target mapping
 *
 * @author Reiner Jung
 *
 */
public class CodeNode {
	private String path;
	private String classname;
	private String operationSignature;

	/**
	 * Create a code node.
	 *
	 * @param path
	 *            related path
	 * @param classname
	 *            class name
	 * @param operationSignature
	 *            operation signature
	 */
	public CodeNode(final String path, final String classname, final String operationSignature) {
		this.path = path;
		this.classname = classname;
		this.operationSignature = operationSignature;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(final String path) {
		this.path = path;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(final String classname) {
		this.classname = classname;
	}

	public String getOperationSignature() {
		return this.operationSignature;
	}

	public void setOperationSignature(final String operationSignature) {
		this.operationSignature = operationSignature;
	}

}
