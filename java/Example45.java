package com.ust.examples;
abstract class Person{
abstract void eat();	
}
public class Example45 {

public static void main(String[] args) {
		Person p= new Person() {
			void eat()
			{
				System.out.println("nice fruits");}
			};
		p.eat();
		}
}
