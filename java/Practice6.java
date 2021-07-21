package com.ust.examples;

public class Practice6 {

	public static void main(String[] args) {
		String str="Replace Region";
		/*
		 * Replace all  of given character with new one and returns new
		 * String object.
		 */
System.out.println(str.replace('R','A'));
/*
 *Replaces only first  of given String with new one and returns new String object.
 *
 */
System.out.println(str.replaceFirst("Re","Ra"));
 /*
  * Replaces all  of given String with new one and returns new String object.
  */
System.out.println(str.replaceAll("Re","Ra"));


	}

}
