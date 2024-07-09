package faq1;

import java.util.Scanner;

public class EvenOrOdd7 {

	public static void main(String[] args) {
		//Java program to check no is even/odd??
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("plz enter a number:");
		
		int num = reader.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}

	}

}
