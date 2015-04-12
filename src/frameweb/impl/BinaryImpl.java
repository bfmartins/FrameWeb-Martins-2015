/**
 */
package frameweb.impl;

import frameweb.Binary;
import frameweb.BinaryAttribute;
import frameweb.FrameWebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.BinaryImpl#getBinaryClassAttribute <em>Binary Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryImpl extends NavigationClassImpl implements Binary {
	/**
	 * The cached value of the '{@link #getBinaryClassAttribute() <em>Binary Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryAttribute> binaryClassAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.BINARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryAttribute> getBinaryClassAttribute() {
		if (binaryClassAttribute == null) {
			binaryClassAttribute = new EObjectContainmentEList<BinaryAttribute>(BinaryAttribute.class, this, FrameWebPackage.BINARY__BINARY_CLASS_ATTRIBUTE);
		}
		return binaryClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.BINARY__BINARY_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getBinaryClassAttribute()).basicRemove(otherEnd, msgs);
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
			case FrameWebPackage.BINARY__BINARY_CLASS_ATTRIBUTE:
				return getBinaryClassAttribute();
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
			case FrameWebPackage.BINARY__BINARY_CLASS_ATTRIBUTE:
				getBinaryClassAttribute().clear();
				getBinaryClassAttribute().addAll((Collection<? extends BinaryAttribute>)newValue);
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
			case FrameWebPackage.BINARY__BINARY_CLASS_ATTRIBUTE:
				getBinaryClassAttribute().clear();
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
			case FrameWebPackage.BINARY__BINARY_CLASS_ATTRIBUTE:
				return binaryClassAttribute != null && !binaryClassAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BinaryImpl
