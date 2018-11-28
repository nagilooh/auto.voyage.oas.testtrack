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
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl#getLeftNeighborOfNeighbor <em>Left Neighbor Of Neighbor</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl#getRightNeighborOfNeighbor <em>Right Neighbor Of Neighbor</em>}</li>
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
	 * The cached value of the '{@link #getLeftNeighborOfNeighbor() <em>Left Neighbor Of Neighbor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftNeighborOfNeighbor()
	 * @generated
	 * @ordered
	 */
	protected RoadSegment leftNeighborOfNeighbor;

	/**
	 * The cached value of the '{@link #getRightNeighborOfNeighbor() <em>Right Neighbor Of Neighbor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightNeighborOfNeighbor()
	 * @generated
	 * @ordered
	 */
	protected RoadSegment rightNeighborOfNeighbor;

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
	public RoadSegment getLeftNeighborOfNeighbor() {
		if (leftNeighborOfNeighbor != null && leftNeighborOfNeighbor.eIsProxy()) {
			InternalEObject oldLeftNeighborOfNeighbor = (InternalEObject)leftNeighborOfNeighbor;
			leftNeighborOfNeighbor = (RoadSegment)eResolveProxy(oldLeftNeighborOfNeighbor);
			if (leftNeighborOfNeighbor != oldLeftNeighborOfNeighbor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR, oldLeftNeighborOfNeighbor, leftNeighborOfNeighbor));
			}
		}
		return leftNeighborOfNeighbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadSegment basicGetLeftNeighborOfNeighbor() {
		return leftNeighborOfNeighbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftNeighborOfNeighbor(RoadSegment newLeftNeighborOfNeighbor, NotificationChain msgs) {
		RoadSegment oldLeftNeighborOfNeighbor = leftNeighborOfNeighbor;
		leftNeighborOfNeighbor = newLeftNeighborOfNeighbor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR, oldLeftNeighborOfNeighbor, newLeftNeighborOfNeighbor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftNeighborOfNeighbor(RoadSegment newLeftNeighborOfNeighbor) {
		if (newLeftNeighborOfNeighbor != leftNeighborOfNeighbor) {
			NotificationChain msgs = null;
			if (leftNeighborOfNeighbor != null)
				msgs = ((InternalEObject)leftNeighborOfNeighbor).eInverseRemove(this, TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR, RoadSegment.class, msgs);
			if (newLeftNeighborOfNeighbor != null)
				msgs = ((InternalEObject)newLeftNeighborOfNeighbor).eInverseAdd(this, TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR, RoadSegment.class, msgs);
			msgs = basicSetLeftNeighborOfNeighbor(newLeftNeighborOfNeighbor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR, newLeftNeighborOfNeighbor, newLeftNeighborOfNeighbor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadSegment getRightNeighborOfNeighbor() {
		if (rightNeighborOfNeighbor != null && rightNeighborOfNeighbor.eIsProxy()) {
			InternalEObject oldRightNeighborOfNeighbor = (InternalEObject)rightNeighborOfNeighbor;
			rightNeighborOfNeighbor = (RoadSegment)eResolveProxy(oldRightNeighborOfNeighbor);
			if (rightNeighborOfNeighbor != oldRightNeighborOfNeighbor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR, oldRightNeighborOfNeighbor, rightNeighborOfNeighbor));
			}
		}
		return rightNeighborOfNeighbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadSegment basicGetRightNeighborOfNeighbor() {
		return rightNeighborOfNeighbor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightNeighborOfNeighbor(RoadSegment newRightNeighborOfNeighbor, NotificationChain msgs) {
		RoadSegment oldRightNeighborOfNeighbor = rightNeighborOfNeighbor;
		rightNeighborOfNeighbor = newRightNeighborOfNeighbor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR, oldRightNeighborOfNeighbor, newRightNeighborOfNeighbor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightNeighborOfNeighbor(RoadSegment newRightNeighborOfNeighbor) {
		if (newRightNeighborOfNeighbor != rightNeighborOfNeighbor) {
			NotificationChain msgs = null;
			if (rightNeighborOfNeighbor != null)
				msgs = ((InternalEObject)rightNeighborOfNeighbor).eInverseRemove(this, TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR, RoadSegment.class, msgs);
			if (newRightNeighborOfNeighbor != null)
				msgs = ((InternalEObject)newRightNeighborOfNeighbor).eInverseAdd(this, TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR, RoadSegment.class, msgs);
			msgs = basicSetRightNeighborOfNeighbor(newRightNeighborOfNeighbor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR, newRightNeighborOfNeighbor, newRightNeighborOfNeighbor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR:
				if (leftNeighborOfNeighbor != null)
					msgs = ((InternalEObject)leftNeighborOfNeighbor).eInverseRemove(this, TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR, RoadSegment.class, msgs);
				return basicSetLeftNeighborOfNeighbor((RoadSegment)otherEnd, msgs);
			case TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR:
				if (rightNeighborOfNeighbor != null)
					msgs = ((InternalEObject)rightNeighborOfNeighbor).eInverseRemove(this, TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR, RoadSegment.class, msgs);
				return basicSetRightNeighborOfNeighbor((RoadSegment)otherEnd, msgs);
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
			case TesttrackPackage.ROAD_SEGMENT__ROADCOMPONENTS:
				return ((InternalEList<?>)getRoadcomponents()).basicRemove(otherEnd, msgs);
			case TesttrackPackage.ROAD_SEGMENT__SIGNS:
				return ((InternalEList<?>)getSigns()).basicRemove(otherEnd, msgs);
			case TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR:
				return basicSetLeftNeighborOfNeighbor(null, msgs);
			case TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR:
				return basicSetRightNeighborOfNeighbor(null, msgs);
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
			case TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR:
				if (resolve) return getLeftNeighborOfNeighbor();
				return basicGetLeftNeighborOfNeighbor();
			case TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR:
				if (resolve) return getRightNeighborOfNeighbor();
				return basicGetRightNeighborOfNeighbor();
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
			case TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR:
				setLeftNeighborOfNeighbor((RoadSegment)newValue);
				return;
			case TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR:
				setRightNeighborOfNeighbor((RoadSegment)newValue);
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
			case TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR:
				setLeftNeighborOfNeighbor((RoadSegment)null);
				return;
			case TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR:
				setRightNeighborOfNeighbor((RoadSegment)null);
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
			case TesttrackPackage.ROAD_SEGMENT__LEFT_NEIGHBOR_OF_NEIGHBOR:
				return leftNeighborOfNeighbor != null;
			case TesttrackPackage.ROAD_SEGMENT__RIGHT_NEIGHBOR_OF_NEIGHBOR:
				return rightNeighborOfNeighbor != null;
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
