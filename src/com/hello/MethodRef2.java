package com.hello;

//Functional Interface
interface Animal {
	void dog(); }

class TestMethodRef {
	//Static method created 
	static void dog() {
		System.out.println("Hi I am a static method named as dog");
	}
}

public class MethodRef2 {
	public static void main(String[] args) {
		//referring a static method 
		Animal animal = TestMethodRef::dog;
		//calling static method
		animal.dog();
	}
}
