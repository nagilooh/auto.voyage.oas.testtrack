/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.RoadSegment#getRoadcomponents <em>Roadcomponents</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.RoadSegment#getSigns <em>Signs</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.RoadSegment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadSegment()
 * @model
 * @generated
 */
public interface RoadSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Roadcomponents</b></em>' containment reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.RoadComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roadcomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roadcomponents</em>' containment reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadSegment_Roadcomponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoadComponent> getRoadcomponents();

	/**
	 * Returns the value of the '<em><b>Signs</b></em>' containment reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.Sign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signs</em>' containment reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadSegment_Signs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sign> getSigns();

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
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadSegment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.RoadSegment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RoadSegment
