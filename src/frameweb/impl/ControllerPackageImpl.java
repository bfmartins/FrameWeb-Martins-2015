/**
 */
package frameweb.impl;

import frameweb.ControllerPackage;
import frameweb.FrontControllerClass;
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
 * An implementation of the model object '<em><b>Controller Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ControllerPackageImpl#getControllerPackageClass <em>Controller Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerPackageImpl extends NavigationPackageImpl implements ControllerPackage {
	/**
	 * The cached value of the '{@link #getControllerPackageClass() <em>Controller Package Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerPackageClass()
	 * @generated
	 * @ordered
	 */
	protected EList<FrontControllerClass> controllerPackageClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.CONTROLLER_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrontControllerClass> getControllerPackageClass() {
		if (controllerPackageClass == null) {
			controllerPackageClass = new EObjectContainmentEList<FrontControllerClass>(FrontControllerClass.class, this, framewebPackage.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS);
		}
		return controllerPackageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS:
				return ((InternalEList<?>)getControllerPackageClass()).basicRemove(otherEnd, msgs);
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
			case framewebPackage.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS:
				return getControllerPackageClass();
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
			case framewebPackage.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS:
				getControllerPackageClass().clear();
				getControllerPackageClass().addAll((Collection<? extends FrontControllerClass>)newValue);
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
			case framewebPackage.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS:
				getControllerPackageClass().clear();
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
			case framewebPackage.CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS:
				return controllerPackageClass != null && !controllerPackageClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllerPackageImpl
