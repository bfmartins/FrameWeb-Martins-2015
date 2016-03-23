/**
 */
package br.ufes.inf.nemo.frameweb.frameweb.impl;

import br.ufes.inf.nemo.frameweb.frameweb.DAOInterface;
import br.ufes.inf.nemo.frameweb.frameweb.DAOInterfaceName;
import br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.InterfaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOInterfaceImpl#getDAOInterfaceName <em>DAO Interface Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOInterfaceImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOInterfaceImpl#getSufix <em>Sufix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOInterfaceImpl extends InterfaceImpl implements DAOInterface {
	/**
	 * The cached value of the '{@link #getDAOInterfaceName() <em>DAO Interface Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected DAOInterfaceName daoInterfaceName;

	/**
	 * The default value of the '{@link #getInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfix()
	 * @generated
	 * @ordered
	 */
	protected static final String INFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfix()
	 * @generated
	 * @ordered
	 */
	protected String infix = INFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSufix() <em>Sufix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSufix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFIX_EDEFAULT = "DAO";

	/**
	 * The cached value of the '{@link #getSufix() <em>Sufix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSufix()
	 * @generated
	 * @ordered
	 */
	protected String sufix = SUFIX_EDEFAULT;

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
	public DAOInterfaceName getDAOInterfaceName() {
		if (daoInterfaceName != null && daoInterfaceName.eIsProxy()) {
			InternalEObject oldDAOInterfaceName = (InternalEObject)daoInterfaceName;
			daoInterfaceName = (DAOInterfaceName)eResolveProxy(oldDAOInterfaceName);
			if (daoInterfaceName != oldDAOInterfaceName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME, oldDAOInterfaceName, daoInterfaceName));
			}
		}
		return daoInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterfaceName basicGetDAOInterfaceName() {
		return daoInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAOInterfaceName(DAOInterfaceName newDAOInterfaceName) {
		DAOInterfaceName oldDAOInterfaceName = daoInterfaceName;
		daoInterfaceName = newDAOInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME, oldDAOInterfaceName, daoInterfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfix() {
		return infix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfix(String newInfix) {
		String oldInfix = infix;
		infix = newInfix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_INTERFACE__INFIX, oldInfix, infix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSufix() {
		return sufix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				if (resolve) return getDAOInterfaceName();
				return basicGetDAOInterfaceName();
			case FramewebPackage.DAO_INTERFACE__INFIX:
				return getInfix();
			case FramewebPackage.DAO_INTERFACE__SUFIX:
				return getSufix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				setDAOInterfaceName((DAOInterfaceName)newValue);
				return;
			case FramewebPackage.DAO_INTERFACE__INFIX:
				setInfix((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				setDAOInterfaceName((DAOInterfaceName)null);
				return;
			case FramewebPackage.DAO_INTERFACE__INFIX:
				setInfix(INFIX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FramewebPackage.DAO_INTERFACE__DAO_INTERFACE_NAME:
				return daoInterfaceName != null;
			case FramewebPackage.DAO_INTERFACE__INFIX:
				return INFIX_EDEFAULT == null ? infix != null : !INFIX_EDEFAULT.equals(infix);
			case FramewebPackage.DAO_INTERFACE__SUFIX:
				return SUFIX_EDEFAULT == null ? sufix != null : !SUFIX_EDEFAULT.equals(sufix);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (infix: ");
		result.append(infix);
		result.append(", sufix: ");
		result.append(sufix);
		result.append(')');
		return result.toString();
	}

} //DAOInterfaceImpl
