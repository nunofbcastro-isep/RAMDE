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

import stateMachineMealy.BaseState;
import stateMachineMealy.Event;
import stateMachineMealy.StateMachineMealyPackage;
import stateMachineMealy.Transation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stateMachineMealy.impl.TransationImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link stateMachineMealy.impl.TransationImpl#getOutputAction <em>Output Action</em>}</li>
 *   <li>{@link stateMachineMealy.impl.TransationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link stateMachineMealy.impl.TransationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransationImpl extends MinimalEObjectImpl.Container implements Transation {
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
	 * The default value of the '{@link #getOutputAction() <em>Output Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAction()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputAction() <em>Output Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputAction()
	 * @generated
	 * @ordered
	 */
	protected String outputAction = OUTPUT_ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected BaseState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected BaseState target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachineMealyPackage.Literals.TRANSATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, StateMachineMealyPackage.TRANSATION__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputAction() {
		return outputAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputAction(String newOutputAction) {
		String oldOutputAction = outputAction;
		outputAction = newOutputAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachineMealyPackage.TRANSATION__OUTPUT_ACTION,
					oldOutputAction, outputAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (BaseState) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StateMachineMealyPackage.TRANSATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(BaseState newSource, NotificationChain msgs) {
		BaseState oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StateMachineMealyPackage.TRANSATION__SOURCE, oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(BaseState newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, StateMachineMealyPackage.BASE_STATE__OUTGOING,
						BaseState.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, StateMachineMealyPackage.BASE_STATE__OUTGOING,
						BaseState.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachineMealyPackage.TRANSATION__SOURCE,
					newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (BaseState) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StateMachineMealyPackage.TRANSATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(BaseState newTarget, NotificationChain msgs) {
		BaseState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StateMachineMealyPackage.TRANSATION__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(BaseState newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, StateMachineMealyPackage.BASE_STATE__INCOMING,
						BaseState.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, StateMachineMealyPackage.BASE_STATE__INCOMING,
						BaseState.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachineMealyPackage.TRANSATION__TARGET,
					newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachineMealyPackage.TRANSATION__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, StateMachineMealyPackage.BASE_STATE__OUTGOING,
						BaseState.class, msgs);
			return basicSetSource((BaseState) otherEnd, msgs);
		case StateMachineMealyPackage.TRANSATION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, StateMachineMealyPackage.BASE_STATE__INCOMING,
						BaseState.class, msgs);
			return basicSetTarget((BaseState) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StateMachineMealyPackage.TRANSATION__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
		case StateMachineMealyPackage.TRANSATION__SOURCE:
			return basicSetSource(null, msgs);
		case StateMachineMealyPackage.TRANSATION__TARGET:
			return basicSetTarget(null, msgs);
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
		case StateMachineMealyPackage.TRANSATION__EVENT:
			return getEvent();
		case StateMachineMealyPackage.TRANSATION__OUTPUT_ACTION:
			return getOutputAction();
		case StateMachineMealyPackage.TRANSATION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case StateMachineMealyPackage.TRANSATION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case StateMachineMealyPackage.TRANSATION__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case StateMachineMealyPackage.TRANSATION__OUTPUT_ACTION:
			setOutputAction((String) newValue);
			return;
		case StateMachineMealyPackage.TRANSATION__SOURCE:
			setSource((BaseState) newValue);
			return;
		case StateMachineMealyPackage.TRANSATION__TARGET:
			setTarget((BaseState) newValue);
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
		case StateMachineMealyPackage.TRANSATION__EVENT:
			getEvent().clear();
			return;
		case StateMachineMealyPackage.TRANSATION__OUTPUT_ACTION:
			setOutputAction(OUTPUT_ACTION_EDEFAULT);
			return;
		case StateMachineMealyPackage.TRANSATION__SOURCE:
			setSource((BaseState) null);
			return;
		case StateMachineMealyPackage.TRANSATION__TARGET:
			setTarget((BaseState) null);
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
		case StateMachineMealyPackage.TRANSATION__EVENT:
			return event != null && !event.isEmpty();
		case StateMachineMealyPackage.TRANSATION__OUTPUT_ACTION:
			return OUTPUT_ACTION_EDEFAULT == null ? outputAction != null : !OUTPUT_ACTION_EDEFAULT.equals(outputAction);
		case StateMachineMealyPackage.TRANSATION__SOURCE:
			return source != null;
		case StateMachineMealyPackage.TRANSATION__TARGET:
			return target != null;
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
		result.append(" (OutputAction: ");
		result.append(outputAction);
		result.append(')');
		return result.toString();
	}

} //TransationImpl
