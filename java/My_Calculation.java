package com.ust.examples;
 // calculation is a super class
 class calculation{
	int z;
	public void addition(int x,int y) {
		z= x+y;
		System.out.println("The sum of the given numbers:"+z);
	}
 public void substraction(int x,int y) {
     z=x-y;
     System.out.println("The difference between the given numbers:" +z);
}
}
 //My_calculation is a subclass
 public class My_Calculation extends calculation { 
 public void multiplication(int x,int y) {
	z=x*y;
 
	System.out.println("The product of the given numbers:"+z);
}
	public static void main(String[] args) {
	int a= 20,b=10;
	My_Calculation demo =new My_Calculation();
	demo.addition(a,b);
	demo.substraction(a,b);
	demo.multiplication(a,b);
	}

}
