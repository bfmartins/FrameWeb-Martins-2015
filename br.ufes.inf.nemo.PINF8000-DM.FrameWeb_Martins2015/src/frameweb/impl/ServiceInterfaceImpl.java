/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.ServiceAttribute;
import frameweb.ServiceInterface;
import frameweb.ServiceOperation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.InterfaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceInterfaceImpl#getServiceInterfaceOperation <em>Service Interface Operation</em>}</li>
 *   <li>{@link frameweb.impl.ServiceInterfaceImpl#getServiceInterfaceAttribute <em>Service Interface Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceInterfaceImpl extends InterfaceImpl implements ServiceInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 44;

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
	public EList<ServiceOperation> getServiceInterfaceOperation() {
		return (EList<ServiceOperation>)eGet(FramewebPackage.Literals.SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceAttribute> getServiceInterfaceAttribute() {
		return (EList<ServiceAttribute>)eGet(FramewebPackage.Literals.SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE, true);
	}

} //ServiceInterfaceImpl
