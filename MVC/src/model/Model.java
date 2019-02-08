package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class Model extends MyConnection {
	private String email;
	private String password;
	private Connection conn;
	private String empId;
	private String empName;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	MyConnection obj=new MyConnection();
	java.sql.PreparedStatement pst;
	String sql;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ResultSet userLogin() throws ClassNotFoundException , SQLException
	{		
		conn = obj.createConnection();
		sql="select * from employee where email=? and password=?";
		
		pst=conn.prepareStatement(sql);
		
		pst.setString(1, getEmail());
		pst.setString(2, getPassword());
		
		ResultSet rs=pst.executeQuery();
		return rs;
	}
}
