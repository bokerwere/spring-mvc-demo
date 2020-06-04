package com.tiang.loadingfrompropertiesfiles2;

import java.sql.*;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.driver}")
	private String driver;
	
	public void  display() {
		System.out.println("url= "+url +" username=  "+username +"   password = "+password
				+"driver=  "+driver );
		
	}
	public void getJdbcConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("connection success"+con );
	}
}
