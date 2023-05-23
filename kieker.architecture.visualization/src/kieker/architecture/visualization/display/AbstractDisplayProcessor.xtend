package kieker.architecture.visualization.display

import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IMarker

abstract class AbstractDisplayProcessor {

	val	IResource resource
			
	new(IResource resource) {
		this.resource = resource
	}
	
	protected def reportError(int severity, String format, Object... objects) {
		val m = resource.createMarker(IMarker.PROBLEM)
	   	//m.setAttribute(IMarker.LINE_NUMBER, 0)
	   	m.setAttribute(IMarker.MESSAGE, String.format(format, objects))
	   	m.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL)
	   	m.setAttribute(IMarker.SEVERITY, severity)
	}
}