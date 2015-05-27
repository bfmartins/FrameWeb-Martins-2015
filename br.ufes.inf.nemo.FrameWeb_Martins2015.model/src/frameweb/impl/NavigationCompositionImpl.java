/**
 */
package frameweb.impl;

import frameweb.Component;
import frameweb.FramewebPackage;
import frameweb.JQuery;
import frameweb.NavigationComposition;
import frameweb.Page;
import frameweb.Tag; //*********************************************** linha adicionada
import frameweb.Template;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.NavigationCompositionImpl#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.impl.NavigationCompositionImpl#getSourcePage <em>Source Page</em>}</li>
 *   <li>{@link frameweb.impl.NavigationCompositionImpl#getTargetForm <em>Target Form</em>}</li>
 *   <li>{@link frameweb.impl.NavigationCompositionImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link frameweb.impl.NavigationCompositionImpl#getTargetJQuery <em>Target JQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationCompositionImpl extends AssociationImpl implements NavigationComposition {
	/**
	 * The cached value of the '{@link #getSourceTemplate() <em>Source Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template sourceTemplate;

	/**
	 * The cached value of the '{@link #getSourcePage() <em>Source Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePage()
	 * @generated
	 * @ordered
	 */
	protected Page sourcePage;

	/**
	 * The cached value of the '{@link #getTargetForm() <em>Target Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetForm()
	 * @generated
	 * @ordered
	 */
	protected Tag targetForm;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationCompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.NAVIGATION_COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getSourceTemplate() {
		if (sourceTemplate != null && sourceTemplate.eIsProxy()) {
			InternalEObject oldSourceTemplate = (InternalEObject)sourceTemplate;
			sourceTemplate = (Template)eResolveProxy(oldSourceTemplate);
			if (sourceTemplate != oldSourceTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
			}
		}
		return sourceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetSourceTemplate() {
		return sourceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTemplate(Template newSourceTemplate) {
		Template oldSourceTemplate = sourceTemplate;
		sourceTemplate = newSourceTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSourcePage() {
		if (sourcePage != null && sourcePage.eIsProxy()) {
			InternalEObject oldSourcePage = (InternalEObject)sourcePage;
			sourcePage = (Page)eResolveProxy(oldSourcePage);
			if (sourcePage != oldSourcePage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_PAGE, oldSourcePage, sourcePage));
			}
		}
		return sourcePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetSourcePage() {
		return sourcePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePage(Page newSourcePage) {
		Page oldSourcePage = sourcePage;
		sourcePage = newSourcePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_PAGE, oldSourcePage, sourcePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Tag getTargetForm() {
		if (targetForm != null && ((EObject)targetForm).eIsProxy()) {
			InternalEObject oldTargetForm = (InternalEObject)targetForm;
			targetForm = (Tag)eResolveProxy(oldTargetForm);
			if (targetForm != oldTargetForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_COMPOSITION__TARGET_FORM, oldTargetForm, targetForm));
			}
		}
		return targetForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag basicGetTargetForm() {
		return targetForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetForm(Tag newTargetForm) {
		Tag oldTargetForm = targetForm;
		targetForm = newTargetForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_COMPOSITION__TARGET_FORM, oldTargetForm, targetForm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_COMPOSITION__TARGET_COMPONENT, oldTargetComponent, targetComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_COMPOSITION__TARGET_COMPONENT, oldTargetComponent, targetComponent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.NAVIGATION_COMPOSITION__TARGET_JQUERY, oldTargetJQuery, targetJQuery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.NAVIGATION_COMPOSITION__TARGET_JQUERY, oldTargetJQuery, targetJQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE:
				if (resolve) return getSourceTemplate();
				return basicGetSourceTemplate();
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_PAGE:
				if (resolve) return getSourcePage();
				return basicGetSourcePage();
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_FORM:
				if (resolve) return getTargetForm();
				return basicGetTargetForm();
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_COMPONENT:
				if (resolve) return getTargetComponent();
				return basicGetTargetComponent();
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_JQUERY:
				if (resolve) return getTargetJQuery();
				return basicGetTargetJQuery();
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
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE:
				setSourceTemplate((Template)newValue);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_PAGE:
				setSourcePage((Page)newValue);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_FORM:
				setTargetForm((Tag)newValue);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_COMPONENT:
				setTargetComponent((Component)newValue);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_JQUERY:
				setTargetJQuery((JQuery)newValue);
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
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE:
				setSourceTemplate((Template)null);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_PAGE:
				setSourcePage((Page)null);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_FORM:
				setTargetForm((Tag)null);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_COMPONENT:
				setTargetComponent((Component)null);
				return;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_JQUERY:
				setTargetJQuery((JQuery)null);
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
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE:
				return sourceTemplate != null;
			case FramewebPackage.NAVIGATION_COMPOSITION__SOURCE_PAGE:
				return sourcePage != null;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_FORM:
				return targetForm != null;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_COMPONENT:
				return targetComponent != null;
			case FramewebPackage.NAVIGATION_COMPOSITION__TARGET_JQUERY:
				return targetJQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //NavigationCompositionImpl
