/**
 */
package frameweb.impl;

import frameweb.Component;
import frameweb.Form;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerDependency;
import frameweb.FrontControllerMethod;
import frameweb.JQuery;
import frameweb.Page;
import frameweb.Template;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getSourceForm <em>Source Form</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getTargetFrontController <em>Target Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getSourcePage <em>Source Page</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getSourceJQuery <em>Source JQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontControllerDependencyImpl extends NavigationDependencyImpl implements FrontControllerDependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getMethod() {
		return (FrontControllerMethod)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(FrontControllerMethod newMethod) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getSourceForm() {
		return (Form)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceForm(Form newSourceForm) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_FORM, newSourceForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getTargetFrontController() {
		return (FrontControllerClass)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__TARGET_FRONT_CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrontController(FrontControllerClass newTargetFrontController) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__TARGET_FRONT_CONTROLLER, newTargetFrontController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSourcePage() {
		return (Page)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePage(Page newSourcePage) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_PAGE, newSourcePage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getSourceTemplate() {
		return (Template)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTemplate(Template newSourceTemplate) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_TEMPLATE, newSourceTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSourceComponent() {
		return (Component)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceComponent(Component newSourceComponent) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_COMPONENT, newSourceComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery getSourceJQuery() {
		return (JQuery)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_JQUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceJQuery(JQuery newSourceJQuery) {
		eSet(FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY__SOURCE_JQUERY, newSourceJQuery);
	}

} //FrontControllerDependencyImpl
