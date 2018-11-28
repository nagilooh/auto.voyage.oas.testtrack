/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.Actor#getType <em>Type</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Actor#getName <em>Name</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Actor#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link auto.voyage.oas.testtrack.ActorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see auto.voyage.oas.testtrack.ActorType
	 * @see #setType(ActorType)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getActor_Type()
	 * @model
	 * @generated
	 */
	ActorType getType();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Actor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see auto.voyage.oas.testtrack.ActorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActorType value);

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
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getActor_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Actor#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Actor
