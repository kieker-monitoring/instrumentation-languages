/*
 * generated by Xtext
 */
package kieker.tools.rl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractRecordLangValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(kieker.tools.rl.recordLang.RecordLangPackage.eINSTANCE);
		return result;
	}
}
