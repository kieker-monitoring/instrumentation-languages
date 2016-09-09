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
package kieker.develop.rl.ui.labeling

import com.google.inject.Inject
import kieker.develop.rl.recordLang.ArrayLiteral
import kieker.develop.rl.recordLang.BooleanLiteral
import kieker.develop.rl.recordLang.Classifier
import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.EventType
import kieker.develop.rl.recordLang.FloatLiteral
import kieker.develop.rl.recordLang.IntLiteral
import kieker.develop.rl.recordLang.Model
import kieker.develop.rl.recordLang.ModelSubType
import kieker.develop.rl.recordLang.ModelType
import kieker.develop.rl.recordLang.Property
import kieker.develop.rl.recordLang.StringLiteral
import kieker.develop.rl.recordLang.TemplateType
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class RecordLangLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	def text(Property e) {
		e.name + ' : ' + e.type.text
	}
	
	def text(StringLiteral e) {
		'\'' + e.value + '\''
	}
	
	def text(IntLiteral e) {
		e.value
	}
	
	def text(ArrayLiteral e) {
		'array'
	}
	
	def text(FloatLiteral e) {
		e.value
	}
	
	def text(BooleanLiteral e) {
		if (e.value) 'true' else 'false'
	}
	
	def text(Classifier e) {
		e.type.name + e.sizes.map['[' + (if (it.size != 0) it.size else '') + ']'].join
	}
	
	def text(ModelType e) {
		e.name + " (" + e.collectAllTypes.size + ")"
	}
	
	
	def text(ModelSubType e) {
		e.name + " -> " + e.modelType.name
	}
	
	def image(Property e) {
		'property.gif'
	}
	
	def image(Constant e) {
		'constant.gif'
	}
	
	def image(EventType e) {
		'record.png'
	}
	
	def image(TemplateType e) {
		'template.png'
	}
	
	def image(Model e) {
		'package.gif'
	}
	
	def image(ModelType e) {
		'model-types.png'
	}
	
	def image(ModelSubType e) {
		'model-sub-types.png'
	}
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
