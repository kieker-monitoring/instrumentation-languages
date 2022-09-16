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
	

	public void addPortType(EPortType type) {
		switch (this.portType) {
		case INTERFACE_CALL:
			switch(type) {
			case OPERATION_CALL_DATAFLOW:
			case OPERATION_DATAFLOW: 
				this.portType = EPortType.INTERFACE_CALL_DATAFLOW;
				break;
			default:
				break;
			}
			break;
		case INTERFACE_CALL_DATAFLOW:
			// do nothing
			break;
		case INTERFACE_DATAFLOW:
			switch (type) {
			case INTERFACE_CALL:
			case OPERATION_CALL:
			case OPERATION_CALL_DATAFLOW:
				this.portType = EPortType.INTERFACE_CALL_DATAFLOW;
				break;
			default:
				break;
			}
			break;
		case OPERATION_CALL:
			switch (type) {
			case OPERATION_CALL_DATAFLOW:
			case OPERATION_DATAFLOW:
				this.portType = EPortType.OPERATION_CALL_DATAFLOW;
				break;
			case INTERFACE_CALL:
			case INTERFACE_CALL_DATAFLOW:
				this.portType = type;
				break;
			case INTERFACE_DATAFLOW:
				this.portType = EPortType.INTERFACE_CALL_DATAFLOW;
			default:
				break;
			}
			break;
		case OPERATION_CALL_DATAFLOW:
			switch (type) {
			case INTERFACE_CALL:
			case INTERFACE_CALL_DATAFLOW:
			case INTERFACE_DATAFLOW:
				this.portType = EPortType.INTERFACE_CALL_DATAFLOW;
				break;
			default:
				break;
			}
			break;
		case OPERATION_DATAFLOW:
			switch(type) {
			case OPERATION_CALL:
			case OPERATION_CALL_DATAFLOW:
				this.portType = EPortType.OPERATION_CALL_DATAFLOW;
				break;
			case INTERFACE_CALL:
			case INTERFACE_CALL_DATAFLOW:
				this.portType = EPortType.INTERFACE_CALL_DATAFLOW;
				break;
			case INTERFACE_DATAFLOW:
				this.portType = EPortType.INTERFACE_DATAFLOW;
				break;
			default:
				break;
			}
			break;
		}
	}

}
