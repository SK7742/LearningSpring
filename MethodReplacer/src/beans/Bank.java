package beans;

public class Bank {
	public void deposite() {
		System.out.println("Deposite method called...");
	}
	public void withdraw() {
		System.out.println("withdraw method called...");
	}
	
	//suppose we don't want use this definition for this method for some time then,
	//it can be replaced by method replacer beans.NewInterestCalculation
	//this method will override using proxy class generated at runtime.
	public void interestRate() {
		System.out.println("interestRate method called...");
	}
}
