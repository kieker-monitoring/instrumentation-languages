/**
 * 
 */
package kieker.architecture.visualization.display.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Reiner Jung
 * @since 1.4
 *
 */
public class DerivedElement<T extends Object> {

	private final Set<T> derivedFrom = new HashSet<>();
	private final String label;
	
	public DerivedElement(String label, T derivedFrom) {
		this.label = label;
		if (derivedFrom != null)
			this.derivedFrom.add(derivedFrom);
	}
	
	public Set<T> getDerivedFrom() {
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
