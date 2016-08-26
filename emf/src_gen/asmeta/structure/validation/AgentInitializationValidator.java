/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package asmeta.structure.validation;

import asmeta.definitions.domains.Domain;

import asmeta.structure.Initialization;

import asmeta.transitionrules.basictransitionrules.MacroCallRule;
import asmeta.transitionrules.basictransitionrules.Rule;

/**
 * A sample validator interface for {@link asmeta.structure.AgentInitialization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AgentInitializationValidator {
	boolean validate();

	boolean validateProgram(MacroCallRule value);

	boolean validateProgram(Rule value);
	boolean validateDomain(Domain value);
	boolean validateInitialState(Initialization value);
}
