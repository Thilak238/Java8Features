package com.hello;

//Program for One Arg 

interface Black {	
	void color(String name);
}

public class LambdaOneArg {

	public static void main(String[] args) 
	{
		Black b = (name) -> {		
			System.out.println("The name is :"+name);
		};
		
		b.color("black");
	}

}
