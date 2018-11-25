/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see auto.voyage.oas.testtrack.TesttrackPackage
 * @generated
 */
public interface TesttrackFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TesttrackFactory eINSTANCE = auto.voyage.oas.testtrack.impl.TesttrackFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Track</em>'.
	 * @generated
	 */
	TestTrack createTestTrack();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Road Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road Segment</em>'.
	 * @generated
	 */
	RoadSegment createRoadSegment();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Track Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Track Segment</em>'.
	 * @generated
	 */
	TrackSegment createTrackSegment();

	/**
	 * Returns a new object of class '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lane</em>'.
	 * @generated
	 */
	Lane createLane();

	/**
	 * Returns a new object of class '<em>Sidewalk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sidewalk</em>'.
	 * @generated
	 */
	Sidewalk createSidewalk();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Crosswalk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crosswalk</em>'.
	 * @generated
	 */
	Crosswalk createCrosswalk();

	/**
	 * Returns a new object of class '<em>Stop Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Sign</em>'.
	 * @generated
	 */
	StopSign createStopSign();

	/**
	 * Returns a new object of class '<em>Give Way Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Give Way Sign</em>'.
	 * @generated
	 */
	GiveWaySign createGiveWaySign();

	/**
	 * Returns a new object of class '<em>Intersection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection</em>'.
	 * @generated
	 */
	Intersection createIntersection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TesttrackPackage getTesttrackPackage();

} //TesttrackFactory
