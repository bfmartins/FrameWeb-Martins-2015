/**
 */
package frameweb;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainClass#getDomainClassAttribute <em>Domain Class Attribute</em>}</li>
 *   <li>{@link frameweb.DomainClass#getDomainClassOperation <em>Domain Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainClass()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface DomainClass extends CDOObject, org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Domain Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DomainAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainClass_DomainClassAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DomainAttribute> getDomainClassAttribute();

	/**
	 * Returns the value of the '<em><b>Domain Class Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DomainOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Class Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Class Operation</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainClass_DomainClassOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainOperation> getDomainClassOperation();

} // DomainClass