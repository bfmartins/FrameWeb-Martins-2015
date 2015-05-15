/**
 */
package frameweb.impl;

import frameweb.DAOAttribute;
import frameweb.DAOBaseOperation;
import frameweb.DAOClass;
import frameweb.DAOClassName;
import frameweb.DAOOperation;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOClassImpl#getBaseImplements <em>Base Implements</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOImplements <em>DAO Implements</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOClassName <em>DAO Class Name</em>}</li>
 *   <li>{@link frameweb.impl.DAOClassImpl#getDAOClassAttribute <em>DAO Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOClassImpl extends ClassImpl implements DAOClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_CLASS;
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
	public EList<DAOBaseOperation> getBaseImplements() {
		return (EList<DAOBaseOperation>)eGet(FramewebPackage.Literals.DAO_CLASS__BASE_IMPLEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DAOOperation> getDAOImplements() {
		return (EList<DAOOperation>)eGet(FramewebPackage.Literals.DAO_CLASS__DAO_IMPLEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClassName getDAOClassName() {
		return (DAOClassName)eGet(FramewebPackage.Literals.DAO_CLASS__DAO_CLASS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAOClassName(DAOClassName newDAOClassName) {
		eSet(FramewebPackage.Literals.DAO_CLASS__DAO_CLASS_NAME, newDAOClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DAOAttribute> getDAOClassAttribute() {
		return (EList<DAOAttribute>)eGet(FramewebPackage.Literals.DAO_CLASS__DAO_CLASS_ATTRIBUTE, true);
	}

} //DAOClassImpl
