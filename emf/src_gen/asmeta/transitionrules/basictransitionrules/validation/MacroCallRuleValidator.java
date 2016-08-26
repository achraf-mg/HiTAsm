/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package asmeta.transitionrules.basictransitionrules.validation;

import asmeta.terms.basicterms.Term;

import asmeta.transitionrules.basictransitionrules.MacroDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link asmeta.transitionrules.basictransitionrules.MacroCallRule}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MacroCallRuleValidator {
	boolean validate();

	boolean validateCalledMacro(MacroDeclaration value);
	boolean validateParameters(EList<Term> value);
}
