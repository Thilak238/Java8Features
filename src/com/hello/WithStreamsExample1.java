package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product1 {
	String name;
	String city;
	int price;
	
	public Product1(String name, String city, int price) {
		super();
		this.name = name;
		this.city = city;
		this.price = price;	}
}

public class WithStreamsExample1 {

	public static void main(String[] args) {
		
		List<Product1> product = new ArrayList<Product1>();
		product.add(new Product1("Sony", "Bangalore", 52000));
		product.add(new Product1("Samsung", "Pune", 36000));
		product.add(new Product1("LG", "Mumbai", 15000));
		//Method 1 filter using stream
		List<Integer> priceList = product.stream()
								  .filter(p->p.price < 20000)
								  .map(p->p.price)
								  .collect(Collectors.toList());
		System.out.println(priceList);
		
		//Method 2 filter using streams
		product.stream()
			   .filter(p->p.price < 20000)
			   .forEach(p->System.out.println(p.price)); 
	}
}