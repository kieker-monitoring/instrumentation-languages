/** 
 * Copyright (C) 2022 OceanDSL (https://oceandsl.uni-kiel.de)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.oceandsl.kieker.architecture.viz

import analysismodel.assembly.AssemblyComponent
import analysismodel.assembly.AssemblyModel
import analysismodel.assembly.AssemblyProvidedInterface
import analysismodel.assembly.impl.EStringToAssemblyProvidedInterfaceMapEntryImpl
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import java.util.Collection
import java.util.HashMap
import java.util.Map
import javax.inject.Inject
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeType
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide

/** 
 * @author Reiner Jung
 */
class KiekerArchitectureDiagramSynthesis extends AbstractDiagramSynthesis<AssemblyModel> {
	
	@Inject
    extension KNodeExtensions
    
    @Inject
    extension KEdgeExtensions
    
    @Inject
    extension KRenderingExtensions
        
    @Inject
    extension KContainerRenderingExtensions
    
    @Inject
    extension KPolylineExtensions
    
    @Inject
    extension KColorExtensions
    
    /** String constants. */
	static val String ALGORITHM_NAME = "Used Layout Algorithm"
	

    /**
     * Select algorithm
     */
    static val SynthesisOption ALGORITHM = SynthesisOption::createChoiceOption(ALGORITHM_NAME,
       ImmutableList::of(DiagramLayoutOptions.ELK_LAYERED, 
       	DiagramLayoutOptions.GRAPHVIZ_CIRCO, 
       	DiagramLayoutOptions.GRAPHVIZ_DOT, 
       	DiagramLayoutOptions.OGDF_PLANARIZATION, 
       	DiagramLayoutOptions.OGDF_CIRCULAR,
       	"org.eclipse.elk.conn.gmf.layouter.Draw2D",
       	"org.eclipse.elk.box",
       	"org.eclipse.elk.disco",
       	"org.eclipse.elk.fixed",
       	"org.eclipse.elk.force",
       	"org.eclipse.elk.mrtree",
       	"org.eclipse.elk.radial",
       	"org.eclipse.elk.random",
       	"org.eclipse.elk.rectpacking",
       	"org.eclipse.elk.sporeCompaction",
       	"org.eclipse.elk.sporeOverlap",
       	"org.eclipse.elk.stress",
       	"org.eclipse.elk.graphviz.fdp",
       	"org.eclipse.elk.graphviz.neato",
       	"org.eclipse.elk.graphviz.twopi"
       ), DiagramLayoutOptions.ELK_LAYERED)
 
    /**
     * Option choose the reference depth while determining the classes related to the selected ones.
     */
    static val SynthesisOption SHOW_PORT_LABELS = SynthesisOption::createCheckOption("Show port labels", false);
		
   
    /**
     * {@inheritDoc}<br>
     * <br>
     * Registers the diagram filter option declared above, which allow users to tailor the constructed diagrams.
     */
    override getDisplayedSynthesisOptions() {
        return ImmutableList::of(ALGORITHM, KiekerArchitectureDiagramSynthesis.SHOW_PORT_LABELS)
    }
    
	
	override KNode transform(AssemblyModel model) {
		return createNode() => [
            it.addLayoutParam(CoreOptions::ALGORITHM, ALGORITHM.objectValue as String)
            it.addLayoutParam(CoreOptions::SPACING_NODE_NODE, 75.0)
            it.addLayoutParam(CoreOptions::DIRECTION, Direction::UP)
            
            createAssemblyComponents(it, model.assemblyComponents.values)
        ]
	}
		
	def createAssemblyComponents(KNode node, Collection<AssemblyComponent> components) {
		val map = new HashMap<AssemblyComponent, KNode>
		components.forEach[component |
			val componentNode = component.createAssemblyComponent
			node.children += componentNode
			map.put(component, componentNode)
		]
		components.forEach[connectAssemblyComponent(it, map)]
	}
				
	def createAssemblyComponent(AssemblyComponent component) {
		return component.createNode().associateWith(component) => [
			component.providedInterfaces.values.forEach[providedInterface, i |
				it.ports += createPort(PortSide.SOUTH, providedInterface, i)
			]
        	it.addRectangle => [
        		it.lineWidth = 2
                it.setBackgroundGradient("white".color, "LemonChiffon".color, 0)
                it.shadow = "black".color
                it.setGridPlacement(1).from(LEFT, 15, 0, TOP, 15, 0).to(RIGHT, 15, 0, BOTTOM, 15, 0)
                                
                it.addText("<<Component>>") => [
                    it.fontSize = 13;
                    it.fontItalic = true;
                    it.verticalAlignment = V_CENTRAL;
                    it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 10, 0).to(RIGHT, 20, 0, BOTTOM, 1, 0.5f);
                ]
                it.addText(component.componentType.signature).associateWith(component) => [
                    it.fontSize = 15;
                    it.fontBold = true;
                    it.cursorSelectable = false;
                    it.setAreaPlacementData.from(LEFT, 20, 0, TOP, 1, 0.5f).to(RIGHT, 20, 0, BOTTOM, 10, 0);
                ]
			]
		]
	}
		
	def KPort createPort(PortSide portSide, AssemblyProvidedInterface providedInterface, int index) {
		val port = KGraphUtil.createInitializedPort()
        
        port.setSize(20, 20)
        port.setProperty(CoreOptions.PORT_SIDE, portSide)
        port.setProperty(CoreOptions.PORT_INDEX, index)
        port.setProperty(CoreOptions.PORT_BORDER_OFFSET, -10.0)
        port.associateWith(providedInterface)
            	            
        val rectangle = KRenderingFactory.eINSTANCE.createKRectangle()
        port.getData().add(rectangle)
        setForegroundInvisible(rectangle, true)
        setBackground(rectangle, getColor("#ffffff"))
        setForeground(rectangle, getColor("#000000"))
        
        if (SHOW_PORT_LABELS.booleanValue) {
        	val label = KGraphUtil.createInitializedLabel(port)
        	label.text = providedInterface.providedInterfaceType.signature
        	label.setProperty(CoreOptions.PORT_LABELS_PLACEMENT, PortLabelPlacement.outside)
        }
        
        return port
	}
	
	def connectAssemblyComponent(AssemblyComponent component, Map<AssemblyComponent, KNode> map) {
		component.requiredInterfaces.forEach[requiredInterface |
			val providedInterface = requiredInterface.requires
			val providedComponent = (providedInterface.eContainer as EStringToAssemblyProvidedInterfaceMapEntryImpl).
				eContainer as AssemblyComponent
			val providedKNode = map.get(providedComponent)				
			val port = providedKNode.ports.findFirst[
				it.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) === providedInterface
			]
			new Pair(component, providedInterface).createEdge() => [
	            it.addLayoutParam(CoreOptions::EDGE_TYPE, EdgeType::DIRECTED)
	            it.source = component.node
	            it.target = providedKNode
				it.targetPort = port

	            it.data addPolyline() => [
	                it.lineWidth = 2;
	                it.foreground = "gray25".color
	                it.addHeadArrowDecorator
	            ]          
	        ]
		]
	}
			
}
