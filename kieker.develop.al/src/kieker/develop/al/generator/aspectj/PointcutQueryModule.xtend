package kieker.develop.al.generator.aspectj

import kieker.develop.al.aspectLang.Pointcut
import kieker.develop.al.aspectLang.LocationQuery
import kieker.develop.al.aspectLang.Node
import kieker.develop.al.aspectLang.ContainerNode
import kieker.develop.al.aspectLang.SubPathNode
import kieker.develop.al.aspectLang.QueryModifier
import kieker.develop.al.aspectLang.WildcardNode
import kieker.develop.al.aspectLang.ParentNode
import java.util.Collection
import java.util.ArrayList
import kieker.develop.al.aspectLang.AspectLangFactory
import kieker.develop.al.aspectLang.CompositionQuery

class PointcutQueryModule {

	static def createExpression(Pointcut pointcut) {
				
		val flattLocationModel = pointcut.location.createFlattLocationModel
		
		var includeQuery = flattLocationModel.filter[it.isInclude].map[it.renderQuery].join('||')
		var excludeQuery = flattLocationModel.filter[!it.isInclude].map[it.renderQuery].join('||')
		
		if (excludeQuery.isEmpty)
			return includeQuery
		else if (includeQuery.isEmpty)
			return '''!(«excludeQuery»)'''
		else
			return '''(«includeQuery») && !(«excludeQuery»)'''
	}
	
	private static def CharSequence getRenderQuery(LocationQuery query) 
		'''«query.node.renderNode»«if (query.specialization != null) '''.«query.specialization.renderQuery»'''»'''
	
	private static def CharSequence getRenderNode(Node node) {
		switch(node) {
			ContainerNode: node.container.name
			SubPathNode: '''**'''
			WildcardNode: '*'
			ParentNode: throw new UnsupportedOperationException("Parent node is not supported in query sequences")
		}
	}
	
	private static def boolean isInclude(LocationQuery query) {
		val thisInclude = (query.modifier == QueryModifier.INCLUDE)
		val childInclude = if (query.specialization != null) query.specialization.isInclude else true
		
		if (thisInclude && childInclude)
			return true
		else if (!thisInclude && !childInclude)
			return true
		else
			return false
	}
		
	/**
	 * Create flattened pointcut search patterns.
	 * 
	 * @param query input query.
	 */
	private static def Collection<LocationQuery> createFlattLocationModel(LocationQuery query) {
		val results = new ArrayList<LocationQuery>()
		
		if (query.specialization != null)
			results.expandPath(query,query.specialization.createFlattLocationModel)
		else if (query.composition != null)
			results.expandPath(query,query.composition.createFlattLocationModel)
		else {
			results.add(query)
		}
		
		return results
	}
	
	private static def Collection<LocationQuery> createFlattLocationModel(CompositionQuery query) {
		val results = new ArrayList<LocationQuery>()
		
		query.subQueries.forEach[results.addAll(it.createFlattLocationModel)]
		
		return results
	}
	
	private static def expandPath(Collection<LocationQuery> queries, LocationQuery head, Collection<LocationQuery> tails) {
		tails.forEach[tail |
			val duplicateQuery = AspectLangFactory.eINSTANCE.createLocationQuery
			duplicateQuery.modifier = head.modifier
			duplicateQuery.node = head.node.duplicate
			duplicateQuery.specialization = tail.duplicateChain
			queries.add(duplicateQuery)
		]
	}
	
	private static def LocationQuery duplicateChain(LocationQuery query) {
		val duplicateQuery = AspectLangFactory.eINSTANCE.createLocationQuery
		duplicateQuery.node = query.node.duplicate
		duplicateQuery.modifier = query.modifier
		if (query.specialization != null)
			duplicateQuery.specialization = query.specialization.duplicateChain
		
		return duplicateQuery
	}
	
	private static def Node duplicate(Node node) {
		// TODO handle constraint duplication
		switch (node) {
			ContainerNode: {
				val result = AspectLangFactory.eINSTANCE.createContainerNode
				result.container = node.container
				return result
			}
			SubPathNode:
				return AspectLangFactory.eINSTANCE.createSubPathNode
			WildcardNode:
				return AspectLangFactory.eINSTANCE.createWildcardNode
			ParentNode:
				return AspectLangFactory.eINSTANCE.createParentNode
		}
	}
		
}