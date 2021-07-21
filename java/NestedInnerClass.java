package com.ust.examples;
public class NestedInnerClass
{
class inner{

 public void show() 
{
 System.out.println("In a nested class method");
	}
    }
	
public static void main(String[] args)
   {
	NestedInnerClass.inner in=new
	NestedInnerClass().new inner();
	in.show();	
	}
    }
