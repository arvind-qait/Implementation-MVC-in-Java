package model;

import controllar.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class AddDetail 
{
	Connection conn;
	PreparedStatement pst;
	MyConnection ob = new MyConnection();
	
	public void addEmployee() throws ClassNotFoundException, IOException, SQLException
	{
		conn=ob.createConnection();
//		pst = conn.prepareStatement("reger");
	}
}
