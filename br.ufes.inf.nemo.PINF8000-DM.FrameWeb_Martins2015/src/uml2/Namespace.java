/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A namespace is an element in a model that contains a set of named elements that can be identified by name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml2.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml2.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link uml2.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml2.Namespace#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml2.Namespace#getPackageImport <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ElementImport}.
	 * It is bidirectional and its opposite is '{@link uml2.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ElementImports owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Import</em>' containment reference list.
	 * @see uml2.Uml2Package#getNamespace_ElementImport()
	 * @see uml2.ElementImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementImport> getElementImport();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see uml2.Uml2Package#getNamespace_ImportedMember()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link uml2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see uml2.Uml2Package#getNamespace_Member()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link uml2.NamedElement}.
	 * It is bidirectional and its opposite is '{@link uml2.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see uml2.Uml2Package#getNamespace_OwnedMember()
	 * @see uml2.NamedElement#getNamespace
	 * @model opposite="namespace" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Owned Rule</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Constraint}.
	 * It is bidirectional and its opposite is '{@link uml2.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of Constraints owned by this Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rule</em>' containment reference list.
	 * @see uml2.Uml2Package#getNamespace_OwnedRule()
	 * @see uml2.Constraint#getContext
	 * @model opposite="context" containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getOwnedRule();

	/**
	 * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.PackageImport}.
	 * It is bidirectional and its opposite is '{@link uml2.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageImports owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Import</em>' containment reference list.
	 * @see uml2.Uml2Package#getNamespace_PackageImport()
	 * @see uml2.PackageImport#getImportingNamespace
	 * @model opposite="importingNamespace" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageImport> getPackageImport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the members of a Namespace are distinguishable within it.
	 * membersAreDistinguishable()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='membersAreDistinguishable()'"
	 * @generated
	 */
	boolean membersDistinguishable(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query excludeCollisions() excludes from a set of PackageableElements any that would not be distinguishable from each other in this namespace.
	 * result = imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))
	 * <!-- end-model-doc -->
	 * @model ordered="false" impsMany="true" impsOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))'"
	 * @generated
	 */
	EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getNamesOfMember() takes importing into account. It gives back the set of names that an element would have in an importing namespace, either because it is owned, or if not owned then imported individually, or if not individually then from a package.
	 * The query getNamesOfMember() gives a set of all of the names that a member would have in a Namespace. In general a member can have multiple names in a Namespace if it is imported more than once with different aliases. The query takes account of importing. It gives back the set of names that an element would have in an importing namespace, either because it is owned, or if not owned then imported individually, or if not individually then from a package.
	 * result = if self.ownedMember ->includes(element)
	 * then Set{}->include(element.name)
	 * else let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in
	 *   if elementImports->notEmpty()
	 *   then elementImports->collect(el | el.getName())
	 *   else self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))
	 *   endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.String" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if self.ownedMember ->includes(element)\nthen Set{}->include(element.name)\nelse let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in\n  if elementImports->notEmpty()\n  then elementImports->collect(el | el.getName())\n  else self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))\n  endif\nendif'"
	 * @generated
	 */
	EList<String> getNamesOfMember(NamedElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query importMembers() defines which of a set of PackageableElements are actually imported into the namespace. This excludes hidden ones, i.e., those which have names that conflict with names of owned members, and also excludes elements which would have the same name when imported.
	 * result = self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem |
	 * mem.imp.isDistinguishableFrom(mem, self)))
	 * <!-- end-model-doc -->
	 * @model ordered="false" impsMany="true" impsOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem |\nmem.imp.isDistinguishableFrom(mem, self)))'"
	 * @generated
	 */
	EList<PackageableElement> importMembers(EList<PackageableElement> imps);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The importedMember property is derived from the ElementImports and the PackageImports. References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * result = self.importMembers(self.elementImport.importedElement.asSet()-
	 * >union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.importMembers(self.elementImport.importedElement.asSet()-\n>union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))'"
	 * @generated
	 */
	EList<PackageableElement> importedMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Boolean query membersAreDistinguishable() determines whether all of the namespace's members are distinguishable within it.
	 * result = self.member->forAll( memb |
	 * self.member->excluding(memb)->forAll(other |
	 * memb.isDistinguishableFrom(other, self)))
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.member->forAll( memb |\nself.member->excluding(memb)->forAll(other |\nmemb.isDistinguishableFrom(other, self)))'"
	 * @generated
	 */
	Boolean membersAreDistinguishable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Namespace::/ownedMember : NamedElement
	 * true
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	EList<NamedElement> ownedMember();

} // Namespace
