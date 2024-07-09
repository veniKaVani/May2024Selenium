package faq2;

public class FactorialOfANo4 {

	public static void main(String[] args) {
		//Java program to find the factorial of a no??
		
		/*
		 * factorial 0 is always 1 => !0 = 1
		 * !4 = 24
		 * !5 = 5x4x3x2x1 = 120 = 1x2x3x4x5 => 
		 * for(i=1;i<=num;i++){ factorial = factorial * i;}
		 * HW: create using while loop and also recursively
		 */
		
		int num = 6;
		getFact(num);
		//creating a generic fn for the below:
//		int fact = 1;
//		
//		for(int i=1;i<=num;i++) {
//			fact = fact * i;
//		}
//		System.out.println("factorial of "+num+" is: "+fact);
		
		

	}
	public static void getFact(int num) {
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("factorial of "+num+" is: "+fact);
		
	}

}
