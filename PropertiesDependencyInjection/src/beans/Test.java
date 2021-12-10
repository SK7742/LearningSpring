package beans;

import java.util.Properties;

public class Test {
	private Properties driver;
	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	public Properties getDriver() {
		return driver;
	}
	public void printdata() {
		driver.keySet().forEach((c) ->System.out.println(driver.get(c)));
	}
}
