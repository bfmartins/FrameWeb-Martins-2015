/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainModel#getDomainUMLPackage <em>Domain UML Package</em>}</li>
 *   <li>{@link frameweb.DomainModel#getDomainUMLAssociation <em>Domain UML Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DomainModelContent DomainModelMinimum'"
 *        annotation="comments DomainModelContent='A DomainModel must have only DomainPackage.' DomainModelMinimum='A DomainModel must have at least one DomainPackage'"
 *        annotation="OCL DomainModelContent='self.packagedElement.oclIsType(DomainPackage' DomaniModelMinimum='self.packagedElement->size()>=1'"
 * @generated
 */
public interface DomainModel extends FrameWebModel {
	/**
	 * Returns the value of the '<em><b>Domain UML Package</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DomainPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain UML Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain UML Package</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainModel_DomainUMLPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainPackage> getDomainUMLPackage();

	/**
	 * Returns the value of the '<em><b>Domain UML Association</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DomainAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain UML Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain UML Association</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainModel_DomainUMLAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainAssociation> getDomainUMLAssociation();

} // DomainModel
