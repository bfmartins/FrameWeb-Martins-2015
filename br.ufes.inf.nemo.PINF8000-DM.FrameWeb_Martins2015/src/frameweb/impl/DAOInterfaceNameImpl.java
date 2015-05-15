/**
 */
package frameweb.impl;

import frameweb.ConstantName;
import frameweb.DAOInterfaceName;
import frameweb.DomainTableName;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Interface Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOInterfaceNameImpl#getConstantPrefix <em>Constant Prefix</em>}</li>
 *   <li>{@link frameweb.impl.DAOInterfaceNameImpl#getDomainTablePrefix <em>Domain Table Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOInterfaceNameImpl extends ConstantNameImpl implements DAOInterfaceName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOInterfaceNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_INTERFACE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantName getConstantPrefix() {
		return (ConstantName)eGet(FramewebPackage.Literals.DAO_INTERFACE_NAME__CONSTANT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantPrefix(ConstantName newConstantPrefix) {
		eSet(FramewebPackage.Literals.DAO_INTERFACE_NAME__CONSTANT_PREFIX, newConstantPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTableName getDomainTablePrefix() {
		return (DomainTableName)eGet(FramewebPackage.Literals.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainTablePrefix(DomainTableName newDomainTablePrefix) {
		eSet(FramewebPackage.Literals.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX, newDomainTablePrefix);
	}

} //DAOInterfaceNameImpl
