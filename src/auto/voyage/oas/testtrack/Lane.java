/**
 */
package auto.voyage.oas.testtrack;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link auto.voyage.oas.testtrack.Lane#getComesFrom <em>Comes From</em>}</li>
 *   <li>{@link auto.voyage.oas.testtrack.Lane#getLeadsTo <em>Leads To</em>}</li>
 * </ul>
 *
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane()
 * @model
 * @generated
 */
public interface Lane extends RoadComponent {
	/**
	 * Returns the value of the '<em><b>Comes From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.Lane#getLeadsTo <em>Leads To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comes From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comes From</em>' reference.
	 * @see #setComesFrom(Lane)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane_ComesFrom()
	 * @see auto.voyage.oas.testtrack.Lane#getLeadsTo
	 * @model opposite="leadsTo"
	 * @generated
	 */
	Lane getComesFrom();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Lane#getComesFrom <em>Comes From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comes From</em>' reference.
	 * @see #getComesFrom()
	 * @generated
	 */
	void setComesFrom(Lane value);

	/**
	 * Returns the value of the '<em><b>Leads To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link auto.voyage.oas.testtrack.Lane#getComesFrom <em>Comes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leads To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leads To</em>' reference.
	 * @see #setLeadsTo(Lane)
	 * @see auto.voyage.oas.testtrack.TesttrackPackage#getLane_LeadsTo()
	 * @see auto.voyage.oas.testtrack.Lane#getComesFrom
	 * @model opposite="comesFrom"
	 * @generated
	 */
	Lane getLeadsTo();

	/**
	 * Sets the value of the '{@link auto.voyage.oas.testtrack.Lane#getLeadsTo <em>Leads To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leads To</em>' reference.
	 * @see #getLeadsTo()
	 * @generated
	 */
	void setLeadsTo(Lane value);

} // Lane
