/**
 */
package auto.voyage.oas.testtrack.impl;

import auto.voyage.oas.testtrack.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TesttrackFactoryImpl extends EFactoryImpl implements TesttrackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TesttrackFactory init() {
		try {
			TesttrackFactory theTesttrackFactory = (TesttrackFactory)EPackage.Registry.INSTANCE.getEFactory(TesttrackPackage.eNS_URI);
			if (theTesttrackFactory != null) {
				return theTesttrackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TesttrackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TesttrackFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TesttrackPackage.TEST_TRACK: return createTestTrack();
			case TesttrackPackage.SCENARIO: return createScenario();
			case TesttrackPackage.ROAD_SEGMENT: return createRoadSegment();
			case TesttrackPackage.ACTOR: return createActor();
			case TesttrackPackage.TRACK_SEGMENT: return createTrackSegment();
			case TesttrackPackage.LANE: return createLane();
			case TesttrackPackage.SIDEWALK: return createSidewalk();
			case TesttrackPackage.ACTION: return createAction();
			case TesttrackPackage.CROSSWALK: return createCrosswalk();
			case TesttrackPackage.STOP_SIGN: return createStopSign();
			case TesttrackPackage.GIVE_WAY_SIGN: return createGiveWaySign();
			case TesttrackPackage.INTERSECTION: return createIntersection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TesttrackPackage.ACTOR_TYPE:
				return createActorTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TesttrackPackage.ACTOR_TYPE:
				return convertActorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestTrack createTestTrack() {
		TestTrackImpl testTrack = new TestTrackImpl();
		return testTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadSegment createRoadSegment() {
		RoadSegmentImpl roadSegment = new RoadSegmentImpl();
		return roadSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackSegment createTrackSegment() {
		TrackSegmentImpl trackSegment = new TrackSegmentImpl();
		return trackSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sidewalk createSidewalk() {
		SidewalkImpl sidewalk = new SidewalkImpl();
		return sidewalk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crosswalk createCrosswalk() {
		CrosswalkImpl crosswalk = new CrosswalkImpl();
		return crosswalk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopSign createStopSign() {
		StopSignImpl stopSign = new StopSignImpl();
		return stopSign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GiveWaySign createGiveWaySign() {
		GiveWaySignImpl giveWaySign = new GiveWaySignImpl();
		return giveWaySign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intersection createIntersection() {
		IntersectionImpl intersection = new IntersectionImpl();
		return intersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorType createActorTypeFromString(EDataType eDataType, String initialValue) {
		ActorType result = ActorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TesttrackPackage getTesttrackPackage() {
		return (TesttrackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TesttrackPackage getPackage() {
		return TesttrackPackage.eINSTANCE;
	}

} //TesttrackFactoryImpl
