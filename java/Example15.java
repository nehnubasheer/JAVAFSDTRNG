package com.ust.examples;

public class Example15 {
	String fName;
	String lName;
	String city;
	String address;
	String dob;
	Float salary;
	
	Example15(String x,String y,String z, String a,String b,Float c){
		fName=x;
		lName=y;
		city=z;
		address=a;
		dob=b;
		 salary=c;
			
	}
	
	void display() {
		System.out.println(fName+" "+lName+" "+city+" "+address+" "+dob+" "+salary);
	}
	public static void main(String[] args) {
		
	Example15 e1 = new Example15 ("ram","raj","pune","abc","11/9/12",1000.0f);
	Example15 e2 = new Example15 ("renu","rani","pala","def","12/8/13",2000.0f);
	Example15 e3 = new Example15 ("nimmi","sam","ktym","ghi","13/7/14",3000.0f);
	Example15 e4 = new Example15 ("nenu","bal","erklm","jkl","14/6/15",4000.0f);
	Example15 e5 = new Example15 ("suni","ker","etpa","mno","15/5/16",5000.0f);

	
	
	
	
	
	e1.display();
	e2.display();
	e3.display();
	e4.display();
	e5.display();
	
	}

}
