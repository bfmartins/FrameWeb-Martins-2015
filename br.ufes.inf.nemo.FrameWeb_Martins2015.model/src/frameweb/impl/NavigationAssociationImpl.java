/**
 */
package frameweb.impl;

import frameweb.Component;
import frameweb.FramewebPackage;
import frameweb.JQuery;
import frameweb.NavigationAssociation;
import frameweb.NavigationCompositionEnd;
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
 *   <li>{@link frameweb.impl.NavigationAssociationImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link frameweb.impl.NavigationAssociationImpl#getTargetJQuery <em>Target JQuery</em>}</li>
 *   <li>{@link frameweb.impl.NavigationAssociationImpl#getNavigationAssociationProperty <em>Navigation Association Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationAssociationImpl extends AssociationImpl implements NavigationAssociation {
	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected Component targetComponent;

	/**
	 * The cached value of the '{@link #getTargetJQuery() <em>Target JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetJQuery()
	 * @generated
	 * @ordered
	 */
	protected JQuery targetJQuery;

	/**
	 * The cached value of the '{@link #getNavigationAssociationProperty() <em>Navigation Association Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationAssociationProperty()
	 * @generated
	 * @ordered
	 */
	protected NavigationCompositionEnd navigationAssociationProperty;

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
	public Component getTargetComponent() {
		if (targetComponent != null && targetComponent.eIsProxy()) {
			InternalEObject oldTargetComponent = (InternalEObject)targetComponent;
			targetComponent = (Component)eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_COMPONENT, oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTargetComponent() {
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComponent(Component newTargetComponent) {
		Component oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_COMPONENT, oldTargetComponent, targetComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery getTargetJQuery() {
		if (targetJQuery != null && targetJQuery.eIsProxy()) {
			InternalEObject oldTargetJQuery = (InternalEObject)targetJQuery;
			targetJQuery = (JQuery)eResolveProxy(oldTargetJQuery);
			if (targetJQuery != oldTargetJQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_JQUERY, oldTargetJQuery, targetJQuery));
			}
		}
		return targetJQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery basicGetTargetJQuery() {
		return targetJQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetJQuery(JQuery newTargetJQuery) {
		JQuery oldTargetJQuery = targetJQuery;
		targetJQuery = newTargetJQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_JQUERY, oldTargetJQuery, targetJQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationCompositionEnd getNavigationAssociationProperty() {
		return navigationAssociationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationAssociationProperty(NavigationCompositionEnd newNavigationAssociationProperty, NotificationChain msgs) {
		NavigationCompositionEnd oldNavigationAssociationProperty = navigationAssociationProperty;
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
	public void setNavigationAssociationProperty(NavigationCompositionEnd newNavigationAssociationProperty) {
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
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_COMPONENT:
				if (resolve) return getTargetComponent();
				return basicGetTargetComponent();
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_JQUERY:
				if (resolve) return getTargetJQuery();
				return basicGetTargetJQuery();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_COMPONENT:
				setTargetComponent((Component)newValue);
				return;
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_JQUERY:
				setTargetJQuery((JQuery)newValue);
				return;
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				setNavigationAssociationProperty((NavigationCompositionEnd)newValue);
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
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_COMPONENT:
				setTargetComponent((Component)null);
				return;
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_JQUERY:
				setTargetJQuery((JQuery)null);
				return;
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				setNavigationAssociationProperty((NavigationCompositionEnd)null);
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
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_COMPONENT:
				return targetComponent != null;
			case FramewebPackage.NAVIGATION_ASSOCIATION__TARGET_JQUERY:
				return targetJQuery != null;
			case FramewebPackage.NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY:
				return navigationAssociationProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //NavigationAssociationImpl
