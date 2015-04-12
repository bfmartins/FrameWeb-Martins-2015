/**
 */
package frameweb.impl;

import frameweb.FrameworkTag;
import frameweb.TagLib;
import frameweb.framewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.TagLibImpl#getTagLibTag <em>Tag Lib Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagLibImpl extends MinimalEObjectImpl.Container implements TagLib {
	/**
	 * The cached value of the '{@link #getTagLibTag() <em>Tag Lib Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagLibTag()
	 * @generated
	 * @ordered
	 */
	protected EList<FrameworkTag> tagLibTag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.TAG_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrameworkTag> getTagLibTag() {
		if (tagLibTag == null) {
			tagLibTag = new EObjectContainmentEList<FrameworkTag>(FrameworkTag.class, this, framewebPackage.TAG_LIB__TAG_LIB_TAG);
		}
		return tagLibTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.TAG_LIB__TAG_LIB_TAG:
				return ((InternalEList<?>)getTagLibTag()).basicRemove(otherEnd, msgs);
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
			case framewebPackage.TAG_LIB__TAG_LIB_TAG:
				return getTagLibTag();
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
			case framewebPackage.TAG_LIB__TAG_LIB_TAG:
				getTagLibTag().clear();
				getTagLibTag().addAll((Collection<? extends FrameworkTag>)newValue);
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
			case framewebPackage.TAG_LIB__TAG_LIB_TAG:
				getTagLibTag().clear();
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
			case framewebPackage.TAG_LIB__TAG_LIB_TAG:
				return tagLibTag != null && !tagLibTag.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TagLibImpl
