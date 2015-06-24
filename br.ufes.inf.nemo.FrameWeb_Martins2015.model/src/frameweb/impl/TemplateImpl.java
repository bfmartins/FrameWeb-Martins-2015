/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.NavigationComposition;
import frameweb.Tag;
import frameweb.TagLib;
import frameweb.Template;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.TemplateImpl#getTemplateClassAttribute <em>Template Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.TemplateImpl#getTemplateTagLib <em>Template Tag Lib</em>}</li>
 *   <li>{@link frameweb.impl.TemplateImpl#getTemplateComposition <em>Template Composition</em>}</li>
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
	protected EList<Tag> templateClassAttribute;

	/**
	 * The cached value of the '{@link #getTemplateTagLib() <em>Template Tag Lib</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateTagLib()
	 * @generated
	 * @ordered
	 */
	protected EList<TagLib> templateTagLib;

	/**
	 * The cached value of the '{@link #getTemplateComposition() <em>Template Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationComposition> templateComposition;

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
	public EList<Tag> getTemplateClassAttribute() {
		if (templateClassAttribute == null) {
			templateClassAttribute = new EObjectContainmentEList<Tag>(Tag.class, this, FramewebPackage.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE);
		}
		return templateClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TagLib> getTemplateTagLib() {
		if (templateTagLib == null) {
			templateTagLib = new EObjectResolvingEList<TagLib>(TagLib.class, this, FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB);
		}
		return templateTagLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationComposition> getTemplateComposition() {
		if (templateComposition == null) {
			templateComposition = new EObjectContainmentEList<NavigationComposition>(NavigationComposition.class, this, FramewebPackage.TEMPLATE__TEMPLATE_COMPOSITION);
		}
		return templateComposition;
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
			case FramewebPackage.TEMPLATE__TEMPLATE_COMPOSITION:
				return ((InternalEList<?>)getTemplateComposition()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				return getTemplateTagLib();
			case FramewebPackage.TEMPLATE__TEMPLATE_COMPOSITION:
				return getTemplateComposition();
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
				getTemplateClassAttribute().addAll((Collection<? extends Tag>)newValue);
				return;
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				getTemplateTagLib().clear();
				getTemplateTagLib().addAll((Collection<? extends TagLib>)newValue);
				return;
			case FramewebPackage.TEMPLATE__TEMPLATE_COMPOSITION:
				getTemplateComposition().clear();
				getTemplateComposition().addAll((Collection<? extends NavigationComposition>)newValue);
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
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				getTemplateTagLib().clear();
				return;
			case FramewebPackage.TEMPLATE__TEMPLATE_COMPOSITION:
				getTemplateComposition().clear();
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
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				return templateTagLib != null && !templateTagLib.isEmpty();
			case FramewebPackage.TEMPLATE__TEMPLATE_COMPOSITION:
				return templateComposition != null && !templateComposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateImpl
