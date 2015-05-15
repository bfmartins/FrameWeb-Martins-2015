/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Template;
import frameweb.UserViewAttribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.TemplateImpl#getTemplateClassAttribute <em>Template Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends NavigationClassImpl implements Template {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserViewAttribute> getTemplateClassAttribute() {
		return (EList<UserViewAttribute>)eGet(FramewebPackage.Literals.TEMPLATE__TEMPLATE_CLASS_ATTRIBUTE, true);
	}

} //TemplateImpl
