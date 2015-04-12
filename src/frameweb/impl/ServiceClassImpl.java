/**
 */
package frameweb.impl;

import frameweb.ServiceAttribute;
import frameweb.ServiceClass;
import frameweb.ServiceOperation;
import frameweb.framewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceClassImpl#getServiceClassAttribute <em>Service Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.ServiceClassImpl#getServiceClassOperation <em>Service Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceClassImpl extends ClassImpl implements ServiceClass {
	/**
	 * The cached value of the '{@link #getServiceClassAttribute() <em>Service Class Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected ServiceAttribute serviceClassAttribute;

	/**
	 * The cached value of the '{@link #getServiceClassOperation() <em>Service Class Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClassOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOperation> serviceClassOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.SERVICE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute getServiceClassAttribute() {
		return serviceClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceClassAttribute(ServiceAttribute newServiceClassAttribute, NotificationChain msgs) {
		ServiceAttribute oldServiceClassAttribute = serviceClassAttribute;
		serviceClassAttribute = newServiceClassAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE, oldServiceClassAttribute, newServiceClassAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClassAttribute(ServiceAttribute newServiceClassAttribute) {
		if (newServiceClassAttribute != serviceClassAttribute) {
			NotificationChain msgs = null;
			if (serviceClassAttribute != null)
				msgs = ((InternalEObject)serviceClassAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE, null, msgs);
			if (newServiceClassAttribute != null)
				msgs = ((InternalEObject)newServiceClassAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE, null, msgs);
			msgs = basicSetServiceClassAttribute(newServiceClassAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE, newServiceClassAttribute, newServiceClassAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceOperation> getServiceClassOperation() {
		if (serviceClassOperation == null) {
			serviceClassOperation = new EObjectContainmentEList<ServiceOperation>(ServiceOperation.class, this, framewebPackage.SERVICE_CLASS__SERVICE_CLASS_OPERATION);
		}
		return serviceClassOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE:
				return basicSetServiceClassAttribute(null, msgs);
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_OPERATION:
				return ((InternalEList<?>)getServiceClassOperation()).basicRemove(otherEnd, msgs);
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
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE:
				return getServiceClassAttribute();
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_OPERATION:
				return getServiceClassOperation();
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
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE:
				setServiceClassAttribute((ServiceAttribute)newValue);
				return;
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_OPERATION:
				getServiceClassOperation().clear();
				getServiceClassOperation().addAll((Collection<? extends ServiceOperation>)newValue);
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
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE:
				setServiceClassAttribute((ServiceAttribute)null);
				return;
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_OPERATION:
				getServiceClassOperation().clear();
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
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE:
				return serviceClassAttribute != null;
			case framewebPackage.SERVICE_CLASS__SERVICE_CLASS_OPERATION:
				return serviceClassOperation != null && !serviceClassOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceClassImpl
