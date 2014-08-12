package de.cau.cs.se.instrumentation.rl.generator

import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier

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
	 * Convert a classifier into a primitive type for a
	 * target language.
	 * 
	 * @param classifier
	 * 		a classifier specifying a primitive type
	 */
	def abstract CharSequence createTypeName(Classifier classifier);
	
	/**
	 * Returns the language type the generator supports.
	 */
	def abstract String getLanguageType();
		
}