/**
 * 
 */
package kieker.architecture.visualization.display.model;

import kieker.model.analysismodel.assembly.AssemblyRequiredInterface;

/**
 * 
 * @param <T> derived element of the provided port
 * @param <R> derived element
 * 
 * @author Reiner Jung
 * @since 1.4
 *
 */
public class RequiredPort extends Port {

	private Port providedPort;
	
	public RequiredPort(String label, Object derivedFrom, Component component, EPortType portType) {
		super(label, derivedFrom, component, portType);
	}
		
	public Port getProvidedPort() {
		return providedPort;
	}
	
	public void setProvidedPort(Port providedPort) {
		this.providedPort = providedPort;
	}
	
	public String print(String offset) {
		if (providedPort != null) {
			StringBuilder build = new StringBuilder();
			build.append(String.format("%sR %s -> %s:%s {\n", offset, this.getLabel(), this.providedPort.getComponent().getLabel(), this.providedPort.getLabel()));
			if (this.getDerivedFrom() instanceof AssemblyRequiredInterface) {
				AssemblyRequiredInterface iface = (AssemblyRequiredInterface)this.getDerivedFrom();
				iface.getRequires().getProvidedInterfaceType().getProvidedOperationTypes().values().forEach(op -> build.append(String.format("%s  %s\n", offset, op.getSignature())));
			}
			build.append(String.format("%s}\n",offset));
			return build.toString();
		} else
			return String.format("%sR %s -> %s:%s\n", offset, this.getLabel(),"---", "---");
	}
}
