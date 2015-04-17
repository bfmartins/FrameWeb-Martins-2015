/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Template;
import frameweb.UserViewAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.TemplateImpl#getTemplateClassAttribute <em>Template Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends NavigationClassImpl implements Template {
	/**
	 * The cached value of the '{@link #getTemplateClassAttribute() <em>Template Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<UserViewAttribute> templateClassAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserViewAttribute> getTemplateClassAttribute() {
		if (templateClassAttribute == null) {
			templateClassAttribute = new EObjectContainmentEList<UserViewAttribute>(UserViewAttribute.class, this, FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE);
		}
		return templateClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getTemplateClassAttribute()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE:
				return getTemplateClassAttribute();
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
			case FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE:
				getTemplateClassAttribute().clear();
				getTemplateClassAttribute().addAll((Collection<? extends UserViewAttribute>)newValue);
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
			case FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE:
				getTemplateClassAttribute().clear();
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
			case FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE:
				return templateClassAttribute != null && !templateClassAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateImpl
