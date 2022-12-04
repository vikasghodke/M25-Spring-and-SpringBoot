package com.example.springdemo;

public class Employee {
	
	//private data members
	
	private int ID;
	private String name;
	
	//user defined method
	public void print()
	{
		System.out.println("Welcome to java full stack");
	}
	//setters and getters method to access private data members

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
