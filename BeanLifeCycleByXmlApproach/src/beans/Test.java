package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test{

	private String driver,url,username,password;
	public Connection con = null;
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void connectionInit() throws Exception{
		System.out.println("Executing afterPropertiesSet (Init) Method");
		Class.forName(driver);
	    con = DriverManager.getConnection(url, username, password);
		System.out.println(con.toString());
	}

	public void connectionCleanup() throws Exception {
		System.out.println("Executing destroy Method");
		con.close();
	}
}
