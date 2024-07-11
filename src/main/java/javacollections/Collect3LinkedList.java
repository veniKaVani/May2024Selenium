package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collect3LinkedList {

	public static void main(String[] args) {
		/*
		 * LinkedList: is a class which implements 2 interfaces ---Deque and List
		 * is a special collection which stores data on the basis of two things:its own datatype
		 * and reference of its next node
		 * LinkedList: each and every node is divided into 2 parts:first node is data,
		 * second node is called next/ref of next node
		 * each node has ---data, next
		 * 
		 * each and every linked list --has a head, pointing to the data
		 * and the next of last node is pointing to null/nothing/earth
		 * 
		 */
		
		LinkedList<String>lL1 = new LinkedList<String>();
		
		//adding elements into the object lL1
		lL1.add("test");
		lL1.add("qtp");
		lL1.add("selenium");
		lL1.add("RPA");
		lL1.add("RFT");
		
		//print:
		System.out.println("content of linkedlist:"+lL1);
		
		//get:
		System.out.println(lL1.get(0));
		
		//set:
		lL1.set(0, "Tom");
		System.out.println(lL1.get(0));
		
		//remove first and last element:
		lL1.removeFirst();	
		lL1.removeLast();
		System.out.println("content of linkedlist:"+lL1);
		
		//how to print all the values of linkedlist:
		
		//1.for loop:
		System.out.println("---using for loop---");
		for(int n=0;n<lL1.size();n++) {
			System.out.println(lL1.get(n));
		}
		//2.using advanced for loop:also called forEach loop
		System.out.println("--using advanced for loop--");
		for(String str:lL1) {
			System.out.println(str);
		}
		//3.using iterator:
		System.out.println("--using iterator--");
		Iterator<String> it = lL1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//4.using while loop:
		System.out.println("--using while loop--");
        int num = 0;
        while(lL1.size()>num) {
        	System.out.println(lL1.get(num));
        	num++;
        }
        

	}

}
