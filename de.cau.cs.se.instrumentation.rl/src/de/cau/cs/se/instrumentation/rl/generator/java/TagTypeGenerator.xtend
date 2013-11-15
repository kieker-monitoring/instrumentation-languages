package de.cau.cs.se.instrumentation.rl.generator.java

import de.cau.cs.se.instrumentation.rl.generator.AbstractTagTypeGenerator
import de.cau.cs.se.instrumentation.rl.recordLang.Type
import de.cau.cs.se.instrumentation.rl.recordLang.TagType
import java.io.File
import de.cau.cs.se.instrumentation.rl.recordLang.Model

class TagTypeGenerator extends AbstractTagTypeGenerator {
	
	override createContent(TagType type, String author, String version) {
		'''
		/***************************************************************************
		 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
		 *
		 * Licensed under the Apache License, Version 2.0 (the "License");
		 * you may not use this file except in compliance with the License.
		 * You may obtain a copy of the License at
		 *
		 *     http://www.apache.org/licenses/LICENSE-2.0
		 *
		 * Unless required by applicable law or agreed to in writing, software
		 * distributed under the License is distributed on an "AS IS" BASIS,
		 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		 * See the License for the specific language governing permissions and
		 * limitations under the License.
		 ***************************************************************************/
		
		package «(type.eContainer as Model).name»;
		
		import java.nio.BufferOverflowException;
		import java.nio.BufferUnderflowException;
		import java.io.UnsupportedEncodingException;
		import java.nio.ByteBuffer;

		import kieker.common.record.AbstractMonitoringRecord;
		import kieker.common.record.IMonitoringRecord;
		import kieker.common.util.registry.IRegistry;
		
		/**
		 * @author «author»
		 * 
		 * @since «version»
		 */
		public interface «type.name»«if (type.parents!=null && type.parents.size>0) 'extends ' + type.parents.map[t | t.name].join(', ')» {
			// Marker interface		
		}
		'''
	}
		
	/**
	 * Compute the directory name for a record type.
	 */
	override directoryName(Type type) '''java«File::separator»«(type.eContainer as Model).name.replace('.',File::separator)»'''

	override fileName(Type type) '''«type.directoryName»«File::separator»«type.name».java'''
	

}