package com.ust.examples;

public class Exception7 {
public static void main(String[] args) {
try {
	Exception7 met= new Exception7();
	System.out.println("length of JUNK is " +met.getStringSize("JUNK"));
	System.out.println("length of WRONG is " +met.getStringSize("WRONG"));
	System.out.println("length of null String is " +met.getStringSize(null));	
}
catch (Exception ex) {
	System.out.println("Exception message: " + ex.getMessage());
}
}
public int getStringSize(String str)
throws Exception{
if (str==null) {
throw new Exception("String input is null");
}
return str.length();
}
}
