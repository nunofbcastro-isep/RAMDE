/**
 */
package stateMachineMealy.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateMachineMealy.Event;
import stateMachineMealy.Initial;
import stateMachineMealy.MealyStateMachine;
import stateMachineMealy.State;
import stateMachineMealy.StateMachineMealyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mealy State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.impl.MealyStateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link stateMachineMealy.impl.MealyStateMachineImpl#getState <em>State</em>}</li>
 *   <li>{@link stateMachineMealy.impl.MealyStateMachineImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link stateMachineMealy.impl.MealyStateMachineImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MealyStateMachineImpl extends MinimalEObjectImpl.Container implements MealyStateMachine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected Initial initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MealyStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachineMealyPackage.Literals.MEALY_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachineMealyPackage.MEALY_STATE_MACHINE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this,
					StateMachineMealyPackage.MEALY_STATE_MACHINE__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this,
					StateMachineMealyPackage.MEALY_STATE_MACHINE__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initial getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject) initial;
			initial = (Initial) eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StateMachineMealyPackage.MEALY_STATE_MACHINE__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial(Initial newInitial) {
		Initial oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachineMealyPackage.MEALY_STATE_MACHINE__INITIAL,
					oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__STATE:
			return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__NAME:
			return getName();
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__STATE:
			return getState();
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__EVENT:
			return getEvent();
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__INITIAL:
			if (resolve)
				return getInitial();
			return basicGetInitial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__NAME:
			setName((String) newValue);
			return;
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__STATE:
			getState().clear();
			getState().addAll((Collection<? extends State>) newValue);
			return;
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__INITIAL:
			setInitial((Initial) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__STATE:
			getState().clear();
			return;
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__EVENT:
			getEvent().clear();
			return;
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__INITIAL:
			setInitial((Initial) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__STATE:
			return state != null && !state.isEmpty();
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__EVENT:
			return event != null && !event.isEmpty();
		case StateMachineMealyPackage.MEALY_STATE_MACHINE__INITIAL:
			return initial != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MealyStateMachineImpl
