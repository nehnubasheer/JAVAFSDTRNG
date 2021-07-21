package com.ust.examples;

public class CollectionP11 {
public static void main(String[] args) {

DemoClass1 demo =new DemoClass1();
demo.<String>genericsMethod("Java Programming");
demo.<Integer>genericsMethod(25);
}
}
class DemoClass1{
	public<T> void genericsMethod(T data) {
	System.out.println("Generics Method:");
	System.out.println("Data Passed:" + data);
		
}
}