package com.hello;

import java.util.ArrayList;
import java.util.List;

class Employee {
	String name;
	String city;
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "name=" + name + ", city=" + city + "";
	}
}
public class Colle1 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Thllak","Salem"));
		list.add(new Employee("Kani", "Madurai"));
		list.add(new Employee("Bala", "Dharmapuri"));
		//Getting the objects as a list 
		
		System.out.println("Printing the list:");
		System.out.println(list);
		
	}

}
