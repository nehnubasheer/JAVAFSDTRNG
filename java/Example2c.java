package com.ust.examples;

public class Example2c {
	int price;
	String item;
	
	public static void main(String[] args) {
		Example2b e1 = new Example2b();
		Example2b e2 = new Example2b();
		e1.price=12;
		e2.price=25;
		e1.item="pen";
		e2.item="book";
		if(e1.price > e2.price) {
		e1.item="scale";	
		}
				
		if(e1.price < e2.price) {
			e1.item="pencil";
		}
		else if (e1.price==e2.price) {
			e1.item="box";
		}
System.out.println(e1.item);
	}
	
	}

