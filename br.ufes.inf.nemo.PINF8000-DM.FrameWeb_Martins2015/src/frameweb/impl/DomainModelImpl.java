/**
 */
package frameweb.impl;

import frameweb.DomainAssociation;
import frameweb.DomainModel;
import frameweb.DomainPackage;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
	@SuppressWarnings("unchecked")
	public EList<DomainPackage> getDomainUMLPackage() {
		return (EList<DomainPackage>)eGet(FramewebPackage.Literals.DOMAIN_MODEL__DOMAIN_UML_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DomainAssociation> getDomainUMLAssociation() {
		return (EList<DomainAssociation>)eGet(FramewebPackage.Literals.DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION, true);
	}

} //DomainModelImpl
