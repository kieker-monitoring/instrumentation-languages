package kieker.tools.rl.generator;

import kieker.tools.rl.recordLang.Type;

@SuppressWarnings("all")
public abstract class AbstractTypeGenerator {
  /**
   * Return the unique id of the generator.
   */
  public abstract String getId();
  
  /**
   * Compute the directory name for a given type based on the package it belongs to.
   * 
   * @param type
   * 		the type model
   */
  public abstract CharSequence getDirectoryName(final Type type);
  
  /**
   * Return the complete filename of the file type this generator produces in correct
   * language format for the given record.
   */
  public abstract String getFileName(final Type type);
  
  /**
   * Returns the outlet type for the generator.
   */
  public abstract String getOutletType();
}
