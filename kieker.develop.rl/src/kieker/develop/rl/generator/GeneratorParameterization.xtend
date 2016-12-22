package kieker.develop.rl.generator

class GeneratorParameterization {
	val String header
	val String author
	val String version
	
	new(String header, String author, String version) {
		this.header = header
		this.author = author
		this.version = version
	}
	
	def String getHeader() {
		return header
	}
	
	def String getAuthor() {
		return author
	}
	
	def String getVersion() {
		return version
	}
	
}