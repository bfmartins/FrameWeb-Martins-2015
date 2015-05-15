/**
 */
package frameweb.impl;

import frameweb.Cascade;
import frameweb.Collection;
import frameweb.DomainAssociation;
import frameweb.DomainClass;
import frameweb.Fetch;
import frameweb.FramewebPackage;
import frameweb.Order;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.AssociationImpl;

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
		return FramewebPackage.Literals.DOMAIN_ASSOCIATION;
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
	public Collection getCollection() {
		return (Collection)eGet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(Collection newCollection) {
		eSet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__COLLECTION, newCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		return (Order)eGet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		eSet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade getCascade() {
		return (Cascade)eGet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__CASCADE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascade(Cascade newCascade) {
		eSet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__CASCADE, newCascade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch getFetch() {
		return (Fetch)eGet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__FETCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(Fetch newFetch) {
		eSet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__FETCH, newFetch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getSourceClass() {
		return (DomainClass)eGet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__SOURCE_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceClass(DomainClass newSourceClass) {
		eSet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__SOURCE_CLASS, newSourceClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainClass getTargetClass() {
		return (DomainClass)eGet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__TARGET_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(DomainClass newTargetClass) {
		eSet(FramewebPackage.Literals.DOMAIN_ASSOCIATION__TARGET_CLASS, newTargetClass);
	}

} //DomainAssociationImpl
