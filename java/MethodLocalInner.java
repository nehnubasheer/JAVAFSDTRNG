package com.ust.examples;

public class MethodLocalInner{
void outerMethod(){
	System.out.println("Inside OuterMethod");
class Inner{
void innerMethod(){
	System.out.println("Inside Inner Method");
}
}
	Inner y= new Inner();
	y.innerMethod();
}

public static void main(String[] args) {
	 MethodLocalInnerClass outer=new MethodLocalInnerClass ();
	 outer.outerMethod();
}

}
