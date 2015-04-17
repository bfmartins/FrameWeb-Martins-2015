/**
 */
package frameweb;

import uml2.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ServiceGeneralization#getSourceServiceInterface <em>Source Service Interface</em>}</li>
 *   <li>{@link frameweb.ServiceGeneralization#getTargetServiceClass <em>Target Service Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getServiceGeneralization()
 * @model
 * @generated
 */
public interface ServiceGeneralization extends Generalization {
	/**
	 * Returns the value of the '<em><b>Source Service Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Service Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Service Interface</em>' reference.
	 * @see #setSourceServiceInterface(ServiceInterface)
	 * @see frameweb.FramewebPackage#getServiceGeneralization_SourceServiceInterface()
	 * @model required="true"
	 * @generated
	 */
	ServiceInterface getSourceServiceInterface();

	/**
	 * Sets the value of the '{@link frameweb.ServiceGeneralization#getSourceServiceInterface <em>Source Service Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Service Interface</em>' reference.
	 * @see #getSourceServiceInterface()
	 * @generated
	 */
	void setSourceServiceInterface(ServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Target Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Service Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Service Class</em>' reference.
	 * @see #setTargetServiceClass(ServiceClass)
	 * @see frameweb.FramewebPackage#getServiceGeneralization_TargetServiceClass()
	 * @model required="true"
	 * @generated
	 */
	ServiceClass getTargetServiceClass();

	/**
	 * Sets the value of the '{@link frameweb.ServiceGeneralization#getTargetServiceClass <em>Target Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Service Class</em>' reference.
	 * @see #getTargetServiceClass()
	 * @generated
	 */
	void setTargetServiceClass(ServiceClass value);

} // ServiceGeneralization
