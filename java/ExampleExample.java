package com.ust.examples;
/*
 * ExceptionExample
 */
public class ExampleExample
{

public static void main(String[] args)
{
String s= null;
//int x=5/0;

try {
try {
		System.out.println( s.length());
	}
catch(NullPointerException e) {
		e.printStackTrace();
	}
finally {
		System.out.println("This Codes Gets Executed Always");
	}
int a []=new int[5];
	a[6]=10;
	
    }
catch(  ArrayIndexOutOfBoundsException e) {
	System.out.println("occured");
	e.printStackTrace();
    }
 
    }

    }
