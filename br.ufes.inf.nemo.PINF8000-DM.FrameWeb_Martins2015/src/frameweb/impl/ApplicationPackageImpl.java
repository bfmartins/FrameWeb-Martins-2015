/**
 */
package frameweb.impl;

import frameweb.ApplicationPackage;
import frameweb.FramewebPackage;
import frameweb.ServiceClass;
import frameweb.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ApplicationPackageImpl#getServicePackageClass <em>Service Package Class</em>}</li>
 *   <li>{@link frameweb.impl.ApplicationPackageImpl#getServicePackageInterface <em>Service Package Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationPackageImpl extends MinimalEObjectImpl.Container implements ApplicationPackage {
	/**
	 * The cached value of the '{@link #getServicePackageClass() <em>Service Package Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackageClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceClass> servicePackageClass;

	/**
	 * The cached value of the '{@link #getServicePackageInterface() <em>Service Package Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePackageInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> servicePackageInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.APPLICATION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceClass> getServicePackageClass() {
		if (servicePackageClass == null) {
			servicePackageClass = new EObjectContainmentEList<ServiceClass>(ServiceClass.class, this, FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS);
		}
		return servicePackageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterface> getServicePackageInterface() {
		if (servicePackageInterface == null) {
			servicePackageInterface = new EObjectContainmentEList<ServiceInterface>(ServiceInterface.class, this, FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE);
		}
		return servicePackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS:
				return ((InternalEList<?>)getServicePackageClass()).basicRemove(otherEnd, msgs);
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE:
				return ((InternalEList<?>)getServicePackageInterface()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS:
				return getServicePackageClass();
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE:
				return getServicePackageInterface();
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
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS:
				getServicePackageClass().clear();
				getServicePackageClass().addAll((Collection<? extends ServiceClass>)newValue);
				return;
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE:
				getServicePackageInterface().clear();
				getServicePackageInterface().addAll((Collection<? extends ServiceInterface>)newValue);
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
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS:
				getServicePackageClass().clear();
				return;
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE:
				getServicePackageInterface().clear();
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
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS:
				return servicePackageClass != null && !servicePackageClass.isEmpty();
			case FramewebPackage.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE:
				return servicePackageInterface != null && !servicePackageInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationPackageImpl
