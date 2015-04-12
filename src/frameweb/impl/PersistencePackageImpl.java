/**
 */
package frameweb.impl;

import frameweb.DAOClass;
import frameweb.DAOInterface;
import frameweb.FrameWebPackage;
import frameweb.PersistencePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PersistencePackageImpl#getPersistencePackageInterface <em>Persistence Package Interface</em>}</li>
 *   <li>{@link frameweb.impl.PersistencePackageImpl#getPersistencePackageClass <em>Persistence Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistencePackageImpl extends PackageImpl implements PersistencePackage {
	/**
	 * The cached value of the '{@link #getPersistencePackageInterface() <em>Persistence Package Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistencePackageInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOInterface> persistencePackageInterface;

	/**
	 * The cached value of the '{@link #getPersistencePackageClass() <em>Persistence Package Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistencePackageClass()
	 * @generated
	 * @ordered
	 */
	protected EList<DAOClass> persistencePackageClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistencePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.PERSISTENCE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAOInterface> getPersistencePackageInterface() {
		if (persistencePackageInterface == null) {
			persistencePackageInterface = new EObjectContainmentEList<DAOInterface>(DAOInterface.class, this, FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE);
		}
		return persistencePackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DAOClass> getPersistencePackageClass() {
		if (persistencePackageClass == null) {
			persistencePackageClass = new EObjectContainmentEList<DAOClass>(DAOClass.class, this, FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS);
		}
		return persistencePackageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE:
				return ((InternalEList<?>)getPersistencePackageInterface()).basicRemove(otherEnd, msgs);
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS:
				return ((InternalEList<?>)getPersistencePackageClass()).basicRemove(otherEnd, msgs);
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
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE:
				return getPersistencePackageInterface();
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS:
				return getPersistencePackageClass();
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
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE:
				getPersistencePackageInterface().clear();
				getPersistencePackageInterface().addAll((Collection<? extends DAOInterface>)newValue);
				return;
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS:
				getPersistencePackageClass().clear();
				getPersistencePackageClass().addAll((Collection<? extends DAOClass>)newValue);
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
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE:
				getPersistencePackageInterface().clear();
				return;
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS:
				getPersistencePackageClass().clear();
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
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE:
				return persistencePackageInterface != null && !persistencePackageInterface.isEmpty();
			case FrameWebPackage.PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS:
				return persistencePackageClass != null && !persistencePackageClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersistencePackageImpl
