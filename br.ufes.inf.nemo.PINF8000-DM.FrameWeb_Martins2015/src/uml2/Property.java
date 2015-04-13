/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Property specializes ParameterableElement to specify that a property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * A property represents a set of instances that are owned by a containing classifier instance.
 * Property represents a declared state of one or more instances in terms of a named relationship to a value or values. When a property is an attribute of a classifier, the value or values are related to the instance of the classifier by being held in slots of the instance. When a property is an association end, the value or values are related to the instance or instances at the other end(s) of the association. The range of valid values represented by the property can be controlled by setting the property's type.
 * A property is a structural feature of a classifier that characterizes instances of the classifier. A property related by ownedAttribute to a classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the class to a value or set of values of the type of the attribute. A property related by memberEnd or its specializations to an association represents an end of the association. The type of the property is the type of the end of the association.
 * A property has the capability of being a deployment target in a deployment relationship. This enables modeling the deployment to hierarchical nodes that have properties functioning as internal parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml2.Property#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml2.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml2.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml2.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link uml2.Property#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link uml2.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml2.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml2.Property#getDefault <em>Default</em>}</li>
 *   <li>{@link uml2.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml2.Property#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml2.Property#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml2.Property#getIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml2.Property#getIsId <em>Is Id</em>}</li>
 *   <li>{@link uml2.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uml2.Property#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link uml2.Property#getSubsettedProperty <em>Subsetted Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getProperty()
 * @model
 * @generated
 */
public interface Property extends StructuralFeature, ConnectableElement, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.DataType#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see uml2.Uml2Package#getProperty_Datatype()
	 * @see uml2.DataType#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link uml2.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Interface#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Interface that owns the Property
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see uml2.Uml2Package#getProperty_Interface()
	 * @see uml2.Interface#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link uml2.Property#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link uml2.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of aggregation that applies to the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see uml2.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see uml2.Uml2Package#getProperty_Aggregation()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link uml2.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see uml2.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the association of which this property is a member, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uml2.Uml2Package#getProperty_Association()
	 * @see uml2.Association#getMemberEnd
	 * @model opposite="memberEnd" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uml2.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the owning association of this property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see uml2.Uml2Package#getProperty_OwningAssociation()
	 * @see uml2.Association#getOwnedEnd
	 * @model opposite="ownedEnd" transient="false" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link uml2.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the optional association end that owns a qualifier attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End</em>' container reference.
	 * @see #setAssociationEnd(Property)
	 * @see uml2.Uml2Package#getProperty_AssociationEnd()
	 * @see uml2.Property#getQualifier
	 * @model opposite="qualifier" transient="false" ordered="false"
	 * @generated
	 */
	Property getAssociationEnd();

	/**
	 * Sets the value of the '{@link uml2.Property#getAssociationEnd <em>Association End</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' container reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Property}.
	 * It is bidirectional and its opposite is '{@link uml2.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional list of ordered qualifier attributes for the end. If the list is empty, then the Association is not qualified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see uml2.Uml2Package#getProperty_Qualifier()
	 * @see uml2.Property#getAssociationEnd
	 * @model opposite="associationEnd" containment="true"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Class that owns the Property.
	 * References the Class that owns the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see uml2.Uml2Package#getProperty_Class()
	 * @model transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	uml2.Class getClass_();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A String that is evaluated to give a default value for the Property when an object of the owning Classifier is instantiated.
	 * Specifies a String that represents a value to be used when no argument is supplied for the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see uml2.Uml2Package#getProperty_Default()
	 * @model dataType="primitiveTypes.String" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link uml2.Property#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that is evaluated to give a default value for the Property when an object of the owning Classifier is instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see uml2.Uml2Package#getProperty_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link uml2.Property#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute.
	 * This is a derived value, indicating whether the aggregation of the Property is composite or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see uml2.Uml2Package#getProperty_IsComposite()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link uml2.Property#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isDerived is true, the value of the attribute is derived from information elsewhere.
	 * Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(Boolean)
	 * @see uml2.Uml2Package#getProperty_IsDerived()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDerived();

	/**
	 * Sets the value of the '{@link uml2.Property#getIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #getIsDerived()
	 * @generated
	 */
	void setIsDerived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the property is derived as the union of all of the properties that are constrained to subset it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(Boolean)
	 * @see uml2.Uml2Package#getProperty_IsDerivedUnion()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDerivedUnion();

	/**
	 * Sets the value of the '{@link uml2.Property#getIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #getIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates this property can be used to uniquely identify an instance of the containing Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Id</em>' attribute.
	 * @see #setIsId(Boolean)
	 * @see uml2.Uml2Package#getProperty_IsId()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsId();

	/**
	 * Sets the value of the '{@link uml2.Property#getIsId <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' attribute.
	 * @see #getIsId()
	 * @generated
	 */
	void setIsId(Boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case where the property is one navigable end of a binary association with both ends navigable, this gives the other end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see uml2.Uml2Package#getProperty_Opposite()
	 * @model volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link uml2.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference list.
	 * The list contents are of type {@link uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties that are redefined by this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference list.
	 * @see uml2.Uml2Package#getProperty_RedefinedProperty()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getRedefinedProperty();

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link uml2.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the properties of which this property is constrained to be a subset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see uml2.Uml2Package#getProperty_SubsettedProperty()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getSubsettedProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property may not subset a property with the same name.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean subsettedPropertyNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binding of a property template parameter representing an attribute must be to an attribute.
	 * (isAttribute(self) and (templateParameterSubstitution->notEmpty())
	 *   implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(isAttribute(self) and (templateParameterSubstitution->notEmpty())\r\n  implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))'"
	 * @generated
	 */
	boolean bindingToAttribute(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A multiplicity of a composite aggregation must not have an upper bound greater than 1.
	 * A multiplicity on an aggregate end of a composite aggregation must not have an upper bound greater than 1.
	 * isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)'"
	 * @generated
	 */
	boolean multiplicityOfComposite(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is read only.
	 * isDerivedUnion implies isReadOnly
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDerivedUnion implies isReadOnly'"
	 * @generated
	 */
	boolean derivedUnionIsReadOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A redefined property must be inherited from a more general classifier containing the redefining property.
	 * if (redefinedProperty->notEmpty()) then
	 *   (redefinitionContext->notEmpty() and
	 *       redefinedProperty->forAll(rp|
	 *         ((redefinitionContext->collect(fc|
	 *           fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if (redefinedProperty->notEmpty()) then\r\n  (redefinitionContext->notEmpty() and\r\n      redefinedProperty->forAll(rp|\r\n        ((redefinitionContext->collect(fc|\r\n          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))'"
	 * @generated
	 */
	boolean redefinedPropertyInherited(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subsetting property may strengthen the type of the subsetted property, and its upper bound may be less.
	 * self.subsettedProperty->forAll(sp |
	 *   self.type.conformsTo(sp.type) and
	 *     ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
	 *       self.upperBound()<=sp.upperBound() ))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subsettedProperty->forAll(sp |\n  self.type.conformsTo(sp.type) and\n    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\n      self.upperBound()<=sp.upperBound() ))'"
	 * @generated
	 */
	boolean subsettingRules(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Property can be a DeploymentTarget if it is a kind of Node and functions as a part in the internal structure of an encompassing Node.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean deploymentTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived union is derived.
	 * isDerivedUnion implies isDerived
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDerivedUnion implies isDerived'"
	 * @generated
	 */
	boolean derivedUnionIsDerived(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsetting may only occur when the context of the subsetting property conforms to the context of the subsetted property.
	 * self.subsettedProperty->notEmpty() implies
	 *   (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |
	 *     self.subsettedProperty->forAll(sp |
	 *       sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subsettedProperty->notEmpty() implies\n  (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |\n    self.subsettedProperty->forAll(sp |\n      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))'"
	 * @generated
	 */
	boolean subsettingContextConforms(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Property::/default : String
	 * true
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.String" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	String default_();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some classifier.
	 * result = Classifier.allInstances->exists(c | c.attribute->includes(p))
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Boolean" required="true" ordered="false" pRequired="true" pOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = Classifier.allInstances->exists(c | c.attribute->includes(p))'"
	 * @generated
	 */
	Boolean isAttribute(Property p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of isComposite is true only if aggregation is composite.
	 * result = (self.aggregation = #composite)
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (self.aggregation = #composite)'"
	 * @generated
	 */
	Boolean isComposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	 * result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)'"
	 * @generated
	 */
	Boolean isNavigable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is owned by a class, associated with a binary association, and the other end of the association is also owned by a class, then opposite gives the other end.
	 * result = if owningAssociation->isEmpty() and association.memberEnd->size() = 2
	 *   then
	 *     let otherEnd = (association.memberEnd - self)->any() in
	 *       if otherEnd.owningAssociation->isEmpty() then otherEnd else Set{} endif
	 *     else Set {}
	 *     endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if owningAssociation->isEmpty() and association.memberEnd->size() = 2\n  then\n    let otherEnd = (association.memberEnd - self)->any() in\n      if otherEnd.owningAssociation->isEmpty() then otherEnd else Set{} endif\n    else Set {}\n    endif'"
	 * @generated
	 */
	Property opposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query subsettingContext() gives the context for subsetting a property. It consists, in the case of an attribute, of the corresponding classifier, and in the case of an association end, all of the classifiers at the other ends.
	 * result = if association->notEmpty()
	 * then association.endType-type
	 * else if classifier->notEmpty() then Set{classifier} else Set{} endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if association->notEmpty()\nthen association.endType-type\nelse if classifier->notEmpty() then Set{classifier} else Set{} endif\nendif'"
	 * @generated
	 */
	EList<Type> subsettingContext();

} // Property
