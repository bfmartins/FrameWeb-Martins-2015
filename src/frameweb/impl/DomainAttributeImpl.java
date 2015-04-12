/**
 */
package frameweb.impl;

import frameweb.DomainAttribute;
import frameweb.DomainColumnName;
import frameweb.FrameWebPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2.impl.PropertyImpl;

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
public class DomainAttributeImpl extends PropertyImpl implements DomainAttribute {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNull = IS_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersistent() <em>Is Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersistent = IS_PERSISTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected DomainColumnName column;

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
		return FrameWebPackage.Literals.DOMAIN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ATTRIBUTE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNull() {
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNull(boolean newIsNull) {
		boolean oldIsNull = isNull;
		isNull = newIsNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ATTRIBUTE__IS_NULL, oldIsNull, isNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersistent() {
		return isPersistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersistent(boolean newIsPersistent) {
		boolean oldIsPersistent = isPersistent;
		isPersistent = newIsPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ATTRIBUTE__IS_PERSISTENT, oldIsPersistent, isPersistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainColumnName getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (DomainColumnName)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainColumnName basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(DomainColumnName newColumn, NotificationChain msgs) {
		DomainColumnName oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(DomainColumnName newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, FrameWebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, DomainColumnName.class, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, FrameWebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, DomainColumnName.class, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN:
				if (column != null)
					msgs = ((InternalEObject)column).eInverseRemove(this, FrameWebPackage.DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME, DomainColumnName.class, msgs);
				return basicSetColumn((DomainColumnName)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN:
				return basicSetColumn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ATTRIBUTE__SIZE:
				return getSize();
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_NULL:
				return isIsNull();
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_PERSISTENT:
				return isIsPersistent();
			case FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ATTRIBUTE__SIZE:
				setSize((Long)newValue);
				return;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_NULL:
				setIsNull((Boolean)newValue);
				return;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_PERSISTENT:
				setIsPersistent((Boolean)newValue);
				return;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN:
				setColumn((DomainColumnName)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ATTRIBUTE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_NULL:
				setIsNull(IS_NULL_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_PERSISTENT:
				setIsPersistent(IS_PERSISTENT_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN:
				setColumn((DomainColumnName)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ATTRIBUTE__SIZE:
				return size != SIZE_EDEFAULT;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_NULL:
				return isNull != IS_NULL_EDEFAULT;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__IS_PERSISTENT:
				return isPersistent != IS_PERSISTENT_EDEFAULT;
			case FrameWebPackage.DOMAIN_ATTRIBUTE__COLUMN:
				return column != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (size: ");
		result.append(size);
		result.append(", isNull: ");
		result.append(isNull);
		result.append(", isPersistent: ");
		result.append(isPersistent);
		result.append(')');
		return result.toString();
	}

} //DomainAttributeImpl
