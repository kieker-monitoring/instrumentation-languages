package de.cau.cs.se.instrumentation.rl.generator;

import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;

@SuppressWarnings("all")
public abstract class AbstractTypeGenerator {
  /**
   * Compute the directory name for a given type based on the package it belongs to.
   * 
   * @param type
   * 		the type model
   */
  public abstract CharSequence directoryName(final Type type);
  
  /**
   * Return the complete filename of the file type this generator produces in correct
   * language format for the given record.
   */
  public abstract String fileName(final Type type);
  
  /**
   * Convert a classifier into a primitive type for a
   * target language.
   * 
   * @param classifier
   * 		a classifier specifying a primitive type
   */
  public abstract CharSequence createTypeName(final Classifier classifier);
  
  /**
   * Returns the language type the generator supports.
   */
  public abstract String getLanguageType();
}
