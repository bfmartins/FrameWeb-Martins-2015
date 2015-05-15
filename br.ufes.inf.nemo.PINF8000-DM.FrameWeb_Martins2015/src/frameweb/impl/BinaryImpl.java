/**
 */
package frameweb.impl;

import frameweb.Binary;
import frameweb.BinaryAttribute;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.BinaryImpl#getBinaryClassAttribute <em>Binary Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryImpl extends NavigationClassImpl implements Binary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.BINARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BinaryAttribute> getBinaryClassAttribute() {
		return (EList<BinaryAttribute>)eGet(FramewebPackage.Literals.BINARY__BINARY_CLASS_ATTRIBUTE, true);
	}

} //BinaryImpl
