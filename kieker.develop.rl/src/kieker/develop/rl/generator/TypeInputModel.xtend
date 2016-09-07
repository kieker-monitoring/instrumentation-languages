package kieker.develop.rl.generator

class TypeInputModel<T> {
	val String header
	val String author
	val String version
	var T type
	
	new(String header, String author, String version, T type) {
		this.header = header
		this.author = author
		this.version = version
		this.type = type
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
	
	def T getType() {
		return type
	}
	
	def void setType(T type) {
		this.type = type
	}
}