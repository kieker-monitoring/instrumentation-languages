package kieker.develop.semantics;

import java.util.Collection;
import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.Implementation;
import kieker.develop.semantics.annotations.TargetLanguage;
import kieker.develop.semantics.annotations.Technology;

@SuppressWarnings("all")
public interface ISemanticExtension {
  public abstract Collection<Annotation> getAnnotations();
  
  public abstract Collection<Technology> getTechnologies();
  
  public abstract Collection<TargetLanguage> getTargetLanguages();
  
  public abstract Implementation getImplementation(final Annotation semantics, final Technology technology, final TargetLanguage language);
}
