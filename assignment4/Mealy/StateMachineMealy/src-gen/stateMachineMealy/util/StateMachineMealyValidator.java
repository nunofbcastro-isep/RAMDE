/**
 */
package stateMachineMealy.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import stateMachineMealy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see stateMachineMealy.StateMachineMealyPackage
 * @generated
 */
public class StateMachineMealyValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StateMachineMealyValidator INSTANCE = new StateMachineMealyValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "stateMachineMealy";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineMealyValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return StateMachineMealyPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case StateMachineMealyPackage.INITIAL:
			return validateInitial((Initial) value, diagnostics, context);
		case StateMachineMealyPackage.BASE_STATE:
			return validateBaseState((BaseState) value, diagnostics, context);
		case StateMachineMealyPackage.MEALY_STATE_MACHINE:
			return validateMealyStateMachine((MealyStateMachine) value, diagnostics, context);
		case StateMachineMealyPackage.EVENT:
			return validateEvent((Event) value, diagnostics, context);
		case StateMachineMealyPackage.TRANSATION:
			return validateTransation((Transation) value, diagnostics, context);
		case StateMachineMealyPackage.STATE:
			return validateState((State) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitial(Initial initial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initial, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInitial_NoOutgoingTransitions(initial, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInitial_SingleIncomingTransition(initial, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NoOutgoingTransitions constraint of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INITIAL__NO_OUTGOING_TRANSITIONS__EEXPRESSION = "self.Outgoing->size() = 0";

	/**
	 * Validates the NoOutgoingTransitions constraint of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitial_NoOutgoingTransitions(Initial initial, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.INITIAL, initial, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NoOutgoingTransitions",
				INITIAL__NO_OUTGOING_TRANSITIONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SingleIncomingTransition constraint of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INITIAL__SINGLE_INCOMING_TRANSITION__EEXPRESSION = "self.Incoming->size() = 1";

	/**
	 * Validates the SingleIncomingTransition constraint of '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitial_SingleIncomingTransition(Initial initial, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.INITIAL, initial, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SingleIncomingTransition",
				INITIAL__SINGLE_INCOMING_TRANSITION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseState(BaseState baseState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealyStateMachine(MealyStateMachine mealyStateMachine, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mealyStateMachine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealyStateMachine_ValidNameFormat(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealyStateMachine_UniqueStateNames(mealyStateMachine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMealyStateMachine_UniqueEventNames(mealyStateMachine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidNameFormat constraint of '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEALY_STATE_MACHINE__VALID_NAME_FORMAT__EEXPRESSION = "self.Name.size() > 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()";

	/**
	 * Validates the ValidNameFormat constraint of '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealyStateMachine_ValidNameFormat(MealyStateMachine mealyStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.MEALY_STATE_MACHINE, mealyStateMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ValidNameFormat",
				MEALY_STATE_MACHINE__VALID_NAME_FORMAT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueStateNames constraint of '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEALY_STATE_MACHINE__UNIQUE_STATE_NAMES__EEXPRESSION = "self.State->isUnique(s | s.Name)";

	/**
	 * Validates the UniqueStateNames constraint of '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealyStateMachine_UniqueStateNames(MealyStateMachine mealyStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.MEALY_STATE_MACHINE, mealyStateMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueStateNames",
				MEALY_STATE_MACHINE__UNIQUE_STATE_NAMES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueEventNames constraint of '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEALY_STATE_MACHINE__UNIQUE_EVENT_NAMES__EEXPRESSION = "self.Event->isUnique(e | e.Name)";

	/**
	 * Validates the UniqueEventNames constraint of '<em>Mealy State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMealyStateMachine_UniqueEventNames(MealyStateMachine mealyStateMachine,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.MEALY_STATE_MACHINE, mealyStateMachine, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueEventNames",
				MEALY_STATE_MACHINE__UNIQUE_EVENT_NAMES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_ValidEventNameFormat(event, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidEventNameFormat constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__VALID_EVENT_NAME_FORMAT__EEXPRESSION = "self.Name.size() > 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()";

	/**
	 * Validates the ValidEventNameFormat constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_ValidEventNameFormat(Event event, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.EVENT, event, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ValidEventNameFormat",
				EVENT__VALID_EVENT_NAME_FORMAT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransation(Transation transation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransation_DefinedOutputAction(transation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransation_DistinctSourceAndTargetStates(transation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DefinedOutputAction constraint of '<em>Transation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSATION__DEFINED_OUTPUT_ACTION__EEXPRESSION = "not self.OutputAction.oclIsUndefined()";

	/**
	 * Validates the DefinedOutputAction constraint of '<em>Transation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransation_DefinedOutputAction(Transation transation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.TRANSATION, transation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DefinedOutputAction",
				TRANSATION__DEFINED_OUTPUT_ACTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DistinctSourceAndTargetStates constraint of '<em>Transation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSATION__DISTINCT_SOURCE_AND_TARGET_STATES__EEXPRESSION = "self.Source <> self.Target";

	/**
	 * Validates the DistinctSourceAndTargetStates constraint of '<em>Transation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransation_DistinctSourceAndTargetStates(Transation transation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.TRANSATION, transation, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DistinctSourceAndTargetStates",
				TRANSATION__DISTINCT_SOURCE_AND_TARGET_STATES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_ValidStateNameFormat(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_NonCircularTransitions(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_UniqueOutgoingTransitions(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_UniqueIncomingTransitions(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidStateNameFormat constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__VALID_STATE_NAME_FORMAT__EEXPRESSION = "self.Name.size() > 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()";

	/**
	 * Validates the ValidStateNameFormat constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_ValidStateNameFormat(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ValidStateNameFormat",
				STATE__VALID_STATE_NAME_FORMAT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NonCircularTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NON_CIRCULAR_TRANSITIONS__EEXPRESSION = "self.Outgoing <> self.Incoming";

	/**
	 * Validates the NonCircularTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_NonCircularTransitions(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NonCircularTransitions",
				STATE__NON_CIRCULAR_TRANSITIONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueOutgoingTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_OUTGOING_TRANSITIONS__EEXPRESSION = "self.Outgoing->isUnique(e | e)";

	/**
	 * Validates the UniqueOutgoingTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniqueOutgoingTransitions(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueOutgoingTransitions",
				STATE__UNIQUE_OUTGOING_TRANSITIONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueIncomingTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__UNIQUE_INCOMING_TRANSITIONS__EEXPRESSION = "self.Incoming->isUnique(e | e)";

	/**
	 * Validates the UniqueIncomingTransitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_UniqueIncomingTransitions(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StateMachineMealyPackage.Literals.STATE, state, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueIncomingTransitions",
				STATE__UNIQUE_INCOMING_TRANSITIONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StateMachineMealyValidator
