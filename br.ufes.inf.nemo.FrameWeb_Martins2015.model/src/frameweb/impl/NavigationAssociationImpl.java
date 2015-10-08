/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.NavigationAssociation;
import frameweb.NavigationCompositionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.NavigationAssociationImpl#getNavigationAssociationProperty <em>Navigation Association Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationAssociationImpl extends AssociationImpl implements NavigationAssociation {
	/**
	 * The cached value of the '{@link #getNavigationAssociationProperty() <em>Navigation Association Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationAssociationProperty()
	 * @generated
	 * @ordered
	 */
	protected NavigationCompositionPart navigationAssociationProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.NAVIGATION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationCompositionPart getNavigationAssociationProperty() {
		return navigationAssociationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationAssociationProperty(NavigationCompositionPart newNavigationAssociationProperty, NotificationChain msgs) {
		NavigationCompositionPart oldNavigationAssociationProperty = navigationAssociationProperty;
		navigationAssociationProperty = newNavigationAssociationProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY, oldNavigationAssociationProperty, newNavigationAssociationProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationAssociationProperty(NavigationCompositionPart newNavigationAssociationProperty) {
		if (newNavigationAssociationProperty != navigationAssociationProperty) {
			NotificationChain msgs = null;
			if (navigationAssociationProperty != null)
				msgs = ((InternalEObject)navigationAssociationProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY, null, msgs);
			if (newNavigationAssociationProperty != null)
				msgs = ((InternalEObject)newNavigationAssociationProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY, null, msgs);
			msgs = basicSetNavigationAssociationProperty(newNavigationAssociationProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY, newNavigationAssociationProperty, newNavigationAssociationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				return basicSetNavigationAssociationProperty(null, msgs);
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
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				return getNavigationAssociationProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				setNavigationAssociationProperty((NavigationCompositionPart)newValue);
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
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				setNavigationAssociationProperty((NavigationCompositionPart)null);
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
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				return navigationAssociationProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //NavigationAssociationImpl
