/**
 */
package stateMachineMealy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see stateMachineMealy.StateMachineMealyPackage
 * @generated
 */
public interface StateMachineMealyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachineMealyFactory eINSTANCE = stateMachineMealy.impl.StateMachineMealyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial</em>'.
	 * @generated
	 */
	Initial createInitial();

	/**
	 * Returns a new object of class '<em>Base State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base State</em>'.
	 * @generated
	 */
	BaseState createBaseState();

	/**
	 * Returns a new object of class '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mealy State Machine</em>'.
	 * @generated
	 */
	MealyStateMachine createMealyStateMachine();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Transation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transation</em>'.
	 * @generated
	 */
	Transation createTransation();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StateMachineMealyPackage getStateMachineMealyPackage();

} //StateMachineMealyFactory
