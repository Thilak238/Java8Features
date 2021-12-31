package com.hello;



//interface method
interface print {
	
	//method declaration 
	//by default compiler will considered as abstract
	void draw();
}

//Implements refers to interface have been called
class Test implements print{
	
	//since we are implementing interface we must provide its method definition here
	public void draw() {
		System.out.println("Abstract method Definition");
	}
}


public class Demo {

	public static void main(String[] args) {
		
		// Creating an object instance for test class
		Test t = new Test();
		
		//calling the method present in test using dot operator following by method name
		t.draw();
	}

}
