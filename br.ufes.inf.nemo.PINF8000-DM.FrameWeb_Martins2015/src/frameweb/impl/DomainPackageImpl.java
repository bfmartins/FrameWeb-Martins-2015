/**
 */
package frameweb.impl;

import frameweb.DomainClass;
import frameweb.DomainPackage;
import frameweb.FramewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainPackageImpl#getDomainPackageClass <em>Domain Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainPackageImpl extends PackageImpl implements DomainPackage {
	/**
	 * The cached value of the '{@link #getDomainPackageClass() <em>Domain Package Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainPackageClass()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainClass> domainPackageClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainClass> getDomainPackageClass() {
		if (domainPackageClass == null) {
			domainPackageClass = new EObjectContainmentEList<DomainClass>(DomainClass.class, this, FramewebPackage.DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS);
		}
		return domainPackageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS:
				return ((InternalEList<?>)getDomainPackageClass()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS:
				return getDomainPackageClass();
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
			case FramewebPackage.DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS:
				getDomainPackageClass().clear();
				getDomainPackageClass().addAll((Collection<? extends DomainClass>)newValue);
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
			case FramewebPackage.DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS:
				getDomainPackageClass().clear();
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
			case FramewebPackage.DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS:
				return domainPackageClass != null && !domainPackageClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainPackageImpl
