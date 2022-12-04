package org.tnsindia.di;

public class Student {
	
	//data members
	//1,DI in terms of literals
	private String Student_Name;
	private int Roll_No;
	void display()
	{
		System.out.println("The name of the student id:"+Student_Name);
		System.out.println("the roll no of the student id:"+Roll_No);
	}
	//Archiving 
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	
	
	//setters amd getters method
	
	//Di using setters
	/*public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public int getRoll_No() {
		return Roll_No;
	}

	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}*/

	
	
	

}
