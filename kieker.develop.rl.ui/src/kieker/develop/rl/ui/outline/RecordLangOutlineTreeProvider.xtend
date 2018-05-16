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
package kieker.develop.rl.ui.outline

import kieker.develop.rl.recordLang.Constant
import kieker.develop.rl.recordLang.Property
import org.eclipse.emf.ecore.EObject
import kieker.develop.rl.recordLang.ModelType
import org.eclipse.xtext.ui.editor.outline.IOutlineNode

import static extension kieker.develop.rl.typing.TypeResolution.*

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class RecordLangOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider {
	
	// do not nest into property
	def boolean _isLeaf(Property feature) {
  		return true;
	}
	
	// do not nest into constant
	def boolean _isLeaf(Constant feature) {
  		return true;
	}
	
	protected override void _createChildren(IOutlineNode parentNode, EObject modelElement) {
		for (EObject childElement : modelElement.eContents()) {
			createNode(parentNode, childElement)
			if (childElement instanceof ModelType) {
				childElement.collectAllTypes.forEach[type |
					createNode(parentNode.children.last, type)
				]
				
			}
				
		}
	}
}
