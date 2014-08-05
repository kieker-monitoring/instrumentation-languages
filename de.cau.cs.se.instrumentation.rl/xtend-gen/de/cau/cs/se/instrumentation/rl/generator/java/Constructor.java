package de.cau.cs.se.instrumentation.rl.generator.java;

import de.cau.cs.se.instrumentation.rl.generator.java.EVisibility;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;

@SuppressWarnings("all")
public class Constructor {
  private String name;
  
  private EVisibility visibility;
  
  private Classifier[] signature;
  
  public Constructor(final String name, final EVisibility visibility, final Classifier[] signature) {
    this.name = name;
    this.visibility = visibility;
    this.signature = signature;
  }
  
  public String getName() {
    return this.name;
  }
  
  public EVisibility getVisibility() {
    return this.visibility;
  }
  
  public Classifier[] getSignature() {
    return this.signature;
  }
}
