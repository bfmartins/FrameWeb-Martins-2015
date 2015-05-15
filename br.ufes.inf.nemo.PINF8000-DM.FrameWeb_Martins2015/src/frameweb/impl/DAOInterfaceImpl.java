/**
 */
package frameweb.impl;

import frameweb.DAOAttribute;
import frameweb.DAOBaseOperation;
import frameweb.DAOInterface;
import frameweb.DAOInterfaceName;
import frameweb.DAOOperation;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.InterfaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getOwnBaseOperation <em>Own Base Operation</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getOwnOperation <em>Own Operation</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getDAOInterfaceName <em>DAO Interface Name</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceImpl#getDAOInterfaceAttribute <em>DAO Interface Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOInterfaceImpl extends InterfaceImpl implements DAOInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 44;

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
	public EList<DAOBaseOperation> getOwnBaseOperation() {
		return (EList<DAOBaseOperation>)eGet(FramewebPackage.Literals.DAO_INTERFACE__OWN_BASE_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DAOOperation> getOwnOperation() {
		return (EList<DAOOperation>)eGet(FramewebPackage.Literals.DAO_INTERFACE__OWN_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterfaceName getDAOInterfaceName() {
		return (DAOInterfaceName)eGet(FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAOInterfaceName(DAOInterfaceName newDAOInterfaceName) {
		eSet(FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_NAME, newDAOInterfaceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DAOAttribute> getDAOInterfaceAttribute() {
		return (EList<DAOAttribute>)eGet(FramewebPackage.Literals.DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE, true);
	}

} //DAOInterfaceImpl
