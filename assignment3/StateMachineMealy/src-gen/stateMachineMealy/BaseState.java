/**
 */
package stateMachineMealy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.BaseState#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link stateMachineMealy.BaseState#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see stateMachineMealy.StateMachineMealyPackage#getBaseState()
 * @model
 * @generated
 */
public interface BaseState extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link stateMachineMealy.Transation}.
	 * It is bidirectional and its opposite is '{@link stateMachineMealy.Transation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see stateMachineMealy.StateMachineMealyPackage#getBaseState_Outgoing()
	 * @see stateMachineMealy.Transation#getSource
	 * @model opposite="Source"
	 * @generated
	 */
	EList<Transation> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link stateMachineMealy.Transation}.
	 * It is bidirectional and its opposite is '{@link stateMachineMealy.Transation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see stateMachineMealy.StateMachineMealyPackage#getBaseState_Incoming()
	 * @see stateMachineMealy.Transation#getTarget
	 * @model opposite="Target"
	 * @generated
	 */
	EList<Transation> getIncoming();

} // BaseState
