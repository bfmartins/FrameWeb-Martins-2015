/**
 */
package frameweb.impl;

import frameweb.Binary;
import frameweb.Component;
import frameweb.Form;
import frameweb.FormComponent;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;
import frameweb.JQuery;
import frameweb.Page;
import frameweb.Result;
import frameweb.ResultDependency;
import frameweb.ResultType;
import frameweb.Template;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
	@SuppressWarnings("unchecked")
	public EList<Result> getReturnResult() {
		return (EList<Result>)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__RETURN_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getReturnMethod() {
		return (FrontControllerMethod)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__RETURN_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnMethod(FrontControllerMethod newReturnMethod) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__RETURN_METHOD, newReturnMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getSourceFrontController() {
		return (FrontControllerClass)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFrontController(FrontControllerClass newSourceFrontController) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__SOURCE_FRONT_CONTROLLER, newSourceFrontController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTargetTemplate() {
		return (Template)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTemplate(Template newTargetTemplate) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_TEMPLATE, newTargetTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getTargetPage() {
		return (Page)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(Page newTargetPage) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_PAGE, newTargetPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary getTargetBinary() {
		return (Binary)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_BINARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBinary(Binary newTargetBinary) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_BINARY, newTargetBinary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResultType> getReturnResultType() {
		return (EList<ResultType>)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__RETURN_RESULT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getTargetForm() {
		return (Form)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetForm(Form newTargetForm) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_FORM, newTargetForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getTargetComponent() {
		return (Component)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComponent(Component newTargetComponent) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_COMPONENT, newTargetComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery getTargetJQuery() {
		return (JQuery)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_JQUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetJQuery(JQuery newTargetJQuery) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_JQUERY, newTargetJQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormComponent getTargetFormComponent() {
		return (FormComponent)eGet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFormComponent(FormComponent newTargetFormComponent) {
		eSet(FramewebPackage.Literals.RESULT_DEPENDENCY__TARGET_FORM_COMPONENT, newTargetFormComponent);
	}

} //ResultDependencyImpl
