package com.hello;

//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  

class Student
{  

		//defining fields
		//field or data member or instance variable
		int id;  
		String name;  
		
		//creating main method inside the Student class  
		public static void main(String args[])
		{  
			//Creating an object or instance  
			Student s1=new Student(); 	//creating an object of Student 

			//Printing values of the object  
			System.out.println("The id is:"+s1.id);//accessing member through reference variable  
			System.out.println("The name is:"+s1.name);  
		}  
}  
