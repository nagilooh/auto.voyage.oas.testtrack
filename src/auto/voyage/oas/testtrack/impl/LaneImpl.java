/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.Lane;
import auto.voyage.oas.testtrack.TesttrackPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.impl.LaneImpl#getFromLanes <em>From Lanes</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.LaneImpl#getToLanes <em>To Lanes</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.LaneImpl#isStraight <em>Straight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends RoadComponentImpl implements Lane {
	/**
	 * The cached value of the '{@link #getFromLanes() <em>From Lanes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> fromLanes;

	/**
	 * The cached value of the '{@link #getToLanes() <em>To Lanes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> toLanes;

	/**
	 * The default value of the '{@link #isStraight() <em>Straight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStraight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRAIGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStraight() <em>Straight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStraight()
	 * @generated
	 * @ordered
	 */
	protected boolean straight = STRAIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesttrackPackage.Literals.LANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getFromLanes() {
		if (fromLanes == null) {
			fromLanes = new EObjectWithInverseResolvingEList.ManyInverse<Lane>(Lane.class, this, TesttrackPackage.LANE__FROM_LANES, TesttrackPackage.LANE__TO_LANES);
		}
		return fromLanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getToLanes() {
		if (toLanes == null) {
			toLanes = new EObjectWithInverseResolvingEList.ManyInverse<Lane>(Lane.class, this, TesttrackPackage.LANE__TO_LANES, TesttrackPackage.LANE__FROM_LANES);
		}
		return toLanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStraight() {
		return straight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStraight(boolean newStraight) {
		boolean oldStraight = straight;
		straight = newStraight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.LANE__STRAIGHT, oldStraight, straight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesttrackPackage.LANE__FROM_LANES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromLanes()).basicAdd(otherEnd, msgs);
			case TesttrackPackage.LANE__TO_LANES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToLanes()).basicAdd(otherEnd, msgs);
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
			case TesttrackPackage.LANE__FROM_LANES:
				return ((InternalEList<?>)getFromLanes()).basicRemove(otherEnd, msgs);
			case TesttrackPackage.LANE__TO_LANES:
				return ((InternalEList<?>)getToLanes()).basicRemove(otherEnd, msgs);
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
			case TesttrackPackage.LANE__FROM_LANES:
				return getFromLanes();
			case TesttrackPackage.LANE__TO_LANES:
				return getToLanes();
			case TesttrackPackage.LANE__STRAIGHT:
				return isStraight();
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
			case TesttrackPackage.LANE__FROM_LANES:
				getFromLanes().clear();
				getFromLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case TesttrackPackage.LANE__TO_LANES:
				getToLanes().clear();
				getToLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case TesttrackPackage.LANE__STRAIGHT:
				setStraight((Boolean)newValue);
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
			case TesttrackPackage.LANE__FROM_LANES:
				getFromLanes().clear();
				return;
			case TesttrackPackage.LANE__TO_LANES:
				getToLanes().clear();
				return;
			case TesttrackPackage.LANE__STRAIGHT:
				setStraight(STRAIGHT_EDEFAULT);
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
			case TesttrackPackage.LANE__FROM_LANES:
				return fromLanes != null && !fromLanes.isEmpty();
			case TesttrackPackage.LANE__TO_LANES:
				return toLanes != null && !toLanes.isEmpty();
			case TesttrackPackage.LANE__STRAIGHT:
				return straight != STRAIGHT_EDEFAULT;
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
		result.append(" (straight: ");
		result.append(straight);
		result.append(')');
		return result.toString();
	}

} //LaneImpl
