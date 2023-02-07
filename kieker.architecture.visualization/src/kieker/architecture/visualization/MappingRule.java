package kieker.architecture.visualization;

import java.util.HashSet;
import java.util.Set;

public class MappingRule {
	
	private final String part;
	private final Set<String> labels = new HashSet<>();
	private String oddColor;
	private String evenColor;
	
	public MappingRule(String part) {
		this.part = part;
	}
	
	public Set<String> getLabels() {
		return labels;
	}
	
	public String getOddColor() {
		return oddColor;
	}
	
	public void setOddColor(String oddColor) {
		this.oddColor = oddColor;
	}
	
	public String getEvenColor() {
		return evenColor;
	}
	
	public void setEvenColor(String evenColor) {
		this.evenColor = evenColor;
	}
	
	public String getPart() {
		return part;
	}
}