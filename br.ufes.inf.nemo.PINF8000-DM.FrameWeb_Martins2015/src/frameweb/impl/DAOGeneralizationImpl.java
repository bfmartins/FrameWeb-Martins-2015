/**
 */
package frameweb.impl;

import frameweb.DAOClass;
import frameweb.DAOGeneralization;
import frameweb.DAOInterface;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.GeneralizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOGeneralizationImpl#getTargetDAOClass <em>Target DAO Class</em>}</li>
 *   <li>{@link frameweb.impl.DAOGeneralizationImpl#getSourceDAOInterface <em>Source DAO Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOGeneralizationImpl extends GeneralizationImpl implements DAOGeneralization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 11;

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
	public DAOClass getTargetDAOClass() {
		return (DAOClass)eGet(FramewebPackage.Literals.DAO_GENERALIZATION__TARGET_DAO_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDAOClass(DAOClass newTargetDAOClass) {
		eSet(FramewebPackage.Literals.DAO_GENERALIZATION__TARGET_DAO_CLASS, newTargetDAOClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface getSourceDAOInterface() {
		return (DAOInterface)eGet(FramewebPackage.Literals.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDAOInterface(DAOInterface newSourceDAOInterface) {
		eSet(FramewebPackage.Literals.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE, newSourceDAOInterface);
	}

} //DAOGeneralizationImpl
