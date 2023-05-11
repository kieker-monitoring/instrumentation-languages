package kieker.architecture.visualization;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class MappingRule {
	
	private final String part;
	private final Set<Pattern> labels = new HashSet<>();
	private String oddColor;
	private String evenColor;
	
	public MappingRule(String part) {
		this.part = part;
	}
	
	public Set<Pattern> getLabels() {
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