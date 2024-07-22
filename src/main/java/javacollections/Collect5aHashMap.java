package javacollections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Collect5aHashMap {

	public static void main(String[] args) {
		/*
		 * HASH MAP: is a class which implements Map interface
		 * it extends Abstract Map
		 * it contains only unique elements
		 * stores the values in -key, value format/pair
		 * it may have one null key and multiple null values
		 * it maintains no order
		 * 
		 * to traverse thru the hashmap-use entry and entryset
		 * 
		 */
		
		HashMap<Integer,String>hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		//to print all the key, value pairs of hashmap-use entry, entrySet
		//==>entry represents key, and value is represented by entrySet
		
		for(Entry<Integer, String> m:hm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());		
		}
		
		//how to use user defined objects in a hash map:
		HashMap<Integer, Employee>emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Tom",25,"admin");
		Employee e2 = new Employee("Peter",30, "Dev");
		Employee e3 = new Employee("Sam",33,"Manager");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap:
		for(Entry<Integer,Employee> m:emp.entrySet()) {
			Integer key = m.getKey();
			Employee e = m.getValue();
		System.out.println(key+"Info");
		
		System.out.println(e.name+" "+e.age+" "+e.dept);
		}

	}

}
