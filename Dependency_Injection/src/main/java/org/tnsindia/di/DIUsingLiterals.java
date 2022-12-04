package org.tnsindia.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiterals {

	public static void main(String[] args) {
		//hard coding
		//Student s=new Student();
		//using IOC
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=c.getBeans("s1",Student.class);
		s1.display();

	}

}
