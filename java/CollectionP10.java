package com.ust.examples;

public class CollectionP10 {
public static void main(String[] args) {

  GenericsClass<Integer> intObj=  new GenericsClass<>(5);
  System.out.println("Generic Class returns:" + intObj.getData());
  
  GenericsClass<String>StringObj =new  GenericsClass<>("java programming");
  System.out.println("Generic class returns:" +StringObj.getData());	
}
}
class GenericsClass<T>{
	private T data;
	public GenericsClass(T data) {
		this.data =data;
	}
	public T getData() {
		return this.data;
	}	
	}
