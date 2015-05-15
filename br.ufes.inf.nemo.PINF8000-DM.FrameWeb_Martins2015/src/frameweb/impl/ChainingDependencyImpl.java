/**
 */
package frameweb.impl;

import frameweb.ChainingDependency;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chaining Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getOutMethod <em>Out Method</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getInMethod <em>In Method</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getTargetFrontController <em>Target Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getSourceFrontController <em>Source Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainingDependencyImpl extends NavigationDependencyImpl implements ChainingDependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainingDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CHAINING_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getOutMethod() {
		return (FrontControllerMethod)eGet(FramewebPackage.Literals.CHAINING_DEPENDENCY__OUT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutMethod(FrontControllerMethod newOutMethod) {
		eSet(FramewebPackage.Literals.CHAINING_DEPENDENCY__OUT_METHOD, newOutMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getInMethod() {
		return (FrontControllerMethod)eGet(FramewebPackage.Literals.CHAINING_DEPENDENCY__IN_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMethod(FrontControllerMethod newInMethod) {
		eSet(FramewebPackage.Literals.CHAINING_DEPENDENCY__IN_METHOD, newInMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getTargetFrontController() {
		return (FrontControllerClass)eGet(FramewebPackage.Literals.CHAINING_DEPENDENCY__TARGET_FRONT_CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrontController(FrontControllerClass newTargetFrontController) {
		eSet(FramewebPackage.Literals.CHAINING_DEPENDENCY__TARGET_FRONT_CONTROLLER, newTargetFrontController);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getSourceFrontController() {
		return (FrontControllerClass)eGet(FramewebPackage.Literals.CHAINING_DEPENDENCY__SOURCE_FRONT_CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFrontController(FrontControllerClass newSourceFrontController) {
		eSet(FramewebPackage.Literals.CHAINING_DEPENDENCY__SOURCE_FRONT_CONTROLLER, newSourceFrontController);
	}

} //ChainingDependencyImpl
