/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainColumnName;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.PropertyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainAttributeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link frameweb.impl.DomainAttributeImpl#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link frameweb.impl.DomainAttributeImpl#isIsPersistent <em>Is Persistent</em>}</li>
 *   <li>{@link frameweb.impl.DomainAttributeImpl#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomainAttributeImpl extends PropertyImpl implements DomainAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 45;

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
	public long getSize() {
		return (Long)eGet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		eSet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNull() {
		return (Boolean)eGet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__IS_NULL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNull(boolean newIsNull) {
		eSet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__IS_NULL, newIsNull);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersistent() {
		return (Boolean)eGet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__IS_PERSISTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersistent(boolean newIsPersistent) {
		eSet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__IS_PERSISTENT, newIsPersistent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainColumnName getColumn() {
		return (DomainColumnName)eGet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(DomainColumnName newColumn) {
		eSet(FramewebPackage.Literals.DOMAIN_ATTRIBUTE__COLUMN, newColumn);
	}

} //DomainAttributeImpl
