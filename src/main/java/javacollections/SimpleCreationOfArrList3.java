package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SimpleCreationOfArrList3 {

	public static void main(String[] args) {
		//shortcut for creation of arraylist and adding eles to it
		ArrayList<Integer>numbers = new ArrayList<Integer>(Arrays.asList(11,12,13,14));
		System.out.println(numbers);
		System.out.println("-----1for------");
		//1.using for loop:
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("-----2for each---");
		//2.for each loop:
		for(Integer ele:numbers) {
			System.out.println(ele);
		}
		System.out.println("------3Lambda----");
		//3.JDK 8:streams with Lambda fn-for each:
		numbers.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("------4iterator---");
		//4.using iterator:
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
