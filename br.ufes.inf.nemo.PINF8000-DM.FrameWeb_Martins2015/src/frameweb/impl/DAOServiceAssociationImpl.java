/**
 */
package frameweb.impl;

import frameweb.DAOInterface;
import frameweb.DAOServiceAssociation;
import frameweb.FramewebPackage;
import frameweb.ServiceClass;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Service Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOServiceAssociationImpl#getSourceDAOClass <em>Source DAO Class</em>}</li>
 *   <li>{@link frameweb.impl.DAOServiceAssociationImpl#getTargetDAOService <em>Target DAO Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOServiceAssociationImpl extends ServiceAssociationImpl implements DAOServiceAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOServiceAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface getSourceDAOClass() {
		return (DAOInterface)eGet(FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDAOClass(DAOInterface newSourceDAOClass) {
		eSet(FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS, newSourceDAOClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getTargetDAOService() {
		return (ServiceClass)eGet(FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDAOService(ServiceClass newTargetDAOService) {
		eSet(FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE, newTargetDAOService);
	}

} //DAOServiceAssociationImpl
