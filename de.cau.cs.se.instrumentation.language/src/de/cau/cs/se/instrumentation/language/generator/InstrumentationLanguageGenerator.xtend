/*
 * MAMBA - Measurement Architecture for Model-Based Analysis
 *
 * http://http://se.informatik.uni-kiel.de/research/projects/mamba
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.se.instrumentation.language.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import de.cau.cs.se.instrumentation.language.instrumentation.Probe
import de.cau.cs.se.instrumentation.language.instrumentation.Model
import de.cau.cs.se.instrumentation.language.instrumentation.Property

class InstrumentationLanguageGenerator implements IGenerator {

    // FIXME be aware this function uses / for path separation
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(typeof(Probe))) {
			fsa.generateFile((e.eContainer as Model).name.replace('.','/') + "/" + e.name.toFirstUpper + "Record.java",e.compile)
		}
	}
	
	def CharSequence compile(Probe probe) '''
		package «(probe.eContainer as Model).name»;
		
		import kieker.common.record.AbstractMonitoringRecord;
		
		public class «probe.name.toFirstUpper»Record extends AbstractMonitoringRecord 
		  implements IMonitoringRecord.Factory {
			
			private static final long serialVersionUID = 1L;
			private static final Class<?>[] TYPES = {
			    «FOR property : probe.properties SEPARATOR ', '»«property.propertyType»«ENDFOR»
			};
			
			«FOR property : probe.properties»«property.propertyDeclaration»«ENDFOR»
			«FOR property : probe.properties»«property.propertyGetter»«ENDFOR»
			
			public «probe.name.toFirstUpper»Record («FOR property : probe.properties SEPARATOR ','»«property.constructorParameterDeclaration»«ENDFOR») {
				«FOR property : probe.properties»«property.propertyInitialization»«ENDFOR»
			}
			
			public «probe.name.toFirstUpper»Record (final Object[] values) {
			    AbstractMonitoringRecord.checkArray(values, «probe.name.toFirstUpper»Record.TYPES);
			    «FOR property : probe.properties»«property.propertyInitializationFromArray(probe.properties.indexOf(property))»«ENDFOR»
			}
			
			@Override
			public Object[] toArray() {
				return new Object[] {
				    «FOR property : probe.properties SEPARATOR ', '»this.«property.name»«ENDFOR»
				};
			}
			
			@Override
			public void initFromArray(Object[] values) {
				throw new UnsupportedOperationException();
			}
			
			@Override
			public Class<?>[] getValueTypes() {
				return «probe.name.toFirstUpper»Record.TYPES.clone();
			}
		}
	'''
	
	/**
	 * For the decprecated TYPES array
	 */
    def propertyType(Property property) '''
        private «property.type.class_.name».class
    '''
	
	/**
	 * Assignments in the record constructor
	 */
	def propertyInitialization(Property property) '''
		this.«property.name» = «property.name»;
	'''

    /**
     *  Assignments in the record constructor, values based initialization
     */
    def propertyInitializationFromArray(Property property, int number) '''
        this.«property.name» = («property.type.class_.name») values[«number»];
    '''

	/**
	 * Declarations for constructor parameters
	 */
	def constructorParameterDeclaration(Property property) '''«property.type.class_.name» «property.name»'''

	
	/**
	 * Generating a getter for a property
	 */
	def CharSequence propertyGetter(Property property) '''
		public «property.type.class_.name» get«property.name.toFirstUpper»() {
			return «property.name»;
		}
	'''

    /**
     * Property declaration in the record class
     */
	def CharSequence propertyDeclaration(Property property) '''
		private final «property.type.class_.name» «property.name»;
	'''

}
