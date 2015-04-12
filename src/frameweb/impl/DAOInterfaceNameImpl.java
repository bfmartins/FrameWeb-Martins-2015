/**
 */
package frameweb.impl;

import frameweb.ConstantName;
import frameweb.DAOInterfaceName;
import frameweb.DomainTableName;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getConstantPrefix() <em>Constant Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantPrefix()
	 * @generated
	 * @ordered
	 */
	protected ConstantName constantPrefix;

	/**
	 * The cached value of the '{@link #getDomainTablePrefix() <em>Domain Table Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainTablePrefix()
	 * @generated
	 * @ordered
	 */
	protected DomainTableName domainTablePrefix;

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
		return framewebPackage.Literals.DAO_INTERFACE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantName getConstantPrefix() {
		if (constantPrefix != null && constantPrefix.eIsProxy()) {
			InternalEObject oldConstantPrefix = (InternalEObject)constantPrefix;
			constantPrefix = (ConstantName)eResolveProxy(oldConstantPrefix);
			if (constantPrefix != oldConstantPrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DAO_INTERFACE_NAME__CONSTANT_PREFIX, oldConstantPrefix, constantPrefix));
			}
		}
		return constantPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantName basicGetConstantPrefix() {
		return constantPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantPrefix(ConstantName newConstantPrefix) {
		ConstantName oldConstantPrefix = constantPrefix;
		constantPrefix = newConstantPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DAO_INTERFACE_NAME__CONSTANT_PREFIX, oldConstantPrefix, constantPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTableName getDomainTablePrefix() {
		if (domainTablePrefix != null && domainTablePrefix.eIsProxy()) {
			InternalEObject oldDomainTablePrefix = (InternalEObject)domainTablePrefix;
			domainTablePrefix = (DomainTableName)eResolveProxy(oldDomainTablePrefix);
			if (domainTablePrefix != oldDomainTablePrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX, oldDomainTablePrefix, domainTablePrefix));
			}
		}
		return domainTablePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTableName basicGetDomainTablePrefix() {
		return domainTablePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainTablePrefix(DomainTableName newDomainTablePrefix) {
		DomainTableName oldDomainTablePrefix = domainTablePrefix;
		domainTablePrefix = newDomainTablePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX, oldDomainTablePrefix, domainTablePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case framewebPackage.DAO_INTERFACE_NAME__CONSTANT_PREFIX:
				if (resolve) return getConstantPrefix();
				return basicGetConstantPrefix();
			case framewebPackage.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX:
				if (resolve) return getDomainTablePrefix();
				return basicGetDomainTablePrefix();
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
			case framewebPackage.DAO_INTERFACE_NAME__CONSTANT_PREFIX:
				setConstantPrefix((ConstantName)newValue);
				return;
			case framewebPackage.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX:
				setDomainTablePrefix((DomainTableName)newValue);
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
			case framewebPackage.DAO_INTERFACE_NAME__CONSTANT_PREFIX:
				setConstantPrefix((ConstantName)null);
				return;
			case framewebPackage.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX:
				setDomainTablePrefix((DomainTableName)null);
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
			case framewebPackage.DAO_INTERFACE_NAME__CONSTANT_PREFIX:
				return constantPrefix != null;
			case framewebPackage.DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX:
				return domainTablePrefix != null;
		}
		return super.eIsSet(featureID);
	}

} //DAOInterfaceNameImpl
