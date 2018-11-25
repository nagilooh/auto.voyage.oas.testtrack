/**
 */
package auto.voyage.oas.testtrack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see auto.voyage.oas.testtrack.TesttrackFactory
 * @model kind="package"
 * @generated
 */
public interface TesttrackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testtrack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/testtrack";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testtrack";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TesttrackPackage eINSTANCE = auto.voyage.oas.testtrack.impl.TesttrackPackageImpl.init();

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.TestTrackImpl <em>Test Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.TestTrackImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getTestTrack()
	 * @generated
	 */
	int TEST_TRACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TRACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tracksegments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TRACK__TRACKSEGMENTS = 1;

	/**
	 * The number of structural features of the '<em>Test Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TRACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.ScenarioImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ACTORS = 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl <em>Road Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.RoadSegmentImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getRoadSegment()
	 * @generated
	 */
	int ROAD_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Roadcomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SEGMENT__ROADCOMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Signs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SEGMENT__SIGNS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SEGMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Road Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Road Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.ActorImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.TrackSegmentImpl <em>Track Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.TrackSegmentImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getTrackSegment()
	 * @generated
	 */
	int TRACK_SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Roadsegments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_SEGMENT__ROADSEGMENTS = 0;

	/**
	 * The feature id for the '<em><b>Intersection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_SEGMENT__INTERSECTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_SEGMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_SEGMENT__SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Track Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Track Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.RoadComponentImpl <em>Road Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.RoadComponentImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getRoadComponent()
	 * @generated
	 */
	int ROAD_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Road Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Road Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.LaneImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getLane()
	 * @generated
	 */
	int LANE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = ROAD_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Comes From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__COMES_FROM = ROAD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leads To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__LEADS_TO = ROAD_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = ROAD_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_OPERATION_COUNT = ROAD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.SidewalkImpl <em>Sidewalk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.SidewalkImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getSidewalk()
	 * @generated
	 */
	int SIDEWALK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWALK__NAME = ROAD_COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Sidewalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWALK_FEATURE_COUNT = ROAD_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sidewalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIDEWALK_OPERATION_COUNT = ROAD_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.ActionImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__START_POSITION = 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__END_POSITION = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.SignImpl <em>Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.SignImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getSign()
	 * @generated
	 */
	int SIGN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.CrosswalkImpl <em>Crosswalk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.CrosswalkImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getCrosswalk()
	 * @generated
	 */
	int CROSSWALK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__NAME = SIGN__NAME;

	/**
	 * The number of structural features of the '<em>Crosswalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK_FEATURE_COUNT = SIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Crosswalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK_OPERATION_COUNT = SIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.StopSignImpl <em>Stop Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.StopSignImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getStopSign()
	 * @generated
	 */
	int STOP_SIGN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SIGN__NAME = SIGN__NAME;

	/**
	 * The number of structural features of the '<em>Stop Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SIGN_FEATURE_COUNT = SIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SIGN_OPERATION_COUNT = SIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.GiveWaySignImpl <em>Give Way Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.GiveWaySignImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getGiveWaySign()
	 * @generated
	 */
	int GIVE_WAY_SIGN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_WAY_SIGN__NAME = SIGN__NAME;

	/**
	 * The number of structural features of the '<em>Give Way Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_WAY_SIGN_FEATURE_COUNT = SIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Give Way Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_WAY_SIGN_OPERATION_COUNT = SIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.impl.IntersectionImpl <em>Intersection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.impl.IntersectionImpl
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getIntersection()
	 * @generated
	 */
	int INTERSECTION = 13;

	/**
	 * The feature id for the '<em><b>Lanes In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__LANES_IN = 0;

	/**
	 * The feature id for the '<em><b>Lanes Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__LANES_OUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Intersection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERSECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link auto.voyage.oas.testtrack.ActorType <em>Actor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see auto.voyage.oas.testtrack.ActorType
	 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getActorType()
	 * @generated
	 */
	int ACTOR_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.TestTrack <em>Test Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Track</em>'.
	 * @see auto.voyage.oas.testtrack.TestTrack
	 * @generated
	 */
	EClass getTestTrack();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.TestTrack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.TestTrack#getName()
	 * @see #getTestTrack()
	 * @generated
	 */
	EAttribute getTestTrack_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.TestTrack#getTracksegments <em>Tracksegments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracksegments</em>'.
	 * @see auto.voyage.oas.testtrack.TestTrack#getTracksegments()
	 * @see #getTestTrack()
	 * @generated
	 */
	EReference getTestTrack_Tracksegments();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see auto.voyage.oas.testtrack.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.Scenario#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see auto.voyage.oas.testtrack.Scenario#getActors()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Actors();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.RoadSegment <em>Road Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Segment</em>'.
	 * @see auto.voyage.oas.testtrack.RoadSegment
	 * @generated
	 */
	EClass getRoadSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.RoadSegment#getRoadcomponents <em>Roadcomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roadcomponents</em>'.
	 * @see auto.voyage.oas.testtrack.RoadSegment#getRoadcomponents()
	 * @see #getRoadSegment()
	 * @generated
	 */
	EReference getRoadSegment_Roadcomponents();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.RoadSegment#getSigns <em>Signs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signs</em>'.
	 * @see auto.voyage.oas.testtrack.RoadSegment#getSigns()
	 * @see #getRoadSegment()
	 * @generated
	 */
	EReference getRoadSegment_Signs();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.RoadSegment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.RoadSegment#getName()
	 * @see #getRoadSegment()
	 * @generated
	 */
	EAttribute getRoadSegment_Name();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see auto.voyage.oas.testtrack.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.Actor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see auto.voyage.oas.testtrack.Actor#getType()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Type();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.Actor#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see auto.voyage.oas.testtrack.Actor#getAction()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Action();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.TrackSegment <em>Track Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Segment</em>'.
	 * @see auto.voyage.oas.testtrack.TrackSegment
	 * @generated
	 */
	EClass getTrackSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.TrackSegment#getRoadsegments <em>Roadsegments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roadsegments</em>'.
	 * @see auto.voyage.oas.testtrack.TrackSegment#getRoadsegments()
	 * @see #getTrackSegment()
	 * @generated
	 */
	EReference getTrackSegment_Roadsegments();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.TrackSegment#getIntersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intersection</em>'.
	 * @see auto.voyage.oas.testtrack.TrackSegment#getIntersection()
	 * @see #getTrackSegment()
	 * @generated
	 */
	EReference getTrackSegment_Intersection();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.TrackSegment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.TrackSegment#getName()
	 * @see #getTrackSegment()
	 * @generated
	 */
	EAttribute getTrackSegment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link auto.voyage.oas.testtrack.TrackSegment#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see auto.voyage.oas.testtrack.TrackSegment#getScenarios()
	 * @see #getTrackSegment()
	 * @generated
	 */
	EReference getTrackSegment_Scenarios();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.RoadComponent <em>Road Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road Component</em>'.
	 * @see auto.voyage.oas.testtrack.RoadComponent
	 * @generated
	 */
	EClass getRoadComponent();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.RoadComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.RoadComponent#getName()
	 * @see #getRoadComponent()
	 * @generated
	 */
	EAttribute getRoadComponent_Name();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see auto.voyage.oas.testtrack.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the reference '{@link auto.voyage.oas.testtrack.Lane#getComesFrom <em>Comes From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comes From</em>'.
	 * @see auto.voyage.oas.testtrack.Lane#getComesFrom()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_ComesFrom();

	/**
	 * Returns the meta object for the reference '{@link auto.voyage.oas.testtrack.Lane#getLeadsTo <em>Leads To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leads To</em>'.
	 * @see auto.voyage.oas.testtrack.Lane#getLeadsTo()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_LeadsTo();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Sidewalk <em>Sidewalk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sidewalk</em>'.
	 * @see auto.voyage.oas.testtrack.Sidewalk
	 * @generated
	 */
	EClass getSidewalk();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see auto.voyage.oas.testtrack.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link auto.voyage.oas.testtrack.Action#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Position</em>'.
	 * @see auto.voyage.oas.testtrack.Action#getStartPosition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_StartPosition();

	/**
	 * Returns the meta object for the reference '{@link auto.voyage.oas.testtrack.Action#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Position</em>'.
	 * @see auto.voyage.oas.testtrack.Action#getEndPosition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_EndPosition();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Sign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign</em>'.
	 * @see auto.voyage.oas.testtrack.Sign
	 * @generated
	 */
	EClass getSign();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.Sign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.Sign#getName()
	 * @see #getSign()
	 * @generated
	 */
	EAttribute getSign_Name();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Crosswalk <em>Crosswalk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosswalk</em>'.
	 * @see auto.voyage.oas.testtrack.Crosswalk
	 * @generated
	 */
	EClass getCrosswalk();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.StopSign <em>Stop Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Sign</em>'.
	 * @see auto.voyage.oas.testtrack.StopSign
	 * @generated
	 */
	EClass getStopSign();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.GiveWaySign <em>Give Way Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Give Way Sign</em>'.
	 * @see auto.voyage.oas.testtrack.GiveWaySign
	 * @generated
	 */
	EClass getGiveWaySign();

	/**
	 * Returns the meta object for class '{@link auto.voyage.oas.testtrack.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intersection</em>'.
	 * @see auto.voyage.oas.testtrack.Intersection
	 * @generated
	 */
	EClass getIntersection();

	/**
	 * Returns the meta object for the reference list '{@link auto.voyage.oas.testtrack.Intersection#getLanesIn <em>Lanes In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lanes In</em>'.
	 * @see auto.voyage.oas.testtrack.Intersection#getLanesIn()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_LanesIn();

	/**
	 * Returns the meta object for the reference list '{@link auto.voyage.oas.testtrack.Intersection#getLanesOut <em>Lanes Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lanes Out</em>'.
	 * @see auto.voyage.oas.testtrack.Intersection#getLanesOut()
	 * @see #getIntersection()
	 * @generated
	 */
	EReference getIntersection_LanesOut();

	/**
	 * Returns the meta object for the attribute '{@link auto.voyage.oas.testtrack.Intersection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see auto.voyage.oas.testtrack.Intersection#getName()
	 * @see #getIntersection()
	 * @generated
	 */
	EAttribute getIntersection_Name();

	/**
	 * Returns the meta object for enum '{@link auto.voyage.oas.testtrack.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Type</em>'.
	 * @see auto.voyage.oas.testtrack.ActorType
	 * @generated
	 */
	EEnum getActorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TesttrackFactory getTesttrackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.TestTrackImpl <em>Test Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.TestTrackImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getTestTrack()
		 * @generated
		 */
		EClass TEST_TRACK = eINSTANCE.getTestTrack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_TRACK__NAME = eINSTANCE.getTestTrack_Name();

		/**
		 * The meta object literal for the '<em><b>Tracksegments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_TRACK__TRACKSEGMENTS = eINSTANCE.getTestTrack_Tracksegments();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.ScenarioImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ACTORS = eINSTANCE.getScenario_Actors();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.RoadSegmentImpl <em>Road Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.RoadSegmentImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getRoadSegment()
		 * @generated
		 */
		EClass ROAD_SEGMENT = eINSTANCE.getRoadSegment();

		/**
		 * The meta object literal for the '<em><b>Roadcomponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD_SEGMENT__ROADCOMPONENTS = eINSTANCE.getRoadSegment_Roadcomponents();

		/**
		 * The meta object literal for the '<em><b>Signs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD_SEGMENT__SIGNS = eINSTANCE.getRoadSegment_Signs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_SEGMENT__NAME = eINSTANCE.getRoadSegment_Name();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.ActorImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ACTION = eINSTANCE.getActor_Action();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.TrackSegmentImpl <em>Track Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.TrackSegmentImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getTrackSegment()
		 * @generated
		 */
		EClass TRACK_SEGMENT = eINSTANCE.getTrackSegment();

		/**
		 * The meta object literal for the '<em><b>Roadsegments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_SEGMENT__ROADSEGMENTS = eINSTANCE.getTrackSegment_Roadsegments();

		/**
		 * The meta object literal for the '<em><b>Intersection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_SEGMENT__INTERSECTION = eINSTANCE.getTrackSegment_Intersection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK_SEGMENT__NAME = eINSTANCE.getTrackSegment_Name();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_SEGMENT__SCENARIOS = eINSTANCE.getTrackSegment_Scenarios();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.RoadComponentImpl <em>Road Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.RoadComponentImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getRoadComponent()
		 * @generated
		 */
		EClass ROAD_COMPONENT = eINSTANCE.getRoadComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD_COMPONENT__NAME = eINSTANCE.getRoadComponent_Name();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.LaneImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Comes From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__COMES_FROM = eINSTANCE.getLane_ComesFrom();

		/**
		 * The meta object literal for the '<em><b>Leads To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__LEADS_TO = eINSTANCE.getLane_LeadsTo();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.SidewalkImpl <em>Sidewalk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.SidewalkImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getSidewalk()
		 * @generated
		 */
		EClass SIDEWALK = eINSTANCE.getSidewalk();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.ActionImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__START_POSITION = eINSTANCE.getAction_StartPosition();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__END_POSITION = eINSTANCE.getAction_EndPosition();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.SignImpl <em>Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.SignImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getSign()
		 * @generated
		 */
		EClass SIGN = eINSTANCE.getSign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN__NAME = eINSTANCE.getSign_Name();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.CrosswalkImpl <em>Crosswalk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.CrosswalkImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getCrosswalk()
		 * @generated
		 */
		EClass CROSSWALK = eINSTANCE.getCrosswalk();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.StopSignImpl <em>Stop Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.StopSignImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getStopSign()
		 * @generated
		 */
		EClass STOP_SIGN = eINSTANCE.getStopSign();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.GiveWaySignImpl <em>Give Way Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.GiveWaySignImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getGiveWaySign()
		 * @generated
		 */
		EClass GIVE_WAY_SIGN = eINSTANCE.getGiveWaySign();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.impl.IntersectionImpl <em>Intersection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.impl.IntersectionImpl
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getIntersection()
		 * @generated
		 */
		EClass INTERSECTION = eINSTANCE.getIntersection();

		/**
		 * The meta object literal for the '<em><b>Lanes In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__LANES_IN = eINSTANCE.getIntersection_LanesIn();

		/**
		 * The meta object literal for the '<em><b>Lanes Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERSECTION__LANES_OUT = eINSTANCE.getIntersection_LanesOut();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERSECTION__NAME = eINSTANCE.getIntersection_Name();

		/**
		 * The meta object literal for the '{@link auto.voyage.oas.testtrack.ActorType <em>Actor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see auto.voyage.oas.testtrack.ActorType
		 * @see auto.voyage.oas.testtrack.impl.TesttrackPackageImpl#getActorType()
		 * @generated
		 */
		EEnum ACTOR_TYPE = eINSTANCE.getActorType();

	}

} //TesttrackPackage
