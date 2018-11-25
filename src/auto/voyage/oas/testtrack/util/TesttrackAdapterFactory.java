/**
 */
package auto.voyage.oas.testtrack.util;

import auto.voyage.oas.testtrack.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see auto.voyage.oas.testtrack.TesttrackPackage
 * @generated
 */
public class TesttrackAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TesttrackPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TesttrackAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TesttrackPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TesttrackSwitch<Adapter> modelSwitch =
		new TesttrackSwitch<Adapter>() {
			@Override
			public Adapter caseTestTrack(TestTrack object) {
				return createTestTrackAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseRoadSegment(RoadSegment object) {
				return createRoadSegmentAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseTrackSegment(TrackSegment object) {
				return createTrackSegmentAdapter();
			}
			@Override
			public Adapter caseRoadComponent(RoadComponent object) {
				return createRoadComponentAdapter();
			}
			@Override
			public Adapter caseLane(Lane object) {
				return createLaneAdapter();
			}
			@Override
			public Adapter caseSidewalk(Sidewalk object) {
				return createSidewalkAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseSign(Sign object) {
				return createSignAdapter();
			}
			@Override
			public Adapter caseCrosswalk(Crosswalk object) {
				return createCrosswalkAdapter();
			}
			@Override
			public Adapter caseStopSign(StopSign object) {
				return createStopSignAdapter();
			}
			@Override
			public Adapter caseGiveWaySign(GiveWaySign object) {
				return createGiveWaySignAdapter();
			}
			@Override
			public Adapter caseIntersection(Intersection object) {
				return createIntersectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.TestTrack <em>Test Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.TestTrack
	 * @generated
	 */
	public Adapter createTestTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.RoadSegment <em>Road Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.RoadSegment
	 * @generated
	 */
	public Adapter createRoadSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.TrackSegment <em>Track Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.TrackSegment
	 * @generated
	 */
	public Adapter createTrackSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.RoadComponent <em>Road Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.RoadComponent
	 * @generated
	 */
	public Adapter createRoadComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Lane
	 * @generated
	 */
	public Adapter createLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Sidewalk <em>Sidewalk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Sidewalk
	 * @generated
	 */
	public Adapter createSidewalkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Sign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Sign
	 * @generated
	 */
	public Adapter createSignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Crosswalk <em>Crosswalk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Crosswalk
	 * @generated
	 */
	public Adapter createCrosswalkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.StopSign <em>Stop Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.StopSign
	 * @generated
	 */
	public Adapter createStopSignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.GiveWaySign <em>Give Way Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.GiveWaySign
	 * @generated
	 */
	public Adapter createGiveWaySignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link auto.voyage.oas.testtrack.Intersection <em>Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see auto.voyage.oas.testtrack.Intersection
	 * @generated
	 */
	public Adapter createIntersectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TesttrackAdapterFactory
