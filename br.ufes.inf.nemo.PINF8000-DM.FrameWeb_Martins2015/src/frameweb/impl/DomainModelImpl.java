/**
 */
package frameweb.impl;

import frameweb.DomainAssociation;
import frameweb.DomainModel;
import frameweb.DomainPackage;
import frameweb.FramewebPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainModelImpl#getDomainUMLPackage <em>Domain UML Package</em>}</li>
 *   <li>{@link frameweb.impl.DomainModelImpl#getDomainUMLAssociation <em>Domain UML Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends FrameWebModelImpl implements DomainModel {
	/**
	 * The cached value of the '{@link #getDomainUMLPackage() <em>Domain UML Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainUMLPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainPackage> domainUMLPackage;

	/**
	 * The cached value of the '{@link #getDomainUMLAssociation() <em>Domain UML Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainUMLAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainAssociation> domainUMLAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainPackage> getDomainUMLPackage() {
		if (domainUMLPackage == null) {
			domainUMLPackage = new EObjectContainmentEList<DomainPackage>(DomainPackage.class, this, FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_PACKAGE);
		}
		return domainUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainAssociation> getDomainUMLAssociation() {
		if (domainUMLAssociation == null) {
			domainUMLAssociation = new EObjectContainmentEList<DomainAssociation>(DomainAssociation.class, this, FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION);
		}
		return domainUMLAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_PACKAGE:
				return ((InternalEList<?>)getDomainUMLPackage()).basicRemove(otherEnd, msgs);
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION:
				return ((InternalEList<?>)getDomainUMLAssociation()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_PACKAGE:
				return getDomainUMLPackage();
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION:
				return getDomainUMLAssociation();
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
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_PACKAGE:
				getDomainUMLPackage().clear();
				getDomainUMLPackage().addAll((Collection<? extends DomainPackage>)newValue);
				return;
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION:
				getDomainUMLAssociation().clear();
				getDomainUMLAssociation().addAll((Collection<? extends DomainAssociation>)newValue);
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
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_PACKAGE:
				getDomainUMLPackage().clear();
				return;
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION:
				getDomainUMLAssociation().clear();
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
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_PACKAGE:
				return domainUMLPackage != null && !domainUMLPackage.isEmpty();
			case FramewebPackage.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION:
				return domainUMLAssociation != null && !domainUMLAssociation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainModelImpl
