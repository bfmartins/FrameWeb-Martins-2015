/**
 */
package frameweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Navigation Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage#getNavigationConstraintKind()
 * @model
 * @generated
 */
public enum NavigationConstraintKind implements Enumerator {
	/**
	 * The '<em><b>Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT(0, "Result", "Result"),

	/**
	 * The '<em><b>Page</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE(0, "Page", "Page"),

	/**
	 * The '<em><b>Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(0, "Method", "Method"),

	/**
	 * The '<em><b>Chaining</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAINING_VALUE
	 * @generated
	 * @ordered
	 */
	CHAINING(0, "Chaining", "Chaining");

	/**
	 * The '<em><b>Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Result</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT
	 * @model name="Result"
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_VALUE = 0;

	/**
	 * The '<em><b>Page</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE
	 * @model name="Page"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_VALUE = 0;

	/**
	 * The '<em><b>Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model name="Method"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 0;

	/**
	 * The '<em><b>Chaining</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chaining</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAINING
	 * @model name="Chaining"
	 * @generated
	 * @ordered
	 */
	public static final int CHAINING_VALUE = 0;

	/**
	 * An array of all the '<em><b>Navigation Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NavigationConstraintKind[] VALUES_ARRAY =
		new NavigationConstraintKind[] {
			RESULT,
			PAGE,
			METHOD,
			CHAINING,
		};

	/**
	 * A public read-only list of all the '<em><b>Navigation Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NavigationConstraintKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Navigation Constraint Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationConstraintKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NavigationConstraintKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Navigation Constraint Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationConstraintKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NavigationConstraintKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Navigation Constraint Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NavigationConstraintKind get(int value) {
		switch (value) {
			case RESULT_VALUE: return RESULT;
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
	private NavigationConstraintKind(int value, String name, String literal) {
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
	
} //NavigationConstraintKind
