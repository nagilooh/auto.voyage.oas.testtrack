/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.Lane;
import auto.voyage.oas.testtrack.TesttrackPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.impl.LaneImpl#getComesFrom <em>Comes From</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.LaneImpl#getLeadsTo <em>Leads To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaneImpl extends RoadComponentImpl implements Lane {
	/**
	 * The cached value of the '{@link #getComesFrom() <em>Comes From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComesFrom()
	 * @generated
	 * @ordered
	 */
	protected Lane comesFrom;

	/**
	 * The cached value of the '{@link #getLeadsTo() <em>Leads To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadsTo()
	 * @generated
	 * @ordered
	 */
	protected Lane leadsTo;

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
	public Lane getComesFrom() {
		if (comesFrom != null && comesFrom.eIsProxy()) {
			InternalEObject oldComesFrom = (InternalEObject)comesFrom;
			comesFrom = (Lane)eResolveProxy(oldComesFrom);
			if (comesFrom != oldComesFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesttrackPackage.LANE__COMES_FROM, oldComesFrom, comesFrom));
			}
		}
		return comesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane basicGetComesFrom() {
		return comesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComesFrom(Lane newComesFrom, NotificationChain msgs) {
		Lane oldComesFrom = comesFrom;
		comesFrom = newComesFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TesttrackPackage.LANE__COMES_FROM, oldComesFrom, newComesFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComesFrom(Lane newComesFrom) {
		if (newComesFrom != comesFrom) {
			NotificationChain msgs = null;
			if (comesFrom != null)
				msgs = ((InternalEObject)comesFrom).eInverseRemove(this, TesttrackPackage.LANE__LEADS_TO, Lane.class, msgs);
			if (newComesFrom != null)
				msgs = ((InternalEObject)newComesFrom).eInverseAdd(this, TesttrackPackage.LANE__LEADS_TO, Lane.class, msgs);
			msgs = basicSetComesFrom(newComesFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.LANE__COMES_FROM, newComesFrom, newComesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane getLeadsTo() {
		if (leadsTo != null && leadsTo.eIsProxy()) {
			InternalEObject oldLeadsTo = (InternalEObject)leadsTo;
			leadsTo = (Lane)eResolveProxy(oldLeadsTo);
			if (leadsTo != oldLeadsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesttrackPackage.LANE__LEADS_TO, oldLeadsTo, leadsTo));
			}
		}
		return leadsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane basicGetLeadsTo() {
		return leadsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeadsTo(Lane newLeadsTo, NotificationChain msgs) {
		Lane oldLeadsTo = leadsTo;
		leadsTo = newLeadsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TesttrackPackage.LANE__LEADS_TO, oldLeadsTo, newLeadsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeadsTo(Lane newLeadsTo) {
		if (newLeadsTo != leadsTo) {
			NotificationChain msgs = null;
			if (leadsTo != null)
				msgs = ((InternalEObject)leadsTo).eInverseRemove(this, TesttrackPackage.LANE__COMES_FROM, Lane.class, msgs);
			if (newLeadsTo != null)
				msgs = ((InternalEObject)newLeadsTo).eInverseAdd(this, TesttrackPackage.LANE__COMES_FROM, Lane.class, msgs);
			msgs = basicSetLeadsTo(newLeadsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.LANE__LEADS_TO, newLeadsTo, newLeadsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesttrackPackage.LANE__COMES_FROM:
				if (comesFrom != null)
					msgs = ((InternalEObject)comesFrom).eInverseRemove(this, TesttrackPackage.LANE__LEADS_TO, Lane.class, msgs);
				return basicSetComesFrom((Lane)otherEnd, msgs);
			case TesttrackPackage.LANE__LEADS_TO:
				if (leadsTo != null)
					msgs = ((InternalEObject)leadsTo).eInverseRemove(this, TesttrackPackage.LANE__COMES_FROM, Lane.class, msgs);
				return basicSetLeadsTo((Lane)otherEnd, msgs);
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
			case TesttrackPackage.LANE__COMES_FROM:
				return basicSetComesFrom(null, msgs);
			case TesttrackPackage.LANE__LEADS_TO:
				return basicSetLeadsTo(null, msgs);
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
			case TesttrackPackage.LANE__COMES_FROM:
				if (resolve) return getComesFrom();
				return basicGetComesFrom();
			case TesttrackPackage.LANE__LEADS_TO:
				if (resolve) return getLeadsTo();
				return basicGetLeadsTo();
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
			case TesttrackPackage.LANE__COMES_FROM:
				setComesFrom((Lane)newValue);
				return;
			case TesttrackPackage.LANE__LEADS_TO:
				setLeadsTo((Lane)newValue);
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
			case TesttrackPackage.LANE__COMES_FROM:
				setComesFrom((Lane)null);
				return;
			case TesttrackPackage.LANE__LEADS_TO:
				setLeadsTo((Lane)null);
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
			case TesttrackPackage.LANE__COMES_FROM:
				return comesFrom != null;
			case TesttrackPackage.LANE__LEADS_TO:
				return leadsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //LaneImpl
