/**
 *
 * $Id$
 */
package de.cau.cs.se.instrumantation.model.structure.validation;

import de.cau.cs.se.instrumantation.model.structure.OperationModifier;
import de.cau.cs.se.instrumantation.model.structure.Parameter;
import de.cau.cs.se.instrumantation.model.structure.TypeReference;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.cau.cs.se.instrumantation.model.structure.Operation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationValidator {
	boolean validate();

	boolean validateReturnType(TypeReference value);
	boolean validateParameters(EList<Parameter> value);
	boolean validateModifier(OperationModifier value);
}