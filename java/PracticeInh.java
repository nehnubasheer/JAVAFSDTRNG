package com.ust.examples;
//java program to illustrate the concept of inheritance
import java.io.*;
import java.lang.*;
import java.util.*;
class one{
	public void print_greek()
	{
	System.out.println("Greeks");	
		}
}
class two extends one{
	public void print_for()
	{
		System.out.println("for");	
	}
}

public class PracticeInh {

	public static void main(String[] args) {
		two g= new two();
		g.print_greek();
		g.print_for();
		g.print_greek();
	}

}
