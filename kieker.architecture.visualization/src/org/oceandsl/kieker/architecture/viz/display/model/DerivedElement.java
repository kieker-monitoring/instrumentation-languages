/**
 * 
 */
package org.oceandsl.kieker.architecture.viz.display.model;

/**
 * @author Reiner Jung
 * @since 1.4
 *
 */
public class DerivedElement<T extends Object> {

	private final T derivedFrom;
	private final String label;
	
	public DerivedElement(String label, T derivedFrom) {
		this.label = label;
		this.derivedFrom = derivedFrom;
	}
	
	public T getDerivedFrom() {
		return derivedFrom;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String print(String offset) {
		return String.format("%s%s (%s)", offset, this.label, this.derivedFrom);
	}
}
