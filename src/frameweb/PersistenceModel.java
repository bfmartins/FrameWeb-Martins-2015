/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.PersistenceModel#getPersistenceUMLPackage <em>Persistence UML Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getPersistenceModel()
 * @model
 * @generated
 */
public interface PersistenceModel extends FrameWebModel {
	/**
	 * Returns the value of the '<em><b>Persistence UML Package</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.PersistencePackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence UML Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence UML Package</em>' containment reference list.
	 * @see frameweb.FrameWebPackage#getPersistenceModel_PersistenceUMLPackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PersistencePackage> getPersistenceUMLPackage();

} // PersistenceModel
