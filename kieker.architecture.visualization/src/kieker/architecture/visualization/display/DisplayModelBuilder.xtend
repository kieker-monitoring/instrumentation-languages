/***************************************************************************
 * Copyright 2022 Kieker Project (http://kieker-monitoring.net)
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
package kieker.architecture.visualization.display

import java.util.Collection
import kieker.model.analysismodel.assembly.AssemblyComponent
import kieker.model.analysismodel.execution.ExecutionModel
import org.eclipse.core.runtime.Path
import org.eclipse.core.resources.ResourcesPlugin

/**
 * Generating a display model from the architecture model.
 * 
 * @author Reiner Jung
 * @since 1.3.0
 */
class DisplayModelBuilder {
		
	def create(Collection<AssemblyComponent> assemblyComponents, ExecutionModel executionModel) {
		val workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		val uri = executionModel.eResource.URI
		val resource = workspaceRoot.getFile(new Path(uri.toPlatformString(true)))
		
		val operationCalls = executionModel.invocations.values
		val storageDataflows = executionModel.storageDataflows.values
		val operationDataflows = executionModel.operationDataflows.values
		
		val componentCreator = new DisplayModelComponentCreator(resource, assemblyComponents, operationCalls, storageDataflows, operationDataflows)		
		val components = componentCreator.create()
				
		val componentLinker = new DisplayModelLinker(resource, componentCreator, components)
		componentLinker.link
		
		val componentLinkMover = new DisplayModelLinkMover(resource, components)
		componentLinkMover.moveUp()
					
		return components
	}
}

