/**
 */
package frameweb.impl;

import frameweb.FrameWebPackage;
import frameweb.PersistenceModel;
import frameweb.PersistencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PersistenceModelImpl#getPersistenceUMLPackage <em>Persistence UML Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceModelImpl extends FrameWebModelImpl implements PersistenceModel {
	/**
	 * The cached value of the '{@link #getPersistenceUMLPackage() <em>Persistence UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<PersistencePackage> persistenceUMLPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.PERSISTENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistencePackage> getPersistenceUMLPackage() {
		if (persistenceUMLPackage == null) {
			persistenceUMLPackage = new EObjectContainmentEList<PersistencePackage>(PersistencePackage.class, this, FrameWebPackage.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE);
		}
		return persistenceUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE:
				return ((InternalEList<?>)getPersistenceUMLPackage()).basicRemove(otherEnd, msgs);
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
			case FrameWebPackage.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE:
				return getPersistenceUMLPackage();
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
			case FrameWebPackage.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE:
				getPersistenceUMLPackage().clear();
				getPersistenceUMLPackage().addAll((Collection<? extends PersistencePackage>)newValue);
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
			case FrameWebPackage.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE:
				getPersistenceUMLPackage().clear();
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
			case FrameWebPackage.PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE:
				return persistenceUMLPackage != null && !persistenceUMLPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersistenceModelImpl
