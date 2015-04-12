/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainClass;
import frameweb.DomainOperation;
import frameweb.FrameWebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainClassImpl#getDomainClassAttribute <em>Domain Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.DomainClassImpl#getDomainClassOperation <em>Domain Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainClassImpl extends ClassImpl implements DomainClass {
	/**
	 * The cached value of the '{@link #getDomainClassAttribute() <em>Domain Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAttribute> domainClassAttribute;

	/**
	 * The cached value of the '{@link #getDomainClassOperation() <em>Domain Class Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClassOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOperation> domainClassOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.DOMAIN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainAttribute> getDomainClassAttribute() {
		if (domainClassAttribute == null) {
			domainClassAttribute = new EObjectContainmentEList<DomainAttribute>(DomainAttribute.class, this, FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE);
		}
		return domainClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOperation> getDomainClassOperation() {
		if (domainClassOperation == null) {
			domainClassOperation = new EObjectContainmentEList<DomainOperation>(DomainOperation.class, this, FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION);
		}
		return domainClassOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getDomainClassAttribute()).basicRemove(otherEnd, msgs);
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				return ((InternalEList<?>)getDomainClassOperation()).basicRemove(otherEnd, msgs);
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
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				return getDomainClassAttribute();
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				return getDomainClassOperation();
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
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				getDomainClassAttribute().clear();
				getDomainClassAttribute().addAll((Collection<? extends DomainAttribute>)newValue);
				return;
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				getDomainClassOperation().clear();
				getDomainClassOperation().addAll((Collection<? extends DomainOperation>)newValue);
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
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				getDomainClassAttribute().clear();
				return;
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				getDomainClassOperation().clear();
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
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE:
				return domainClassAttribute != null && !domainClassAttribute.isEmpty();
			case FrameWebPackage.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION:
				return domainClassOperation != null && !domainClassOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainClassImpl
