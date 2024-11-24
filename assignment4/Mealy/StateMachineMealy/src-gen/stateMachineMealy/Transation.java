/**
 */
package stateMachineMealy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.Transation#getEvent <em>Event</em>}</li>
 *   <li>{@link stateMachineMealy.Transation#getOutputAction <em>Output Action</em>}</li>
 *   <li>{@link stateMachineMealy.Transation#getSource <em>Source</em>}</li>
 *   <li>{@link stateMachineMealy.Transation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see stateMachineMealy.StateMachineMealyPackage#getTransation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DefinedOutputAction DistinctSourceAndTargetStates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DefinedOutputAction='not self.OutputAction.oclIsUndefined()' DistinctSourceAndTargetStates='self.Source &lt;&gt; self.Target'"
 * @generated
 */
public interface Transation extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachineMealy.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see stateMachineMealy.StateMachineMealyPackage#getTransation_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Output Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Action</em>' attribute.
	 * @see #setOutputAction(String)
	 * @see stateMachineMealy.StateMachineMealyPackage#getTransation_OutputAction()
	 * @model
	 * @generated
	 */
	String getOutputAction();

	/**
	 * Sets the value of the '{@link stateMachineMealy.Transation#getOutputAction <em>Output Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Action</em>' attribute.
	 * @see #getOutputAction()
	 * @generated
	 */
	void setOutputAction(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stateMachineMealy.BaseState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BaseState)
	 * @see stateMachineMealy.StateMachineMealyPackage#getTransation_Source()
	 * @see stateMachineMealy.BaseState#getOutgoing
	 * @model opposite="Outgoing" required="true"
	 * @generated
	 */
	BaseState getSource();

	/**
	 * Sets the value of the '{@link stateMachineMealy.Transation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BaseState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stateMachineMealy.BaseState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BaseState)
	 * @see stateMachineMealy.StateMachineMealyPackage#getTransation_Target()
	 * @see stateMachineMealy.BaseState#getIncoming
	 * @model opposite="Incoming" required="true"
	 * @generated
	 */
	BaseState getTarget();

	/**
	 * Sets the value of the '{@link stateMachineMealy.Transation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BaseState value);

} // Transation
