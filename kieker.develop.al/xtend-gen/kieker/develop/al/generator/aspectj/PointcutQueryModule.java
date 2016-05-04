package kieker.develop.al.generator.aspectj;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import kieker.develop.al.aspectLang.AspectLangFactory;
import kieker.develop.al.aspectLang.CompositionQuery;
import kieker.develop.al.aspectLang.ContainerNode;
import kieker.develop.al.aspectLang.LocationQuery;
import kieker.develop.al.aspectLang.Node;
import kieker.develop.al.aspectLang.ParentNode;
import kieker.develop.al.aspectLang.Pointcut;
import kieker.develop.al.aspectLang.QueryModifier;
import kieker.develop.al.aspectLang.SubPathNode;
import kieker.develop.al.aspectLang.WildcardNode;
import kieker.develop.al.mapping.Feature;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PointcutQueryModule {
  public static String createExpression(final Pointcut pointcut) {
    LocationQuery _location = pointcut.getLocation();
    final Collection<LocationQuery> flattLocationModel = PointcutQueryModule.createFlattLocationModel(_location);
    final Function1<LocationQuery, Boolean> _function = (LocationQuery it) -> {
      return Boolean.valueOf(PointcutQueryModule.isInclude(it));
    };
    Iterable<LocationQuery> _filter = IterableExtensions.<LocationQuery>filter(flattLocationModel, _function);
    final Function1<LocationQuery, CharSequence> _function_1 = (LocationQuery it) -> {
      return PointcutQueryModule.getRenderQuery(it);
    };
    Iterable<CharSequence> _map = IterableExtensions.<LocationQuery, CharSequence>map(_filter, _function_1);
    String includeQuery = IterableExtensions.join(_map, "||");
    final Function1<LocationQuery, Boolean> _function_2 = (LocationQuery it) -> {
      boolean _isInclude = PointcutQueryModule.isInclude(it);
      return Boolean.valueOf((!_isInclude));
    };
    Iterable<LocationQuery> _filter_1 = IterableExtensions.<LocationQuery>filter(flattLocationModel, _function_2);
    final Function1<LocationQuery, CharSequence> _function_3 = (LocationQuery it) -> {
      return PointcutQueryModule.getRenderQuery(it);
    };
    Iterable<CharSequence> _map_1 = IterableExtensions.<LocationQuery, CharSequence>map(_filter_1, _function_3);
    String excludeQuery = IterableExtensions.join(_map_1, "||");
    boolean _isEmpty = excludeQuery.isEmpty();
    if (_isEmpty) {
      return includeQuery;
    } else {
      boolean _isEmpty_1 = includeQuery.isEmpty();
      if (_isEmpty_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("!(");
        _builder.append(excludeQuery, "");
        _builder.append(")");
        return _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("(");
        _builder_1.append(includeQuery, "");
        _builder_1.append(") && !(");
        _builder_1.append(excludeQuery, "");
        _builder_1.append(")");
        return _builder_1.toString();
      }
    }
  }
  
  private static CharSequence getRenderQuery(final LocationQuery query) {
    StringConcatenation _builder = new StringConcatenation();
    Node _node = query.getNode();
    CharSequence _renderNode = PointcutQueryModule.getRenderNode(_node);
    _builder.append(_renderNode, "");
    CharSequence _xifexpression = null;
    LocationQuery _specialization = query.getSpecialization();
    boolean _notEquals = (!Objects.equal(_specialization, null));
    if (_notEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(".");
      LocationQuery _specialization_1 = query.getSpecialization();
      CharSequence _renderQuery = PointcutQueryModule.getRenderQuery(_specialization_1);
      _builder_1.append(_renderQuery, "");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  private static CharSequence getRenderNode(final Node node) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (node instanceof ContainerNode) {
        _matched=true;
        Feature _container = ((ContainerNode)node).getContainer();
        _switchResult = _container.getName();
      }
    }
    if (!_matched) {
      if (node instanceof SubPathNode) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("**");
        _switchResult = _builder;
      }
    }
    if (!_matched) {
      if (node instanceof WildcardNode) {
        _matched=true;
        _switchResult = "*";
      }
    }
    if (!_matched) {
      if (node instanceof ParentNode) {
        _matched=true;
        throw new UnsupportedOperationException("Parent node is not supported in query sequences");
      }
    }
    return _switchResult;
  }
  
  private static boolean isInclude(final LocationQuery query) {
    QueryModifier _modifier = query.getModifier();
    final boolean thisInclude = Objects.equal(_modifier, QueryModifier.INCLUDE);
    boolean _xifexpression = false;
    LocationQuery _specialization = query.getSpecialization();
    boolean _notEquals = (!Objects.equal(_specialization, null));
    if (_notEquals) {
      LocationQuery _specialization_1 = query.getSpecialization();
      _xifexpression = PointcutQueryModule.isInclude(_specialization_1);
    } else {
      _xifexpression = true;
    }
    final boolean childInclude = _xifexpression;
    boolean _and = false;
    if (!thisInclude) {
      _and = false;
    } else {
      _and = childInclude;
    }
    if (_and) {
      return true;
    } else {
      if (((!thisInclude) && (!childInclude))) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  /**
   * Create flattened pointcut search patterns.
   * 
   * @param query input query.
   */
  private static Collection<LocationQuery> createFlattLocationModel(final LocationQuery query) {
    final ArrayList<LocationQuery> results = new ArrayList<LocationQuery>();
    LocationQuery _specialization = query.getSpecialization();
    boolean _notEquals = (!Objects.equal(_specialization, null));
    if (_notEquals) {
      LocationQuery _specialization_1 = query.getSpecialization();
      Collection<LocationQuery> _createFlattLocationModel = PointcutQueryModule.createFlattLocationModel(_specialization_1);
      PointcutQueryModule.expandPath(results, query, _createFlattLocationModel);
    } else {
      CompositionQuery _composition = query.getComposition();
      boolean _notEquals_1 = (!Objects.equal(_composition, null));
      if (_notEquals_1) {
        CompositionQuery _composition_1 = query.getComposition();
        Collection<LocationQuery> _createFlattLocationModel_1 = PointcutQueryModule.createFlattLocationModel(_composition_1);
        PointcutQueryModule.expandPath(results, query, _createFlattLocationModel_1);
      } else {
        results.add(query);
      }
    }
    return results;
  }
  
  private static Collection<LocationQuery> createFlattLocationModel(final CompositionQuery query) {
    final ArrayList<LocationQuery> results = new ArrayList<LocationQuery>();
    EList<LocationQuery> _subQueries = query.getSubQueries();
    final Consumer<LocationQuery> _function = (LocationQuery it) -> {
      Collection<LocationQuery> _createFlattLocationModel = PointcutQueryModule.createFlattLocationModel(it);
      results.addAll(_createFlattLocationModel);
    };
    _subQueries.forEach(_function);
    return results;
  }
  
  private static void expandPath(final Collection<LocationQuery> queries, final LocationQuery head, final Collection<LocationQuery> tails) {
    final Consumer<LocationQuery> _function = (LocationQuery tail) -> {
      final LocationQuery duplicateQuery = AspectLangFactory.eINSTANCE.createLocationQuery();
      QueryModifier _modifier = head.getModifier();
      duplicateQuery.setModifier(_modifier);
      Node _node = head.getNode();
      Node _duplicate = PointcutQueryModule.duplicate(_node);
      duplicateQuery.setNode(_duplicate);
      LocationQuery _duplicateChain = PointcutQueryModule.duplicateChain(tail);
      duplicateQuery.setSpecialization(_duplicateChain);
      queries.add(duplicateQuery);
    };
    tails.forEach(_function);
  }
  
  private static LocationQuery duplicateChain(final LocationQuery query) {
    final LocationQuery duplicateQuery = AspectLangFactory.eINSTANCE.createLocationQuery();
    Node _node = query.getNode();
    Node _duplicate = PointcutQueryModule.duplicate(_node);
    duplicateQuery.setNode(_duplicate);
    QueryModifier _modifier = query.getModifier();
    duplicateQuery.setModifier(_modifier);
    LocationQuery _specialization = query.getSpecialization();
    boolean _notEquals = (!Objects.equal(_specialization, null));
    if (_notEquals) {
      LocationQuery _specialization_1 = query.getSpecialization();
      LocationQuery _duplicateChain = PointcutQueryModule.duplicateChain(_specialization_1);
      duplicateQuery.setSpecialization(_duplicateChain);
    }
    return duplicateQuery;
  }
  
  private static Node duplicate(final Node node) {
    boolean _matched = false;
    if (!_matched) {
      if (node instanceof ContainerNode) {
        _matched=true;
        final ContainerNode result = AspectLangFactory.eINSTANCE.createContainerNode();
        Feature _container = ((ContainerNode)node).getContainer();
        result.setContainer(_container);
        return result;
      }
    }
    if (!_matched) {
      if (node instanceof SubPathNode) {
        _matched=true;
        return AspectLangFactory.eINSTANCE.createSubPathNode();
      }
    }
    if (!_matched) {
      if (node instanceof WildcardNode) {
        _matched=true;
        return AspectLangFactory.eINSTANCE.createWildcardNode();
      }
    }
    if (!_matched) {
      if (node instanceof ParentNode) {
        _matched=true;
        return AspectLangFactory.eINSTANCE.createParentNode();
      }
    }
    return null;
  }
}
