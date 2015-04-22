/**
 */
package frameweb.impl;

import frameweb.Anotation;
import frameweb.FramewebPackage;
import frameweb.Framework;
import frameweb.Rule;
import frameweb.TagLib;
import frameweb.Talvez_Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrameworkImpl#getFrameworkTagLib <em>Framework Tag Lib</em>}</li>
 *   <li>{@link frameweb.impl.FrameworkImpl#getFrameworkRule <em>Framework Rule</em>}</li>
 *   <li>{@link frameweb.impl.FrameworkImpl#getNewEReference <em>New EReference</em>}</li>
 *   <li>{@link frameweb.impl.FrameworkImpl#getFrameworkAnotation <em>Framework Anotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameworkImpl extends MinimalEObjectImpl.Container implements Framework {
	/**
	 * The cached value of the '{@link #getFrameworkTagLib() <em>Framework Tag Lib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkTagLib()
	 * @generated
	 * @ordered
	 */
	protected TagLib frameworkTagLib;

	/**
	 * The cached value of the '{@link #getFrameworkRule() <em>Framework Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> frameworkRule;

	/**
	 * The cached value of the '{@link #getNewEReference() <em>New EReference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Talvez_Method> newEReference;

	/**
	 * The cached value of the '{@link #getFrameworkAnotation() <em>Framework Anotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameworkAnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Anotation> frameworkAnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagLib getFrameworkTagLib() {
		return frameworkTagLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrameworkTagLib(TagLib newFrameworkTagLib, NotificationChain msgs) {
		TagLib oldFrameworkTagLib = frameworkTagLib;
		frameworkTagLib = newFrameworkTagLib;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB, oldFrameworkTagLib, newFrameworkTagLib);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameworkTagLib(TagLib newFrameworkTagLib) {
		if (newFrameworkTagLib != frameworkTagLib) {
			NotificationChain msgs = null;
			if (frameworkTagLib != null)
				msgs = ((InternalEObject)frameworkTagLib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB, null, msgs);
			if (newFrameworkTagLib != null)
				msgs = ((InternalEObject)newFrameworkTagLib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB, null, msgs);
			msgs = basicSetFrameworkTagLib(newFrameworkTagLib, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB, newFrameworkTagLib, newFrameworkTagLib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getFrameworkRule() {
		if (frameworkRule == null) {
			frameworkRule = new EObjectContainmentEList<Rule>(Rule.class, this, FramewebPackage.FRAMEWORK__FRAMEWORK_RULE);
		}
		return frameworkRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Talvez_Method> getNewEReference() {
		if (newEReference == null) {
			newEReference = new EObjectContainmentEList<Talvez_Method>(Talvez_Method.class, this, FramewebPackage.FRAMEWORK__NEW_EREFERENCE);
		}
		return newEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Anotation> getFrameworkAnotation() {
		if (frameworkAnotation == null) {
			frameworkAnotation = new EObjectContainmentEList<Anotation>(Anotation.class, this, FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION);
		}
		return frameworkAnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB:
				return basicSetFrameworkTagLib(null, msgs);
			case FramewebPackage.FRAMEWORK__FRAMEWORK_RULE:
				return ((InternalEList<?>)getFrameworkRule()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FRAMEWORK__NEW_EREFERENCE:
				return ((InternalEList<?>)getNewEReference()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION:
				return ((InternalEList<?>)getFrameworkAnotation()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB:
				return getFrameworkTagLib();
			case FramewebPackage.FRAMEWORK__FRAMEWORK_RULE:
				return getFrameworkRule();
			case FramewebPackage.FRAMEWORK__NEW_EREFERENCE:
				return getNewEReference();
			case FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION:
				return getFrameworkAnotation();
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
			case FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB:
				setFrameworkTagLib((TagLib)newValue);
				return;
			case FramewebPackage.FRAMEWORK__FRAMEWORK_RULE:
				getFrameworkRule().clear();
				getFrameworkRule().addAll((Collection<? extends Rule>)newValue);
				return;
			case FramewebPackage.FRAMEWORK__NEW_EREFERENCE:
				getNewEReference().clear();
				getNewEReference().addAll((Collection<? extends Talvez_Method>)newValue);
				return;
			case FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION:
				getFrameworkAnotation().clear();
				getFrameworkAnotation().addAll((Collection<? extends Anotation>)newValue);
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
			case FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB:
				setFrameworkTagLib((TagLib)null);
				return;
			case FramewebPackage.FRAMEWORK__FRAMEWORK_RULE:
				getFrameworkRule().clear();
				return;
			case FramewebPackage.FRAMEWORK__NEW_EREFERENCE:
				getNewEReference().clear();
				return;
			case FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION:
				getFrameworkAnotation().clear();
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
			case FramewebPackage.FRAMEWORK__FRAMEWORK_TAG_LIB:
				return frameworkTagLib != null;
			case FramewebPackage.FRAMEWORK__FRAMEWORK_RULE:
				return frameworkRule != null && !frameworkRule.isEmpty();
			case FramewebPackage.FRAMEWORK__NEW_EREFERENCE:
				return newEReference != null && !newEReference.isEmpty();
			case FramewebPackage.FRAMEWORK__FRAMEWORK_ANOTATION:
				return frameworkAnotation != null && !frameworkAnotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrameworkImpl
