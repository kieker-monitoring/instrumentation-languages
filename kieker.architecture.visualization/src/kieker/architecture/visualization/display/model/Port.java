/**
 * 
 */
package kieker.architecture.visualization.display.model;

/**
 * @author reiner
 *
 */
public class Port extends DerivedElement<Object> {
	
	Component component;

	public Port(String label, Object derivedFrom, Component component) {
		super(label, derivedFrom);
		this.component = component;
	}
	
	public Component getComponent() {
		return component;
	}
}
