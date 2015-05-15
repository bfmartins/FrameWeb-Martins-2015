/**
 */
package frameweb.impl;

import frameweb.DAOClassName;
import frameweb.FrameWorkName;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Class Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOClassNameImpl#getFrameWorkNameSufix <em>Frame Work Name Sufix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOClassNameImpl extends DAOInterfaceNameImpl implements DAOClassName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOClassNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_CLASS_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameWorkName getFrameWorkNameSufix() {
		return (FrameWorkName)eGet(FramewebPackage.Literals.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameWorkNameSufix(FrameWorkName newFrameWorkNameSufix) {
		eSet(FramewebPackage.Literals.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX, newFrameWorkNameSufix);
	}

} //DAOClassNameImpl
