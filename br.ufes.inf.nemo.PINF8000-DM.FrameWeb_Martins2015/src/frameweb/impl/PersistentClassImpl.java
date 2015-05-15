/**
 */
package frameweb.impl;

import frameweb.DomainTableName;
import frameweb.FramewebPackage;
import frameweb.PersistentClass;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PersistentClassImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistentClassImpl extends DomainClassImpl implements PersistentClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PERSISTENT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTableName getTable() {
		return (DomainTableName)eGet(FramewebPackage.Literals.PERSISTENT_CLASS__TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(DomainTableName newTable) {
		eSet(FramewebPackage.Literals.PERSISTENT_CLASS__TABLE, newTable);
	}

} //PersistentClassImpl
