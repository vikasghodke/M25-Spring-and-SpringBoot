package com.example.demo;

public class Heart {
	
	//Dependency in terms of literals
		private String nameOfAnimal;
		private int noOfHeart;
		public String getNameOfAnimal() {
			return nameOfAnimal;
		}
		public void setNameOfAnimal(String nameOfAnimal) {
			this.nameOfAnimal = nameOfAnimal;
		}
		public int getNoOfHeart() {
			return noOfHeart;
		}
		public void setNoOfHeart(int noOfHeart) {
			this.noOfHeart = noOfHeart;
		}
		
		//getters and setters
		
		
		//method
		public void pump()
		{
			System.out.println("Your heart is pumping");
			System.out.println("You are alive!");
		}
		

}
