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
package kieker.develop.al.generator

import de.cau.cs.se.geco.architecture.framework.IGenerator
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.al.intermediate.IntermediateFactory
import org.eclipse.emf.common.util.EList
import kieker.develop.al.intermediate.AbstractJoinpoint
import kieker.develop.al.aspectLang.Pointcut
import kieker.develop.semantics.annotations.Technology

/**
 * Generate the intermediate model.
 */
class IntermediateModelGenerator implements IGenerator<AspectModel, IntermediateModel> {
	
	override generate(AspectModel input) {
		val result = IntermediateFactory.eINSTANCE.createIntermediateModel
		
		input.aspects.forEach[aspect |
			val resultAspect = IntermediateFactory.eINSTANCE.createIntermediateAspect
			
			resultAspect.advices.addAll(aspect.advices)
			resultAspect.joinpoints.createJoinpoints(aspect.pointcut)
			
			result.aspects += resultAspect
		]
		
		return result
	}
	
	private def void createJoinpoints(EList<AbstractJoinpoint> list, Pointcut pointcut) {
		val annotation = pointcut.annotation
		if ("technology".equals(annotation.name)) {
			annotation.technologies.forEach[technology |
				list.addJoinpointsForTechnology(pointcut, technology)
			]
		}
	}
	
	private def void addJoinpointsForTechnology(EList<AbstractJoinpoint> list, Pointcut pointcut, Technology technology) {
		
	}
	
}