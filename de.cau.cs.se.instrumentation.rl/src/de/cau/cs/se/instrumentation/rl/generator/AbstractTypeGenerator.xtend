package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.recordLang.Type

abstract class AbstractTypeGenerator {
	
	/**
	 * Return the unique id of the generator.
	 */
	def abstract String getId()
			
	/**
	 * Compute the directory name for a given type based on the package it belongs to.
	 * 
	 * @param type
	 * 		the type model
	 */
	def abstract CharSequence getDirectoryName(Type type)
	
	/**
	 * Return the complete filename of the file type this generator produces in correct
	 * language format for the given record.
	 */
	def abstract String getFileName(Type type)
		
	/**
	 * Returns the outlet type for the generator.
	 */
	def abstract String getOutletType()
			
}