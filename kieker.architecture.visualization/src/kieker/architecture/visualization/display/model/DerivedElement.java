/**
 * 
 */
package kieker.architecture.visualization.display.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Reiner Jung
 * @since 1.4
 *
 */
public class DerivedElement<T extends Object> {

	private final Collection<T> derivedFrom = new ArrayList<>();
	private final String label;
	
	public DerivedElement(String label, T derivedFrom) {
		this.label = label;
		this.derivedFrom.add(derivedFrom);
	}
	
	public Collection<T> getDerivedFrom() {
		return this.derivedFrom;
	}
	
	public String getLabel() {
		return label;
	}
	
	public String print(String offset) {
		return String.format("%s%s (%s)", offset, this.label, 
				this.derivedFrom);
	}
}
