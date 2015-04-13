/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A general ordering represents a binary relation between two occurrence specifications, to describe that one occurrence specification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of occurrence cpecifications that may otherwise not have a specified order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.GeneralOrdering#getAfter <em>After</em>}</li>
 *   <li>{@link uml2.GeneralOrdering#getBefore <em>Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.OccurrenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced by before.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurrenceSpecification)
	 * @see uml2.Uml2Package#getGeneralOrdering_After()
	 * @see uml2.OccurrenceSpecification#getToBefore
	 * @model opposite="toBefore" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link uml2.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.OccurrenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced by after.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurrenceSpecification)
	 * @see uml2.Uml2Package#getGeneralOrdering_Before()
	 * @see uml2.OccurrenceSpecification#getToAfter
	 * @model opposite="toAfter" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link uml2.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurrenceSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An occurrence specification must not be ordered relative to itself through a series of general orderings. (In other words, the transitive closure of the general orderings is irreflexive.)
	 * start.lifeline = finish.lifeline
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='start.lifeline = finish.lifeline'"
	 * @generated
	 */
	boolean irreflexsiveTransitiveClosure(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GeneralOrdering
