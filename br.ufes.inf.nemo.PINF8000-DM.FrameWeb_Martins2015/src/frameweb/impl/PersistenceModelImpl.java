/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.PersistenceModel;
import frameweb.PersistencePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PersistenceModelImpl#getPersistenceUMLPackage <em>Persistence UML Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceModelImpl extends FrameWebModelImpl implements PersistenceModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PERSISTENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PersistencePackage> getPersistenceUMLPackage() {
		return (EList<PersistencePackage>)eGet(FramewebPackage.Literals.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE, true);
	}

} //PersistenceModelImpl
