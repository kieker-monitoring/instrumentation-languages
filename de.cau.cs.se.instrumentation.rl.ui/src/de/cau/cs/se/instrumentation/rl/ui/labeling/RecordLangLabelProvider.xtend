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
package de.cau.cs.se.instrumentation.rl.ui.labeling

import com.google.inject.Inject

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class RecordLangLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	def text(de.cau.cs.se.instrumentation.rl.recordLang.Property e) {
		e.name + ' : ' + e.type.text
	}
	
	def text(de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral e) {
		'\'' + e.value + '\''
	}
	
	def text(de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral e) {
		e.value
	}
	
	def text(de.cau.cs.se.instrumentation.rl.recordLang.ArrayLiteral e) {
		'array'
	}
	
	def text(de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral e) {
		e.value
	}
	
	def text(de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral e) {
		if (e.value) 'true' else 'false'
	}
	
	def text(de.cau.cs.se.instrumentation.rl.recordLang.Classifier e) {
		e.class_.name + e.sizes.map['[' + (if (it.size != 0) it.size else '') + ']'].join
	}
	
	def image(de.cau.cs.se.instrumentation.rl.recordLang.Property e) {
		'property.gif'
	}
	
	def image(de.cau.cs.se.instrumentation.rl.recordLang.Constant e) {
		'constant.gif'
	}
	
	def image(de.cau.cs.se.instrumentation.rl.recordLang.RecordType e) {
		'record.png'
	}
	
	def image(de.cau.cs.se.instrumentation.rl.recordLang.TemplateType e) {
		'template.png'
	}
	
	def image(de.cau.cs.se.instrumentation.rl.recordLang.Model e) {
		'package.gif'
	}
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
