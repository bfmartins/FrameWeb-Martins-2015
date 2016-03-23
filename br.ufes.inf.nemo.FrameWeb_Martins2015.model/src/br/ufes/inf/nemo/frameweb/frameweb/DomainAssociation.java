/**
 */
package br.ufes.inf.nemo.frameweb.frameweb;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getCollection <em>Collection</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getCascade <em>Cascade</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getFetch <em>Fetch</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getDomainAssociation()
 * @model
 * @generated
 */
public interface DomainAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.frameweb.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Collection
	 * @see #setCollection(Collection)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getDomainAssociation_Collection()
	 * @model
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Collection
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.frameweb.Cascade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Cascade
	 * @see #setCascade(Cascade)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getDomainAssociation_Cascade()
	 * @model
	 * @generated
	 */
	Cascade getCascade();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Cascade
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(Cascade value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.frameweb.Fetch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Fetch
	 * @see #setFetch(Fetch)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getDomainAssociation_Fetch()
	 * @model
	 * @generated
	 */
	Fetch getFetch();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Fetch
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(Fetch value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufes.inf.nemo.frameweb.frameweb.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Order
	 * @see #setOrder(Order)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getDomainAssociation_Order()
	 * @model
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.DomainAssociation#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.Order
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

} // DomainAssociation
