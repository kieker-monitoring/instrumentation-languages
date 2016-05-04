package kieker.develop.al.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import kieker.develop.al.aspectLang.Advice;
import kieker.develop.al.aspectLang.Aspect;
import kieker.develop.al.aspectLang.UtilizeAdvice;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class CommonCollectionModule {
  /**
   * Create a map for advices and their instantiation/utilization.
   * 
   * @param aspects collection of aspects containing advices.
   * 
   * @return map of advices and list of utilizations.
   */
  public static HashMap<Advice, List<UtilizeAdvice>> createUtilizationMap(final Collection<Aspect> aspects) {
    final HashMap<Advice, List<UtilizeAdvice>> utilizationAdviceMap = new HashMap<Advice, List<UtilizeAdvice>>();
    final Consumer<Aspect> _function = (Aspect it) -> {
      EList<UtilizeAdvice> _advices = it.getAdvices();
      final Consumer<UtilizeAdvice> _function_1 = (UtilizeAdvice advice) -> {
        Advice _advice = advice.getAdvice();
        List<UtilizeAdvice> adviceList = utilizationAdviceMap.get(_advice);
        boolean _equals = Objects.equal(adviceList, null);
        if (_equals) {
          ArrayList<UtilizeAdvice> _arrayList = new ArrayList<UtilizeAdvice>();
          adviceList = _arrayList;
          Advice _advice_1 = advice.getAdvice();
          utilizationAdviceMap.put(_advice_1, adviceList);
        }
        adviceList.add(advice);
      };
      _advices.forEach(_function_1);
    };
    aspects.forEach(_function);
    return utilizationAdviceMap;
  }
}
