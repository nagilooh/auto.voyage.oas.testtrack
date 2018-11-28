/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.Lane#getFromLanes <em>From Lanes</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Lane#getToLanes <em>To Lanes</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Lane#isStraight <em>Straight</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends RoadComponent {
	/**
	 * Returns the value of the '<em><b>From Lanes</b></em>' reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.Lane}.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.Lane#getToLanes <em>To Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Lanes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Lanes</em>' reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane_FromLanes()
	 * @see auto.voyage.oas.testtrack.Lane#getToLanes
	 * @model opposite="toLanes"
	 * @generated
	 */
	EList<Lane> getFromLanes();

	/**
	 * Returns the value of the '<em><b>To Lanes</b></em>' reference list.
	 * The list contents are of type {@link auto.voyage.oas.testtrack.Lane}.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.Lane#getFromLanes <em>From Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Lanes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Lanes</em>' reference list.
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane_ToLanes()
	 * @see auto.voyage.oas.testtrack.Lane#getFromLanes
	 * @model opposite="fromLanes"
	 * @generated
	 */
	EList<Lane> getToLanes();

	/**
	 * Returns the value of the '<em><b>Straight</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Straight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Straight</em>' attribute.
	 * @see #setStraight(boolean)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane_Straight()
	 * @model default="true"
	 * @generated
	 */
	boolean isStraight();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Lane#isStraight <em>Straight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Straight</em>' attribute.
	 * @see #isStraight()
	 * @generated
	 */
	void setStraight(boolean value);

} // Lane
