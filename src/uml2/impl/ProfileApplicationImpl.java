/**
 */
package uml2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml2.Profile;
import uml2.ProfileApplication;
import uml2.Uml2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ProfileApplicationImpl#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link uml2.impl.ProfileApplicationImpl#getIsStrict <em>Is Strict</em>}</li>
 *   <li>{@link uml2.impl.ProfileApplicationImpl#getApplyingPackage <em>Applying Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileApplicationImpl extends DirectedRelationshipImpl implements ProfileApplication {
	/**
	 * The cached value of the '{@link #getAppliedProfile() <em>Applied Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile appliedProfile;

	/**
	 * The default value of the '{@link #getIsStrict() <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStrict()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STRICT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsStrict() <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStrict()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStrict = IS_STRICT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.PROFILE_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile() {
		if (appliedProfile != null && appliedProfile.eIsProxy()) {
			InternalEObject oldAppliedProfile = (InternalEObject)appliedProfile;
			appliedProfile = (Profile)eResolveProxy(oldAppliedProfile);
			if (appliedProfile != oldAppliedProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.PROFILE_APPLICATION__APPLIED_PROFILE, oldAppliedProfile, appliedProfile));
			}
		}
		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetAppliedProfile() {
		return appliedProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedProfile(Profile newAppliedProfile) {
		Profile oldAppliedProfile = appliedProfile;
		appliedProfile = newAppliedProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PROFILE_APPLICATION__APPLIED_PROFILE, oldAppliedProfile, appliedProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsStrict() {
		return isStrict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrict(Boolean newIsStrict) {
		Boolean oldIsStrict = isStrict;
		isStrict = newIsStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PROFILE_APPLICATION__IS_STRICT, oldIsStrict, isStrict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Package getApplyingPackage() {
		if (eContainerFeatureID() != Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE) return null;
		return (uml2.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplyingPackage(uml2.Package newApplyingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplyingPackage, Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyingPackage(uml2.Package newApplyingPackage) {
		if (newApplyingPackage != eInternalContainer() || (eContainerFeatureID() != Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE && newApplyingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newApplyingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplyingPackage != null)
				msgs = ((InternalEObject)newApplyingPackage).eInverseAdd(this, Uml2Package.PACKAGE__PROFILE_APPLICATION, uml2.Package.class, msgs);
			msgs = basicSetApplyingPackage(newApplyingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE, newApplyingPackage, newApplyingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplyingPackage((uml2.Package)otherEnd, msgs);
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
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				return basicSetApplyingPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, Uml2Package.PACKAGE__PROFILE_APPLICATION, uml2.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.PROFILE_APPLICATION__APPLIED_PROFILE:
				if (resolve) return getAppliedProfile();
				return basicGetAppliedProfile();
			case Uml2Package.PROFILE_APPLICATION__IS_STRICT:
				return getIsStrict();
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				return getApplyingPackage();
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
			case Uml2Package.PROFILE_APPLICATION__APPLIED_PROFILE:
				setAppliedProfile((Profile)newValue);
				return;
			case Uml2Package.PROFILE_APPLICATION__IS_STRICT:
				setIsStrict((Boolean)newValue);
				return;
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				setApplyingPackage((uml2.Package)newValue);
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
			case Uml2Package.PROFILE_APPLICATION__APPLIED_PROFILE:
				setAppliedProfile((Profile)null);
				return;
			case Uml2Package.PROFILE_APPLICATION__IS_STRICT:
				setIsStrict(IS_STRICT_EDEFAULT);
				return;
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				setApplyingPackage((uml2.Package)null);
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
			case Uml2Package.PROFILE_APPLICATION__APPLIED_PROFILE:
				return appliedProfile != null;
			case Uml2Package.PROFILE_APPLICATION__IS_STRICT:
				return IS_STRICT_EDEFAULT == null ? isStrict != null : !IS_STRICT_EDEFAULT.equals(isStrict);
			case Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE:
				return getApplyingPackage() != null;
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
		result.append(" (isStrict: ");
		result.append(isStrict);
		result.append(')');
		return result.toString();
	}

} //ProfileApplicationImpl
