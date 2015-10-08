/**
 */
package frameweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Framework Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage#getFrameworkCategoryList()
 * @model
 * @generated
 */
public enum FrameworkCategoryList implements Enumerator {
	/**
	 * The '<em><b>MVC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MVC_VALUE
	 * @generated
	 * @ordered
	 */
	MVC(1, "MVC", "mvc"),

	/**
	 * The '<em><b>Dependency Injection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_INJECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCY_INJECTION(2, "DependencyInjection", "dependencyInjection"),

	/**
	 * The '<em><b>ORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORM_VALUE
	 * @generated
	 * @ordered
	 */
	ORM(3, "ORM", "orm"),

	/**
	 * The '<em><b>Decorator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECORATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DECORATOR(4, "Decorator", "decorator"),

	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(0, "Standard", "standard");

	/**
	 * The '<em><b>MVC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MVC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MVC
	 * @model literal="mvc"
	 * @generated
	 * @ordered
	 */
	public static final int MVC_VALUE = 1;

	/**
	 * The '<em><b>Dependency Injection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dependency Injection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCY_INJECTION
	 * @model name="DependencyInjection" literal="dependencyInjection"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCY_INJECTION_VALUE = 2;

	/**
	 * The '<em><b>ORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORM
	 * @model literal="orm"
	 * @generated
	 * @ordered
	 */
	public static final int ORM_VALUE = 3;

	/**
	 * The '<em><b>Decorator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decorator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECORATOR
	 * @model name="Decorator" literal="decorator"
	 * @generated
	 * @ordered
	 */
	public static final int DECORATOR_VALUE = 4;

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model name="Standard" literal="standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 0;

	/**
	 * An array of all the '<em><b>Framework Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FrameworkCategoryList[] VALUES_ARRAY =
		new FrameworkCategoryList[] {
			MVC,
			DEPENDENCY_INJECTION,
			ORM,
			DECORATOR,
			STANDARD,
		};

	/**
	 * A public read-only list of all the '<em><b>Framework Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FrameworkCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Framework Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FrameworkCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Framework Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrameworkCategoryList get(int value) {
		switch (value) {
			case MVC_VALUE: return MVC;
			case DEPENDENCY_INJECTION_VALUE: return DEPENDENCY_INJECTION;
			case ORM_VALUE: return ORM;
			case DECORATOR_VALUE: return DECORATOR;
			case STANDARD_VALUE: return STANDARD;
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
	private FrameworkCategoryList(int value, String name, String literal) {
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
	
} //FrameworkCategoryList
