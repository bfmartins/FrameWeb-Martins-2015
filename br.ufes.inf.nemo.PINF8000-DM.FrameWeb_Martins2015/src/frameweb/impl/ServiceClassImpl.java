/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.ServiceAttribute;
import frameweb.ServiceClass;
import frameweb.ServiceOperation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceClassImpl#getServiceClassAttribute <em>Service Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.ServiceClassImpl#getServiceClassOperation <em>Service Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceClassImpl extends ClassImpl implements ServiceClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 52;

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
	public ServiceAttribute getServiceClassAttribute() {
		return (ServiceAttribute)eGet(FramewebPackage.Literals.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClassAttribute(ServiceAttribute newServiceClassAttribute) {
		eSet(FramewebPackage.Literals.SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE, newServiceClassAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ServiceOperation> getServiceClassOperation() {
		return (EList<ServiceOperation>)eGet(FramewebPackage.Literals.SERVICE_CLASS__SERVICE_CLASS_OPERATION, true);
	}

} //ServiceClassImpl
