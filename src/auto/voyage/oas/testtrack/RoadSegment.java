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
 *   <li>{@link auto.voyage.oas.testtrack.RoadSegment#getLeftNeighborOfNeighbor <em>Left Neighbor Of Neighbor</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.RoadSegment#getRightNeighborOfNeighbor <em>Right Neighbor Of Neighbor</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Left Neighbor Of Neighbor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.RoadSegment#getRightNeighborOfNeighbor <em>Right Neighbor Of Neighbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Neighbor Of Neighbor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Neighbor Of Neighbor</em>' reference.
	 * @see #setLeftNeighborOfNeighbor(RoadSegment)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadSegment_LeftNeighborOfNeighbor()
	 * @see auto.voyage.oas.testtrack.RoadSegment#getRightNeighborOfNeighbor
	 * @model opposite="rightNeighborOfNeighbor"
	 * @generated
	 */
	RoadSegment getLeftNeighborOfNeighbor();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.RoadSegment#getLeftNeighborOfNeighbor <em>Left Neighbor Of Neighbor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Neighbor Of Neighbor</em>' reference.
	 * @see #getLeftNeighborOfNeighbor()
	 * @generated
	 */
	void setLeftNeighborOfNeighbor(RoadSegment value);

	/**
	 * Returns the value of the '<em><b>Right Neighbor Of Neighbor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.RoadSegment#getLeftNeighborOfNeighbor <em>Left Neighbor Of Neighbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Neighbor Of Neighbor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Neighbor Of Neighbor</em>' reference.
	 * @see #setRightNeighborOfNeighbor(RoadSegment)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getRoadSegment_RightNeighborOfNeighbor()
	 * @see auto.voyage.oas.testtrack.RoadSegment#getLeftNeighborOfNeighbor
	 * @model opposite="leftNeighborOfNeighbor"
	 * @generated
	 */
	RoadSegment getRightNeighborOfNeighbor();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.RoadSegment#getRightNeighborOfNeighbor <em>Right Neighbor Of Neighbor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Neighbor Of Neighbor</em>' reference.
	 * @see #getRightNeighborOfNeighbor()
	 * @generated
	 */
	void setRightNeighborOfNeighbor(RoadSegment value);

} // RoadSegment
