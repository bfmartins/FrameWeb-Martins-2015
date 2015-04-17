/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.ServiceAssociation;

import org.eclipse.emf.ecore.EClass;

import uml2.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ServiceAssociationImpl extends AssociationImpl implements ServiceAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_ASSOCIATION;
	}

} //ServiceAssociationImpl
