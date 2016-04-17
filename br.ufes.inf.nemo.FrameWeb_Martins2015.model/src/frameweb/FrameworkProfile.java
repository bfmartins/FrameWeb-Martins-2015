/**
 */
package frameweb;

import org.eclipse.uml2.uml.Profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FrameworkProfile#getCategory <em>Category</em>}</li>
 *   <li>{@link frameweb.FrameworkProfile#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrameworkProfile()
 * @model
 * @generated
 */
public interface FrameworkProfile extends Profile {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.FrameworkCategoryList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see frameweb.FrameworkCategoryList
	 * @see #setCategory(FrameworkCategoryList)
	 * @see frameweb.FramewebPackage#getFrameworkProfile_Category()
	 * @model
	 * @generated
	 */
	FrameworkCategoryList getCategory();

	/**
	 * Sets the value of the '{@link frameweb.FrameworkProfile#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see frameweb.FrameworkCategoryList
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(FrameworkCategoryList value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.FrameworkKindList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see frameweb.FrameworkKindList
	 * @see #setKind(FrameworkKindList)
	 * @see frameweb.FramewebPackage#getFrameworkProfile_Kind()
	 * @model
	 * @generated
	 */
	FrameworkKindList getKind();

	/**
	 * Sets the value of the '{@link frameweb.FrameworkProfile#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see frameweb.FrameworkKindList
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FrameworkKindList value);

} // FrameworkProfile
