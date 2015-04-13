/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An expansion region is a structured activity region that executes multiple times corresponding to elements of an input collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link uml2.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link uml2.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"iterative"</code>.
	 * The literals are from the enumeration {@link uml2.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The way in which the executions interact: parallel: all interactions are independent iterative: the interactions occur in order of the elements stream: a stream of values flows into a single execution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see uml2.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see uml2.Uml2Package#getExpansionRegion_Mode()
	 * @model default="iterative" required="true" ordered="false"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link uml2.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see uml2.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link uml2.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link uml2.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object node that accepts a separate element of the output collection during each of the multiple executions of the region. The values are formed into a collection that is available when the execution of the region is complete.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see uml2.Uml2Package#getExpansionRegion_OutputElement()
	 * @see uml2.ExpansionNode#getRegionAsOutput
	 * @model opposite="regionAsOutput" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link uml2.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link uml2.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An object node that holds a separate element of the input collection during each of the multiple executions of the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see uml2.Uml2Package#getExpansionRegion_InputElement()
	 * @see uml2.ExpansionNode#getRegionAsInput
	 * @model opposite="regionAsInput" required="true" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ExpansionRegion must have one or more argument ExpansionNodes and zero or more result ExpansionNodes.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean expansionNodes(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExpansionRegion
