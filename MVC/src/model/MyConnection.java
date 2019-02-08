package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyConnection {
	
	Connection conn;
	
	public Connection createConnection() throws ClassNotFoundException,SQLException 
	{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","qainfotech");  
		return conn;
	}
	
	
}
