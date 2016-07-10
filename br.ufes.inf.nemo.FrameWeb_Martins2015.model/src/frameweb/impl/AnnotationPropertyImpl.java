/**
 */
package frameweb.impl;

import frameweb.AnnotationProperty;
import frameweb.Association;
import frameweb.FramewebPackage;
import frameweb.Property;
import frameweb.VocabularyAssociation;

import frameweb.util.FramewebValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.AnnotationPropertyImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link frameweb.impl.AnnotationPropertyImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link frameweb.impl.AnnotationPropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link frameweb.impl.AnnotationPropertyImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link frameweb.impl.AnnotationPropertyImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link frameweb.impl.AnnotationPropertyImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationPropertyImpl extends VocabularyEntityImpl implements AnnotationProperty {
	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.ANNOTATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElements() {
		// TODO: implement this method to return the 'Related Element' reference list
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
	public EList<Type> getEndType() {
		// TODO: implement this method to return the 'End Type' reference list
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
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END, FramewebPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, FramewebPackage.ANNOTATION_PROPERTY__OWNED_END, FramewebPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean specialized_end_number(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.ASSOCIATION__SPECIALIZED_END_NUMBER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specialized_end_number", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean specialized_end_types(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.ASSOCIATION__SPECIALIZED_END_TYPES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specialized_end_types", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean binary_associations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.ASSOCIATION__BINARY_ASSOCIATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "binary_associations", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean association_ends(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.ASSOCIATION__ASSOCIATION_ENDS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "association_ends", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ends_must_be_typed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 FramewebValidator.DIAGNOSTIC_SOURCE,
						 FramewebValidator.ASSOCIATION__ENDS_MUST_BE_TYPED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ends_must_be_typed", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean isBinary() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndTypes() {
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
			case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
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
			case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.ANNOTATION_PROPERTY__RELATED_ELEMENT:
				return getRelatedElements();
			case FramewebPackage.ANNOTATION_PROPERTY__END_TYPE:
				return getEndType();
			case FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED:
				return isIsDerived();
			case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END:
				return getMemberEnd();
			case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END:
				return getOwnedEnd();
			case FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
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
			case FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
			case FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END:
				getMemberEnd().clear();
				return;
			case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END:
				getOwnedEnd().clear();
				return;
			case FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
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
			case FramewebPackage.ANNOTATION_PROPERTY__RELATED_ELEMENT:
				return !getRelatedElements().isEmpty();
			case FramewebPackage.ANNOTATION_PROPERTY__END_TYPE:
				return !getEndType().isEmpty();
			case FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
			case FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.ANNOTATION_PROPERTY__RELATED_ELEMENT: return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.ANNOTATION_PROPERTY__END_TYPE: return FramewebPackage.ASSOCIATION__END_TYPE;
				case FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED: return FramewebPackage.ASSOCIATION__IS_DERIVED;
				case FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END: return FramewebPackage.ASSOCIATION__MEMBER_END;
				case FramewebPackage.ANNOTATION_PROPERTY__OWNED_END: return FramewebPackage.ASSOCIATION__OWNED_END;
				case FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END: return FramewebPackage.ASSOCIATION__NAVIGABLE_OWNED_END;
				default: return -1;
			}
		}
		if (baseClass == VocabularyAssociation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case UMLPackage.RELATIONSHIP__RELATED_ELEMENT: return FramewebPackage.ANNOTATION_PROPERTY__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case FramewebPackage.ASSOCIATION__END_TYPE: return FramewebPackage.ANNOTATION_PROPERTY__END_TYPE;
				case FramewebPackage.ASSOCIATION__IS_DERIVED: return FramewebPackage.ANNOTATION_PROPERTY__IS_DERIVED;
				case FramewebPackage.ASSOCIATION__MEMBER_END: return FramewebPackage.ANNOTATION_PROPERTY__MEMBER_END;
				case FramewebPackage.ASSOCIATION__OWNED_END: return FramewebPackage.ANNOTATION_PROPERTY__OWNED_END;
				case FramewebPackage.ASSOCIATION__NAVIGABLE_OWNED_END: return FramewebPackage.ANNOTATION_PROPERTY__NAVIGABLE_OWNED_END;
				default: return -1;
			}
		}
		if (baseClass == VocabularyAssociation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseOperationID) {
				case FramewebPackage.ASSOCIATION___SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP: return FramewebPackage.ANNOTATION_PROPERTY___SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.ASSOCIATION___SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP: return FramewebPackage.ANNOTATION_PROPERTY___SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.ASSOCIATION___BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.ANNOTATION_PROPERTY___BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.ASSOCIATION___ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.ANNOTATION_PROPERTY___ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.ASSOCIATION___ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP: return FramewebPackage.ANNOTATION_PROPERTY___ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP;
				case FramewebPackage.ASSOCIATION___IS_BINARY: return FramewebPackage.ANNOTATION_PROPERTY___IS_BINARY;
				case FramewebPackage.ASSOCIATION___GET_END_TYPES: return FramewebPackage.ANNOTATION_PROPERTY___GET_END_TYPES;
				default: return -1;
			}
		}
		if (baseClass == VocabularyAssociation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case FramewebPackage.ANNOTATION_PROPERTY___SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP:
				return specialized_end_number((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.ANNOTATION_PROPERTY___SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP:
				return specialized_end_types((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.ANNOTATION_PROPERTY___BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
				return binary_associations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.ANNOTATION_PROPERTY___ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP:
				return association_ends((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.ANNOTATION_PROPERTY___ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP:
				return ends_must_be_typed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.ANNOTATION_PROPERTY___IS_BINARY:
				return isBinary();
			case FramewebPackage.ANNOTATION_PROPERTY___GET_END_TYPES:
				return getEndTypes();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //AnnotationPropertyImpl
