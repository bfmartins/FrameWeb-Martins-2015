/**
 */
package frameweb.impl;

import frameweb.FormComponent;
import frameweb.FrameworkTag;
import frameweb.IOParameter;
import frameweb.Tag;
import frameweb.framewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FormComponentImpl#getSubTag <em>Sub Tag</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getInject <em>Inject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormComponentImpl extends NavigationAttributeImpl implements FormComponent {
	/**
	 * The cached value of the '{@link #getSubTag() <em>Sub Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> subTag;

	/**
	 * The cached value of the '{@link #getInject() <em>Inject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInject()
	 * @generated
	 * @ordered
	 */
	protected IOParameter inject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.FORM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getSubTag() {
		if (subTag == null) {
			subTag = new EObjectContainmentEList<Tag>(Tag.class, this, framewebPackage.FORM_COMPONENT__SUB_TAG);
		}
		return subTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter getInject() {
		if (inject != null && inject.eIsProxy()) {
			InternalEObject oldInject = (InternalEObject)inject;
			inject = (IOParameter)eResolveProxy(oldInject);
			if (inject != oldInject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.FORM_COMPONENT__INJECT, oldInject, inject));
			}
		}
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter basicGetInject() {
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInject(IOParameter newInject, NotificationChain msgs) {
		IOParameter oldInject = inject;
		inject = newInject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, framewebPackage.FORM_COMPONENT__INJECT, oldInject, newInject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInject(IOParameter newInject) {
		if (newInject != inject) {
			NotificationChain msgs = null;
			if (inject != null)
				msgs = ((InternalEObject)inject).eInverseRemove(this, framewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
			if (newInject != null)
				msgs = ((InternalEObject)newInject).eInverseAdd(this, framewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
			msgs = basicSetInject(newInject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.FORM_COMPONENT__INJECT, newInject, newInject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.FORM_COMPONENT__INJECT:
				if (inject != null)
					msgs = ((InternalEObject)inject).eInverseRemove(this, framewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
				return basicSetInject((IOParameter)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case framewebPackage.FORM_COMPONENT__SUB_TAG:
				return ((InternalEList<?>)getSubTag()).basicRemove(otherEnd, msgs);
			case framewebPackage.FORM_COMPONENT__INJECT:
				return basicSetInject(null, msgs);
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
			case framewebPackage.FORM_COMPONENT__SUB_TAG:
				return getSubTag();
			case framewebPackage.FORM_COMPONENT__INJECT:
				if (resolve) return getInject();
				return basicGetInject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case framewebPackage.FORM_COMPONENT__SUB_TAG:
				getSubTag().clear();
				getSubTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case framewebPackage.FORM_COMPONENT__INJECT:
				setInject((IOParameter)newValue);
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
			case framewebPackage.FORM_COMPONENT__SUB_TAG:
				getSubTag().clear();
				return;
			case framewebPackage.FORM_COMPONENT__INJECT:
				setInject((IOParameter)null);
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
			case framewebPackage.FORM_COMPONENT__SUB_TAG:
				return subTag != null && !subTag.isEmpty();
			case framewebPackage.FORM_COMPONENT__INJECT:
				return inject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tag.class) {
			switch (derivedFeatureID) {
				case framewebPackage.FORM_COMPONENT__SUB_TAG: return framewebPackage.TAG__SUB_TAG;
				default: return -1;
			}
		}
		if (baseClass == FrameworkTag.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tag.class) {
			switch (baseFeatureID) {
				case framewebPackage.TAG__SUB_TAG: return framewebPackage.FORM_COMPONENT__SUB_TAG;
				default: return -1;
			}
		}
		if (baseClass == FrameworkTag.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FormComponentImpl
