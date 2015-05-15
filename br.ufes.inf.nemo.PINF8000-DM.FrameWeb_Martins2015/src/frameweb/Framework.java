/**
 */
package frameweb;

import org.eclipse.emf.cdo.CDOObject;

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
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFramework()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Framework extends CDOObject, org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Framework Tag Lib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Tag Lib</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Tag Lib</em>' containment reference.
	 * @see #setFrameworkTagLib(TagLib)
	 * @see frameweb.FramewebPackage#getFramework_FrameworkTagLib()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TagLib getFrameworkTagLib();

	/**
	 * Sets the value of the '{@link frameweb.Framework#getFrameworkTagLib <em>Framework Tag Lib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Tag Lib</em>' containment reference.
	 * @see #getFrameworkTagLib()
	 * @generated
	 */
	void setFrameworkTagLib(TagLib value);

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
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Anotation> getFrameworkAnotation();

} // Framework