package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.recordLang.Type

abstract class AbstractTypeGenerator {
			
	/**
	 * Compute the directory name for a given type based on the package it belongs to.
	 * 
	 * @param type
	 * 		the type model
	 */
	def abstract CharSequence directoryName(Type type);
	
	/**
	 * Return the complete filename of the file type this generator produces in correct
	 * language format for the given record.
	 */
	def abstract String fileName(Type type);
		
	/**
	 * Returns the language type the generator supports.
	 */
	def abstract String getLanguageType();
		
}