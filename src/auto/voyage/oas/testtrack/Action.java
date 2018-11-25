/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.Action#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Action#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Action#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' reference.
	 * @see #setStartPosition(RoadComponent)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getAction_StartPosition()
	 * @model
	 * @generated
	 */
	RoadComponent getStartPosition();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Action#getStartPosition <em>Start Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' reference.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(RoadComponent value);

	/**
	 * Returns the value of the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Position</em>' reference.
	 * @see #setEndPosition(RoadComponent)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getAction_EndPosition()
	 * @model
	 * @generated
	 */
	RoadComponent getEndPosition();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Action#getEndPosition <em>End Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Position</em>' reference.
	 * @see #getEndPosition()
	 * @generated
	 */
	void setEndPosition(RoadComponent value);

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
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Action
