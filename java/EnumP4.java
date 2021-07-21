package com.ust.examples;

enum Operation{
	PLUS,
	MINUS,
	TIMES,
	DIVIDE;
double calculate (double x,double y) {
	switch(this) {
	case PLUS:
		return x+y;
	case MINUS:
		return x-y;
	case TIMES:
		return x*y;
	case DIVIDE:
		return x/y;
default:
	throw new AssertionError("Unknown operations" + this);
}
}	
}
public class EnumP4 {
public static void main(String[] args) {
double result = Operation.TIMES.calculate(6, 4);
System.out.println(result);

}
}
