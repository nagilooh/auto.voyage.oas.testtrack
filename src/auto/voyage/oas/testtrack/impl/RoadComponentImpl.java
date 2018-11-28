/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.RoadComponent;
import auto.voyage.oas.testtrack.TesttrackPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Road Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadComponentImpl#getLeftLane <em>Left Lane</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadComponentImpl#getRightLane <em>Right Lane</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoadComponentImpl extends MinimalEObjectImpl.Container implements RoadComponent {
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
	 * The cached value of the '{@link #getLeftLane() <em>Left Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftLane()
	 * @generated
	 * @ordered
	 */
	protected RoadComponent leftLane;

	/**
	 * The cached value of the '{@link #getRightLane() <em>Right Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightLane()
	 * @generated
	 * @ordered
	 */
	protected RoadComponent rightLane;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoadComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesttrackPackage.Literals.ROAD_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadComponent getLeftLane() {
		if (leftLane != null && leftLane.eIsProxy()) {
			InternalEObject oldLeftLane = (InternalEObject)leftLane;
			leftLane = (RoadComponent)eResolveProxy(oldLeftLane);
			if (leftLane != oldLeftLane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesttrackPackage.ROAD_COMPONENT__LEFT_LANE, oldLeftLane, leftLane));
			}
		}
		return leftLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadComponent basicGetLeftLane() {
		return leftLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftLane(RoadComponent newLeftLane, NotificationChain msgs) {
		RoadComponent oldLeftLane = leftLane;
		leftLane = newLeftLane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_COMPONENT__LEFT_LANE, oldLeftLane, newLeftLane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftLane(RoadComponent newLeftLane) {
		if (newLeftLane != leftLane) {
			NotificationChain msgs = null;
			if (leftLane != null)
				msgs = ((InternalEObject)leftLane).eInverseRemove(this, TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE, RoadComponent.class, msgs);
			if (newLeftLane != null)
				msgs = ((InternalEObject)newLeftLane).eInverseAdd(this, TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE, RoadComponent.class, msgs);
			msgs = basicSetLeftLane(newLeftLane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_COMPONENT__LEFT_LANE, newLeftLane, newLeftLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadComponent getRightLane() {
		if (rightLane != null && rightLane.eIsProxy()) {
			InternalEObject oldRightLane = (InternalEObject)rightLane;
			rightLane = (RoadComponent)eResolveProxy(oldRightLane);
			if (rightLane != oldRightLane) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE, oldRightLane, rightLane));
			}
		}
		return rightLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadComponent basicGetRightLane() {
		return rightLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightLane(RoadComponent newRightLane, NotificationChain msgs) {
		RoadComponent oldRightLane = rightLane;
		rightLane = newRightLane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE, oldRightLane, newRightLane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightLane(RoadComponent newRightLane) {
		if (newRightLane != rightLane) {
			NotificationChain msgs = null;
			if (rightLane != null)
				msgs = ((InternalEObject)rightLane).eInverseRemove(this, TesttrackPackage.ROAD_COMPONENT__LEFT_LANE, RoadComponent.class, msgs);
			if (newRightLane != null)
				msgs = ((InternalEObject)newRightLane).eInverseAdd(this, TesttrackPackage.ROAD_COMPONENT__LEFT_LANE, RoadComponent.class, msgs);
			msgs = basicSetRightLane(newRightLane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE, newRightLane, newRightLane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesttrackPackage.ROAD_COMPONENT__LEFT_LANE:
				if (leftLane != null)
					msgs = ((InternalEObject)leftLane).eInverseRemove(this, TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE, RoadComponent.class, msgs);
				return basicSetLeftLane((RoadComponent)otherEnd, msgs);
			case TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE:
				if (rightLane != null)
					msgs = ((InternalEObject)rightLane).eInverseRemove(this, TesttrackPackage.ROAD_COMPONENT__LEFT_LANE, RoadComponent.class, msgs);
				return basicSetRightLane((RoadComponent)otherEnd, msgs);
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
			case TesttrackPackage.ROAD_COMPONENT__LEFT_LANE:
				return basicSetLeftLane(null, msgs);
			case TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE:
				return basicSetRightLane(null, msgs);
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
			case TesttrackPackage.ROAD_COMPONENT__NAME:
				return getName();
			case TesttrackPackage.ROAD_COMPONENT__LEFT_LANE:
				if (resolve) return getLeftLane();
				return basicGetLeftLane();
			case TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE:
				if (resolve) return getRightLane();
				return basicGetRightLane();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TesttrackPackage.ROAD_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case TesttrackPackage.ROAD_COMPONENT__LEFT_LANE:
				setLeftLane((RoadComponent)newValue);
				return;
			case TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE:
				setRightLane((RoadComponent)newValue);
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
			case TesttrackPackage.ROAD_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TesttrackPackage.ROAD_COMPONENT__LEFT_LANE:
				setLeftLane((RoadComponent)null);
				return;
			case TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE:
				setRightLane((RoadComponent)null);
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
			case TesttrackPackage.ROAD_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TesttrackPackage.ROAD_COMPONENT__LEFT_LANE:
				return leftLane != null;
			case TesttrackPackage.ROAD_COMPONENT__RIGHT_LANE:
				return rightLane != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoadComponentImpl
