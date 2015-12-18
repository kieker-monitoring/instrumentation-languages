/**
 *
 * $Id$
 */
package de.cau.cs.se.instrumantation.model.structure.validation;

import de.cau.cs.se.instrumantation.model.structure.Type;

/**
 * A sample validator interface for {@link de.cau.cs.se.instrumantation.model.structure.TypeReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TypeReferenceValidator {
	boolean validate();

	boolean validateType(Type value);
}