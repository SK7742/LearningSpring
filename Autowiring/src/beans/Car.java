package beans;

public class Car {
	private Engine engine;
	
	//In case of autowire autodetect if this default constructor is available then 
	// it will call setter method to inject dependency else if it is not present and parametrized constructor is present then constructor injection will happens.
	public Car() {
	}


	public Car(Engine engine) {
		System.out.println("Injected through constructor");
		this.engine = engine;
	}

	
	  public void setEngine(Engine engine) { 
		  this.engine = engine; 
		  System.out.println("Injected through setter...");}
	 
	public void printData() {
		System.out.println("Engine Model Year: "+ engine.getModelYear());
	}
}
