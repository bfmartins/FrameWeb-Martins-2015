/**
 */
package frameweb.impl;

import frameweb.ApplicationPackage;
import frameweb.FramewebPackage;
import frameweb.ServiceClass;
import frameweb.ServiceInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ApplicationPackageImpl#getServicePackageClass <em>Service Package Class</em>}</li>
 *   <li>{@link frameweb.impl.ApplicationPackageImpl#getServicePackageInterface <em>Service Package Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationPackageImpl extends PackageImpl implements ApplicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.APPLICATION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 28;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceClass> getServicePackageClass() {
		return (EList<ServiceClass>)eGet(FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceInterface> getServicePackageInterface() {
		return (EList<ServiceInterface>)eGet(FramewebPackage.Literals.APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE, true);
	}

} //ApplicationPackageImpl
