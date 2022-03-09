/**
 * 
 */
package org.oceandsl.kieker.architecture.viz.display.model;

import java.util.HashSet;
import java.util.Set;

import analysismodel.assembly.AssemblyComponent;

/**
 * @author Reiner Jung
 * @since 1.4
 */
public class Component extends DerivedElement<AssemblyComponent> {

	private final Set<Component> children = new HashSet<>();
	private final Set<ProvidedPort> providedPorts = new HashSet<>();
	private final Set<RequiredPort> requiredPorts = new HashSet<>();

	private final Component parent;

	public Component(String label, AssemblyComponent derivedFrom, Component parent) {
		super(label, derivedFrom);
		this.parent = parent;
	}
	
	public Set<Component> getChildren() {
		return children;
	}
	
	public Set<ProvidedPort> getProvidedPorts() {
		return providedPorts;
	}
	
	public Set<RequiredPort> getRequiredPorts() {
		return requiredPorts;
	}
	
	public Component getParent() {
		return parent;
	}
	
	public String print(String offset) {
		final StringBuilder result = new StringBuilder();
		result.append(super.print(offset) + "{\n");
		providedPorts.forEach(port -> result.append(port.print(offset + "  ")));
		requiredPorts.forEach(port -> result.append(port.print(offset + "  ")));
		result.append("\n");
		children.forEach(child -> result.append(child.print(offset + "  ")));
		result.append(String.format("%s}\n", offset));
		return result.toString();
	}
}
