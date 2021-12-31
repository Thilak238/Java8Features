package com.hello;

interface Speaker {
	void sound();
}

class MethodTest implements Speaker{
	public void sound() {
		System.out.println("Hi I am belongs to SONY");
	}
}
public class MethodRef3 {

	public static void main(String[] args) {
		
		//Creating an object
		MethodTest methodTest = new MethodTest();
		
		//Referring non static method using reference
		Speaker speaker = methodTest::sound;
		
		//calling an interface
		speaker.sound();
	}
}
