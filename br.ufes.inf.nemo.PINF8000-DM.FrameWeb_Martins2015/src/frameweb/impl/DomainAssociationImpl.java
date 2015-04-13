/**
 */
package frameweb.impl;

import frameweb.Cascade;
import frameweb.Collection;
import frameweb.DomainAssociation;
import frameweb.DomainClass;
import frameweb.Fetch;
import frameweb.FrameWebPackage;
import frameweb.Order;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DomainAssociationImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link frameweb.impl.DomainAssociationImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link frameweb.impl.DomainAssociationImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link frameweb.impl.DomainAssociationImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link frameweb.impl.DomainAssociationImpl#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link frameweb.impl.DomainAssociationImpl#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainAssociationImpl extends AssociationImpl implements DomainAssociation {
	/**
	 * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected static final Collection COLLECTION_EDEFAULT = Collection.SET;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected Collection collection = COLLECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Order ORDER_EDEFAULT = Order.NATURAL;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order = ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected static final Cascade CASCADE_EDEFAULT = Cascade.REMOVE;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected Cascade cascade = CASCADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final Fetch FETCH_EDEFAULT = Fetch.EAGER;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected Fetch fetch = FETCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceClass() <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceClass()
	 * @generated
	 * @ordered
	 */
	protected DomainClass sourceClass;

	/**
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected DomainClass targetClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrameWebPackage.Literals.DOMAIN_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(Collection newCollection) {
		Collection oldCollection = collection;
		collection = newCollection == null ? COLLECTION_EDEFAULT : newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ASSOCIATION__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		Order oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ASSOCIATION__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade getCascade() {
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascade(Cascade newCascade) {
		Cascade oldCascade = cascade;
		cascade = newCascade == null ? CASCADE_EDEFAULT : newCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ASSOCIATION__CASCADE, oldCascade, cascade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(Fetch newFetch) {
		Fetch oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ASSOCIATION__FETCH, oldFetch, fetch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getSourceClass() {
		if (sourceClass != null && sourceClass.eIsProxy()) {
			InternalEObject oldSourceClass = (InternalEObject)sourceClass;
			sourceClass = (DomainClass)eResolveProxy(oldSourceClass);
			if (sourceClass != oldSourceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrameWebPackage.DOMAIN_ASSOCIATION__SOURCE_CLASS, oldSourceClass, sourceClass));
			}
		}
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass basicGetSourceClass() {
		return sourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceClass(DomainClass newSourceClass) {
		DomainClass oldSourceClass = sourceClass;
		sourceClass = newSourceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ASSOCIATION__SOURCE_CLASS, oldSourceClass, sourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (DomainClass)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrameWebPackage.DOMAIN_ASSOCIATION__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(DomainClass newTargetClass) {
		DomainClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.DOMAIN_ASSOCIATION__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FrameWebPackage.DOMAIN_ASSOCIATION__COLLECTION:
				return getCollection();
			case FrameWebPackage.DOMAIN_ASSOCIATION__ORDER:
				return getOrder();
			case FrameWebPackage.DOMAIN_ASSOCIATION__CASCADE:
				return getCascade();
			case FrameWebPackage.DOMAIN_ASSOCIATION__FETCH:
				return getFetch();
			case FrameWebPackage.DOMAIN_ASSOCIATION__SOURCE_CLASS:
				if (resolve) return getSourceClass();
				return basicGetSourceClass();
			case FrameWebPackage.DOMAIN_ASSOCIATION__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
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
			case FrameWebPackage.DOMAIN_ASSOCIATION__COLLECTION:
				setCollection((Collection)newValue);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__ORDER:
				setOrder((Order)newValue);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__CASCADE:
				setCascade((Cascade)newValue);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__FETCH:
				setFetch((Fetch)newValue);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__SOURCE_CLASS:
				setSourceClass((DomainClass)newValue);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__TARGET_CLASS:
				setTargetClass((DomainClass)newValue);
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
			case FrameWebPackage.DOMAIN_ASSOCIATION__COLLECTION:
				setCollection(COLLECTION_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__CASCADE:
				setCascade(CASCADE_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__FETCH:
				setFetch(FETCH_EDEFAULT);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__SOURCE_CLASS:
				setSourceClass((DomainClass)null);
				return;
			case FrameWebPackage.DOMAIN_ASSOCIATION__TARGET_CLASS:
				setTargetClass((DomainClass)null);
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
			case FrameWebPackage.DOMAIN_ASSOCIATION__COLLECTION:
				return collection != COLLECTION_EDEFAULT;
			case FrameWebPackage.DOMAIN_ASSOCIATION__ORDER:
				return order != ORDER_EDEFAULT;
			case FrameWebPackage.DOMAIN_ASSOCIATION__CASCADE:
				return cascade != CASCADE_EDEFAULT;
			case FrameWebPackage.DOMAIN_ASSOCIATION__FETCH:
				return fetch != FETCH_EDEFAULT;
			case FrameWebPackage.DOMAIN_ASSOCIATION__SOURCE_CLASS:
				return sourceClass != null;
			case FrameWebPackage.DOMAIN_ASSOCIATION__TARGET_CLASS:
				return targetClass != null;
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
		result.append(" (collection: ");
		result.append(collection);
		result.append(", order: ");
		result.append(order);
		result.append(", cascade: ");
		result.append(cascade);
		result.append(", fetch: ");
		result.append(fetch);
		result.append(')');
		return result.toString();
	}

} //DomainAssociationImpl
