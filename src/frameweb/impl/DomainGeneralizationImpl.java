/**
 */
package frameweb.impl;

import frameweb.DomainClass;
import frameweb.DomainGeneralization;
import frameweb.InheritanceMapping;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2.impl.GeneralizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainGeneralizationImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link frameweb.impl.DomainGeneralizationImpl#getTargetDomain <em>Target Domain</em>}</li>
 *   <li>{@link frameweb.impl.DomainGeneralizationImpl#getSourceDomain <em>Source Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainGeneralizationImpl extends GeneralizationImpl implements DomainGeneralization {
	/**
	 * The default value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceMapping MAPPING_EDEFAULT = InheritanceMapping.SINGLETABLE;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected InheritanceMapping mapping = MAPPING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetDomain() <em>Target Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainClass targetDomain;

	/**
	 * The cached value of the '{@link #getSourceDomain() <em>Source Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainClass sourceDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.DOMAIN_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceMapping getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(InheritanceMapping newMapping) {
		InheritanceMapping oldMapping = mapping;
		mapping = newMapping == null ? MAPPING_EDEFAULT : newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DOMAIN_GENERALIZATION__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getTargetDomain() {
		if (targetDomain != null && targetDomain.eIsProxy()) {
			InternalEObject oldTargetDomain = (InternalEObject)targetDomain;
			targetDomain = (DomainClass)eResolveProxy(oldTargetDomain);
			if (targetDomain != oldTargetDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DOMAIN_GENERALIZATION__TARGET_DOMAIN, oldTargetDomain, targetDomain));
			}
		}
		return targetDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass basicGetTargetDomain() {
		return targetDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDomain(DomainClass newTargetDomain) {
		DomainClass oldTargetDomain = targetDomain;
		targetDomain = newTargetDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DOMAIN_GENERALIZATION__TARGET_DOMAIN, oldTargetDomain, targetDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getSourceDomain() {
		if (sourceDomain != null && sourceDomain.eIsProxy()) {
			InternalEObject oldSourceDomain = (InternalEObject)sourceDomain;
			sourceDomain = (DomainClass)eResolveProxy(oldSourceDomain);
			if (sourceDomain != oldSourceDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DOMAIN_GENERALIZATION__SOURCE_DOMAIN, oldSourceDomain, sourceDomain));
			}
		}
		return sourceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass basicGetSourceDomain() {
		return sourceDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDomain(DomainClass newSourceDomain) {
		DomainClass oldSourceDomain = sourceDomain;
		sourceDomain = newSourceDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DOMAIN_GENERALIZATION__SOURCE_DOMAIN, oldSourceDomain, sourceDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case framewebPackage.DOMAIN_GENERALIZATION__MAPPING:
				return getMapping();
			case framewebPackage.DOMAIN_GENERALIZATION__TARGET_DOMAIN:
				if (resolve) return getTargetDomain();
				return basicGetTargetDomain();
			case framewebPackage.DOMAIN_GENERALIZATION__SOURCE_DOMAIN:
				if (resolve) return getSourceDomain();
				return basicGetSourceDomain();
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
			case framewebPackage.DOMAIN_GENERALIZATION__MAPPING:
				setMapping((InheritanceMapping)newValue);
				return;
			case framewebPackage.DOMAIN_GENERALIZATION__TARGET_DOMAIN:
				setTargetDomain((DomainClass)newValue);
				return;
			case framewebPackage.DOMAIN_GENERALIZATION__SOURCE_DOMAIN:
				setSourceDomain((DomainClass)newValue);
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
			case framewebPackage.DOMAIN_GENERALIZATION__MAPPING:
				setMapping(MAPPING_EDEFAULT);
				return;
			case framewebPackage.DOMAIN_GENERALIZATION__TARGET_DOMAIN:
				setTargetDomain((DomainClass)null);
				return;
			case framewebPackage.DOMAIN_GENERALIZATION__SOURCE_DOMAIN:
				setSourceDomain((DomainClass)null);
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
			case framewebPackage.DOMAIN_GENERALIZATION__MAPPING:
				return mapping != MAPPING_EDEFAULT;
			case framewebPackage.DOMAIN_GENERALIZATION__TARGET_DOMAIN:
				return targetDomain != null;
			case framewebPackage.DOMAIN_GENERALIZATION__SOURCE_DOMAIN:
				return sourceDomain != null;
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
		result.append(" (mapping: ");
		result.append(mapping);
		result.append(')');
		return result.toString();
	}

} //DomainGeneralizationImpl
