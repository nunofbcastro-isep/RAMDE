/**
 */
package stateMachineMealy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.State#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see stateMachineMealy.StateMachineMealyPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidStateNameFormat NonCircularTransitions UniqueOutgoingTransitions UniqueIncomingTransitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidStateNameFormat='self.Name.size() &gt; 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()' NonCircularTransitions='self.Outgoing &lt;&gt; self.Incoming' UniqueOutgoingTransitions='self.Outgoing-&gt;isUnique(e | e)' UniqueIncomingTransitions='self.Incoming-&gt;isUnique(e | e)'"
 * @generated
 */
public interface State extends BaseState {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachineMealy.StateMachineMealyPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachineMealy.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // State
