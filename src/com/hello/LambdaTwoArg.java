package com.hello;


//Program for Two Arg 

interface Green {	
	void color(String name, Integer num);
}


public class LambdaTwoArg {

	public static void main(String[] args) 
	{
		Green g = (name,num) -> {		
			System.out.println("The name and num is :"+name+" "+num);
		};
		g.color("Sachin", 10);

	}

}
