/**
 */
package br.ufes.inf.nemo.frameweb.frameweb.impl;

import br.ufes.inf.nemo.frameweb.frameweb.DAOClass;
import br.ufes.inf.nemo.frameweb.frameweb.DAOClassName;
import br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOClassImpl#getDAOClassName <em>DAO Class Name</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOClassImpl#getSufix <em>Sufix</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOClassImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.DAOClassImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOClassImpl extends ClassImpl implements DAOClass {
	/**
	 * The cached value of the '{@link #getDAOClassName() <em>DAO Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOClassName()
	 * @generated
	 * @ordered
	 */
	protected DAOClassName daoClassName;

	/**
	 * The default value of the '{@link #getSufix() <em>Sufix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSufix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFIX_EDEFAULT = "";

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
	 * The default value of the '{@link #getInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfix()
	 * @generated
	 * @ordered
	 */
	protected static final String INFIX_EDEFAULT = "DAO";

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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClassName getDAOClassName() {
		if (daoClassName != null && daoClassName.eIsProxy()) {
			InternalEObject oldDAOClassName = (InternalEObject)daoClassName;
			daoClassName = (DAOClassName)eResolveProxy(oldDAOClassName);
			if (daoClassName != oldDAOClassName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.DAO_CLASS__DAO_CLASS_NAME, oldDAOClassName, daoClassName));
			}
		}
		return daoClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClassName basicGetDAOClassName() {
		return daoClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAOClassName(DAOClassName newDAOClassName) {
		DAOClassName oldDAOClassName = daoClassName;
		daoClassName = newDAOClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_CLASS__DAO_CLASS_NAME, oldDAOClassName, daoClassName));
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
	public String getInfix() {
		return infix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				if (resolve) return getDAOClassName();
				return basicGetDAOClassName();
			case FramewebPackage.DAO_CLASS__SUFIX:
				return getSufix();
			case FramewebPackage.DAO_CLASS__INFIX:
				return getInfix();
			case FramewebPackage.DAO_CLASS__PREFIX:
				return getPrefix();
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
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				setDAOClassName((DAOClassName)newValue);
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
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				setDAOClassName((DAOClassName)null);
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
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				return daoClassName != null;
			case FramewebPackage.DAO_CLASS__SUFIX:
				return SUFIX_EDEFAULT == null ? sufix != null : !SUFIX_EDEFAULT.equals(sufix);
			case FramewebPackage.DAO_CLASS__INFIX:
				return INFIX_EDEFAULT == null ? infix != null : !INFIX_EDEFAULT.equals(infix);
			case FramewebPackage.DAO_CLASS__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
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
		result.append(" (sufix: ");
		result.append(sufix);
		result.append(", infix: ");
		result.append(infix);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //DAOClassImpl
