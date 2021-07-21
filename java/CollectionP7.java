package com.ust.examples;
 
import java.util.*;

public class CollectionP7 {	
public static void main(String[] args) {
		
TreeSet<String> ts = new TreeSet<String>();
ts.add("Greks");
ts.add("For");
ts.add("Greeks");
ts.add("Is");
ts.add("Very helpful");

Iterator<String>itr = ts.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
