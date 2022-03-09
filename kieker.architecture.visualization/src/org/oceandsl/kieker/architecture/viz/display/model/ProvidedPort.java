/**
 * 
 */
package org.oceandsl.kieker.architecture.viz.display.model;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Reiner Jung
 * @since 1.4
 *
 */
public class ProvidedPort extends Port {
	
	Set<RequiredPort> requiringPorts = new HashSet<>();

	public ProvidedPort(String label, Object derivedFrom, Component component) {
		super(label, derivedFrom, component);
	}
	
	public Set<RequiredPort> getRequiringPorts() {
		return requiringPorts;
	}
	
	public String print(String offset) {
		return String.format("%sP %s\n", offset, super.print(""));
	}
}
