package kieker.develop.rl.generator.java.junit

class NameResolver {
		/**
	 * Reconstruct the package name out of the record package name.
	 * kieker.common.record -> kieker.test.common.junit.record
	 * All other structures are converted by adding .junit to the package hierarchy
	 */
	def static createTestPackageName(String name) {
		if (name.contains("kieker.common.record")) 
			return name.replaceAll("kieker\\.common\\.record", "kieker.test.common.junit.record")
		else
			return name + ".junit"
	}
}