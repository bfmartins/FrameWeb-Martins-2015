/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainClass;
import frameweb.DomainOperation;
import frameweb.FramewebPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainClassImpl#getDomainClassAttribute <em>Domain Class Attribute</em>}</li>
 *   <li>{@link frameweb.impl.DomainClassImpl#getDomainClassOperation <em>Domain Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainClassImpl extends ClassImpl implements DomainClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_CLASS;
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
	@SuppressWarnings("unchecked")
	public EList<DomainAttribute> getDomainClassAttribute() {
		return (EList<DomainAttribute>)eGet(FramewebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DomainOperation> getDomainClassOperation() {
		return (EList<DomainOperation>)eGet(FramewebPackage.Literals.DOMAIN_CLASS__DOMAIN_CLASS_OPERATION, true);
	}

} //DomainClassImpl
