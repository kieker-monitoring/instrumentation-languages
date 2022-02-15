/**
 */
package analysismodel.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link analysismodel.trace.Trace#getTraceID <em>Trace ID</em>}</li>
 *   <li>{@link analysismodel.trace.Trace#getRootOperationCall <em>Root Operation Call</em>}</li>
 * </ul>
 *
 * @see analysismodel.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace ID</em>' attribute.
	 * @see #setTraceID(long)
	 * @see analysismodel.trace.TracePackage#getTrace_TraceID()
	 * @model
	 * @generated
	 */
	long getTraceID();

	/**
	 * Sets the value of the '{@link analysismodel.trace.Trace#getTraceID <em>Trace ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace ID</em>' attribute.
	 * @see #getTraceID()
	 * @generated
	 */
	void setTraceID(long value);

	/**
	 * Returns the value of the '<em><b>Root Operation Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Operation Call</em>' containment reference.
	 * @see #setRootOperationCall(OperationCall)
	 * @see analysismodel.trace.TracePackage#getTrace_RootOperationCall()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	OperationCall getRootOperationCall();

	/**
	 * Sets the value of the '{@link analysismodel.trace.Trace#getRootOperationCall <em>Root Operation Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Operation Call</em>' containment reference.
	 * @see #getRootOperationCall()
	 * @generated
	 */
	void setRootOperationCall(OperationCall value);

} // Trace
