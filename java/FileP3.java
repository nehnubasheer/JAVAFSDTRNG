package com.ust.examples;
import java.io.File;

public class FileP3 {
public static void main(String[] args) {
	File file = new File("D:FileP3.txt") ;
	String[]fileList = file.list();
	for(String str : fileList) {
	System.out.println(str);	
}
}
}
