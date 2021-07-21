package com.ust.examples;
import java.io.*;
class Student
{
	//data members o the class
	String name;
	int id;
	// constructor would initialize data members
	// with the values of passed arguments while
	// object of that class created.
	Student( String name, int id)
	{
		this.name = name;
		this.id= id;
	}
	}
	
public class ParameterizedConstructor {

	public static void main(String[] args) {
		//this would invoke the parameterized constructor.
		Student student1=new Student("Ashok",101);
		System.out.println("StudentName:"+student1.name+"and Student Id:"+student1.id);
	}
}
