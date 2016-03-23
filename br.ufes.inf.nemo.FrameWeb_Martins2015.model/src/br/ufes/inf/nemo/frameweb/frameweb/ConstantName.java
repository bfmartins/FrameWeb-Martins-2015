/**
 */
package br.ufes.inf.nemo.frameweb.frameweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.ConstantName#getFwName <em>Fw Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getConstantName()
 * @model
 * @generated
 */
public interface ConstantName extends EObject {
	/**
	 * Returns the value of the '<em><b>Fw Name</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.frameweb.ConstantNameList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fw Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fw Name</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.ConstantNameList
	 * @see #setFwName(ConstantNameList)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getConstantName_FwName()
	 * @model
	 * @generated
	 */
	ConstantNameList getFwName();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.ConstantName#getFwName <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fw Name</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.ConstantNameList
	 * @see #getFwName()
	 * @generated
	 */
	void setFwName(ConstantNameList value);

} // ConstantName
