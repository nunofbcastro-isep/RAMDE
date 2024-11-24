/**
 */
package stateMachineMealy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stateMachineMealy.BaseState;
import stateMachineMealy.Event;
import stateMachineMealy.Initial;
import stateMachineMealy.MealyStateMachine;
import stateMachineMealy.State;
import stateMachineMealy.StateMachineMealyFactory;
import stateMachineMealy.StateMachineMealyPackage;
import stateMachineMealy.Transation;

import stateMachineMealy.util.StateMachineMealyValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineMealyPackageImpl extends EPackageImpl implements StateMachineMealyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mealyStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see stateMachineMealy.StateMachineMealyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateMachineMealyPackageImpl() {
		super(eNS_URI, StateMachineMealyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StateMachineMealyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateMachineMealyPackage init() {
		if (isInited)
			return (StateMachineMealyPackage) EPackage.Registry.INSTANCE.getEPackage(StateMachineMealyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStateMachineMealyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StateMachineMealyPackageImpl theStateMachineMealyPackage = registeredStateMachineMealyPackage instanceof StateMachineMealyPackageImpl
				? (StateMachineMealyPackageImpl) registeredStateMachineMealyPackage
				: new StateMachineMealyPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStateMachineMealyPackage.createPackageContents();

		// Initialize created meta-data
		theStateMachineMealyPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theStateMachineMealyPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return StateMachineMealyValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theStateMachineMealyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateMachineMealyPackage.eNS_URI, theStateMachineMealyPackage);
		return theStateMachineMealyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitial() {
		return initialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseState() {
		return baseStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseState_Outgoing() {
		return (EReference) baseStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseState_Incoming() {
		return (EReference) baseStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMealyStateMachine() {
		return mealyStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMealyStateMachine_Name() {
		return (EAttribute) mealyStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyStateMachine_State() {
		return (EReference) mealyStateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyStateMachine_Event() {
		return (EReference) mealyStateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMealyStateMachine_Initial() {
		return (EReference) mealyStateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransation() {
		return transationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransation_Event() {
		return (EReference) transationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransation_OutputAction() {
		return (EAttribute) transationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransation_Source() {
		return (EReference) transationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransation_Target() {
		return (EReference) transationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Name() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateMachineMealyFactory getStateMachineMealyFactory() {
		return (StateMachineMealyFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		initialEClass = createEClass(INITIAL);

		baseStateEClass = createEClass(BASE_STATE);
		createEReference(baseStateEClass, BASE_STATE__OUTGOING);
		createEReference(baseStateEClass, BASE_STATE__INCOMING);

		mealyStateMachineEClass = createEClass(MEALY_STATE_MACHINE);
		createEAttribute(mealyStateMachineEClass, MEALY_STATE_MACHINE__NAME);
		createEReference(mealyStateMachineEClass, MEALY_STATE_MACHINE__STATE);
		createEReference(mealyStateMachineEClass, MEALY_STATE_MACHINE__EVENT);
		createEReference(mealyStateMachineEClass, MEALY_STATE_MACHINE__INITIAL);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		transationEClass = createEClass(TRANSATION);
		createEReference(transationEClass, TRANSATION__EVENT);
		createEAttribute(transationEClass, TRANSATION__OUTPUT_ACTION);
		createEReference(transationEClass, TRANSATION__SOURCE);
		createEReference(transationEClass, TRANSATION__TARGET);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		initialEClass.getESuperTypes().add(this.getBaseState());
		stateEClass.getESuperTypes().add(this.getBaseState());

		// Initialize classes, features, and operations; add parameters
		initEClass(initialEClass, Initial.class, "Initial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseStateEClass, BaseState.class, "BaseState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseState_Outgoing(), this.getTransation(), this.getTransation_Source(), "Outgoing", null, 0,
				-1, BaseState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseState_Incoming(), this.getTransation(), this.getTransation_Target(), "Incoming", null, 0,
				-1, BaseState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mealyStateMachineEClass, MealyStateMachine.class, "MealyStateMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMealyStateMachine_Name(), ecorePackage.getEString(), "Name", null, 0, 1,
				MealyStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMealyStateMachine_State(), this.getState(), null, "State", null, 1, -1,
				MealyStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyStateMachine_Event(), this.getEvent(), null, "Event", null, 1, -1,
				MealyStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMealyStateMachine_Initial(), this.getInitial(), null, "Initial", null, 1, 1,
				MealyStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transationEClass, Transation.class, "Transation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransation_Event(), this.getEvent(), null, "Event", null, 1, -1, Transation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransation_OutputAction(), ecorePackage.getEString(), "OutputAction", null, 0, 1,
				Transation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTransation_Source(), this.getBaseState(), this.getBaseState_Outgoing(), "Source", null, 1, 1,
				Transation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransation_Target(), this.getBaseState(), this.getBaseState_Incoming(), "Target", null, 1, 1,
				Transation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "Name", null, 0, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(initialEClass, source,
				new String[] { "constraints", "NoOutgoingTransitions SingleIncomingTransition" });
		addAnnotation(mealyStateMachineEClass, source,
				new String[] { "constraints", "ValidNameFormat UniqueStateNames UniqueEventNames" });
		addAnnotation(eventEClass, source, new String[] { "constraints", "ValidEventNameFormat" });
		addAnnotation(transationEClass, source,
				new String[] { "constraints", "DefinedOutputAction DistinctSourceAndTargetStates" });
		addAnnotation(stateEClass, source, new String[] { "constraints",
				"ValidStateNameFormat NonCircularTransitions UniqueOutgoingTransitions UniqueIncomingTransitions" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(initialEClass, source, new String[] { "NoOutgoingTransitions", "self.Outgoing->size() = 0",
				"SingleIncomingTransition", "self.Incoming->size() = 1" });
		addAnnotation(mealyStateMachineEClass, source,
				new String[] { "ValidNameFormat",
						"self.Name.size() > 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()",
						"UniqueStateNames", "self.State->isUnique(s | s.Name)", "UniqueEventNames",
						"self.Event->isUnique(e | e.Name)" });
		addAnnotation(eventEClass, source, new String[] { "ValidEventNameFormat",
				"self.Name.size() > 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()" });
		addAnnotation(transationEClass, source,
				new String[] { "DefinedOutputAction", "not self.OutputAction.oclIsUndefined()",
						"DistinctSourceAndTargetStates", "self.Source <> self.Target" });
		addAnnotation(stateEClass, source, new String[] { "ValidStateNameFormat",
				"self.Name.size() > 3 and self.Name.substring(1, 1) = self.Name.substring(1, 1).toUpper()",
				"NonCircularTransitions", "self.Outgoing <> self.Incoming", "UniqueOutgoingTransitions",
				"self.Outgoing->isUnique(e | e)", "UniqueIncomingTransitions", "self.Incoming->isUnique(e | e)" });
	}

} //StateMachineMealyPackageImpl
