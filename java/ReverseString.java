package com.ust.examples;
import java.util.*;
public class ReverseString
{

public static void main(String[] args)
{
String orginal,reverse = "";
Scanner sct = new Scanner(System.in);

System.out.println("Enter string to reverse");	
orginal= sct.nextLine();
int length = orginal.length();
for(int i=length-1;i>=0;i--)
	reverse = reverse+ orginal.charAt(i);
System.out.println("Reverse of entered string is:"+reverse);	
}
}
