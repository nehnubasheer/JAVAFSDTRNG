package com.ust.examples;
/*
 * Upcasting & Downcasting
 */
public class CastExample {

	public static void main(String[] args) {
	double num=15.256;
	System.out.println("num");
	int n= (int) num;
	System.out.println(n);
	int x=78;
	double y= x;
	System.out.println(x);
	System.out.println(y);
	float f=(float)3.78;
	byte d= (byte)f;
	System.out.println(d);
	long e= 1895;
	float j= (float)e;
	System.out.println(j);
	int c= 4;
	String dbValue=String.valueOf(c);
	System.out.println(dbValue);
	
	dbValue=String.valueOf(x);
	System.out.println(dbValue);
			
			
	}

}
