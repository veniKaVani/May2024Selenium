package javacollections;

import java.util.HashMap;

public class Collect5aHashMap {

	public static void main(String[] args) {
		/*
		 * HASH MAP: is a class which implements Map interface
		 * it extends Abstract Map
		 * it contains only unique elements
		 * stores the values in -key, value format/pair
		 * it may have one null key and multiple null values
		 * it maintains no order
		 */
		
		HashMap<Integer,String>hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));

	}

}
