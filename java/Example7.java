package com.ust.examples;
/*
 *do while
 */

public class Example7 {

	public static void main(String[] args) {
		int  x =1, sum =0;
	/*	
		{
			sum = sum+x;
			x++;
		}
		*/
do {
	sum = sum+x;
	x++;		
	}
while (x<=10);
System.out.println("summation"+ sum );
}
}