package de.cau.cs.se.instrumentation.rl.generator;

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
   * Returns the outlet type for the generator.
   */
  public abstract String outletType();
}
