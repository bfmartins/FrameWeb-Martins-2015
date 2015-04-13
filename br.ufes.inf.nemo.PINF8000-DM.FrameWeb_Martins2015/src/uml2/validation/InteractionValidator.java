/**
 *
 * $Id$
 */
package uml2.validation;

import org.eclipse.emf.common.util.EList;

import uml2.Action;
import uml2.Gate;
import uml2.InteractionFragment;
import uml2.Lifeline;
import uml2.Message;

/**
 * A sample validator interface for {@link uml2.Interaction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InteractionValidator {
	boolean validate();

	boolean validateAction(EList<Action> value);
	boolean validateFormalGate(EList<Gate> value);
	boolean validateFragment(EList<InteractionFragment> value);
	boolean validateLifeline(EList<Lifeline> value);
	boolean validateMessage(EList<Message> value);
}