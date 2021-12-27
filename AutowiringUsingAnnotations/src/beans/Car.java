package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("carEngine")
	private Engine engine;

	//In case of autowired annotation no need to write setter or constructors
	/*
	 * public void setEngine(Engine engine) { this.engine = engine; }
	 */
	public void printData() {
		System.out.println("Car Engine Model Year: "+ engine.getModelYear());
	}
}
