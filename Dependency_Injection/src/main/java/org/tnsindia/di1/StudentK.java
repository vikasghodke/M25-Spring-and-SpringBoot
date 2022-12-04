package org.tnsindia.di1;

public class StudentK {
	
	MathCheat math;
	
	
	//DI using setters
	//MathCheat m=new MathCheat();
	public void cheating()
	{
		math.mathcheat();
	}


	public void setMath(MathCheat math) {
		this.math = math;
	}
	

}
