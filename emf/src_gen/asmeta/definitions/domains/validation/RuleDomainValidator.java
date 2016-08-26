/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package asmeta.definitions.domains.validation;

import asmeta.definitions.domains.Domain;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link asmeta.definitions.domains.RuleDomain}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RuleDomainValidator {
	boolean validate();

	boolean validateDomains(EList<Domain> value);
}
