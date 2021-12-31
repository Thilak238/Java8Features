package com.hello;

//program with Lambda Expression

//Interface created 

interface Phone
{
	void message();
}

public class WithLambda
{	
	//main driver method
	public static void main(String[] args) 
	{ 	
		Phone p = () -> {
			
				System.out.println("Hi ! With lambda expression");
		};
		p.message();
	}
}

