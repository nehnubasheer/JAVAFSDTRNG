package com.ust.examples;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ExampleFile {

public static void main(String[] args) {
try {
	File f=new File("D:File1.txt ");
/*
	System.out.println(f.getName()+"is created");
}
else {
	System.out.println("Already Exists");
}*/

//f.write("This is a java training");
	//Scanner read= new Scanner(f);
	FileReader read= new FileReader(f);
	/*while (read.hasNextLine()) {
		String data =read.nextLine();
		Systm.out.println(data);
	}*/
	int ch;
	while((ch=read.read())!=-1) {
		System.out.print((char)ch);
	}
	read.close();
}
catch(IOException e) {
System.out.println("Exception Occured");
}
}
}