/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityGroup is an abstract class for defining sets of nodes and edges in an activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ActivityGroup#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml2.ActivityGroup#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml2.ActivityGroup#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml2.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml2.ActivityGroup#getContainedEdge <em>Contained Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getActivityGroup()
 * @model abstract="true"
 * @generated
 */
public interface ActivityGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityNode#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes immediately contained in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see uml2.Uml2Package#getActivityGroup_ContainedNode()
	 * @see uml2.ActivityNode#getInGroup
	 * @model opposite="inGroup" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>In Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Activity#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity containing the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Activity</em>' container reference.
	 * @see #setInActivity(Activity)
	 * @see uml2.Uml2Package#getActivityGroup_InActivity()
	 * @see uml2.Activity#getGroup
	 * @model opposite="group" transient="false" ordered="false"
	 * @generated
	 */
	Activity getInActivity();

	/**
	 * Sets the value of the '{@link uml2.ActivityGroup#getInActivity <em>In Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Activity</em>' container reference.
	 * @see #getInActivity()
	 * @generated
	 */
	void setInActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Groups immediately contained in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subgroup</em>' reference list.
	 * @see uml2.Uml2Package#getActivityGroup_Subgroup()
	 * @see uml2.ActivityGroup#getSuperGroup
	 * @model opposite="superGroup" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityGroup#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group immediately containing the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see uml2.Uml2Package#getActivityGroup_SuperGroup()
	 * @see uml2.ActivityGroup#getSubgroup
	 * @model opposite="subgroup" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityEdge#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges immediately contained in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see uml2.Uml2Package#getActivityGroup_ContainedEdge()
	 * @see uml2.ActivityEdge#getInGroup
	 * @model opposite="inGroup" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Groups may only be owned by activities or groups.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean groupOwned(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All nodes and edges of the group must be in the same activity as the group.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean nodesAndEdges(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No node or edge in a group may be contained by its subgroups or its containing groups, transitively.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean notContained(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ActivityGroup
