/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.Intersection;
import auto.voyage.oas.testtrack.Lane;
import auto.voyage.oas.testtrack.TesttrackPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.impl.IntersectionImpl#getLanesIn <em>Lanes In</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.IntersectionImpl#getLanesOut <em>Lanes Out</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.impl.IntersectionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntersectionImpl extends MinimalEObjectImpl.Container implements Intersection {
	/**
	 * The cached value of the '{@link #getLanesIn() <em>Lanes In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanesIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanesIn;

	/**
	 * The cached value of the '{@link #getLanesOut() <em>Lanes Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanesOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanesOut;

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
	protected IntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesttrackPackage.Literals.INTERSECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLanesIn() {
		if (lanesIn == null) {
			lanesIn = new EObjectResolvingEList<Lane>(Lane.class, this, TesttrackPackage.INTERSECTION__LANES_IN);
		}
		return lanesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLanesOut() {
		if (lanesOut == null) {
			lanesOut = new EObjectResolvingEList<Lane>(Lane.class, this, TesttrackPackage.INTERSECTION__LANES_OUT);
		}
		return lanesOut;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TesttrackPackage.INTERSECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TesttrackPackage.INTERSECTION__LANES_IN:
				return getLanesIn();
			case TesttrackPackage.INTERSECTION__LANES_OUT:
				return getLanesOut();
			case TesttrackPackage.INTERSECTION__NAME:
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
			case TesttrackPackage.INTERSECTION__LANES_IN:
				getLanesIn().clear();
				getLanesIn().addAll((Collection<? extends Lane>)newValue);
				return;
			case TesttrackPackage.INTERSECTION__LANES_OUT:
				getLanesOut().clear();
				getLanesOut().addAll((Collection<? extends Lane>)newValue);
				return;
			case TesttrackPackage.INTERSECTION__NAME:
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
			case TesttrackPackage.INTERSECTION__LANES_IN:
				getLanesIn().clear();
				return;
			case TesttrackPackage.INTERSECTION__LANES_OUT:
				getLanesOut().clear();
				return;
			case TesttrackPackage.INTERSECTION__NAME:
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
			case TesttrackPackage.INTERSECTION__LANES_IN:
				return lanesIn != null && !lanesIn.isEmpty();
			case TesttrackPackage.INTERSECTION__LANES_OUT:
				return lanesOut != null && !lanesOut.isEmpty();
			case TesttrackPackage.INTERSECTION__NAME:
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

} //IntersectionImpl
