/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package asmeta.structure.validation;

import asmeta.definitions.DynamicFunction;

import asmeta.structure.Initialization;

import asmeta.terms.basicterms.Term;
import asmeta.terms.basicterms.VariableTerm;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link asmeta.structure.FunctionInitialization}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FunctionInitializationValidator {
	boolean validate();

	boolean validateInitialState(Initialization value);
	boolean validateBody(Term value);
	boolean validateInitializedFunction(DynamicFunction value);
	boolean validateVariable(EList<VariableTerm> value);
}
