package org.tnsndia.springbean;

import java.sql.SQLException;

public class Test {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException {
		
		/*StudentDAO obj=new StudentDAO();
		obj.selectAllRows();*/
		
		ApplicationContext c=new ClassPathApplicationContext("beans.xml");
		StudentDAO s1=c.getBean("studentdao",StudentDAO.class);
		s1.selectAllRows();
	}
}
