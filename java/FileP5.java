package com.ust.examples;
//StringReader demo
import java.io.IOException;
import java.io.StringReader;

public class FileP5 {
public static void main(String[] args) {
		
String str = "Hello World.!& This is String Reader Program.";
StringReader sr = new StringReader(str);
int i =0;
try {
	while ((i=sr.read())!=-1){
	System.out.print((char)i);	
	}
}
catch (IOException e) {
	e.printStackTrace();
}
}
}
