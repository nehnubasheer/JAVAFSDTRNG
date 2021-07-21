package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

public static void main(String[] args) {
ArrayList arr = new ArrayList();
 arr.add(2);
 arr.add(4.2f);
 arr.add("String hi");
 arr.remove(1);
 arr.add(2,"Nehnu");
 System.out.println(arr);
 ArrayList<Integer>x =new ArrayList<Integer>();
 x.add(4);
 x.add(10);
 x.add(1);
 x.add(0);
 Collections.sort(x);
 System.out.println(x); 
 if(x.contains(1)) {
System.out.println(x.indexOf(1)); 	 
 }
 x.set(x.indexOf(1),2);
 x.remove(3);
 System.out.println(x);
}
}
