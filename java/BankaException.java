package com.ust.examples;

public class BankaException extends Exception {
	static String msg="error";
	BankaException (String message){
		super(message);
}
public static void main(String[] args) throws BankaException {
if (msg.equals("error")) {
	System.out.println("error message");
}
else
	throw new  BankaException(" BankaException");
}
}