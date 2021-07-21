package com.ust.examples;
/*
 * constuctor
 */
public class Example13 {
	int x;
	float y;
	String z;
	
	Example13(){}
	Example13(int x,float y){
		x= this .x;
		y= this .y;
	}
	
	Example13(int a,float b,String c){
		this(a,b);
		x=a;
		y=b;
		z=c;
	}
	
	
 public static void main(String[] args) {
	Example13 e1= new Example13();
	System.out.println(e1.x);
	Example13 e2=new Example13(2,3.0f);
	System.out.println(e2.y);
	Example13 e3=new Example13(3,4.0f,"nehnu");
	System.out.println(e3.z);
	
	}

}
