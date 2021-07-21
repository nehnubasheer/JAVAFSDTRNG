package com.ust.examples;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap2 {
public static void main(String[] args) {
	
LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();	

hm.put(3,"Greeks");
hm.put(2, "For");
hm.put(1, "Greeks");

for(Map.Entry<Integer, String>mapElement :hm.entrySet()) {
	Integer KEY = mapElement.getKey();
	String value = mapElement.getValue();
	System.out.println(KEY+" : " + value);
	
}
}
}
