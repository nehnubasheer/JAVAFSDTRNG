package com.ust.examples;
import java.io.FileWriter;
import java.io.IOException;


public class FileExample1 {

public static void main(String[] args) {
try {
	FileWriter fName= new FileWriter("D;File1.txt");
	fName.write("I am writing to the file");
	fName.close();
}
catch(IOException e) {
	e.printStackTrace();
}

}
}
