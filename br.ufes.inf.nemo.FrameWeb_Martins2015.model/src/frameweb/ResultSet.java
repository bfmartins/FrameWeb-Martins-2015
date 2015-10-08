/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ResultSet#getSetOfResultType <em>Set Of Result Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getResultSet()
 * @model
 * @generated
 */
public interface ResultSet extends org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Set Of Result Type</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Of Result Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Of Result Type</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getResultSet_SetOfResultType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResultType> getSetOfResultType();

} // ResultSet
