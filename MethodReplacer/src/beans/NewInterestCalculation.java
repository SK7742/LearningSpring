package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewInterestCalculation implements MethodReplacer {

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("new Interest rate has been applied through method replacer...");
		return null;
	}

}
