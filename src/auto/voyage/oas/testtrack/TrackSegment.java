/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.TrackSegment#getRoadsegments <em>Roadsegments</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.TrackSegment#getName <em>Name</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.TrackSegment#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getTrackSegment()
 * @model
 * @generated
 */
public interface TrackSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Roadsegments</b></em>' containment reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.RoadSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roadsegments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roadsegments</em>' containment reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getTrackSegment_Roadsegments()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoadSegment> getRoadsegments();

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
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getTrackSegment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.TrackSegment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.Scenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getTrackSegment_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

} // TrackSegment
