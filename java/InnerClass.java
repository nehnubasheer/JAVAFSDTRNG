package com.ust.examples;
/*
 * Example inner class
 */
public class InnerClass {
 class inner{
	void display() {
	System.out.println("Example of inner class");
		
	}
   }
	public static void main(String[] args) {
		
InnerClass.inner e1=new InnerClass().new inner();
e1.display();
	}

}
