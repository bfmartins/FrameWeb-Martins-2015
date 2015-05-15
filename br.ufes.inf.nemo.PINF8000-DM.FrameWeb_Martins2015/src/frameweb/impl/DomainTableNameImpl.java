/**
 */
package frameweb.impl;

import frameweb.DomainTableName;
import frameweb.FramewebPackage;
import frameweb.PersistentClass;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Table Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainTableNameImpl#getFwName <em>Fw Name</em>}</li>
 *   <li>{@link frameweb.impl.DomainTableNameImpl#getPersistentClassName <em>Persistent Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainTableNameImpl extends FrameWebNameImpl implements DomainTableName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainTableNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DOMAIN_TABLE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFwName() {
		return (String)eGet(FramewebPackage.Literals.DOMAIN_TABLE_NAME__FW_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFwName(String newFwName) {
		eSet(FramewebPackage.Literals.DOMAIN_TABLE_NAME__FW_NAME, newFwName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentClass getPersistentClassName() {
		return (PersistentClass)eGet(FramewebPackage.Literals.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentClassName(PersistentClass newPersistentClassName) {
		eSet(FramewebPackage.Literals.DOMAIN_TABLE_NAME__PERSISTENT_CLASS_NAME, newPersistentClassName);
	}

} //DomainTableNameImpl
