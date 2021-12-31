package com.hello;

//Abstract class
abstract class Bank  {    
	//Abstract method
	abstract int getRateOfInterest();    
}    

//abstract class have been extends here. We need to provide body definition
class SBI extends Bank {
	
	//Body definition for abstract class
	int getRateOfInterest() {
		return 7;
	}    
}

//abstract class have been extends here. We need to provide body definition
class PNB extends Bank {
	
	//Body definition for abstract class
	int getRateOfInterest() {
		return 8;
	}    
}     
class TestBank{    
	public static void main(String args[])	{    
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
	}
}    
