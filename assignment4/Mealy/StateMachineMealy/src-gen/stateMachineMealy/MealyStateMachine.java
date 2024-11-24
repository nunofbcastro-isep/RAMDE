/**
 */
package stateMachineMealy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mealy State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.MealyStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link stateMachineMealy.MealyStateMachine#getState <em>State</em>}</li>
 *   <li>{@link stateMachineMealy.MealyStateMachine#getEvent <em>Event</em>}</li>
 *   <li>{@link stateMachineMealy.MealyStateMachine#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see stateMachineMealy.StateMachineMealyPackage#getMealyStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidNameFormat UniqueStateNames UniqueEventNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidNameFormat='self.Name.size() &gt; 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()' UniqueStateNames='self.State-&gt;isUnique(s | s.Name)' UniqueEventNames='self.Event-&gt;isUnique(e | e.Name)'"
 * @generated
 */
public interface MealyStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachineMealy.StateMachineMealyPackage#getMealyStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachineMealy.MealyStateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachineMealy.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see stateMachineMealy.StateMachineMealyPackage#getMealyStateMachine_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link stateMachineMealy.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see stateMachineMealy.StateMachineMealyPackage#getMealyStateMachine_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(Initial)
	 * @see stateMachineMealy.StateMachineMealyPackage#getMealyStateMachine_Initial()
	 * @model required="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link stateMachineMealy.MealyStateMachine#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Initial value);

} // MealyStateMachine
