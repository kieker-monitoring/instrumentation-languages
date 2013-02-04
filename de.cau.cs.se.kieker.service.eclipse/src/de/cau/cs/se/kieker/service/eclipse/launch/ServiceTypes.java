/**
 * 
 */
package de.cau.cs.se.kieker.service.eclipse.launch;

/**
 * @author rju
 *
 */
public enum ServiceTypes {
	TCP_CLIENT("TCP Client"),
	TCP_SERVER("TCP Server"),
	JMS_CLIENT("JMS Connector"),
	JMS_EMBEDDED("JMS Embedded");
	
	String label;
	
	private ServiceTypes(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
}
