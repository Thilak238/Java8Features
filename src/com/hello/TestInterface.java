package com.hello;


//Interface created 
@FunctionalInterface
interface read{
	void message();
}


//interface have been called through implements keyword
class Welcome implements read {
	
	//method definition for interface abstract method
		public void message() {
			System.out.println("Welcome! Hello world");
		}
}



public class TestInterface{
	
	public static void main(String[] args) { 
		
		//Object created for a class
		Welcome wel = new Welcome();
		
		//method is called through its object
		wel.message();
	}
}
