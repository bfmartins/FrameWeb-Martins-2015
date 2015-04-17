/**
 */
package frameweb.impl;

import frameweb.FrameWebModel;
import frameweb.FramewebPackage;
import frameweb.NamingMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2.impl.ModelImpl;

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
public abstract class FrameWebModelImpl extends ModelImpl implements FrameWebModel {
	/**
	 * The cached value of the '{@link #getIndite() <em>Indite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndite()
	 * @generated
	 * @ordered
	 */
	protected NamingMethod indite;

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
	public NamingMethod getIndite() {
		return indite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndite(NamingMethod newIndite, NotificationChain msgs) {
		NamingMethod oldIndite = indite;
		indite = newIndite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAME_WEB_MODEL__INDITE, oldIndite, newIndite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndite(NamingMethod newIndite) {
		if (newIndite != indite) {
			NotificationChain msgs = null;
			if (indite != null)
				msgs = ((InternalEObject)indite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.FRAME_WEB_MODEL__INDITE, null, msgs);
			if (newIndite != null)
				msgs = ((InternalEObject)newIndite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.FRAME_WEB_MODEL__INDITE, null, msgs);
			msgs = basicSetIndite(newIndite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAME_WEB_MODEL__INDITE, newIndite, newIndite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.FRAME_WEB_MODEL__INDITE:
				return basicSetIndite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.FRAME_WEB_MODEL__INDITE:
				return getIndite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.FRAME_WEB_MODEL__INDITE:
				setIndite((NamingMethod)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FramewebPackage.FRAME_WEB_MODEL__INDITE:
				setIndite((NamingMethod)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FramewebPackage.FRAME_WEB_MODEL__INDITE:
				return indite != null;
		}
		return super.eIsSet(featureID);
	}

} //FrameWebModelImpl
