package com.ust.lambda;

import java.util.ArrayList;
import java.util.List;
public class Listy {
public static void main(String[] args) {
ArrayList<String> pointList = new ArrayList();
	 
pointList.add("1");
pointList.add("2");	 
pointList.forEach(p -> { 
System.out.println(p);
} );		
}
}
