/**
 */
package frameweb.impl;

import frameweb.Component;
import frameweb.Form;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerDependence;
import frameweb.FrontControllerMethod;
import frameweb.JQuery;
import frameweb.Page;
import frameweb.Template;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getSourceForm <em>Source Form</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getTargetFrontController <em>Target Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getSourcePage <em>Source Page</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependenceImpl#getSourceJQuery <em>Source JQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontControllerDependenceImpl extends NavigationDependencyImpl implements FrontControllerDependence {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod method;

	/**
	 * The cached value of the '{@link #getSourceForm() <em>Source Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceForm()
	 * @generated
	 * @ordered
	 */
	protected Form sourceForm;

	/**
	 * The cached value of the '{@link #getTargetFrontController() <em>Target Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass targetFrontController;

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
	 * The cached value of the '{@link #getSourceTemplate() <em>Source Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template sourceTemplate;

	/**
	 * The cached value of the '{@link #getSourceComponent() <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceComponent()
	 * @generated
	 * @ordered
	 */
	protected Component sourceComponent;

	/**
	 * The cached value of the '{@link #getSourceJQuery() <em>Source JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceJQuery()
	 * @generated
	 * @ordered
	 */
	protected JQuery sourceJQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerDependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (FrontControllerMethod)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(FrontControllerMethod newMethod) {
		FrontControllerMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getSourceForm() {
		if (sourceForm != null && sourceForm.eIsProxy()) {
			InternalEObject oldSourceForm = (InternalEObject)sourceForm;
			sourceForm = (Form)eResolveProxy(oldSourceForm);
			if (sourceForm != oldSourceForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM, oldSourceForm, sourceForm));
			}
		}
		return sourceForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetSourceForm() {
		return sourceForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceForm(Form newSourceForm) {
		Form oldSourceForm = sourceForm;
		sourceForm = newSourceForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM, oldSourceForm, sourceForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getTargetFrontController() {
		if (targetFrontController != null && targetFrontController.eIsProxy()) {
			InternalEObject oldTargetFrontController = (InternalEObject)targetFrontController;
			targetFrontController = (FrontControllerClass)eResolveProxy(oldTargetFrontController);
			if (targetFrontController != oldTargetFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER, oldTargetFrontController, targetFrontController));
			}
		}
		return targetFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetTargetFrontController() {
		return targetFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrontController(FrontControllerClass newTargetFrontController) {
		FrontControllerClass oldTargetFrontController = targetFrontController;
		targetFrontController = newTargetFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER, oldTargetFrontController, targetFrontController));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE, oldSourcePage, sourcePage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE, oldSourcePage, sourcePage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSourceComponent() {
		if (sourceComponent != null && sourceComponent.eIsProxy()) {
			InternalEObject oldSourceComponent = (InternalEObject)sourceComponent;
			sourceComponent = (Component)eResolveProxy(oldSourceComponent);
			if (sourceComponent != oldSourceComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT, oldSourceComponent, sourceComponent));
			}
		}
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSourceComponent() {
		return sourceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceComponent(Component newSourceComponent) {
		Component oldSourceComponent = sourceComponent;
		sourceComponent = newSourceComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT, oldSourceComponent, sourceComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery getSourceJQuery() {
		if (sourceJQuery != null && sourceJQuery.eIsProxy()) {
			InternalEObject oldSourceJQuery = (InternalEObject)sourceJQuery;
			sourceJQuery = (JQuery)eResolveProxy(oldSourceJQuery);
			if (sourceJQuery != oldSourceJQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY, oldSourceJQuery, sourceJQuery));
			}
		}
		return sourceJQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery basicGetSourceJQuery() {
		return sourceJQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceJQuery(JQuery newSourceJQuery) {
		JQuery oldSourceJQuery = sourceJQuery;
		sourceJQuery = newSourceJQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY, oldSourceJQuery, sourceJQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM:
				if (resolve) return getSourceForm();
				return basicGetSourceForm();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				if (resolve) return getTargetFrontController();
				return basicGetTargetFrontController();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE:
				if (resolve) return getSourcePage();
				return basicGetSourcePage();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE:
				if (resolve) return getSourceTemplate();
				return basicGetSourceTemplate();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT:
				if (resolve) return getSourceComponent();
				return basicGetSourceComponent();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY:
				if (resolve) return getSourceJQuery();
				return basicGetSourceJQuery();
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
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__METHOD:
				setMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM:
				setSourceForm((Form)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				setTargetFrontController((FrontControllerClass)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE:
				setSourcePage((Page)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE:
				setSourceTemplate((Template)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT:
				setSourceComponent((Component)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY:
				setSourceJQuery((JQuery)newValue);
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
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__METHOD:
				setMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM:
				setSourceForm((Form)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				setTargetFrontController((FrontControllerClass)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE:
				setSourcePage((Page)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE:
				setSourceTemplate((Template)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT:
				setSourceComponent((Component)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY:
				setSourceJQuery((JQuery)null);
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
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__METHOD:
				return method != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_FORM:
				return sourceForm != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				return targetFrontController != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_PAGE:
				return sourcePage != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_TEMPLATE:
				return sourceTemplate != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_COMPONENT:
				return sourceComponent != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCE__SOURCE_JQUERY:
				return sourceJQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //FrontControllerDependenceImpl
