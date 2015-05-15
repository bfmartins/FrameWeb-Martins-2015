/**
 */
package frameweb.impl;

import frameweb.ApplicationModel;
import frameweb.ApplicationPackage;
import frameweb.FramewebPackage;
import frameweb.ServiceAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ApplicationModelImpl#getServiceUMLAssociation <em>Service UML Association</em>}</li>
 *   <li>{@link frameweb.impl.ApplicationModelImpl#getApplicationUMLPackage <em>Application UML Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationModelImpl extends FrameWebModelImpl implements ApplicationModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.APPLICATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceAssociation> getServiceUMLAssociation() {
		return (EList<ServiceAssociation>)eGet(FramewebPackage.Literals.APPLICATION_MODEL__SERVICE_UML_ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ApplicationPackage> getApplicationUMLPackage() {
		return (EList<ApplicationPackage>)eGet(FramewebPackage.Literals.APPLICATION_MODEL__APPLICATION_UML_PACKAGE, true);
	}

} //ApplicationModelImpl
