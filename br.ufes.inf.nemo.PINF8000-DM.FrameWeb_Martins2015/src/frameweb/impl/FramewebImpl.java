/**
 */
package frameweb.impl;

import frameweb.FrameWebModel;
import frameweb.Frameweb;
import frameweb.FramewebPackage;
import frameweb.Framework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frameweb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FramewebImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link frameweb.impl.FramewebImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FramewebImpl extends CDOObjectImpl implements Frameweb {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramewebImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRAMEWEB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FrameWebModel> getCompose() {
		return (EList<FrameWebModel>)eGet(FramewebPackage.Literals.FRAMEWEB__COMPOSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Framework> getUses() {
		return (EList<Framework>)eGet(FramewebPackage.Literals.FRAMEWEB__USES, true);
	}

} //FramewebImpl
