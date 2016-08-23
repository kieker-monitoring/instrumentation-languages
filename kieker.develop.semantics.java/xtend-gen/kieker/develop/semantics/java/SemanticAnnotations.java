package kieker.develop.semantics.java;

import java.util.Collection;
import kieker.develop.semantics.ISemanticExtension;
import kieker.develop.semantics.annotations.Annotation;
import kieker.develop.semantics.annotations.AnnotationsFactory;
import kieker.develop.semantics.annotations.Implementation;
import kieker.develop.semantics.annotations.Semantics;
import kieker.develop.semantics.annotations.TargetLanguage;
import kieker.develop.semantics.annotations.Technology;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SemanticAnnotations implements ISemanticExtension {
  private Semantics model;
  
  public SemanticAnnotations() {
    Semantics _createSemantics = AnnotationsFactory.eINSTANCE.createSemantics();
    this.model = _createSemantics;
    final Procedure1<Semantics> _function = (Semantics it) -> {
      final TargetLanguage language = this.createLanguage("Java");
      EList<TargetLanguage> _languages = it.getLanguages();
      _languages.add(language);
      final Technology technology = this.createTechnology("AspectJ");
      EList<Technology> _technologies = it.getTechnologies();
      _technologies.add(technology);
      EList<Annotation> _annotations = it.getAnnotations();
      Annotation _createAnnotationOperationSiganture = this.createAnnotationOperationSiganture(language, technology);
      _annotations.add(_createAnnotationOperationSiganture);
    };
    ObjectExtensions.<Semantics>operator_doubleArrow(
      this.model, _function);
  }
  
  @Override
  public Collection<Annotation> getAnnotations() {
    return this.model.getAnnotations();
  }
  
  @Override
  public Collection<Technology> getTechnologies() {
    return this.model.getTechnologies();
  }
  
  @Override
  public Collection<TargetLanguage> getTargetLanguages() {
    return this.model.getLanguages();
  }
  
  @Override
  public Implementation getImplementation(final Annotation semantics, final Technology technology, final TargetLanguage language) {
    EList<Implementation> _implementations = semantics.getImplementations();
    final Function1<Implementation, Boolean> _function = (Implementation it) -> {
      return Boolean.valueOf((it.getTechnology().getName().equals(technology.getName()) && 
        it.getLanguage().getName().equals(language.getName())));
    };
    return IterableExtensions.<Implementation>findFirst(_implementations, _function);
  }
  
  private Technology createTechnology(final String name) {
    final Technology result = AnnotationsFactory.eINSTANCE.createTechnology();
    result.setName(name);
    return result;
  }
  
  private TargetLanguage createLanguage(final String name) {
    final TargetLanguage result = AnnotationsFactory.eINSTANCE.createTargetLanguage();
    result.setName(name);
    return result;
  }
  
  private Annotation createAnnotationOperationSiganture(final TargetLanguage language, final Technology technology) {
    final Annotation result = AnnotationsFactory.eINSTANCE.createAnnotation();
    result.setName("operationSignature");
    EList<Implementation> _implementations = result.getImplementations();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("getSignature");
    Implementation _createImplementation = this.createImplementation(language, technology, _builder.toString());
    _implementations.add(_createImplementation);
    return result;
  }
  
  private Implementation createImplementation(final TargetLanguage language, final Technology technology, final String code) {
    final Implementation result = AnnotationsFactory.eINSTANCE.createImplementation();
    result.setLanguage(language);
    result.setTechnology(technology);
    result.setCode(code);
    return result;
  }
}
