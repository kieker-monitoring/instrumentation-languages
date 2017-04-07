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

import com.google.inject.Inject
import kieker.develop.al.aspectLang.ApplicationModelHandle
import kieker.develop.al.aspectLang.AspectLangPackage
import kieker.develop.al.modelhandling.ModelMapperProviderFactory
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 * 
 * @author Reiner Jung
 * 
 * @since 1.0
 */
class AspectLangValidator extends AbstractAspectLangValidator {
	
	@Inject
	ModelMapperProviderFactory modelMapperProviderFactory
	
	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkApplicationModel(ApplicationModelHandle model) {
		if (!modelMapperProviderFactory.provider.modelMappers.containsKey(model.handler)) {
			error('No model handler for ' + model.handler + ' registered.', 
					AspectLangPackage.Literals::APPLICATION_MODEL_HANDLE__HANDLER,
					INVALID_NAME)
		}					    	
	}
}
