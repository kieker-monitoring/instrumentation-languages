/**
 * 
 */
package kieker.architecture.visualization.display.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import kieker.model.analysismodel.assembly.AssemblyComponent;

/**
 * @author Reiner Jung
 * @since 1.4
 */
public class Component extends DerivedElement<AssemblyComponent> {

	private final Set<Component> children = new HashSet<>();
	private final Map<String,ProvidedPort> providedPorts = new HashMap<>();
	private final Map<String,RequiredPort> requiredPorts = new HashMap<>();

	private final Component parent;

	public Component(String label, AssemblyComponent derivedFrom, Component parent) {
		super(label, derivedFrom);
		this.parent = parent;
	}
	
	public Set<Component> getChildren() {
		return children;
	}
	
	public Map<String,ProvidedPort> getProvidedPorts() {
		return providedPorts;
	}
	
	public Map<String,RequiredPort> getRequiredPorts() {
		return requiredPorts;
	}
	
	public Component getParent() {
		return parent;
	}
	
	public String print(String offset) {
		final StringBuilder result = new StringBuilder();
		result.append(super.print(offset) + "{\n");
		providedPorts.values().forEach(port -> result.append(port.print(offset + "  ")));
		requiredPorts.values().forEach(port -> result.append(port.print(offset + "  ")));
		result.append("\n");
		children.forEach(child -> result.append(child.print(offset + "  ")));
		result.append(String.format("%s}\n", offset));
		return result.toString();
	}

}
