package com.ust.examples;
interface FirstInterface{
public void myMethod();
}
interface SecondInterface{
public void myOtherMethod();
}
class DemoClass implements FirstInterface,SecondInterface{
public void myMethod() {
System.out.println("Some text..");
}
public void myOtherMethod() {
System.out.println("Some other text..");	
}	
}
public class Interface2 {

public static void main(String[] args) {
DemoClass myObj=new DemoClass();
myObj.myMethod();
myObj.myOtherMethod();
}
}
