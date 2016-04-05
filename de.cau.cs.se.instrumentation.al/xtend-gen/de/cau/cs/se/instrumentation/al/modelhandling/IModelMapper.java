package kieker.tools.al.modelhandling;

import kieker.tools.al.aspectLang.ApplicationModel;
import kieker.tools.al.aspectLang.Technology;
import kieker.tools.al.mapping.MappingModel;
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
