/**
 */
package stateMachineMealy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import stateMachineMealy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineMealyFactoryImpl extends EFactoryImpl implements StateMachineMealyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineMealyFactory init() {
		try {
			StateMachineMealyFactory theStateMachineMealyFactory = (StateMachineMealyFactory) EPackage.Registry.INSTANCE
					.getEFactory(StateMachineMealyPackage.eNS_URI);
			if (theStateMachineMealyFactory != null) {
				return theStateMachineMealyFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateMachineMealyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineMealyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StateMachineMealyPackage.INITIAL:
			return createInitial();
		case StateMachineMealyPackage.BASE_STATE:
			return createBaseState();
		case StateMachineMealyPackage.MEALY_STATE_MACHINE:
			return createMealyStateMachine();
		case StateMachineMealyPackage.EVENT:
			return createEvent();
		case StateMachineMealyPackage.TRANSATION:
			return createTransation();
		case StateMachineMealyPackage.STATE:
			return createState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseState createBaseState() {
		BaseStateImpl baseState = new BaseStateImpl();
		return baseState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MealyStateMachine createMealyStateMachine() {
		MealyStateMachineImpl mealyStateMachine = new MealyStateMachineImpl();
		return mealyStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transation createTransation() {
		TransationImpl transation = new TransationImpl();
		return transation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachineMealyPackage getStateMachineMealyPackage() {
		return (StateMachineMealyPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StateMachineMealyPackage getPackage() {
		return StateMachineMealyPackage.eINSTANCE;
	}

} //StateMachineMealyFactoryImpl
