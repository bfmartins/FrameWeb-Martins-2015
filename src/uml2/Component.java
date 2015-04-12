/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In the namespace of a component, all model elements that are involved in or related to its definition are either owned or imported explicitly. This may include, for example, use cases and dependencies (e.g. mappings), packages, components, and artifacts.
 * A component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Component#getIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link uml2.Component#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml2.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml2.Component#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml2.Component#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends uml2.Class {
	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isIndirectlyInstantiated : Boolean {default = true} The kind of instantiation that applies to a Component. If false, the component is instantiated as an addressable object. If true, the Component is defined at design-time, but at run-time (or execution-time) an object specified by the Component does not exist, that is, the component is instantiated indirectly, through the instantiation of its realizing classifiers or parts. Several standard stereotypes use this meta attribute (e.g., «specification», «focus», «subsystem»).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(Boolean)
	 * @see uml2.Uml2Package#getComponent_IsIndirectlyInstantiated()
	 * @model default="true" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link uml2.Component#getIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #getIsIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of PackageableElements that a Component owns. In the namespace of a component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g. Classes, Interfaces, Components, Packages, Use cases, Dependencies (e.g. mappings), and Artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see uml2.Uml2Package#getComponent_PackagedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interfaces that the component exposes to its environment. These interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see uml2.Uml2Package#getComponent_Provided()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ComponentRealization}.
	 * It is bidirectional and its opposite is '{@link uml2.ComponentRealization#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see uml2.Uml2Package#getComponent_Realization()
	 * @see uml2.ComponentRealization#getAbstraction
	 * @model opposite="abstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList<ComponentRealization> getRealization();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link uml2.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interfaces that the component requires from other components in its environment in order to be able to offer its full set of provided functionality. These interfaces may be used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see uml2.Uml2Package#getComponent_Required()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * component nested in a Class cannot have any packaged elements.
	 * (not self.class->isEmpty()) implies self.packagedElement->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(not self.class->isEmpty()) implies self.packagedElement->isEmpty()'"
	 * @generated
	 */
	boolean noPackagedElements(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component cannot nest classifiers.
	 * self.nestedClassifier->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nestedClassifier->isEmpty()'"
	 * @generated
	 */
	boolean noNestedClassifiers(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Component::/provided : Interface
	 * result =
	 * let 	realizedInterfaces : Set(Interface) = RealizedInterfaces(self) ,
	 * 		realizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),
	 * 		allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()) ,
	 * 		realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(RealizedInterfaces(c))) ,
	 * 		ports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort) ,
	 * 		providedByPorts : Set(Interface) = ports.provided 
	 * in 	realizedInterfaces->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet()
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result =\r\nlet \trealizedInterfaces : Set(Interface) = RealizedInterfaces(self) ,\r\n\t\trealizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),\r\n\t\tallRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()) ,\r\n\t\trealizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(RealizedInterfaces(c))) ,\r\n\t\tports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort) ,\r\n\t\tprovidedByPorts : Set(Interface) = ports.provided \r\nin \trealizedInterfaces->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet()\r\n'"
	 * @generated
	 */
	EList<Interface> provided();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of realized interfaces of a component.
	 * result = (classifier.clientDependency->
	 * select(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->
	 * collect(dependency|dependency.client)
	 * <!-- end-model-doc -->
	 * @model ordered="false" classifierRequired="true" classifierOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (classifier.clientDependency->\nselect(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->\ncollect(dependency|dependency.client)'"
	 * @generated
	 */
	EList<Interface> realizedInterfaces(Classifier classifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Component::/required : Interface
	 * result = 
	 * let 	usedInterfaces : Set(Interface) = UsedInterfaces(self),
	 * 		realizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),
	 * 		allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()),
	 * 		realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(UsedInterfaces(c))),
	 * 		ports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort),
	 * 		usedByPorts : Set(Interface) = ports.required
	 * in		usedInterfaces->union(realizingClassifierInterfaces) ->union(usedByPorts)->asSet()
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = \r\nlet \tusedInterfaces : Set(Interface) = UsedInterfaces(self),\r\n\t\trealizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),\r\n\t\tallRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()),\r\n\t\trealizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(UsedInterfaces(c))),\r\n\t\tports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort),\r\n\t\tusedByPorts : Set(Interface) = ports.required\r\nin\t\tusedInterfaces->union(realizingClassifierInterfaces) ->union(usedByPorts)->asSet()\r\n'"
	 * @generated
	 */
	EList<Interface> required();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utility returning the set of used interfaces of a component.
	 * result = (classifier.supplierDependency->
	 * select(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->
	 * collect(dependency|dependency.supplier)
	 * <!-- end-model-doc -->
	 * @model ordered="false" classifierRequired="true" classifierOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (classifier.supplierDependency->\nselect(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->\ncollect(dependency|dependency.supplier)'"
	 * @generated
	 */
	EList<Interface> usedInterfaces(Classifier classifier);

} // Component
