/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainColumnName;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Column Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainColumnNameImpl#getFwName <em>Fw Name</em>}</li>
 *   <li>{@link frameweb.impl.DomainColumnNameImpl#getDomainAttributeName <em>Domain Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainColumnNameImpl extends FrameWebNameImpl implements DomainColumnName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainColumnNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_COLUMN_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFwName() {
		return (String)eGet(FramewebPackage.Literals.DOMAIN_COLUMN_NAME__FW_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFwName(String newFwName) {
		eSet(FramewebPackage.Literals.DOMAIN_COLUMN_NAME__FW_NAME, newFwName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAttribute getDomainAttributeName() {
		return (DomainAttribute)eGet(FramewebPackage.Literals.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainAttributeName(DomainAttribute newDomainAttributeName) {
		eSet(FramewebPackage.Literals.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, newDomainAttributeName);
	}

} //DomainColumnNameImpl
