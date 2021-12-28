package beans;

public class Test {
	private static Test t;
	private Test() {
		System.out.println("Object created by invoking Private Test Constructor...");
	}
	public static Test getInstance(){
		if(t==null) {
			t=new Test();
			return t;
		}else {
			return t;
		}
	}
	
	//We need to override the clone method as this is a singleton class so only single object should be created.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
