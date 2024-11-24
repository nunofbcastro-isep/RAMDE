/**
 */
package stateMachineMealy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see stateMachineMealy.StateMachineMealyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface StateMachineMealyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateMachineMealy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.isep.ipp.pt/stateMachineMealy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pt.ipp.isep.mescc.ramde.statemachinemealy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachineMealyPackage eINSTANCE = stateMachineMealy.impl.StateMachineMealyPackageImpl.init();

	/**
	 * The meta object id for the '{@link stateMachineMealy.impl.BaseStateImpl <em>Base State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachineMealy.impl.BaseStateImpl
	 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getBaseState()
	 * @generated
	 */
	int BASE_STATE = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_STATE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_STATE__INCOMING = 1;

	/**
	 * The number of structural features of the '<em>Base State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachineMealy.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachineMealy.impl.InitialImpl
	 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__OUTGOING = BASE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__INCOMING = BASE_STATE__INCOMING;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = BASE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_OPERATION_COUNT = BASE_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stateMachineMealy.impl.MealyStateMachineImpl <em>Mealy State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachineMealy.impl.MealyStateMachineImpl
	 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getMealyStateMachine()
	 * @generated
	 */
	int MEALY_STATE_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_STATE_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_STATE_MACHINE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_STATE_MACHINE__EVENT = 2;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_STATE_MACHINE__INITIAL = 3;

	/**
	 * The number of structural features of the '<em>Mealy State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_STATE_MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mealy State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEALY_STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachineMealy.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachineMealy.impl.EventImpl
	 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachineMealy.impl.TransationImpl <em>Transation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachineMealy.impl.TransationImpl
	 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getTransation()
	 * @generated
	 */
	int TRANSATION = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSATION__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Output Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSATION__OUTPUT_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSATION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSATION__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Transation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stateMachineMealy.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stateMachineMealy.impl.StateImpl
	 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = BASE_STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = BASE_STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = BASE_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = BASE_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = BASE_STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link stateMachineMealy.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see stateMachineMealy.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for class '{@link stateMachineMealy.BaseState <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base State</em>'.
	 * @see stateMachineMealy.BaseState
	 * @generated
	 */
	EClass getBaseState();

	/**
	 * Returns the meta object for the reference list '{@link stateMachineMealy.BaseState#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see stateMachineMealy.BaseState#getOutgoing()
	 * @see #getBaseState()
	 * @generated
	 */
	EReference getBaseState_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link stateMachineMealy.BaseState#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see stateMachineMealy.BaseState#getIncoming()
	 * @see #getBaseState()
	 * @generated
	 */
	EReference getBaseState_Incoming();

	/**
	 * Returns the meta object for class '{@link stateMachineMealy.MealyStateMachine <em>Mealy State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mealy State Machine</em>'.
	 * @see stateMachineMealy.MealyStateMachine
	 * @generated
	 */
	EClass getMealyStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link stateMachineMealy.MealyStateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachineMealy.MealyStateMachine#getName()
	 * @see #getMealyStateMachine()
	 * @generated
	 */
	EAttribute getMealyStateMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachineMealy.MealyStateMachine#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see stateMachineMealy.MealyStateMachine#getState()
	 * @see #getMealyStateMachine()
	 * @generated
	 */
	EReference getMealyStateMachine_State();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachineMealy.MealyStateMachine#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see stateMachineMealy.MealyStateMachine#getEvent()
	 * @see #getMealyStateMachine()
	 * @generated
	 */
	EReference getMealyStateMachine_Event();

	/**
	 * Returns the meta object for the reference '{@link stateMachineMealy.MealyStateMachine#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see stateMachineMealy.MealyStateMachine#getInitial()
	 * @see #getMealyStateMachine()
	 * @generated
	 */
	EReference getMealyStateMachine_Initial();

	/**
	 * Returns the meta object for class '{@link stateMachineMealy.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see stateMachineMealy.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link stateMachineMealy.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachineMealy.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link stateMachineMealy.Transation <em>Transation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transation</em>'.
	 * @see stateMachineMealy.Transation
	 * @generated
	 */
	EClass getTransation();

	/**
	 * Returns the meta object for the containment reference list '{@link stateMachineMealy.Transation#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see stateMachineMealy.Transation#getEvent()
	 * @see #getTransation()
	 * @generated
	 */
	EReference getTransation_Event();

	/**
	 * Returns the meta object for the attribute '{@link stateMachineMealy.Transation#getOutputAction <em>Output Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Action</em>'.
	 * @see stateMachineMealy.Transation#getOutputAction()
	 * @see #getTransation()
	 * @generated
	 */
	EAttribute getTransation_OutputAction();

	/**
	 * Returns the meta object for the reference '{@link stateMachineMealy.Transation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see stateMachineMealy.Transation#getSource()
	 * @see #getTransation()
	 * @generated
	 */
	EReference getTransation_Source();

	/**
	 * Returns the meta object for the reference '{@link stateMachineMealy.Transation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see stateMachineMealy.Transation#getTarget()
	 * @see #getTransation()
	 * @generated
	 */
	EReference getTransation_Target();

	/**
	 * Returns the meta object for class '{@link stateMachineMealy.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see stateMachineMealy.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link stateMachineMealy.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stateMachineMealy.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachineMealyFactory getStateMachineMealyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link stateMachineMealy.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachineMealy.impl.InitialImpl
		 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '{@link stateMachineMealy.impl.BaseStateImpl <em>Base State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachineMealy.impl.BaseStateImpl
		 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getBaseState()
		 * @generated
		 */
		EClass BASE_STATE = eINSTANCE.getBaseState();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_STATE__OUTGOING = eINSTANCE.getBaseState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_STATE__INCOMING = eINSTANCE.getBaseState_Incoming();

		/**
		 * The meta object literal for the '{@link stateMachineMealy.impl.MealyStateMachineImpl <em>Mealy State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachineMealy.impl.MealyStateMachineImpl
		 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getMealyStateMachine()
		 * @generated
		 */
		EClass MEALY_STATE_MACHINE = eINSTANCE.getMealyStateMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEALY_STATE_MACHINE__NAME = eINSTANCE.getMealyStateMachine_Name();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_STATE_MACHINE__STATE = eINSTANCE.getMealyStateMachine_State();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_STATE_MACHINE__EVENT = eINSTANCE.getMealyStateMachine_Event();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEALY_STATE_MACHINE__INITIAL = eINSTANCE.getMealyStateMachine_Initial();

		/**
		 * The meta object literal for the '{@link stateMachineMealy.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachineMealy.impl.EventImpl
		 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link stateMachineMealy.impl.TransationImpl <em>Transation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachineMealy.impl.TransationImpl
		 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getTransation()
		 * @generated
		 */
		EClass TRANSATION = eINSTANCE.getTransation();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSATION__EVENT = eINSTANCE.getTransation_Event();

		/**
		 * The meta object literal for the '<em><b>Output Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSATION__OUTPUT_ACTION = eINSTANCE.getTransation_OutputAction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSATION__SOURCE = eINSTANCE.getTransation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSATION__TARGET = eINSTANCE.getTransation_Target();

		/**
		 * The meta object literal for the '{@link stateMachineMealy.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stateMachineMealy.impl.StateImpl
		 * @see stateMachineMealy.impl.StateMachineMealyPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

	}

} //StateMachineMealyPackage
