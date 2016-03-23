/**
 */
package br.ufes.inf.nemo.frameweb.frameweb.impl;

import br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.frameweb.TagLib;
import br.ufes.inf.nemo.frameweb.frameweb.Template;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.impl.TemplateImpl#getTemplateTagLib <em>Template Tag Lib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends NavigationClassImpl implements Template {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				return getTemplateTagLib();
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
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				getTemplateTagLib().clear();
				getTemplateTagLib().addAll((Collection<? extends TagLib>)newValue);
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
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				getTemplateTagLib().clear();
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
			case FramewebPackage.TEMPLATE__TEMPLATE_TAG_LIB:
				return templateTagLib != null && !templateTagLib.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateImpl
