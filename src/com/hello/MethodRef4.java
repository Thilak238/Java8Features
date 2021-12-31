package com.hello;

interface Internet {
	Telegram getMessage(String msg);
}

class Telegram {
	public Telegram(String msg) {
		System.out.println("The message is:"+msg);
	}
}

public class MethodRef4 {

	public static void main(String[] args) {
		//Accessing a constructor
		Internet internet = Telegram::new;
		internet.getMessage("Hi I am referring a constructor using method reference");
	}

}
