/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package asmeta.terms.furtherterms.validation;

import asmeta.terms.basicterms.Term;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link asmeta.terms.furtherterms.CaseTerm}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CaseTermValidator {
	boolean validate();

	boolean validateComparingTerm(EList<Term> value);
	boolean validateComparedTerm(Term value);
	boolean validateOtherwiseTerm(Term value);
	boolean validateResultTerms(EList<Term> value);
}
