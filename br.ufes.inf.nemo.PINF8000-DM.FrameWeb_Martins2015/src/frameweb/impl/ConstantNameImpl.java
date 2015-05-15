/**
 */
package frameweb.impl;

import frameweb.ConstantName;
import frameweb.ConstantNameList;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ConstantNameImpl#getFwName <em>Fw Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantNameImpl extends FrameWebNameImpl implements ConstantName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CONSTANT_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantNameList getFwName() {
		return (ConstantNameList)eGet(FramewebPackage.Literals.CONSTANT_NAME__FW_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFwName(ConstantNameList newFwName) {
		eSet(FramewebPackage.Literals.CONSTANT_NAME__FW_NAME, newFwName);
	}

} //ConstantNameImpl
