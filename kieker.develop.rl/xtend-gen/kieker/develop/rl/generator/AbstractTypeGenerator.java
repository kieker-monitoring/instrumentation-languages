package kieker.develop.rl.generator;

@SuppressWarnings("all")
public abstract class AbstractTypeGenerator {
  private String header;
  
  private String author;
  
  private String version;
  
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
  public abstract CharSequence getDirectoryName(final /* Type */Object type);
  
  /**
   * Return the complete filename of the file type this generator produces in correct
   * language format for the given record.
   */
  public abstract String getFileName(final /* Type */Object type);
  
  /**
   * Returns the outlet type for the generator.
   */
  public abstract String getOutletType();
  
  public void setAuthor(final String author) {
    this.author = author;
  }
  
  public String getAuthor() {
    return this.author;
  }
  
  public void setVersion(final String version) {
    this.version = version;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public void setHeader(final String header) {
    this.header = header;
  }
  
  public String getHeader() {
    return this.header;
  }
}
