package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
	@Autowired
	@Qualifier(value = "busEngine")
	private Engine engine;
	
	//In case of autowired annotation no need to write setter or constructors
	/*
	 * public Bus() { System.out.println("Default Bus Contructor"); }
	 */

	/*
	 * public Bus(Engine engine) { this.engine = engine;
	 * System.out.println("Parameterized constructor"); }
	 */
	void printData() {
		System.out.println("Bus Engine modelYear: "+ engine.getModelYear());
	}
}	
