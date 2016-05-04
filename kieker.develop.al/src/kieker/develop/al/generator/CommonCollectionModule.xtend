package kieker.develop.al.generator

import java.util.Collection
import kieker.develop.al.aspectLang.Aspect
import java.util.HashMap
import kieker.develop.al.aspectLang.Advice
import java.util.List
import kieker.develop.al.aspectLang.UtilizeAdvice
import java.util.ArrayList

class CommonCollectionModule {

	/**
	 * Create a map for advices and their instantiation/utilization.
	 * 
	 * @param aspects collection of aspects containing advices.
	 * 
	 * @return map of advices and list of utilizations.
	 */
	static def createUtilizationMap(Collection<Aspect> aspects) {
		val utilizationAdviceMap = new HashMap<Advice,List<UtilizeAdvice>>()
		aspects.forEach[
			it.advices.forEach[advice |
				var adviceList = utilizationAdviceMap.get(advice.advice)
				if (adviceList == null) {
					adviceList = new ArrayList<UtilizeAdvice>()
					utilizationAdviceMap.put(advice.advice, adviceList)
				}
				adviceList.add(advice)
			]
		]
		
		return utilizationAdviceMap
	}
	
}