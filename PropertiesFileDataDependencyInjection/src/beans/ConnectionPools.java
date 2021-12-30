package beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPools {
	String driver,user,url,pass;
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void createConnection() throws Exception {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass );
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
