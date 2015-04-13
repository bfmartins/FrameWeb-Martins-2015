/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InteractionFragment is an abstract notion of the most general interaction unit. An interaction fragment is a piece of an interaction. Each interaction fragment is conceptually like an interaction by itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link uml2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link uml2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link uml2.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link uml2.Lifeline}.
	 * It is bidirectional and its opposite is '{@link uml2.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Lifelines that the InteractionFragment involves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see uml2.Uml2Package#getInteractionFragment_Covered()
	 * @see uml2.Lifeline#getCoveredBy
	 * @model opposite="coveredBy" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Interaction#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interaction enclosing this InteractionFragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see uml2.Uml2Package#getInteractionFragment_EnclosingInteraction()
	 * @see uml2.Interaction#getFragment
	 * @model opposite="fragment" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getEnclosingInteraction();

	/**
	 * Sets the value of the '{@link uml2.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #getEnclosingInteraction()
	 * @generated
	 */
	void setEnclosingInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand enclosing this InteractionFragment (they may nest recursively)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see uml2.Uml2Package#getInteractionFragment_EnclosingOperand()
	 * @see uml2.InteractionOperand#getFragment
	 * @model opposite="fragment" transient="false" ordered="false"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link uml2.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general ordering relationships contained in this fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see uml2.Uml2Package#getInteractionFragment_GeneralOrdering()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrdering();

} // InteractionFragment
