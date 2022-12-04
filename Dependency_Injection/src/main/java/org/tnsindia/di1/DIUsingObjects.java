package org.tnsindia.di1;
//driver class
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIUsingObjects {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		StudentK s1=c.getBean("s2",StudentK.class);
		s1.cheating();
	}

}
