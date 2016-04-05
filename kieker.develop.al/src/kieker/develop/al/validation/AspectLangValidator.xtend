/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.al.validation

import org.eclipse.xtext.validation.Check
import kieker.develop.al.aspectLang.ApplicationModel
import org.eclipse.core.runtime.Platform
import kieker.develop.al.modelhandling.IModelMapper
import kieker.develop.al.aspectLang.AspectLangPackage
import org.eclipse.core.runtime.CoreException

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AspectLangValidator extends AbstractAspectLangValidator {
	
	private static final String MODEL_MAPPER = "kieker.develop.al.modelMapping"

	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkApplicationModel(ApplicationModel model) {
		val registry = Platform.getExtensionRegistry()
		val config = registry.getConfigurationElementsFor(MODEL_MAPPER)
  		try {
  			val handlerPresent = config.exists[element |
  				val ext = element.createExecutableExtension("class")
  				if (ext instanceof IModelMapper) {
	          		(ext as IModelMapper).name.equals(model.handler)
	          	} else
	          		false
  			]
  			if (!handlerPresent)
	  			error('No model handler for ' + model.handler + ' registered.', 
					AspectLangPackage$Literals::APPLICATION_MODEL__HANDLER,
					INVALID_NAME)
  		} catch (CoreException ex) {
			System.out.println(ex.getMessage())
		} 
					    	
	}
}
