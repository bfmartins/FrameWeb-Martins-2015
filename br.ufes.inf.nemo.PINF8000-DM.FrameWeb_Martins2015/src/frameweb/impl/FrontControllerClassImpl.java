/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;
import frameweb.IOParameter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrontControllerClassImpl#getFrontControllerAttribute <em>Front Controller Attribute</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerClassImpl#getFrontControllerClassMethod <em>Front Controller Class Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontControllerClassImpl extends ClassImpl implements FrontControllerClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 52;

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
	@SuppressWarnings("unchecked")
	public EList<IOParameter> getFrontControllerAttribute() {
		return (EList<IOParameter>)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FrontControllerMethod> getFrontControllerClassMethod() {
		return (EList<FrontControllerMethod>)eGet(FramewebPackage.Literals.FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD, true);
	}

} //FrontControllerClassImpl
