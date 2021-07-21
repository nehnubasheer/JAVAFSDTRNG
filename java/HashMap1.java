package com.ust.examples;

import java.util.*;

public class HashMap1 {
public static void main(String[] args) {
		
LinkedHashMap<Integer,String> hm1= new LinkedHashMap<Integer,String>();
	
hm1.put(3,"Greeks");
hm1.put(2, "For");
hm1.put(1, "Greeks");

System.out.println("Mapping of LinkedHashMap:  " + hm1);

}
}
