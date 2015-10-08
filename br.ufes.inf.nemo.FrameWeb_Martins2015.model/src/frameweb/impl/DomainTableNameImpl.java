/**
 */
package frameweb.impl;

import frameweb.DomainTableName;
import frameweb.FramewebPackage;
import frameweb.PersistentClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Table Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainTableNameImpl#getFwName <em>Fw Name</em>}</li>
 *   <li>{@link frameweb.impl.DomainTableNameImpl#getPersistentClassName <em>Persistent Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainTableNameImpl extends MinimalEObjectImpl.Container implements DomainTableName {
	/**
	 * The default value of the '{@link #getFwName() <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwName()
	 * @generated
	 * @ordered
	 */
	protected static final String FW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFwName() <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwName()
	 * @generated
	 * @ordered
	 */
	protected String fwName = FW_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersistentClassName() <em>Persistent Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentClassName()
	 * @generated
	 * @ordered
	 */
	protected PersistentClass persistentClassName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTableNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_TABLE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFwName() {
		return fwName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFwName(String newFwName) {
		String oldFwName = fwName;
		fwName = newFwName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_TABLE_NAME__FW_NAME, oldFwName, fwName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentClass getPersistentClassName() {
		if (persistentClassName != null && persistentClassName.eIsProxy()) {
			InternalEObject oldPersistentClassName = (InternalEObject)persistentClassName;
			persistentClassName = (PersistentClass)eResolveProxy(oldPersistentClassName);
			if (persistentClassName != oldPersistentClassName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME, oldPersistentClassName, persistentClassName));
			}
		}
		return persistentClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentClass basicGetPersistentClassName() {
		return persistentClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistentClassName(PersistentClass newPersistentClassName, NotificationChain msgs) {
		PersistentClass oldPersistentClassName = persistentClassName;
		persistentClassName = newPersistentClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME, oldPersistentClassName, newPersistentClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentClassName(PersistentClass newPersistentClassName) {
		if (newPersistentClassName != persistentClassName) {
			NotificationChain msgs = null;
			if (persistentClassName != null)
				msgs = ((InternalEObject)persistentClassName).eInverseRemove(this, FramewebPackage.PERSISTENT_CLASS__TABLE, PersistentClass.class, msgs);
			if (newPersistentClassName != null)
				msgs = ((InternalEObject)newPersistentClassName).eInverseAdd(this, FramewebPackage.PERSISTENT_CLASS__TABLE, PersistentClass.class, msgs);
			msgs = basicSetPersistentClassName(newPersistentClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME, newPersistentClassName, newPersistentClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME:
				if (persistentClassName != null)
					msgs = ((InternalEObject)persistentClassName).eInverseRemove(this, FramewebPackage.PERSISTENT_CLASS__TABLE, PersistentClass.class, msgs);
				return basicSetPersistentClassName((PersistentClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME:
				return basicSetPersistentClassName(null, msgs);
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
			case FramewebPackage.DOMAIN_TABLE_NAME__FW_NAME:
				return getFwName();
			case FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME:
				if (resolve) return getPersistentClassName();
				return basicGetPersistentClassName();
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
			case FramewebPackage.DOMAIN_TABLE_NAME__FW_NAME:
				setFwName((String)newValue);
				return;
			case FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME:
				setPersistentClassName((PersistentClass)newValue);
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
			case FramewebPackage.DOMAIN_TABLE_NAME__FW_NAME:
				setFwName(FW_NAME_EDEFAULT);
				return;
			case FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME:
				setPersistentClassName((PersistentClass)null);
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
			case FramewebPackage.DOMAIN_TABLE_NAME__FW_NAME:
				return FW_NAME_EDEFAULT == null ? fwName != null : !FW_NAME_EDEFAULT.equals(fwName);
			case FramewebPackage.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME:
				return persistentClassName != null;
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
		result.append(" (fwName: ");
		result.append(fwName);
		result.append(')');
		return result.toString();
	}

} //DomainTableNameImpl
