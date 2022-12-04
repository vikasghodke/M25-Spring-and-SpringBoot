package org.tnsndia.springbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class StudentDAO {
	//depenct in the form of literels
	private String driver;
	private String URL;
	private String username;
	private String password;
	
	//DI using setters
	
	public void setDriver(String driver) {
		this.driver = driver;
	}



	public void setURL(String uRL) {
		URL = uRL;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName(driver);
		
		Connection c=DriverManager.getConnection(URL, username, password);
		
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM m25.book");
		
		while(r.next())
		{
			int id=r.getInt(1);
			String title=r.getString(2);
			String author=r.getString(3);
			double price=r.getDouble(4);
			System.out.println("the below is for book:");
			System.out.println("Book Id: "+id+" "+"Book Title:"+title +" "+"Author: "+author+" "+"price:"+price);
		}
	}
	
}
