package kieker.develop.rl.scoping;

import java.util.Collection;
import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.Semantics;

@SuppressWarnings("all")
public interface ISemanticAnnotationHandler {
  public abstract Collection<Annotation> getAnnotations();
  
  public abstract Semantics getSemantics();
}
