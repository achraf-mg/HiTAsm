/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package asmeta.structure.validation;

import asmeta.structure.Asm;
import asmeta.structure.ExportClause;
import asmeta.structure.ImportClause;
import asmeta.structure.Signature;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link asmeta.structure.Header}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HeaderValidator {
	boolean validate();

	boolean validateImportClause(EList<ImportClause> value);
	boolean validateSignature(Signature value);
	boolean validateExportClause(ExportClause value);
	boolean validateAsm(Asm value);
}
