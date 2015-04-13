/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type is a type whose instances are identified only by their value. A data type may contain attributes to support the modeling of structured data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.DataType#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml2.DataType#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Property}.
	 * It is bidirectional and its opposite is '{@link uml2.Property#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Attributes owned by the DataType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml2.Uml2Package#getDataType_OwnedAttribute()
	 * @see uml2.Property#getDatatype
	 * @model opposite="datatype" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Operation}.
	 * It is bidirectional and its opposite is '{@link uml2.Operation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations owned by the DataType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml2.Uml2Package#getDataType_OwnedOperation()
	 * @see uml2.Operation#getDatatype
	 * @model opposite="datatype" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

} // DataType
