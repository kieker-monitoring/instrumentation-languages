package de.cau.cs.se.instrumentation.al.modelhandling;

import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.mapping.MappingModel;
import org.eclipse.emf.ecore.resource.ResourceSet;

@SuppressWarnings("all")
public interface IModelMapper {
  public abstract MappingModel loadModel(final ApplicationModel model, final ResourceSet resourceSet);
  
  public abstract String name();
}
