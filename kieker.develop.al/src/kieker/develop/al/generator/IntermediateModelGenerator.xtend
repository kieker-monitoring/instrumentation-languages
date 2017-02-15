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
import java.util.ArrayList
import java.util.Collection
import kieker.develop.al.aspectLang.AspectModel
import kieker.develop.al.aspectLang.CompositionQuery
import kieker.develop.al.aspectLang.ContainerNode
import kieker.develop.al.aspectLang.LocationQuery
import kieker.develop.al.aspectLang.ParentNode
import kieker.develop.al.aspectLang.Pointcut
import kieker.develop.al.aspectLang.SubPathNode
import kieker.develop.al.aspectLang.WildcardNode
import kieker.develop.al.intermediate.AbstractJoinpoint
import kieker.develop.al.intermediate.IntermediateFactory
import kieker.develop.al.intermediate.IntermediateModel
import kieker.develop.al.mapping.Container
import kieker.develop.al.mapping.Feature
import kieker.develop.al.modelhandling.ModelMapperProviderFactory
import kieker.develop.rl.generator.InternalErrorException
import kieker.develop.semantics.annotations.Technology
import org.eclipse.emf.common.util.EList

/**
 * Generate the intermediate model.
 */
class IntermediateModelGenerator implements IGenerator<AspectModel, IntermediateModel> {
	
	val modelMapperProviderFactory = ModelMapperProviderFactory.createInstance
	
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
	
	/**
	 * Create for a pointcut a set of joinpoints and add them to the result list.
	 * 
	 * @param list the result list
	 * @param pointcut the pointcut
	 */
	private def void createJoinpoints(EList<AbstractJoinpoint> joinpoints, Pointcut pointcut) {
		if (pointcut.annotation != null) {
			if ("technology".equals(pointcut.annotation.name)) {
				collectDestinationNodes(pointcut).forEach[joinpoints.add(it.findTargetLevelNode(pointcut.name, pointcut.annotation.technologies))]
			}
		} else {
			collectDestinationNodes(pointcut).forEach[joinpoints.add(it.findTargetLevelNode(pointcut.name, new ArrayList<Technology>))]
		}
	}
	
	/**
	 * Create an abstract joinpoints for EObject or Object 
	 * 
	 * @param container model element which represents the joinpoint
	 * @param name the name of the pointcut
	 * @param technologies collection of technologies specified in the configuration (used as default)
	 * 
	 * @returns an AbstractJoinpoint
	 */
	private def AbstractJoinpoint findTargetLevelNode(Container container, String name, Collection<Technology> technologies) {
		val joinpoint = IntermediateFactory.eINSTANCE.createModelJoinpoint
		
		joinpoint.name = name + "_" + container.name
		
		joinpoint.referencedInstance = container.predecessor // Note predecessor is the element of the mapped model.
		// TODO technologies should be inferred from the target level model
		joinpoint.technologies.addAll(technologies)
		
		return joinpoint
	}
	
	/**
	 * Infer all destination nodes related to this pointcut. 
	 */
	private def collectDestinationNodes(Pointcut pointcut) {
		val containers = new ArrayList<Container>
		
		val modelMapper = modelMapperProviderFactory.provider.modelMappers.get(pointcut.model.handler)
		val mappingModel = modelMapper.loadModel(pointcut.model, pointcut.eResource.resourceSet)
		
		containers.collectLocationNodes(pointcut.location, mappingModel.contents)
		
		println(">> destination nodes")
		containers.forEach[println("Found " + it.fullyQualifiedName)]
		println("<<")
		
		return containers
	}
	
	def static String fullyQualifiedName(Container container) {
		if (container.eContainer instanceof Container) {
			(container.eContainer as Container).fullyQualifiedName + "." container.name
		} else
			container.name
	}
			
	/**
	 * 
	 */
	private def void collectLocationNodes(Collection<Container> results, LocationQuery location, Collection<Container> state) {
		val collectedContainers = new ArrayList<Container>
		
		switch(location.node) {
			SubPathNode: {		
				state.forEach[if (it.matchSubPathNodeSuffix(location)) collectedContainers.add(it)]
				results.collectLocationNodes(location, collectedContainers)
			}
			WildcardNode: {
				state.forEach[collectedContainers.add(it)]
				results.collectLocationChildNodes(location, collectedContainers)
			}
			ParentNode: {		
				if (state.forall[it.eContainer instanceof Container]) {
					state.forEach[collectedContainers.addUnique(it.eContainer as Container)]
					results.collectLocationChildNodes(location, collectedContainers)	
				} else {
					throw new InternalErrorException("All parents of a set of containers on the same hierarchy level must have the same kind of parent.")
				}
			} 
			ContainerNode: {
				val node = state.findFirst[(location.node as ContainerNode).container.equals(it)]
				if (node != null) {
					if (node.contents.size > 0) {
						collectedContainers.addAll(node.contents)
						results.collectLocationChildNodes(location, collectedContainers)
					} else {
						results.add(node)
					}
				}
			}
		}
	}
	

	
	/**
	 * 
	 */
	private def void collectLocationNodes(Collection<Container> containers, CompositionQuery location, Collection<Container> state) {
		// TODO missing implementation
	}
	
	
	/**
	 * Move one to the next path segment of a location query and assess
	 * the next level of container elements.
	 * 
	 * @param results collection of the resulting locations
	 * @param location the present location path segment
	 * @param collectedContainers containers matching the present location
	 */
	private def void collectLocationChildNodes(Collection<Container> results, LocationQuery location, Collection<Container> collectedContainers) {
		if (location.specialization != null)
			results.collectLocationNodes(location.specialization, collectedContainers)
		else if (location.composition != null)
			results.collectLocationNodes(location.composition, collectedContainers)
		else
			results.addAll(collectedContainers)
	}

	
	/**
	 * Check whether there is a child of the container which matches the next level of the
	 * query, which must be either an ContainerNode or a set of ContainerNodes.
	 * 
	 * @param container the context container
	 * @param query the present query
	 * 
	 * @returns return true in case the suffix matches
	 */
	private def boolean matchSubPathNodeSuffix(Container container, LocationQuery query) {
		if (query.specialization != null) {
			if (query.specialization.node instanceof ContainerNode) {
				return container.pathContainsSuffix((query.specialization.node as ContainerNode).container)
			} else {
				throw new InternalErrorException("A SubPathNode must be followed by a ContainerNode or null, but was followed by " + query.specialization.node.class)
			}
		} else if (query.composition != null) {
			// TODO composition
			return false
		} else
			return false
	}
	
	/**
	 * Check whether the given feature is present in at least on path originating from the elements in the list.
	 * 
	 * @param container path start point
	 * @param feature matching feature suffix
	 * 
	 * @returns true in case on path is found
	 */
	private def boolean pathContainsSuffix(Container container, Feature feature) {
		container.contents.exists[it.equals(feature) || it.pathContainsSuffix(feature)]
	}
	
	/**
	 * Add an container only if it is not already existing in the collection.
	 * 
	 * @param containers collection of containers
	 * @param container the object to be added to the collection
	 */
	private def addUnique(Collection<Container> containers, Container container) {
		if (!containers.contains(container))
			containers.add(container)
	}
	
}