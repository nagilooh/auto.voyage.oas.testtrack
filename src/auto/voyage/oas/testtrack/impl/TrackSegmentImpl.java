/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.RoadSegment;
import auto.voyage.oas.testtrack.Scenario;
import auto.voyage.oas.testtrack.TesttrackPackage;
import auto.voyage.oas.testtrack.TrackSegment;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.impl.TrackSegmentImpl#getRoadsegments <em>Roadsegments</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.TrackSegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.TrackSegmentImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackSegmentImpl extends MinimalEObjectImpl.Container implements TrackSegment {
	/**
	 * The cached value of the '{@link #getRoadsegments() <em>Roadsegments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoadsegments()
	 * @generated
	 * @ordered
	 */
	protected EList<RoadSegment> roadsegments;

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
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesttrackPackage.Literals.TRACK_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoadSegment> getRoadsegments() {
		if (roadsegments == null) {
			roadsegments = new EObjectContainmentEList<RoadSegment>(RoadSegment.class, this, TesttrackPackage.TRACK_SEGMENT__ROADSEGMENTS);
		}
		return roadsegments;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.TRACK_SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, TesttrackPackage.TRACK_SEGMENT__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesttrackPackage.TRACK_SEGMENT__ROADSEGMENTS:
				return ((InternalEList<?>)getRoadsegments()).basicRemove(otherEnd, msgs);
			case TesttrackPackage.TRACK_SEGMENT__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case TesttrackPackage.TRACK_SEGMENT__ROADSEGMENTS:
				return getRoadsegments();
			case TesttrackPackage.TRACK_SEGMENT__NAME:
				return getName();
			case TesttrackPackage.TRACK_SEGMENT__SCENARIOS:
				return getScenarios();
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
			case TesttrackPackage.TRACK_SEGMENT__ROADSEGMENTS:
				getRoadsegments().clear();
				getRoadsegments().addAll((Collection<? extends RoadSegment>)newValue);
				return;
			case TesttrackPackage.TRACK_SEGMENT__NAME:
				setName((String)newValue);
				return;
			case TesttrackPackage.TRACK_SEGMENT__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
			case TesttrackPackage.TRACK_SEGMENT__ROADSEGMENTS:
				getRoadsegments().clear();
				return;
			case TesttrackPackage.TRACK_SEGMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TesttrackPackage.TRACK_SEGMENT__SCENARIOS:
				getScenarios().clear();
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
			case TesttrackPackage.TRACK_SEGMENT__ROADSEGMENTS:
				return roadsegments != null && !roadsegments.isEmpty();
			case TesttrackPackage.TRACK_SEGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TesttrackPackage.TRACK_SEGMENT__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
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

} //TrackSegmentImpl
