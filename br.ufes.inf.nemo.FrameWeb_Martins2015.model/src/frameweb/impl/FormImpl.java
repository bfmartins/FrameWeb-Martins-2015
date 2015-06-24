/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FormImpl#getFormClassAttribute <em>Form Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends NavigationClassImpl implements Tag {
	/**
	 * The cached value of the '{@link #getFormClassAttribute() <em>Form Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> formClassAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getFormClassAttribute() {
		if (formClassAttribute == null) {
			formClassAttribute = new EObjectContainmentEList<Tag>(Tag.class, this, FramewebPackage.FORM__FORM_CLASS_ATTRIBUTE);
		}
		return formClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.FORM__FORM_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getFormClassAttribute()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.FORM__FORM_CLASS_ATTRIBUTE:
				return getFormClassAttribute();
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
			case FramewebPackage.FORM__FORM_CLASS_ATTRIBUTE:
				getFormClassAttribute().clear();
				getFormClassAttribute().addAll((Collection<? extends Tag>)newValue);
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
			case FramewebPackage.FORM__FORM_CLASS_ATTRIBUTE:
				getFormClassAttribute().clear();
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
			case FramewebPackage.FORM__FORM_CLASS_ATTRIBUTE:
				return formClassAttribute != null && !formClassAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Tag> getSubTag() {
		// TODO Auto-generated method stub
		return null;
	}

} //FormImpl
