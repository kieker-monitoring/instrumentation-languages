package kieker.architecture.visualization.utils

import kieker.model.analysismodel.execution.EDirection
import kieker.architecture.visualization.display.model.EPortType

class ModelUtils {
	
	static def isWrite(EDirection direction) {
		#[EDirection.WRITE, EDirection.BOTH].contains(direction)
	}

	static def isRead(EDirection direction) {
		#[EDirection.READ, EDirection.BOTH].contains(direction)
	}
	
	static def isDataflow(EPortType type) {
		#[EPortType.OPERATION_DATAFLOW, EPortType.OPERATION_CALL_DATAFLOW].contains(type)
	}

	static def isCall(EPortType type) {
		#[EPortType.OPERATION_CALL, EPortType.OPERATION_CALL_DATAFLOW].contains(type)
	}
	
}