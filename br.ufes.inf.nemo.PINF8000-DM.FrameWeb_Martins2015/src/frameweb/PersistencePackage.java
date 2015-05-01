/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.PersistencePackage#getPersistencePackageInterface <em>Persistence Package Interface</em>}</li>
 *   <li>{@link frameweb.PersistencePackage#getPersistencePackageClass <em>Persistence Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getPersistencePackage()
 * @model
 * @generated
 */
public interface PersistencePackage extends uml2.Package {
	/**
	 * Returns the value of the '<em><b>Persistence Package Interface</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Package Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Package Interface</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getPersistencePackage_PersistencePackageInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DAOInterface> getPersistencePackageInterface();

	/**
	 * Returns the value of the '<em><b>Persistence Package Class</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Package Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Package Class</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getPersistencePackage_PersistencePackageClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DAOClass> getPersistencePackageClass();

} // PersistencePackage
