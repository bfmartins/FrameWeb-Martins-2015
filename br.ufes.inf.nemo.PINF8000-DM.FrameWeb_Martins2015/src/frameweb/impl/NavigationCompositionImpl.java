/**
 */
package frameweb.impl;

import frameweb.Component;
import frameweb.Form;
import frameweb.FramewebPackage;
import frameweb.JQuery;
import frameweb.NavigationComposition;
import frameweb.Page;
import frameweb.Template;

import org.eclipse.emf.ecore.EClass;

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
	protected static final int ESTATIC_FEATURE_COUNT = 44;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getSourceTemplate() {
		return (Template)eGet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTemplate(Template newSourceTemplate) {
		eSet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__SOURCE_TEMPLATE, newSourceTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSourcePage() {
		return (Page)eGet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__SOURCE_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePage(Page newSourcePage) {
		eSet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__SOURCE_PAGE, newSourcePage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getTargetForm() {
		return (Form)eGet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetForm(Form newTargetForm) {
		eSet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_FORM, newTargetForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getTargetComponent() {
		return (Component)eGet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComponent(Component newTargetComponent) {
		eSet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_COMPONENT, newTargetComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery getTargetJQuery() {
		return (JQuery)eGet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_JQUERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetJQuery(JQuery newTargetJQuery) {
		eSet(FramewebPackage.Literals.NAVIGATION_COMPOSITION__TARGET_JQUERY, newTargetJQuery);
	}

} //NavigationCompositionImpl
