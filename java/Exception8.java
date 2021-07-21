package com.ust.examples;
public class Exception8 {
	
public static int returnTest(int number) {
	try {
	if (number%2==0)throw new Exception("Excetpion thrown");
	else 
	return 5;
}
	catch (Exception e) {
	return 10;
}
	finally {
	return 4;
}
}
	public static void main(String[] args) {
	  System.out.println(returnTest(2));
}
}
