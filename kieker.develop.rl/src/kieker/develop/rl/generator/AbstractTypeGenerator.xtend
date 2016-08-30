package kieker.develop.rl.generator

import kieker.develop.rl.recordLang.Type

abstract class AbstractTypeGenerator {
	
	var String header
	var String author
	var String version
	
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
	
	
	def void setAuthor(String author) {
		this.author = author
	}
	
	def String getAuthor() {
		return author
	}
	
	def void setVersion (String version) {
		this.version = version
	}
	
	def String getVersion() {
		return version
	}
	
	def void setHeader (String header) {
		this.header = header
	}
	
	def String getHeader() {
		return header
	}
				
}