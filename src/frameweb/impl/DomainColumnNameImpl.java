/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainColumnName;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Column Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainColumnNameImpl#getFwName <em>Fw Name</em>}</li>
 *   <li>{@link frameweb.impl.DomainColumnNameImpl#getDomainAttributeName <em>Domain Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainColumnNameImpl extends FrameWebNameImpl implements DomainColumnName {
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
	 * The cached value of the '{@link #getDomainAttributeName() <em>Domain Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAttributeName()
	 * @generated
	 * @ordered
	 */
	protected DomainAttribute domainAttributeName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainColumnNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.DOMAIN_COLUMN_NAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DOMAIN_COLUMN_NAME__FW_NAME, oldFwName, fwName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAttribute getDomainAttributeName() {
		if (domainAttributeName != null && domainAttributeName.eIsProxy()) {
			InternalEObject oldDomainAttributeName = (InternalEObject)domainAttributeName;
			domainAttributeName = (DomainAttribute)eResolveProxy(oldDomainAttributeName);
			if (domainAttributeName != oldDomainAttributeName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, oldDomainAttributeName, domainAttributeName));
			}
		}
		return domainAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAttribute basicGetDomainAttributeName() {
		return domainAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainAttributeName(DomainAttribute newDomainAttributeName, NotificationChain msgs) {
		DomainAttribute oldDomainAttributeName = domainAttributeName;
		domainAttributeName = newDomainAttributeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, oldDomainAttributeName, newDomainAttributeName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainAttributeName(DomainAttribute newDomainAttributeName) {
		if (newDomainAttributeName != domainAttributeName) {
			NotificationChain msgs = null;
			if (domainAttributeName != null)
				msgs = ((InternalEObject)domainAttributeName).eInverseRemove(this, framewebPackage.DOMAIN_ATTRIBUTE__COLUMN, DomainAttribute.class, msgs);
			if (newDomainAttributeName != null)
				msgs = ((InternalEObject)newDomainAttributeName).eInverseAdd(this, framewebPackage.DOMAIN_ATTRIBUTE__COLUMN, DomainAttribute.class, msgs);
			msgs = basicSetDomainAttributeName(newDomainAttributeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, newDomainAttributeName, newDomainAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME:
				if (domainAttributeName != null)
					msgs = ((InternalEObject)domainAttributeName).eInverseRemove(this, framewebPackage.DOMAIN_ATTRIBUTE__COLUMN, DomainAttribute.class, msgs);
				return basicSetDomainAttributeName((DomainAttribute)otherEnd, msgs);
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
			case framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME:
				return basicSetDomainAttributeName(null, msgs);
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
			case framewebPackage.DOMAIN_COLUMN_NAME__FW_NAME:
				return getFwName();
			case framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME:
				if (resolve) return getDomainAttributeName();
				return basicGetDomainAttributeName();
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
			case framewebPackage.DOMAIN_COLUMN_NAME__FW_NAME:
				setFwName((String)newValue);
				return;
			case framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME:
				setDomainAttributeName((DomainAttribute)newValue);
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
			case framewebPackage.DOMAIN_COLUMN_NAME__FW_NAME:
				setFwName(FW_NAME_EDEFAULT);
				return;
			case framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME:
				setDomainAttributeName((DomainAttribute)null);
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
			case framewebPackage.DOMAIN_COLUMN_NAME__FW_NAME:
				return FW_NAME_EDEFAULT == null ? fwName != null : !FW_NAME_EDEFAULT.equals(fwName);
			case framewebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME:
				return domainAttributeName != null;
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

} //DomainColumnNameImpl
