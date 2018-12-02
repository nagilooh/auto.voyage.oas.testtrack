/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.Sign#getName <em>Name</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Sign#getForRoadComponent <em>For Road Component</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getSign()
 * @model abstract="true"
 * @generated
 */
public interface Sign extends EObject {
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
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getSign_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Sign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>For Road Component</b></em>' reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.RoadComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Road Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Road Component</em>' reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getSign_ForRoadComponent()
	 * @model
	 * @generated
	 */
	EList<RoadComponent> getForRoadComponent();

} // Sign
