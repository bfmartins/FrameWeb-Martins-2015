/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package import is a relationship that allows the use of unqualified names to refer to package members from other namespaces.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link uml2.PackageImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml2.PackageImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getPackageImport()
 * @model
 * @generated
 */
public interface PackageImport extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Package whose members are imported into a Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package</em>' reference.
	 * @see #setImportedPackage(uml2.Package)
	 * @see uml2.Uml2Package#getPackageImport_ImportedPackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	uml2.Package getImportedPackage();

	/**
	 * Sets the value of the '{@link uml2.PackageImport#getImportedPackage <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package</em>' reference.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(uml2.Package value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link uml2.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the visibility of the imported PackageableElements within the importing Namespace, i.e., whether imported elements will in turn be visible to other packages that use that importingPackage as an importedPackage. If the PackageImport is public, the imported elements will be visible outside the package, while if it is private they will not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see uml2.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see uml2.Uml2Package#getPackageImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link uml2.PackageImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see uml2.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Namespace#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that imports the members from a Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see uml2.Uml2Package#getPackageImport_ImportingNamespace()
	 * @see uml2.Namespace#getPackageImport
	 * @model opposite="packageImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link uml2.PackageImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The visibility of a PackageImport is either public or private.
	 * self.visibility = #public or self.visibility = #private
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.visibility = #public or self.visibility = #private'"
	 * @generated
	 */
	boolean publicOrPrivate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PackageImport
