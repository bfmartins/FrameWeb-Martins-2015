/**
 */
package frameweb.impl;

import frameweb.Binary;
import frameweb.Component;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;
import frameweb.JQuery;
import frameweb.Page;
import frameweb.Result;
import frameweb.ResultDependency;
import frameweb.ResultType;
import frameweb.Tag; //*********************************************** linha adicionada
import frameweb.FrameworkTag; //*********************************************** linha adicionada
import frameweb.Template;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getReturnMethod <em>Return Method</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getSourceFrontController <em>Source Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetTemplate <em>Target Template</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetBinary <em>Target Binary</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getReturnResultType <em>Return Result Type</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetForm <em>Target Form</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetJQuery <em>Target JQuery</em>}</li>
 *   <li>{@link frameweb.impl.ResultDependencyImpl#getTargetFormComponent <em>Target Form Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultDependencyImpl extends NavigationDependencyImpl implements ResultDependency {
	/**
	 * The cached value of the '{@link #getReturnResult() <em>Return Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> returnResult;

	/**
	 * The cached value of the '{@link #getReturnMethod() <em>Return Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod returnMethod;

	/**
	 * The cached value of the '{@link #getSourceFrontController() <em>Source Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass sourceFrontController;

	/**
	 * The cached value of the '{@link #getTargetTemplate() <em>Target Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template targetTemplate;

	/**
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected Page targetPage;

	/**
	 * The cached value of the '{@link #getTargetBinary() <em>Target Binary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetBinary()
	 * @generated
	 * @ordered
	 */
	protected Binary targetBinary;

	/**
	 * The cached value of the '{@link #getReturnResultType() <em>Return Result Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnResultType()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultType> returnResultType;

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
	 * The cached value of the '{@link #getTargetFormComponent() <em>Target Form Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFormComponent()
	 * @generated
	 * @ordered
	 */
	protected FrameworkTag targetFormComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.RESULT_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Result> getReturnResult() {
		if (returnResult == null) {
			returnResult = new EObjectResolvingEList<Result>(Result.class, this, FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT);
		}
		return returnResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getReturnMethod() {
		if (returnMethod != null && returnMethod.eIsProxy()) {
			InternalEObject oldReturnMethod = (InternalEObject)returnMethod;
			returnMethod = (FrontControllerMethod)eResolveProxy(oldReturnMethod);
			if (returnMethod != oldReturnMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD, oldReturnMethod, returnMethod));
			}
		}
		return returnMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetReturnMethod() {
		return returnMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnMethod(FrontControllerMethod newReturnMethod) {
		FrontControllerMethod oldReturnMethod = returnMethod;
		returnMethod = newReturnMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD, oldReturnMethod, returnMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getSourceFrontController() {
		if (sourceFrontController != null && sourceFrontController.eIsProxy()) {
			InternalEObject oldSourceFrontController = (InternalEObject)sourceFrontController;
			sourceFrontController = (FrontControllerClass)eResolveProxy(oldSourceFrontController);
			if (sourceFrontController != oldSourceFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER, oldSourceFrontController, sourceFrontController));
			}
		}
		return sourceFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetSourceFrontController() {
		return sourceFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFrontController(FrontControllerClass newSourceFrontController) {
		FrontControllerClass oldSourceFrontController = sourceFrontController;
		sourceFrontController = newSourceFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER, oldSourceFrontController, sourceFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTargetTemplate() {
		if (targetTemplate != null && targetTemplate.eIsProxy()) {
			InternalEObject oldTargetTemplate = (InternalEObject)targetTemplate;
			targetTemplate = (Template)eResolveProxy(oldTargetTemplate);
			if (targetTemplate != oldTargetTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_TEMPLATE, oldTargetTemplate, targetTemplate));
			}
		}
		return targetTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetTargetTemplate() {
		return targetTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTemplate(Template newTargetTemplate) {
		Template oldTargetTemplate = targetTemplate;
		targetTemplate = newTargetTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_TEMPLATE, oldTargetTemplate, targetTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject)targetPage;
			targetPage = (Page)eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_PAGE, oldTargetPage, targetPage));
			}
		}
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(Page newTargetPage) {
		Page oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_PAGE, oldTargetPage, targetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary getTargetBinary() {
		if (targetBinary != null && targetBinary.eIsProxy()) {
			InternalEObject oldTargetBinary = (InternalEObject)targetBinary;
			targetBinary = (Binary)eResolveProxy(oldTargetBinary);
			if (targetBinary != oldTargetBinary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_BINARY, oldTargetBinary, targetBinary));
			}
		}
		return targetBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary basicGetTargetBinary() {
		return targetBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBinary(Binary newTargetBinary) {
		Binary oldTargetBinary = targetBinary;
		targetBinary = newTargetBinary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_BINARY, oldTargetBinary, targetBinary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultType> getReturnResultType() {
		if (returnResultType == null) {
			returnResultType = new EObjectResolvingEList<ResultType>(ResultType.class, this, FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE);
		}
		return returnResultType;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM, oldTargetForm, targetForm));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM, oldTargetForm, targetForm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_COMPONENT, oldTargetComponent, targetComponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_COMPONENT, oldTargetComponent, targetComponent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_JQUERY, oldTargetJQuery, targetJQuery));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_JQUERY, oldTargetJQuery, targetJQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public FrameworkTag getTargetFormComponent() {
		if (targetFormComponent != null && ((EObject)targetFormComponent).eIsProxy()) {
			InternalEObject oldTargetFormComponent = (InternalEObject)targetFormComponent;
			targetFormComponent = (FrameworkTag)eResolveProxy(oldTargetFormComponent);
			if (targetFormComponent != oldTargetFormComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT, oldTargetFormComponent, targetFormComponent));
			}
		}
		return targetFormComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTag basicGetTargetFormComponent() {
		return targetFormComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFormComponent(FrameworkTag newTargetFormComponent) {
		FrameworkTag oldTargetFormComponent = targetFormComponent;
		targetFormComponent = newTargetFormComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT, oldTargetFormComponent, targetFormComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				return getReturnResult();
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				if (resolve) return getReturnMethod();
				return basicGetReturnMethod();
			case FramewebPackage.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER:
				if (resolve) return getSourceFrontController();
				return basicGetSourceFrontController();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_TEMPLATE:
				if (resolve) return getTargetTemplate();
				return basicGetTargetTemplate();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_PAGE:
				if (resolve) return getTargetPage();
				return basicGetTargetPage();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_BINARY:
				if (resolve) return getTargetBinary();
				return basicGetTargetBinary();
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				return getReturnResultType();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM:
				if (resolve) return getTargetForm();
				return basicGetTargetForm();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_COMPONENT:
				if (resolve) return getTargetComponent();
				return basicGetTargetComponent();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_JQUERY:
				if (resolve) return getTargetJQuery();
				return basicGetTargetJQuery();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT:
				if (resolve) return getTargetFormComponent();
				return basicGetTargetFormComponent();
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
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				getReturnResult().clear();
				getReturnResult().addAll((Collection<? extends Result>)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				setReturnMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER:
				setSourceFrontController((FrontControllerClass)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_TEMPLATE:
				setTargetTemplate((Template)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_PAGE:
				setTargetPage((Page)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_BINARY:
				setTargetBinary((Binary)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				getReturnResultType().clear();
				getReturnResultType().addAll((Collection<? extends ResultType>)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM:
				setTargetForm((Tag)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_COMPONENT:
				setTargetComponent((Component)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_JQUERY:
				setTargetJQuery((JQuery)newValue);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT:
				setTargetFormComponent((FrameworkTag)newValue);
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
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				getReturnResult().clear();
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				setReturnMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER:
				setSourceFrontController((FrontControllerClass)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_TEMPLATE:
				setTargetTemplate((Template)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_PAGE:
				setTargetPage((Page)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_BINARY:
				setTargetBinary((Binary)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				getReturnResultType().clear();
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM:
				setTargetForm((Tag)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_COMPONENT:
				setTargetComponent((Component)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_JQUERY:
				setTargetJQuery((JQuery)null);
				return;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT:
				setTargetFormComponent((FrameworkTag)null);
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
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT:
				return returnResult != null && !returnResult.isEmpty();
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_METHOD:
				return returnMethod != null;
			case FramewebPackage.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER:
				return sourceFrontController != null;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_TEMPLATE:
				return targetTemplate != null;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_PAGE:
				return targetPage != null;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_BINARY:
				return targetBinary != null;
			case FramewebPackage.RESULT_DEPENDENCY__RETURN_RESULT_TYPE:
				return returnResultType != null && !returnResultType.isEmpty();
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM:
				return targetForm != null;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_COMPONENT:
				return targetComponent != null;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_JQUERY:
				return targetJQuery != null;
			case FramewebPackage.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT:
				return targetFormComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultDependencyImpl
