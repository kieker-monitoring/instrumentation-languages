/**
 *
 */
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
