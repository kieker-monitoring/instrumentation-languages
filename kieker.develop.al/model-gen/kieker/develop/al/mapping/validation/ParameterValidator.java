/**
 *
 * $Id$
 */
package kieker.develop.al.mapping.validation;

import kieker.develop.al.mapping.ParameterModifier;
import kieker.develop.al.mapping.TypeReference;

/**
 * A sample validator interface for {@link kieker.develop.al.mapping.Parameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParameterValidator {
	boolean validate();

	boolean validateModifier(ParameterModifier value);
	boolean validateType(TypeReference value);
}
