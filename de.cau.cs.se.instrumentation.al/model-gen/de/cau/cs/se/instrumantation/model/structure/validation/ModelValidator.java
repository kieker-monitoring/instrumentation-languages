/**
 *
 * $Id$
 */
package de.cau.cs.se.instrumantation.model.structure.validation;

import de.cau.cs.se.instrumantation.model.structure.Type;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link de.cau.cs.se.instrumantation.model.structure.Model}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ModelValidator {
	boolean validate();

	boolean validateTypes(EList<Type> value);
}