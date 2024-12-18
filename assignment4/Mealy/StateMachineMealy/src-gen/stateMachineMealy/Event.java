/**
 */
package stateMachineMealy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.Event#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see stateMachineMealy.StateMachineMealyPackage#getEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidEventNameFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidEventNameFormat='self.Name.size() &gt; 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stateMachineMealy.StateMachineMealyPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stateMachineMealy.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Event
