/**
 *
 * $Id$
 */
package frameweb.validation;

import frameweb.DAOInterface;
import frameweb.ServiceClass;

/**
 * A sample validator interface for {@link frameweb.DAOServiceAssociation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DAOServiceAssociationValidator {
	boolean validate();

	boolean validateSourceDAOClass(DAOInterface value);
	boolean validateTargetDAOService(ServiceClass value);
}