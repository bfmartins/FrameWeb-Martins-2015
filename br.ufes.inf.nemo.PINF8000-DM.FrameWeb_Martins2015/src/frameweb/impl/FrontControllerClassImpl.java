/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;
import frameweb.IOParameter;

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
 * An implementation of the model object '<em><b>Front Controller Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrontControllerClassImpl#getFrontControllerAttribute <em>Front Controller Attribute</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerClassImpl#getFrontControllerClassMethod <em>Front Controller Class Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontControllerClassImpl extends ClassImpl implements FrontControllerClass {
	/**
	 * The cached value of the '{@link #getFrontControllerAttribute() <em>Front Controller Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontControllerAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<IOParameter> frontControllerAttribute;

	/**
	 * The cached value of the '{@link #getFrontControllerClassMethod() <em>Front Controller Class Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontControllerClassMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<FrontControllerMethod> frontControllerClassMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOParameter> getFrontControllerAttribute() {
		if (frontControllerAttribute == null) {
			frontControllerAttribute = new EObjectContainmentEList<IOParameter>(IOParameter.class, this, FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE);
		}
		return frontControllerAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrontControllerMethod> getFrontControllerClassMethod() {
		if (frontControllerClassMethod == null) {
			frontControllerClassMethod = new EObjectContainmentEList<FrontControllerMethod>(FrontControllerMethod.class, this, FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD);
		}
		return frontControllerClassMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE:
				return ((InternalEList<?>)getFrontControllerAttribute()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD:
				return ((InternalEList<?>)getFrontControllerClassMethod()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE:
				return getFrontControllerAttribute();
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD:
				return getFrontControllerClassMethod();
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
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE:
				getFrontControllerAttribute().clear();
				getFrontControllerAttribute().addAll((Collection<? extends IOParameter>)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD:
				getFrontControllerClassMethod().clear();
				getFrontControllerClassMethod().addAll((Collection<? extends FrontControllerMethod>)newValue);
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
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE:
				getFrontControllerAttribute().clear();
				return;
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD:
				getFrontControllerClassMethod().clear();
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
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE:
				return frontControllerAttribute != null && !frontControllerAttribute.isEmpty();
			case FramewebPackage.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD:
				return frontControllerClassMethod != null && !frontControllerClassMethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrontControllerClassImpl
