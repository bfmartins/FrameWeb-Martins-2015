/**
 */
package frameweb.impl;

import frameweb.DAOAttribute;
import frameweb.DAOClass;
import frameweb.DAOClassName;
import frameweb.DAOMethod;
import frameweb.FramewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOImplements <em>DAO Implements</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOClassName <em>DAO Class Name</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOClassAttribute <em>DAO Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getSufix <em>Sufix</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOClassImpl extends ClassImpl implements DAOClass {
	/**
	 * The cached value of the '{@link #getDAOImplements() <em>DAO Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOMethod> daoImplements;

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
	 * The cached value of the '{@link #getDAOClassAttribute() <em>DAO Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOAttribute> daoClassAttribute;

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
	public EList<DAOMethod> getDAOImplements() {
		if (daoImplements == null) {
			daoImplements = new EObjectContainmentEList<DAOMethod>(DAOMethod.class, this, FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS);
		}
		return daoImplements;
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
	public EList<DAOAttribute> getDAOClassAttribute() {
		if (daoClassAttribute == null) {
			daoClassAttribute = new EObjectContainmentEList<DAOAttribute>(DAOAttribute.class, this, FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE);
		}
		return daoClassAttribute;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				return ((InternalEList<?>)getDAOImplements()).basicRemove(otherEnd, msgs);
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getDAOClassAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				return getDAOImplements();
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				if (resolve) return getDAOClassName();
				return basicGetDAOClassName();
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				return getDAOClassAttribute();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				getDAOImplements().clear();
				getDAOImplements().addAll((Collection<? extends DAOMethod>)newValue);
				return;
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				setDAOClassName((DAOClassName)newValue);
				return;
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				getDAOClassAttribute().clear();
				getDAOClassAttribute().addAll((Collection<? extends DAOAttribute>)newValue);
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
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				getDAOImplements().clear();
				return;
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				setDAOClassName((DAOClassName)null);
				return;
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				getDAOClassAttribute().clear();
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
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				return daoImplements != null && !daoImplements.isEmpty();
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				return daoClassName != null;
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				return daoClassAttribute != null && !daoClassAttribute.isEmpty();
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
