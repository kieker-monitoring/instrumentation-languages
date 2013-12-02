package de.cau.cs.se.instrumentation.rl.generator;

import de.cau.cs.se.instrumentation.rl.generator.AbstractTypeGenerator;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;

@SuppressWarnings("all")
public abstract class AbstractPartialRecordTypeGenerator extends AbstractTypeGenerator {
  /**
   * Primary code generation template.
   * 
   * @params type
   * 		one record type to be used to create monitoring record
   * @params author
   * 		generic author name for the record
   * @params version
   * 		generic kieker version for the record
   */
  public abstract CharSequence createContent(final PartialRecordType type, final String author, final String version);
  
  /**
   * Convert a classifier into a primitive type for a
   * target language.
   * 
   * @param classifier
   * 		a classifier specifying a primitive type
   */
  public abstract CharSequence createTypeName(final Classifier classifier);
}
