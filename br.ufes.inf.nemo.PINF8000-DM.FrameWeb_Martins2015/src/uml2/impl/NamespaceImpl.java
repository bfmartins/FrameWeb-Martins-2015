/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Constraint;
import uml2.ElementImport;
import uml2.NamedElement;
import uml2.Namespace;
import uml2.PackageImport;
import uml2.PackageableElement;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.NamespaceImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml2.impl.NamespaceImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml2.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml2.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml2.impl.NamespaceImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml2.impl.NamespaceImpl#getPackageImport <em>Package Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, Uml2Package.NAMESPACE__ELEMENT_IMPORT, Uml2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		// TODO: implement this method to return the 'Imported Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getMember() {
		// TODO: implement this method to return the 'Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getOwnedMember() {
		// TODO: implement this method to return the 'Owned Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, Uml2Package.NAMESPACE__OWNED_RULE, Uml2Package.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, Uml2Package.NAMESPACE__PACKAGE_IMPORT, Uml2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersDistinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "membersDistinguishable", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamesOfMember(NamedElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importedMember() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean membersAreDistinguishable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> ownedMember() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case Uml2Package.NAMESPACE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case Uml2Package.NAMESPACE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
				return getElementImport();
			case Uml2Package.NAMESPACE__IMPORTED_MEMBER:
				return getImportedMember();
			case Uml2Package.NAMESPACE__MEMBER:
				return getMember();
			case Uml2Package.NAMESPACE__OWNED_MEMBER:
				return getOwnedMember();
			case Uml2Package.NAMESPACE__OWNED_RULE:
				return getOwnedRule();
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
				return getPackageImport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case Uml2Package.NAMESPACE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
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
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case Uml2Package.NAMESPACE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
				getPackageImport().clear();
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
			case Uml2Package.NAMESPACE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case Uml2Package.NAMESPACE__IMPORTED_MEMBER:
				return !getImportedMember().isEmpty();
			case Uml2Package.NAMESPACE__MEMBER:
				return !getMember().isEmpty();
			case Uml2Package.NAMESPACE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case Uml2Package.NAMESPACE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case Uml2Package.NAMESPACE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.NAMESPACE___MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return membersDistinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.NAMESPACE___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<PackageableElement>)arguments.get(0));
			case Uml2Package.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
				return getNamesOfMember((NamedElement)arguments.get(0));
			case Uml2Package.NAMESPACE___IMPORT_MEMBERS__ELIST:
				return importMembers((EList<PackageableElement>)arguments.get(0));
			case Uml2Package.NAMESPACE___IMPORTED_MEMBER:
				return importedMember();
			case Uml2Package.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE:
				return membersAreDistinguishable();
			case Uml2Package.NAMESPACE___OWNED_MEMBER:
				return ownedMember();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamespaceImpl
