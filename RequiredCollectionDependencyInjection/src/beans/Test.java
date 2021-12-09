package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;
	private TreeSet cricketrs;
	private Hashtable cc;
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCricketrs(TreeSet cricketrs) {
		this.cricketrs = cricketrs;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}
	public void printData() {
		System.out.println("Fruits stored in Vector.....");
		fruits.forEach((c) -> System.out.println(c));
		
		System.out.println("Crickter Stored in TreeSet.....");
		cricketrs.forEach((c) -> System.out.println(c));
		
		System.out.println("Countries and capitals in HashTable.....");
		cc.keySet().forEach((c) -> System.out.println(cc.get(c)));
		
	}
}
