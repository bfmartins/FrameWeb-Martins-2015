/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Framework#getFrameworkTagLib <em>Framework Tag Lib</em>}</li>
 *   <li>{@link frameweb.Framework#getFrameworkRule <em>Framework Rule</em>}</li>
 *   <li>{@link frameweb.Framework#getFrameworkAnotation <em>Framework Anotation</em>}</li>
 *   <li>{@link frameweb.Framework#getFrameworkCategory <em>Framework Category</em>}</li>
 *   <li>{@link frameweb.Framework#getFrameWebResultSet <em>Frame Web Result Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFramework()
 * @model annotation="Ecore constraints='FrameworkResultSetConstraint FrameworkTagLibConstraint'"
 * @generated
 */
public interface Framework extends org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Framework Tag Lib</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.TagLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Tag Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Tag Lib</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFramework_FrameworkTagLib()
	 * @model containment="true"
	 * @generated
	 */
	EList<TagLib> getFrameworkTagLib();

	/**
	 * Returns the value of the '<em><b>Framework Rule</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Rule</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFramework_FrameworkRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getFrameworkRule();

	/**
	 * Returns the value of the '<em><b>Framework Anotation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Anotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Anotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Anotation</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFramework_FrameworkAnotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anotation> getFrameworkAnotation();

	/**
	 * Returns the value of the '<em><b>Framework Category</b></em>' attribute.
	 * The default value is <code>"standard"</code>.
	 * The literals are from the enumeration {@link frameweb.FrameworkCategoryList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Category</em>' attribute.
	 * @see frameweb.FrameworkCategoryList
	 * @see #setFrameworkCategory(FrameworkCategoryList)
	 * @see frameweb.FramewebPackage#getFramework_FrameworkCategory()
	 * @model default="standard"
	 * @generated
	 */
	FrameworkCategoryList getFrameworkCategory();

	/**
	 * Sets the value of the '{@link frameweb.Framework#getFrameworkCategory <em>Framework Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Category</em>' attribute.
	 * @see frameweb.FrameworkCategoryList
	 * @see #getFrameworkCategory()
	 * @generated
	 */
	void setFrameworkCategory(FrameworkCategoryList value);

	/**
	 * Returns the value of the '<em><b>Frame Web Result Set</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ResultSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Web Result Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Web Result Set</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFramework_FrameWebResultSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResultSet> getFrameWebResultSet();

} // Framework
