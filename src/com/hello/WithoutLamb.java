package com.hello;

//program without Lambda Expression

//Interface created 
@FunctionalInterface
interface Park
{
	void message();
}

public class WithoutLamb
{	
	//main driver method
	public static void main(String[] args) 
	{ 	
		Park r = new Park() 
		{
			public void message() 
			{
				System.out.println("Hi ! Without lambda expression");
			}
		};
		r.message();
	}
}

