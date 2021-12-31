package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Book {
	String author;
	int price;
	
	public Book(String author,int price) {
		this.author = author;
		this.price = price;
	}
}


public class ListToSet {
	
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("Salim", 5200));
		list.add(new Book("Shakesphere", 7000));
		list.add(new Book("Henry",10000));
		list.add(new Book("Henry",6050));
		
		Set<String> setBook = list.stream()
							.filter(b->b.price < 15000)
							.map(be->be.author)
							.collect(Collectors.toSet());
		
		System.out.println(setBook);
	}

}
