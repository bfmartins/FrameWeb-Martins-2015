/**
 */
package frameweb.impl;

import frameweb.FrameWebModel;
import frameweb.FramewebPackage;
import frameweb.NamingMethod;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Web Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrameWebModelImpl#getIndite <em>Indite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FrameWebModelImpl extends PackageImpl implements FrameWebModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameWebModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRAME_WEB_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 28;

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
	public NamingMethod getIndite() {
		return (NamingMethod)eGet(FramewebPackage.Literals.FRAME_WEB_MODEL__INDITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndite(NamingMethod newIndite) {
		eSet(FramewebPackage.Literals.FRAME_WEB_MODEL__INDITE, newIndite);
	}

} //FrameWebModelImpl
