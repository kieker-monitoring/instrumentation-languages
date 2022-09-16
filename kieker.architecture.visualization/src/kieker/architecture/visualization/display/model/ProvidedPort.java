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
public class ProvidedPort extends Port {
	
	Set<RequiredPort> requiringPorts = new HashSet<>();
	ProvidedPort derivedFromPort;
	
	public ProvidedPort(String label, Object derivedFrom, Component component, EPortType portType) {
		super(label, derivedFrom, component, portType);
		this.derivedFromPort = null;
	}
	
	public ProvidedPort(ProvidedPort derivedFromPort, Component component, EPortType portType) {
		super(derivedFromPort.getLabel(), null, component, portType);
		this.derivedFromPort = derivedFromPort;
	}
	
	public ProvidedPort getDerivedFromPort() {
		return derivedFromPort;
	}
	
	public Set<RequiredPort> getRequiringPorts() {
		return requiringPorts;
	}
	
	public String print(String offset) {
		return String.format("%sP %s\n", offset, super.print(""));
	}
}
