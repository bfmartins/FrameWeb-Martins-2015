/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.NavigationComposition;
import frameweb.Page;
import frameweb.Tag;
import frameweb.TagLib;

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
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PageImpl#getPageClassAttribute <em>Page Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.PageImpl#getPageTagLib <em>Page Tag Lib</em>}</li>
 *   <li>{@link frameweb.impl.PageImpl#getPageComposition <em>Page Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends NavigationClassImpl implements Page {
	/**
	 * The cached value of the '{@link #getPageClassAttribute() <em>Page Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> pageClassAttribute;

	/**
	 * The cached value of the '{@link #getPageTagLib() <em>Page Tag Lib</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTagLib()
	 * @generated
	 * @ordered
	 */
	protected EList<TagLib> pageTagLib;

	/**
	 * The cached value of the '{@link #getPageComposition() <em>Page Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationComposition> pageComposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getPageClassAttribute() {
		if (pageClassAttribute == null) {
			pageClassAttribute = new EObjectContainmentEList<Tag>(Tag.class, this, FramewebPackage.PAGE__PAGE_CLASS_ATTRIBUTE);
		}
		return pageClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TagLib> getPageTagLib() {
		if (pageTagLib == null) {
			pageTagLib = new EObjectResolvingEList<TagLib>(TagLib.class, this, FramewebPackage.PAGE__PAGE_TAG_LIB);
		}
		return pageTagLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationComposition> getPageComposition() {
		if (pageComposition == null) {
			pageComposition = new EObjectContainmentEList<NavigationComposition>(NavigationComposition.class, this, FramewebPackage.PAGE__PAGE_COMPOSITION);
		}
		return pageComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.PAGE__PAGE_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getPageClassAttribute()).basicRemove(otherEnd, msgs);
			case FramewebPackage.PAGE__PAGE_COMPOSITION:
				return ((InternalEList<?>)getPageComposition()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.PAGE__PAGE_CLASS_ATTRIBUTE:
				return getPageClassAttribute();
			case FramewebPackage.PAGE__PAGE_TAG_LIB:
				return getPageTagLib();
			case FramewebPackage.PAGE__PAGE_COMPOSITION:
				return getPageComposition();
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
			case FramewebPackage.PAGE__PAGE_CLASS_ATTRIBUTE:
				getPageClassAttribute().clear();
				getPageClassAttribute().addAll((Collection<? extends Tag>)newValue);
				return;
			case FramewebPackage.PAGE__PAGE_TAG_LIB:
				getPageTagLib().clear();
				getPageTagLib().addAll((Collection<? extends TagLib>)newValue);
				return;
			case FramewebPackage.PAGE__PAGE_COMPOSITION:
				getPageComposition().clear();
				getPageComposition().addAll((Collection<? extends NavigationComposition>)newValue);
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
			case FramewebPackage.PAGE__PAGE_CLASS_ATTRIBUTE:
				getPageClassAttribute().clear();
				return;
			case FramewebPackage.PAGE__PAGE_TAG_LIB:
				getPageTagLib().clear();
				return;
			case FramewebPackage.PAGE__PAGE_COMPOSITION:
				getPageComposition().clear();
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
			case FramewebPackage.PAGE__PAGE_CLASS_ATTRIBUTE:
				return pageClassAttribute != null && !pageClassAttribute.isEmpty();
			case FramewebPackage.PAGE__PAGE_TAG_LIB:
				return pageTagLib != null && !pageTagLib.isEmpty();
			case FramewebPackage.PAGE__PAGE_COMPOSITION:
				return pageComposition != null && !pageComposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PageImpl
