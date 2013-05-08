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
import de.cau.cs.se.instrumentation.language.instrumentation.Record
import de.cau.cs.se.instrumentation.language.instrumentation.Model
import de.cau.cs.se.instrumentation.language.instrumentation.Property

class InstrumentationLanguageGenerator implements IGenerator {

    // FIXME be aware this function uses / for path separation
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(typeof(Record))) {
			fsa.generateFile((e.eContainer as Model).name.replace('.','/') + "/" + e.name.toFirstUpper + "Record.java",e.compile)
		}
	}
	
	def CharSequence compile(Record record) '''
		package «(record.eContainer as Model).name»;
		
		import kieker.common.record.AbstractMonitoringRecord;
		
		public class «record.name.toFirstUpper»Record extends AbstractMonitoringRecord 
		  implements IMonitoringRecord.Factory {
			
			private static final long serialVersionUID = 1L;
			private static final Class<?>[] TYPES = {
			    «FOR property : record.properties SEPARATOR ', '»«property.propertyType»«ENDFOR»
			};
			
			«FOR property : record.properties»«property.propertyDeclaration»«ENDFOR»
			«FOR property : record.properties»«property.propertyGetter»«ENDFOR»
			
			public «record.name.toFirstUpper»Record («FOR property : record.properties SEPARATOR ','»«property.constructorParameterDeclaration»«ENDFOR») {
				«FOR property : record.properties»«property.propertyInitialization»«ENDFOR»
			}
			
			public «record.name.toFirstUpper»Record (final Object[] values) {
			    AbstractMonitoringRecord.checkArray(values, «record.name.toFirstUpper»Record.TYPES);
			    «FOR property : record.properties»«property.propertyInitializationFromArray(record.properties.indexOf(property))»«ENDFOR»
			}
			
			@Override
			public Object[] toArray() {
				return new Object[] {
				    «FOR property : record.properties SEPARATOR ', '»this.«property.name»«ENDFOR»
				};
			}
			
			@Override
			public void initFromArray(Object[] values) {
				throw new UnsupportedOperationException();
			}
			
			@Override
			public Class<?>[] getValueTypes() {
				return «record.name.toFirstUpper»Record.TYPES.clone();
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
