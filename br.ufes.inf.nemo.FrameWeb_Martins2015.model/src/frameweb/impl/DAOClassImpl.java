/**
 */
package frameweb.impl;

import frameweb.DAOAttribute;
import frameweb.DAOBaseOperation;
import frameweb.DAOClass;
import frameweb.DAOClassName;
import frameweb.DAOOperation;
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
 *   <li>{@link frameweb.impl.DAOClassImpl#getBaseImplements <em>Base Implements</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOImplements <em>DAO Implements</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOClassName <em>DAO Class Name</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOClassAttribute <em>DAO Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOClassImpl extends ClassImpl implements DAOClass {
	/**
	 * The cached value of the '{@link #getBaseImplements() <em>Base Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOBaseOperation> baseImplements;

	/**
	 * The cached value of the '{@link #getDAOImplements() <em>DAO Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAOImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOOperation> daoImplements;

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
	public EList<DAOBaseOperation> getBaseImplements() {
		if (baseImplements == null) {
			baseImplements = new EObjectContainmentEList<DAOBaseOperation>(DAOBaseOperation.class, this, FramewebPackage.DAO_CLASS__BASE_IMPLEMENTS);
		}
		return baseImplements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAOOperation> getDAOImplements() {
		if (daoImplements == null) {
			daoImplements = new EObjectContainmentEList<DAOOperation>(DAOOperation.class, this, FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DAO_CLASS__BASE_IMPLEMENTS:
				return ((InternalEList<?>)getBaseImplements()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.DAO_CLASS__BASE_IMPLEMENTS:
				return getBaseImplements();
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				return getDAOImplements();
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				if (resolve) return getDAOClassName();
				return basicGetDAOClassName();
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				return getDAOClassAttribute();
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
			case FramewebPackage.DAO_CLASS__BASE_IMPLEMENTS:
				getBaseImplements().clear();
				getBaseImplements().addAll((Collection<? extends DAOBaseOperation>)newValue);
				return;
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				getDAOImplements().clear();
				getDAOImplements().addAll((Collection<? extends DAOOperation>)newValue);
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
			case FramewebPackage.DAO_CLASS__BASE_IMPLEMENTS:
				getBaseImplements().clear();
				return;
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
			case FramewebPackage.DAO_CLASS__BASE_IMPLEMENTS:
				return baseImplements != null && !baseImplements.isEmpty();
			case FramewebPackage.DAO_CLASS__DAO_IMPLEMENTS:
				return daoImplements != null && !daoImplements.isEmpty();
			case FramewebPackage.DAO_CLASS__DAO_CLASS_NAME:
				return daoClassName != null;
			case FramewebPackage.DAO_CLASS__DAO_CLASS_ATTRIBUTE:
				return daoClassAttribute != null && !daoClassAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DAOClassImpl
