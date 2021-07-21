 package com.ust.examples;
  public class Localliner2 {
    private int data=30;
 //instance variable
    void display() {
	int value=50;
	class Local{
	void msg() {
		System.out.println(value);
	}
	}
	Local l = new Local();
	l.msg();
    }
	public static void main(String[] args) {
		Localliner2 obj= new Localliner2();
		obj.display();

	}

}
