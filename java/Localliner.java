package com.ust.examples;

public class Localliner {
private int data=30;
void display() {
class local{
void msg(){
System.out.println(data);		
}
}
local l= new local();
l.msg();
}

public static void main(String[] args) {
Localliner obj= new Localliner();
obj.display();
}
}
