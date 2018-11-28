/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.RoadComponent#getName <em>Name</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.RoadComponent#getLeftLane <em>Left Lane</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.RoadComponent#getRightLane <em>Right Lane</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadComponent()
 * @model abstract="true"
 * @generated
 */
public interface RoadComponent extends EObject {
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
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.RoadComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Left Lane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.RoadComponent#getRightLane <em>Right Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Lane</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Lane</em>' reference.
	 * @see #setLeftLane(RoadComponent)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadComponent_LeftLane()
	 * @see auto.voyage.oas.testtrack.RoadComponent#getRightLane
	 * @model opposite="rightLane"
	 * @generated
	 */
	RoadComponent getLeftLane();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.RoadComponent#getLeftLane <em>Left Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Lane</em>' reference.
	 * @see #getLeftLane()
	 * @generated
	 */
	void setLeftLane(RoadComponent value);

	/**
	 * Returns the value of the '<em><b>Right Lane</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.RoadComponent#getLeftLane <em>Left Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Lane</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Lane</em>' reference.
	 * @see #setRightLane(RoadComponent)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadComponent_RightLane()
	 * @see auto.voyage.oas.testtrack.RoadComponent#getLeftLane
	 * @model opposite="leftLane"
	 * @generated
	 */
	RoadComponent getRightLane();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.RoadComponent#getRightLane <em>Right Lane</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Lane</em>' reference.
	 * @see #getRightLane()
	 * @generated
	 */
	void setRightLane(RoadComponent value);

} // RoadComponent
