package com.ust.examples;

    public class StaticNestedClass {
	static class Nested_demo{
	public void my_method(){
		System.out.println("This is my nested class");
	}
	}

    public static void main(String[] args) {
    StaticNestedClass.Nested_Demo  nested=new StaticNestedClass.Nested_Demo();
    nested.my_method();
    }
    }
