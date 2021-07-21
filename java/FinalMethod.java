package com.ust.examples;
 class Base{
  final void display()
	{
		System.out.println("Base method called");	
		}
}
	class Derived extends Base
	{
	 //void display() //cannot override
		{
			System.out.println("Base method called");
		}
		}
     public class FinalMethod {

	public static void main(String[] args) {
		 Derived d= new Derived();
		 d.display();
	
	}
   }
	
