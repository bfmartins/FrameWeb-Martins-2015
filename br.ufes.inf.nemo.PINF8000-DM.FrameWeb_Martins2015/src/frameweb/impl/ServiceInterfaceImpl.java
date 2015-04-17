/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.ServiceAttribute;
import frameweb.ServiceInterface;
import frameweb.ServiceOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.impl.InterfaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceInterfaceImpl#getServiceInterfaceOperation <em>Service Interface Operation</em>}</li>
 *   <li>{@link frameweb.impl.ServiceInterfaceImpl#getServiceInterfaceAttribute <em>Service Interface Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInterfaceImpl extends InterfaceImpl implements ServiceInterface {
	/**
	 * The cached value of the '{@link #getServiceInterfaceOperation() <em>Service Interface Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOperation> serviceInterfaceOperation;

	/**
	 * The cached value of the '{@link #getServiceInterfaceAttribute() <em>Service Interface Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceInterfaceAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAttribute> serviceInterfaceAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceOperation> getServiceInterfaceOperation() {
		if (serviceInterfaceOperation == null) {
			serviceInterfaceOperation = new EObjectContainmentEList<ServiceOperation>(ServiceOperation.class, this, FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION);
		}
		return serviceInterfaceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAttribute> getServiceInterfaceAttribute() {
		if (serviceInterfaceAttribute == null) {
			serviceInterfaceAttribute = new EObjectContainmentEList<ServiceAttribute>(ServiceAttribute.class, this, FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE);
		}
		return serviceInterfaceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION:
				return ((InternalEList<?>)getServiceInterfaceOperation()).basicRemove(otherEnd, msgs);
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE:
				return ((InternalEList<?>)getServiceInterfaceAttribute()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION:
				return getServiceInterfaceOperation();
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE:
				return getServiceInterfaceAttribute();
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
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION:
				getServiceInterfaceOperation().clear();
				getServiceInterfaceOperation().addAll((Collection<? extends ServiceOperation>)newValue);
				return;
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE:
				getServiceInterfaceAttribute().clear();
				getServiceInterfaceAttribute().addAll((Collection<? extends ServiceAttribute>)newValue);
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
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION:
				getServiceInterfaceOperation().clear();
				return;
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE:
				getServiceInterfaceAttribute().clear();
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
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION:
				return serviceInterfaceOperation != null && !serviceInterfaceOperation.isEmpty();
			case FramewebPackage.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE:
				return serviceInterfaceAttribute != null && !serviceInterfaceAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceInterfaceImpl
