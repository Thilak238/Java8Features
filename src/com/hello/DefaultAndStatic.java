package com.hello;

interface Speacker{
	
	default void sound() {
		System.out.println("I am a default method");
	}
	static void sound1() {
		System.out.println("I am a static method");
	}
}

public class DefaultAndStatic {

	public static void main(String[] args) {
		
		//creating reference for an Interface
		Speacker sp = new Speacker() {};
		
		//accessing default method
		sp.sound();
		
		//accessing static method
		Speacker.sound1();
		
	}
}
