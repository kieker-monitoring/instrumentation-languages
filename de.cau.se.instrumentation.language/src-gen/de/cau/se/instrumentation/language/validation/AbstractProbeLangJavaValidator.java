package de.cau.se.instrumentation.language.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractProbeLangJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.cau.se.instrumentation.language.probeLang.ProbeLangPackage.eINSTANCE);
		return result;
	}

}
