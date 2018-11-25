/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.Intersection#getLanesIn <em>Lanes In</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Intersection#getLanesOut <em>Lanes Out</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Intersection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getIntersection()
 * @model
 * @generated
 */
public interface Intersection extends EObject {
	/**
	 * Returns the value of the '<em><b>Lanes In</b></em>' reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.Lane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanes In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes In</em>' reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getIntersection_LanesIn()
	 * @model
	 * @generated
	 */
	EList<Lane> getLanesIn();

	/**
	 * Returns the value of the '<em><b>Lanes Out</b></em>' reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.Lane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanes Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes Out</em>' reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getIntersection_LanesOut()
	 * @model
	 * @generated
	 */
	EList<Lane> getLanesOut();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getIntersection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Intersection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Intersection
