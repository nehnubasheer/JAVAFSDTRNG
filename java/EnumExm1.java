package com.ust.examples;

public class EnumExm1 {
enum Level{
	LOW,MEDIUM,HIGH;
}	
public static void main(String[] args) {

//Level myVar = Level.MEDIUM;
System.out.println(Level.values());

}
}
