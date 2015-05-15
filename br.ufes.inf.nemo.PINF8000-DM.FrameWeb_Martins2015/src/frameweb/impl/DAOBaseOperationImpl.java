/**
 */
package frameweb.impl;

import frameweb.DAOBaseOperation;
import frameweb.DAOBaseOperationList;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Base Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOBaseOperationImpl#getDAObaseOperationName <em>DA Obase Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOBaseOperationImpl extends CDOObjectImpl implements DAOBaseOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOBaseOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_BASE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOBaseOperationList getDAObaseOperationName() {
		return (DAOBaseOperationList)eGet(FramewebPackage.Literals.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAObaseOperationName(DAOBaseOperationList newDAObaseOperationName) {
		eSet(FramewebPackage.Literals.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME, newDAObaseOperationName);
	}

} //DAOBaseOperationImpl
