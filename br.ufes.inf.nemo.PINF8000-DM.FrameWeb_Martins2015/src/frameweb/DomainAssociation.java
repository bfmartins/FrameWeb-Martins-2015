/**
 */
package frameweb;

import uml2.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainAssociation#getCollection <em>Collection</em>}</li>
 *   <li>{@link frameweb.DomainAssociation#getOrder <em>Order</em>}</li>
 *   <li>{@link frameweb.DomainAssociation#getCascade <em>Cascade</em>}</li>
 *   <li>{@link frameweb.DomainAssociation#getFetch <em>Fetch</em>}</li>
 *   <li>{@link frameweb.DomainAssociation#getSourceClass <em>Source Class</em>}</li>
 *   <li>{@link frameweb.DomainAssociation#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainAssociation()
 * @model
 * @generated
 */
public interface DomainAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see frameweb.Collection
	 * @see #setCollection(Collection)
	 * @see frameweb.FramewebPackage#getDomainAssociation_Collection()
	 * @model
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link frameweb.DomainAssociation#getCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see frameweb.Collection
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see frameweb.Order
	 * @see #setOrder(Order)
	 * @see frameweb.FramewebPackage#getDomainAssociation_Order()
	 * @model
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link frameweb.DomainAssociation#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see frameweb.Order
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.Cascade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see frameweb.Cascade
	 * @see #setCascade(Cascade)
	 * @see frameweb.FramewebPackage#getDomainAssociation_Cascade()
	 * @model
	 * @generated
	 */
	Cascade getCascade();

	/**
	 * Sets the value of the '{@link frameweb.DomainAssociation#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see frameweb.Cascade
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(Cascade value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.Fetch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see frameweb.Fetch
	 * @see #setFetch(Fetch)
	 * @see frameweb.FramewebPackage#getDomainAssociation_Fetch()
	 * @model
	 * @generated
	 */
	Fetch getFetch();

	/**
	 * Sets the value of the '{@link frameweb.DomainAssociation#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see frameweb.Fetch
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(Fetch value);

	/**
	 * Returns the value of the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Class</em>' reference.
	 * @see #setSourceClass(DomainClass)
	 * @see frameweb.FramewebPackage#getDomainAssociation_SourceClass()
	 * @model required="true"
	 * @generated
	 */
	DomainClass getSourceClass();

	/**
	 * Sets the value of the '{@link frameweb.DomainAssociation#getSourceClass <em>Source Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Class</em>' reference.
	 * @see #getSourceClass()
	 * @generated
	 */
	void setSourceClass(DomainClass value);

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(DomainClass)
	 * @see frameweb.FramewebPackage#getDomainAssociation_TargetClass()
	 * @model required="true"
	 * @generated
	 */
	DomainClass getTargetClass();

	/**
	 * Sets the value of the '{@link frameweb.DomainAssociation#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(DomainClass value);

} // DomainAssociation
