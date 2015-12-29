package de.cau.cs.se.instrumentation.al.modelhandling;

import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Technology;
import de.cau.cs.se.instrumentation.al.mapping.MappingModel;
import java.util.Collection;
import org.eclipse.emf.ecore.resource.ResourceSet;

@SuppressWarnings("all")
public interface IModelMapper {
  /**
   * Load an application model and return a mapping model.
   * 
   * @param model an application model reference
   * @param resourceSet the resource set for the model
   * 
   * @returns a mapping model
   */
  public abstract MappingModel loadModel(final ApplicationModel model, final ResourceSet resourceSet);
  
  /**
   * Return the name of the extension to be used in the language.
   */
  public abstract String name();
  
  /**
   * Returns a collection of technologies for the target level
   * of the transformation processing the application model.
   */
  public abstract Collection<Technology> targetTechnologies();
}
