/***************************************************************************
 * Copyright 2017 Kieker Project (http://kieker-monitoring.net)
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
package kieker.develop.al.ui.labeling

import com.google.inject.Inject
import kieker.develop.al.aspectLang.Aspect
import kieker.develop.al.aspectLang.ContainerNode
import kieker.develop.al.mapping.NamedElement
import kieker.develop.al.aspectLang.WildcardNode
import kieker.develop.al.aspectLang.SubPathNode
import kieker.develop.al.aspectLang.LocationQuery
import kieker.develop.al.aspectLang.Collector
import kieker.develop.al.aspectLang.Pointcut

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class AspectLangLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

		def text(Aspect e) { 'aspect' }
	
		def text(ContainerNode e) {
			if (e.container instanceof NamedElement)
				e.container.name
			else
				'''Container is of type «e.container.class.name»'''
		}
		
		def text (WildcardNode e) { '*' }
		
		def text (SubPathNode e) { '**' }
		
		def text(Pointcut e) { 'pointcut' + e.name }
		def text(LocationQuery e) { 'path' }
		 
		def text (Collector e) { // TODO this is most likely broken
			//e.type.name + " " + e.insertionPoint.toString
		}
	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
