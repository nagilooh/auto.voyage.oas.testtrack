/**
 */
package auto.voyage.oas.testtrack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see auto.voyage.oas.testtrack.TesttrackPackage#getActorType()
 * @model
 * @generated
 */
public enum ActorType implements Enumerator {
	/**
	 * The '<em><b>CAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAR_VALUE
	 * @generated
	 * @ordered
	 */
	CAR(0, "CAR", "CAR"),

	/**
	 * The '<em><b>BUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(1, "BUS", "BUS"),

	/**
	 * The '<em><b>BICYCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BICYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	BICYCLE(2, "BICYCLE", "BICYCLE"),

	/**
	 * The '<em><b>MOTORCYCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORCYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTORCYCLE(3, "MOTORCYCLE", "MOTORCYCLE"),

	/**
	 * The '<em><b>GOLFCART</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLFCART_VALUE
	 * @generated
	 * @ordered
	 */
	GOLFCART(4, "GOLFCART", "GOLFCART"),

	/**
	 * The '<em><b>PEDESTRIAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEDESTRIAN_VALUE
	 * @generated
	 * @ordered
	 */
	PEDESTRIAN(5, "PEDESTRIAN", "PEDESTRIAN");

	/**
	 * The '<em><b>CAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAR_VALUE = 0;

	/**
	 * The '<em><b>BUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 1;

	/**
	 * The '<em><b>BICYCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BICYCLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BICYCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BICYCLE_VALUE = 2;

	/**
	 * The '<em><b>MOTORCYCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOTORCYCLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTORCYCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTORCYCLE_VALUE = 3;

	/**
	 * The '<em><b>GOLFCART</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOLFCART</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOLFCART
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOLFCART_VALUE = 4;

	/**
	 * The '<em><b>PEDESTRIAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PEDESTRIAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PEDESTRIAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PEDESTRIAN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Actor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActorType[] VALUES_ARRAY =
		new ActorType[] {
			CAR,
			BUS,
			BICYCLE,
			MOTORCYCLE,
			GOLFCART,
			PEDESTRIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Actor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActorType get(int value) {
		switch (value) {
			case CAR_VALUE: return CAR;
			case BUS_VALUE: return BUS;
			case BICYCLE_VALUE: return BICYCLE;
			case MOTORCYCLE_VALUE: return MOTORCYCLE;
			case GOLFCART_VALUE: return GOLFCART;
			case PEDESTRIAN_VALUE: return PEDESTRIAN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActorType
