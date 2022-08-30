/**
 * 
 */
package kieker.architecture.visualization.display.model;

/**
 * @author Reiner Jung
 * @since 1.3.0
 *
 */
public class Port extends DerivedElement<Object> {
	
	Component component;
	private EPortType portType;

	public Port(String label, Object derivedFrom, Component component, EPortType portType) {
		super(label, derivedFrom);
		this.component = component;
		this.portType = portType;
	}
	
	public Component getComponent() {
		return component;
	}
	
	public EPortType getPortType() {
		return portType;
	}
	
	public void setPortType(EPortType portType) {
		this.portType = portType;
	}
}
