/**
 */
package frameweb.impl;

import frameweb.DAOClass;
import frameweb.DAOInterface;
import frameweb.FramewebPackage;
import frameweb.PersistencePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PersistencePackageImpl#getPersistencePackageInterface <em>Persistence Package Interface</em>}</li>
 *   <li>{@link frameweb.impl.PersistencePackageImpl#getPersistencePackageClass <em>Persistence Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistencePackageImpl extends PackageImpl implements PersistencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistencePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PERSISTENCE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 28;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DAOInterface> getPersistencePackageInterface() {
		return (EList<DAOInterface>)eGet(FramewebPackage.Literals.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DAOClass> getPersistencePackageClass() {
		return (EList<DAOClass>)eGet(FramewebPackage.Literals.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS, true);
	}

} //PersistencePackageImpl
