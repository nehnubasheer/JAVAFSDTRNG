package com.ust.examples;

import java.util.*;

public class CollectionP6 {
public static void main(String[] args) {

HashSet<String>	hs =new HashSet<String>();
hs.add("Greeks");
hs.add("For");	
hs.add("Greeks");	
hs.add("Is");
hs.add("Very helpful");

Iterator<String> itr = hs.iterator();
while (itr.hasNext()){
	System.out.println(itr.next());
}
}
}
