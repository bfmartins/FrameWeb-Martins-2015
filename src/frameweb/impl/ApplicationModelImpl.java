/**
 */
package frameweb.impl;

import frameweb.ApplicationModel;
import frameweb.ApplicationPackage;
import frameweb.ServiceAssociation;
import frameweb.framewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ApplicationModelImpl#getServiceUMLAssociation <em>Service UML Association</em>}</li>
 *   <li>{@link frameweb.impl.ApplicationModelImpl#getApplicationUMLPackage <em>Application UML Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationModelImpl extends FrameWebModelImpl implements ApplicationModel {
	/**
	 * The cached value of the '{@link #getServiceUMLAssociation() <em>Service UML Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUMLAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceAssociation> serviceUMLAssociation;

	/**
	 * The cached value of the '{@link #getApplicationUMLPackage() <em>Application UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationPackage> applicationUMLPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.APPLICATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceAssociation> getServiceUMLAssociation() {
		if (serviceUMLAssociation == null) {
			serviceUMLAssociation = new EObjectContainmentEList<ServiceAssociation>(ServiceAssociation.class, this, framewebPackage.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION);
		}
		return serviceUMLAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationPackage> getApplicationUMLPackage() {
		if (applicationUMLPackage == null) {
			applicationUMLPackage = new EObjectContainmentEList<ApplicationPackage>(ApplicationPackage.class, this, framewebPackage.APPLICATION_MODEL__APPLICATION_UML_PACKAGE);
		}
		return applicationUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION:
				return ((InternalEList<?>)getServiceUMLAssociation()).basicRemove(otherEnd, msgs);
			case framewebPackage.APPLICATION_MODEL__APPLICATION_UML_PACKAGE:
				return ((InternalEList<?>)getApplicationUMLPackage()).basicRemove(otherEnd, msgs);
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
			case framewebPackage.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION:
				return getServiceUMLAssociation();
			case framewebPackage.APPLICATION_MODEL__APPLICATION_UML_PACKAGE:
				return getApplicationUMLPackage();
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
			case framewebPackage.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION:
				getServiceUMLAssociation().clear();
				getServiceUMLAssociation().addAll((Collection<? extends ServiceAssociation>)newValue);
				return;
			case framewebPackage.APPLICATION_MODEL__APPLICATION_UML_PACKAGE:
				getApplicationUMLPackage().clear();
				getApplicationUMLPackage().addAll((Collection<? extends ApplicationPackage>)newValue);
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
			case framewebPackage.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION:
				getServiceUMLAssociation().clear();
				return;
			case framewebPackage.APPLICATION_MODEL__APPLICATION_UML_PACKAGE:
				getApplicationUMLPackage().clear();
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
			case framewebPackage.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION:
				return serviceUMLAssociation != null && !serviceUMLAssociation.isEmpty();
			case framewebPackage.APPLICATION_MODEL__APPLICATION_UML_PACKAGE:
				return applicationUMLPackage != null && !applicationUMLPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationModelImpl
