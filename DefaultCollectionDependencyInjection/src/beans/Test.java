package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set cricketrs;
	private Map cc;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketrs(Set cricketrs) {
		this.cricketrs = cricketrs;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	public void printData() {
		System.out.println("Fruits.....");
		fruits.forEach((c) -> System.out.println(c));
		
		System.out.println("Crickter.....");
		cricketrs.forEach((c) -> System.out.println(c));
		
		System.out.println("Countries and capitals.....");
		cc.keySet().forEach((c) -> System.out.println(cc.get(c)));
		
	}
}
