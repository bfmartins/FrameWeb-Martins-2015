/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainPackage#getDomainPackageClass <em>Domain Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainPackage()
 * @model
 * @generated
 */
public interface DomainPackage extends org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Domain Package Class</b></em>' containment reference list.
	 * The list contents are of type {@link ClassMappingKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Package Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Package Class</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainPackage_DomainPackageClass()
	 * @model type="frameweb.DomainClass" containment="true" required="true"
	 * @generated
	 */
	EList<ClassMappingKind> getDomainPackageClass();

} // DomainPackage
