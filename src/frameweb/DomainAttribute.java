/**
 */
package frameweb;

import uml2.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainAttribute#getSize <em>Size</em>}</li>
 *   <li>{@link frameweb.DomainAttribute#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link frameweb.DomainAttribute#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link frameweb.DomainAttribute#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getDomainAttribute()
 * @model
 * @generated
 */
public interface DomainAttribute extends Property {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see frameweb.FrameWebPackage#getDomainAttribute_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link frameweb.DomainAttribute#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Null</em>' attribute.
	 * @see #setIsNull(boolean)
	 * @see frameweb.FrameWebPackage#getDomainAttribute_IsNull()
	 * @model
	 * @generated
	 */
	boolean isIsNull();

	/**
	 * Sets the value of the '{@link frameweb.DomainAttribute#isIsNull <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Null</em>' attribute.
	 * @see #isIsNull()
	 * @generated
	 */
	void setIsNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Persistent</em>' attribute.
	 * @see #setIsPersistent(boolean)
	 * @see frameweb.FrameWebPackage#getDomainAttribute_IsPersistent()
	 * @model
	 * @generated
	 */
	boolean isIsPersistent();

	/**
	 * Sets the value of the '{@link frameweb.DomainAttribute#isIsPersistent <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Persistent</em>' attribute.
	 * @see #isIsPersistent()
	 * @generated
	 */
	void setIsPersistent(boolean value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link frameweb.DomainColumnName#getDomainAttributeName <em>Domain Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(DomainColumnName)
	 * @see frameweb.FrameWebPackage#getDomainAttribute_Column()
	 * @see frameweb.DomainColumnName#getDomainAttributeName
	 * @model opposite="DomainAttributeName"
	 * @generated
	 */
	DomainColumnName getColumn();

	/**
	 * Sets the value of the '{@link frameweb.DomainAttribute#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(DomainColumnName value);

} // DomainAttribute
