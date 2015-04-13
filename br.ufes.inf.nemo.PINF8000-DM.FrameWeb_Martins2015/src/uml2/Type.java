/**
 */
package uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type is a named element that is used as the type for a typed element. A type can be contained in a package.
 * A type constrains the values represented by a typed element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Type#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.Package#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the owning package of this classifier, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(uml2.Package)
	 * @see uml2.Uml2Package#getType_Package()
	 * @see uml2.Package#getOwnedType
	 * @model opposite="ownedType" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	uml2.Package getPackage();

	/**
	 * Sets the value of the '{@link uml2.Type#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(uml2.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a type that conforms to another. By default, two types do not conform to each other. This query is intended to be redefined for specific conformance situations.
	 * result = false
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = false'"
	 * @generated
	 */
	Boolean conformsTo(Type other);

} // Type
