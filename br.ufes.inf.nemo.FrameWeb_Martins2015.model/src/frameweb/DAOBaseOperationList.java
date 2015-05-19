/**
 */
package frameweb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DAO Base Operation List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage#getDAOBaseOperationList()
 * @model
 * @generated
 */
public enum DAOBaseOperationList implements Enumerator {
	/**
	 * The '<em><b>Retrieve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_VALUE
	 * @generated
	 * @ordered
	 */
	RETRIEVE(0, "retrieve", "retrieve"),

	/**
	 * The '<em><b>Retrieve All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	RETRIEVE_ALL(1, "retrieveAll", "retrieveAll"),

	/**
	 * The '<em><b>Save</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE(2, "save", "save"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(3, "delete", "delete");

	/**
	 * The '<em><b>Retrieve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retrieve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE
	 * @model name="retrieve"
	 * @generated
	 * @ordered
	 */
	public static final int RETRIEVE_VALUE = 0;

	/**
	 * The '<em><b>Retrieve All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retrieve All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_ALL
	 * @model name="retrieveAll"
	 * @generated
	 * @ordered
	 */
	public static final int RETRIEVE_ALL_VALUE = 1;

	/**
	 * The '<em><b>Save</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Save</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE
	 * @model name="save"
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_VALUE = 2;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 3;

	/**
	 * An array of all the '<em><b>DAO Base Operation List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DAOBaseOperationList[] VALUES_ARRAY =
		new DAOBaseOperationList[] {
			RETRIEVE,
			RETRIEVE_ALL,
			SAVE,
			DELETE,
		};

	/**
	 * A public read-only list of all the '<em><b>DAO Base Operation List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DAOBaseOperationList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DAO Base Operation List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DAOBaseOperationList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DAOBaseOperationList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAO Base Operation List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DAOBaseOperationList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DAOBaseOperationList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAO Base Operation List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DAOBaseOperationList get(int value) {
		switch (value) {
			case RETRIEVE_VALUE: return RETRIEVE;
			case RETRIEVE_ALL_VALUE: return RETRIEVE_ALL;
			case SAVE_VALUE: return SAVE;
			case DELETE_VALUE: return DELETE;
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
	private DAOBaseOperationList(int value, String name, String literal) {
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
	
} //DAOBaseOperationList
