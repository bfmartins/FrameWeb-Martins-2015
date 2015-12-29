/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.NavigationClass;
import frameweb.NavigationCompositionWhole;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.NavigationClassImpl#getNavigationClassComposition <em>Navigation Class Composition</em>}</li>
 *   <li>{@link frameweb.impl.NavigationClassImpl#getNavigationClassAttribute <em>Navigation Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NavigationClassImpl extends ClassImpl implements NavigationClass {
	/**
	 * The cached value of the '{@link #getNavigationClassComposition() <em>Navigation Class Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationClassComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationCompositionWhole> navigationClassComposition;

	/**
	 * The cached value of the '{@link #getNavigationClassAttribute() <em>Navigation Class Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> navigationClassAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.NAVIGATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationCompositionWhole> getNavigationClassComposition() {
		if (navigationClassComposition == null) {
			navigationClassComposition = new EObjectContainmentEList<NavigationCompositionWhole>(NavigationCompositionWhole.class, this, FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION);
		}
		return navigationClassComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getNavigationClassAttribute() {
		if (navigationClassAttribute == null) {
			navigationClassAttribute = new EObjectContainmentEList<Tag>(Tag.class, this, FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE);
		}
		return navigationClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION:
				return ((InternalEList<?>)getNavigationClassComposition()).basicRemove(otherEnd, msgs);
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE:
				return ((InternalEList<?>)getNavigationClassAttribute()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION:
				return getNavigationClassComposition();
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE:
				return getNavigationClassAttribute();
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
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION:
				getNavigationClassComposition().clear();
				getNavigationClassComposition().addAll((Collection<? extends NavigationCompositionWhole>)newValue);
				return;
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE:
				getNavigationClassAttribute().clear();
				getNavigationClassAttribute().addAll((Collection<? extends Tag>)newValue);
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
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION:
				getNavigationClassComposition().clear();
				return;
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE:
				getNavigationClassAttribute().clear();
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
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION:
				return navigationClassComposition != null && !navigationClassComposition.isEmpty();
			case FramewebPackage.NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE:
				return navigationClassAttribute != null && !navigationClassAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationClassImpl
