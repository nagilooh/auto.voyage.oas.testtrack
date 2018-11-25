/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.RoadComponent;
import auto.voyage.oas.testtrack.RoadSegment;
import auto.voyage.oas.testtrack.Sign;
import auto.voyage.oas.testtrack.TesttrackPackage;

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
 * An implementation of the model object '<em><b>Road Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl#getRoadcomponents <em>Roadcomponents</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl#getSigns <em>Signs</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoadSegmentImpl extends MinimalEObjectImpl.Container implements RoadSegment {
	/**
	 * The cached value of the '{@link #getRoadcomponents() <em>Roadcomponents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoadcomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<RoadComponent> roadcomponents;

	/**
	 * The cached value of the '{@link #getSigns() <em>Signs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Sign> signs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoadSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesttrackPackage.Literals.ROAD_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoadComponent> getRoadcomponents() {
		if (roadcomponents == null) {
			roadcomponents = new EObjectContainmentEList<RoadComponent>(RoadComponent.class, this, TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS);
		}
		return roadcomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sign> getSigns() {
		if (signs == null) {
			signs = new EObjectContainmentEList<Sign>(Sign.class, this, TesttrackPackage.ROAD_SEGMENT__SIGNS);
		}
		return signs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS:
				return ((InternalEList<?>)getRoadcomponents()).basicRemove(otherEnd, msgs);
			case TesttrackPackage.ROAD_SEGMENT__SIGNS:
				return ((InternalEList<?>)getSigns()).basicRemove(otherEnd, msgs);
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
			case TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS:
				return getRoadcomponents();
			case TesttrackPackage.ROAD_SEGMENT__SIGNS:
				return getSigns();
			case TesttrackPackage.ROAD_SEGMENT__NAME:
				return getName();
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
			case TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS:
				getRoadcomponents().clear();
				getRoadcomponents().addAll((Collection<? extends RoadComponent>)newValue);
				return;
			case TesttrackPackage.ROAD_SEGMENT__SIGNS:
				getSigns().clear();
				getSigns().addAll((Collection<? extends Sign>)newValue);
				return;
			case TesttrackPackage.ROAD_SEGMENT__NAME:
				setName((String)newValue);
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
			case TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS:
				getRoadcomponents().clear();
				return;
			case TesttrackPackage.ROAD_SEGMENT__SIGNS:
				getSigns().clear();
				return;
			case TesttrackPackage.ROAD_SEGMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS:
				return roadcomponents != null && !roadcomponents.isEmpty();
			case TesttrackPackage.ROAD_SEGMENT__SIGNS:
				return signs != null && !signs.isEmpty();
			case TesttrackPackage.ROAD_SEGMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //RoadSegmentImpl
