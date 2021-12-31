package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class CreditCard {
	
	int number;
	String name;
	String offer;
	
	public CreditCard(int number, String name, String offer) {
		super();
		this.number = number;
		this.name = name;
		this.offer = offer;
	}	
}

public class ListToMap {

	public static void main(String[] args) {
		
		List<CreditCard> list = new ArrayList<CreditCard>();
		list.add(new CreditCard(105, "RBL", "Deepavali"));
		list.add(new CreditCard(109, "SBI", "Ramzan"));
		list.add(new CreditCard(119, "ICICI", "Christmas"));
		
		Map<Integer, String> cardMap = list.stream()
									   .collect(Collectors.toMap(p->p.number, p->p.name));
		
		System.out.println(cardMap);
		
	}

}
